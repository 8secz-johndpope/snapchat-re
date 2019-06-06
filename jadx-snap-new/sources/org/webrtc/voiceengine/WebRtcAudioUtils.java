package org.webrtc.voiceengine;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Build.VERSION;
import defpackage.ppy;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

public final class WebRtcAudioUtils {
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = DEFAULT_SAMPLE_RATE_HZ;
    private static boolean isDefaultSampleRateOverridden = false;
    private static boolean useWebRtcBasedAcousticEchoCanceler = false;
    private static boolean useWebRtcBasedNoiseSuppressor = false;

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i) {
        String str = "TYPE_UNKNOWN";
        switch (i) {
            case 0:
                return str;
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return str;
        }
    }

    public static List<String> getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List<String> getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static String getThreadInfo() {
        StringBuilder stringBuilder = new StringBuilder("@[name=");
        stringBuilder.append(Thread.currentThread().getName());
        stringBuilder.append(", id=");
        stringBuilder.append(Thread.currentThread().getId());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    @TargetApi(23)
    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        if (runningOnMarshmallowOrHigher()) {
            AudioDeviceInfo[] devices = audioManager.getDevices(3);
            if (devices.length != 0) {
                Logging.d(str, "Audio Devices: ");
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  ");
                    stringBuilder.append(deviceTypeToString(audioDeviceInfo.getType()));
                    stringBuilder.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
                    int length = audioDeviceInfo.getChannelCounts().length;
                    String str2 = ppy.d;
                    if (length > 0) {
                        stringBuilder.append("channels=");
                        stringBuilder.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                        stringBuilder.append(str2);
                    }
                    if (audioDeviceInfo.getEncodings().length > 0) {
                        stringBuilder.append("encodings=");
                        stringBuilder.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                        stringBuilder.append(str2);
                    }
                    if (audioDeviceInfo.getSampleRates().length > 0) {
                        stringBuilder.append("sample rates=");
                        stringBuilder.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                        stringBuilder.append(str2);
                    }
                    stringBuilder.append("id=");
                    stringBuilder.append(audioDeviceInfo.getId());
                    Logging.d(str, stringBuilder.toString());
                }
            }
        }
    }

    static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        StringBuilder stringBuilder = new StringBuilder("Audio State: audio mode: ");
        stringBuilder.append(modeToString(audioManager.getMode()));
        stringBuilder.append(", has mic: ");
        stringBuilder.append(hasMicrophone());
        stringBuilder.append(", mic muted: ");
        stringBuilder.append(audioManager.isMicrophoneMute());
        stringBuilder.append(", music active: ");
        stringBuilder.append(audioManager.isMusicActive());
        stringBuilder.append(", speakerphone: ");
        stringBuilder.append(audioManager.isSpeakerphoneOn());
        stringBuilder.append(", BT SCO: ");
        stringBuilder.append(audioManager.isBluetoothScoOn());
        Logging.d(str, stringBuilder.toString());
    }

    @SuppressLint({"NewApi"})
    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        boolean isVolumeFixed;
        int[] iArr = new int[]{0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        if (runningOnLollipopOrHigher()) {
            isVolumeFixed = audioManager.isVolumeFixed();
            Logging.d(str, "  fixed volume=".concat(String.valueOf(isVolumeFixed)));
        } else {
            isVolumeFixed = false;
        }
        if (!isVolumeFixed) {
            for (int i = 0; i < 6; i++) {
                int i2 = iArr[i];
                StringBuilder stringBuilder = new StringBuilder();
                StringBuilder stringBuilder2 = new StringBuilder("  ");
                stringBuilder2.append(streamTypeToString(i2));
                stringBuilder2.append(": ");
                stringBuilder.append(stringBuilder2.toString());
                stringBuilder.append("volume=");
                stringBuilder.append(audioManager.getStreamVolume(i2));
                stringBuilder.append(", max=");
                stringBuilder.append(audioManager.getStreamMaxVolume(i2));
                logIsStreamMute(str, audioManager, i2, stringBuilder);
                Logging.d(str, stringBuilder.toString());
            }
        }
    }

    static void logDeviceInfo(String str) {
        StringBuilder stringBuilder = new StringBuilder("Android SDK: ");
        stringBuilder.append(VERSION.SDK_INT);
        stringBuilder.append(", Release: ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append(", Brand: ");
        stringBuilder.append(Build.BRAND);
        stringBuilder.append(", Device: ");
        stringBuilder.append(Build.DEVICE);
        stringBuilder.append(", Id: ");
        stringBuilder.append(Build.ID);
        stringBuilder.append(", Hardware: ");
        stringBuilder.append(Build.HARDWARE);
        stringBuilder.append(", Manufacturer: ");
        stringBuilder.append(Build.MANUFACTURER);
        stringBuilder.append(", Model: ");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(", Product: ");
        stringBuilder.append(Build.PRODUCT);
        Logging.d(str, stringBuilder.toString());
    }

    @TargetApi(23)
    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder stringBuilder) {
        if (runningOnMarshmallowOrHigher()) {
            stringBuilder.append(", muted=");
            stringBuilder.append(audioManager.isStreamMute(i));
        }
    }

    static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean runningOnJellyBeanMR1OrHigher() {
        return VERSION.SDK_INT >= 17;
    }

    public static boolean runningOnJellyBeanMR2OrHigher() {
        return VERSION.SDK_INT >= 18;
    }

    public static boolean runningOnLollipopOrHigher() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean runningOnMarshmallowOrHigher() {
        return VERSION.SDK_INT >= 23;
    }

    public static boolean runningOnNougatOrHigher() {
        return VERSION.SDK_INT >= 24;
    }

    public static boolean runningOnOreoMR1OrHigher() {
        return VERSION.SDK_INT >= 27;
    }

    public static boolean runningOnOreoOrHigher() {
        return VERSION.SDK_INT >= 26;
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.w(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    private static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.w(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
        }
        return z;
    }
}
