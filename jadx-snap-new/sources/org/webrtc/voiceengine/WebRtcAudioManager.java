package org.webrtc.voiceengine;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized = false;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    static class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        private final AudioManager audioManager;
        private Timer timer;

        class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                String str = ")";
                String str2 = " (max=";
                String str3 = WebRtcAudioManager.TAG;
                StringBuilder stringBuilder;
                if (mode == 1) {
                    stringBuilder = new StringBuilder("STREAM_RING stream volume: ");
                    stringBuilder.append(VolumeLogger.this.audioManager.getStreamVolume(2));
                    stringBuilder.append(str2);
                    stringBuilder.append(this.maxRingVolume);
                    stringBuilder.append(str);
                    Logging.d(str3, stringBuilder.toString());
                    return;
                }
                if (mode == 3) {
                    stringBuilder = new StringBuilder("VOICE_CALL stream volume: ");
                    stringBuilder.append(VolumeLogger.this.audioManager.getStreamVolume(0));
                    stringBuilder.append(str2);
                    stringBuilder.append(this.maxVoiceCallVolume);
                    stringBuilder.append(str);
                    Logging.d(str3, stringBuilder.toString());
                }
            }
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        private void stop() {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            this.timer = new Timer(THREAD_NAME);
            this.timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    WebRtcAudioManager(long j) {
        StringBuilder stringBuilder = new StringBuilder("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        this.nativeAudioManager = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.volumeLogger = new VolumeLogger(this.audioManager);
        storeAudioParameters();
        int i = this.sampleRate;
        int i2 = this.outputChannels;
        int i3 = this.inputChannels;
        boolean z = this.hardwareAEC;
        boolean z2 = this.hardwareAGC;
        boolean z3 = this.hardwareNS;
        boolean z4 = this.lowLatencyOutput;
        boolean z5 = this.lowLatencyInput;
        boolean z6 = this.proAudio;
        boolean z7 = this.aAudio;
        int i4 = this.outputBufferSize;
        int i5 = this.inputBufferSize;
        String str2 = str;
        nativeCacheAudioParameters(i, i2, i3, z, z2, z3, z4, z5, z6, z7, i4, i5, j);
        WebRtcAudioUtils.logAudioState(str2);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        StringBuilder stringBuilder = new StringBuilder("dispose");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.d(TAG, stringBuilder.toString());
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    @TargetApi(17)
    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        if (!WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher()) {
            return DEFAULT_FRAME_PER_BUFFER;
        }
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        return property == null ? DEFAULT_FRAME_PER_BUFFER : Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 << 1);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 << 1);
    }

    private int getNativeOutputSampleRate() {
        boolean runningOnEmulator = WebRtcAudioUtils.runningOnEmulator();
        String str = TAG;
        if (runningOnEmulator) {
            Logging.d(str, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        String str2 = " Hz";
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            StringBuilder stringBuilder = new StringBuilder("Default sample rate is overriden to ");
            stringBuilder.append(WebRtcAudioUtils.getDefaultSampleRateHz());
            stringBuilder.append(str2);
            Logging.d(str, stringBuilder.toString());
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateOnJellyBeanMR10OrHigher = WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher() ? getSampleRateOnJellyBeanMR10OrHigher() : WebRtcAudioUtils.getDefaultSampleRateHz();
        StringBuilder stringBuilder2 = new StringBuilder("Sample rate is set to ");
        stringBuilder2.append(sampleRateOnJellyBeanMR10OrHigher);
        stringBuilder2.append(str2);
        Logging.d(str, stringBuilder2.toString());
        return sampleRateOnJellyBeanMR10OrHigher;
    }

    @TargetApi(17)
    private int getSampleRateOnJellyBeanMR10OrHigher() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        StringBuilder stringBuilder = new StringBuilder("init");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        if (this.initialized) {
            return true;
        }
        stringBuilder = new StringBuilder("audio mode is: ");
        stringBuilder.append(WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Logging.d(str, stringBuilder.toString());
        this.initialized = true;
        this.volumeLogger.start();
        return true;
    }

    private boolean isAAudioSupported() {
        Logging.w(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        return this.audioManager.getMode() == 3;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Build.MODEL);
            stringBuilder.append(" is blacklisted for OpenSL ES usage!");
            Logging.d(TAG, stringBuilder.toString());
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    @TargetApi(23)
    private boolean isProAudioSupported() {
        return WebRtcAudioUtils.runningOnMarshmallowOrHigher() && ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro");
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = true;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("Overriding default input behavior: setStereoInput(");
            stringBuilder.append(z);
            stringBuilder.append(')');
            Logging.w(str, stringBuilder.toString());
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("Overriding default output behavior: setStereoOutput(");
            stringBuilder.append(z);
            stringBuilder.append(')');
            Logging.w(str, stringBuilder.toString());
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int i = 2;
        this.outputChannels = getStereoOutput() ? 2 : 1;
        if (!getStereoInput()) {
            i = 1;
        }
        this.inputChannels = i;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        this.aAudio = isAAudioSupported();
        this.outputBufferSize = this.lowLatencyOutput ? getLowLatencyOutputFramesPerBuffer() : getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        this.inputBufferSize = this.lowLatencyInput ? getLowLatencyInputFramesPerBuffer() : getMinInputFrameSize(this.sampleRate, this.inputChannels);
    }

    public boolean isLowLatencyInputSupported() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported();
    }
}
