package org.webrtc.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.ThreadUtils.ThreadChecker;

public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread = null;
    private AudioTrack audioTrack = null;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadChecker threadChecker = new ThreadChecker();

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioTrackThread(String str) {
            super(str);
        }

        @TargetApi(21)
        private int writeOnLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        private int writePreLollipop(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i);
        }

        public void run() {
            Process.setThreadPriority(-19);
            StringBuilder stringBuilder = new StringBuilder("AudioTrackThread");
            stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
            String stringBuilder2 = stringBuilder.toString();
            String str = WebRtcAudioTrack.TAG;
            Logging.d(str, stringBuilder2);
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeOnLollipop = WebRtcAudioUtils.runningOnLollipopOrHigher() ? writeOnLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity) : writePreLollipop(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeOnLollipop != capacity) {
                    Logging.e(str, "AudioTrack.write played invalid number of bytes: ".concat(String.valueOf(writeOnLollipop)));
                    if (writeOnLollipop < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: ".concat(String.valueOf(writeOnLollipop)));
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.d(str, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.d(str, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    StringBuilder stringBuilder3 = new StringBuilder("AudioTrack.stop failed: ");
                    stringBuilder3.append(e.getMessage());
                    Logging.e(str, stringBuilder3.toString());
                }
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    static {
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    WebRtcAudioTrack(long j) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder stringBuilder = new StringBuilder("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.d(TAG, stringBuilder.toString());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    @TargetApi(21)
    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        String str = TAG;
        Logging.d(str, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(str, "nativeOutputSampleRate: ".concat(String.valueOf(nativeOutputSampleRate)));
        if (i != nativeOutputSampleRate) {
            Logging.w(str, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != DEFAULT_USAGE) {
            StringBuilder stringBuilder = new StringBuilder("A non default usage attribute is used: ");
            stringBuilder.append(usageAttribute);
            Logging.w(str, stringBuilder.toString());
        }
        return new AudioTrack(new Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private static int getDefaultUsageAttribute() {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() ? getDefaultUsageAttributeOnLollipopOrHigher() : 0;
    }

    @TargetApi(21)
    private static int getDefaultUsageAttributeOnLollipopOrHigher() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(0);
    }

    private boolean initPlayout(int i, int i2) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder stringBuilder = new StringBuilder("initPlayout(sampleRate=");
        stringBuilder.append(i);
        stringBuilder.append(", channels=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        this.byteBuffer = ByteBuffer.allocateDirect((i2 << 1) * (i / 100));
        stringBuilder = new StringBuilder("byteBuffer.capacity: ");
        stringBuilder.append(this.byteBuffer.capacity());
        Logging.d(str, stringBuilder.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        i2 = channelCountToConfiguration(i2);
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, 2);
        Logging.d(str, "AudioTrack.getMinBufferSize: ".concat(String.valueOf(minBufferSize)));
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return false;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return false;
        } else {
            try {
                this.audioTrack = WebRtcAudioUtils.runningOnLollipopOrHigher() ? createAudioTrackOnLollipopOrHigher(i, i2, minBufferSize) : createAudioTrackOnLowerThanLollipop(i, i2, minBufferSize);
                AudioTrack audioTrack = this.audioTrack;
                if (audioTrack == null || audioTrack.getState() != 1) {
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return false;
                }
                logMainParameters();
                logMainParametersExtended();
                return true;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    private boolean isVolumeFixed() {
        return !WebRtcAudioUtils.runningOnLollipopOrHigher() ? false : this.audioManager.isVolumeFixed();
    }

    private void logMainParameters() {
        StringBuilder stringBuilder = new StringBuilder("AudioTrack: session ID: ");
        stringBuilder.append(this.audioTrack.getAudioSessionId());
        stringBuilder.append(", channels: ");
        stringBuilder.append(this.audioTrack.getChannelCount());
        stringBuilder.append(", sample rate: ");
        stringBuilder.append(this.audioTrack.getSampleRate());
        stringBuilder.append(", max gain: ");
        stringBuilder.append(AudioTrack.getMaxVolume());
        Logging.d(TAG, stringBuilder.toString());
    }

    @TargetApi(24)
    private void logMainParametersExtended() {
        StringBuilder stringBuilder;
        boolean runningOnMarshmallowOrHigher = WebRtcAudioUtils.runningOnMarshmallowOrHigher();
        String str = TAG;
        if (runningOnMarshmallowOrHigher) {
            stringBuilder = new StringBuilder("AudioTrack: buffer size in frames: ");
            stringBuilder.append(this.audioTrack.getBufferSizeInFrames());
            Logging.d(str, stringBuilder.toString());
        }
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            stringBuilder = new StringBuilder("AudioTrack: buffer capacity in frames: ");
            stringBuilder.append(this.audioTrack.getBufferCapacityInFrames());
            Logging.d(str, stringBuilder.toString());
        }
    }

    @TargetApi(24)
    private void logUnderrunCount() {
        if (WebRtcAudioUtils.runningOnNougatOrHigher()) {
            StringBuilder stringBuilder = new StringBuilder("underrun count: ");
            stringBuilder.append(this.audioTrack.getUnderrunCount());
            Logging.d(TAG, stringBuilder.toString());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    private void reportWebRtcAudioTrackError(String str) {
        String concat = "Run-time playback error: ".concat(String.valueOf(str));
        String str2 = TAG;
        Logging.e(str2, concat);
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback = errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        String concat = "Init playout error: ".concat(String.valueOf(str));
        String str2 = TAG;
        Logging.e(str2, concat);
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback = errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        StringBuilder stringBuilder = new StringBuilder("Start playout error: ");
        stringBuilder.append(audioTrackStartErrorCode);
        stringBuilder.append(". ");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        String str2 = TAG;
        Logging.e(str2, stringBuilder2);
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback = errorCallback;
        if (errorCallback != null) {
            errorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("Default usage attribute is changed from: ");
            stringBuilder.append(DEFAULT_USAGE);
            stringBuilder.append(" to ");
            stringBuilder.append(i);
            Logging.w(str, stringBuilder.toString());
            usageAttribute = i;
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("setSpeakerMute(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.w(TAG, stringBuilder.toString());
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        StringBuilder stringBuilder = new StringBuilder("setStreamVolume(");
        stringBuilder.append(i);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.e(str, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                StringBuilder stringBuilder = new StringBuilder("AudioTrack.play failed - incorrect state :");
                stringBuilder.append(this.audioTrack.getPlayState());
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, stringBuilder.toString());
                releaseAudioResources();
                return false;
            }
            this.audioThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            StringBuilder stringBuilder2 = new StringBuilder("AudioTrack.play failed: ");
            stringBuilder2.append(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, stringBuilder2.toString());
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.checkIsOnValidThread();
        String str = TAG;
        Logging.d(str, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(str, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.e(str, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(str);
        }
        Logging.d(str, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }
}
