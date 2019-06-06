package org.webrtc.voiceengine;

import android.annotation.TargetApi;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AudioEffect.Descriptor;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.UUID;
import org.webrtc.Logging;

public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static Descriptor[] cachedEffects = null;
    private AcousticEchoCanceler aec = null;
    private NoiseSuppressor ns = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;

    private WebRtcAudioEffects() {
        StringBuilder stringBuilder = new StringBuilder("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.d(TAG, stringBuilder.toString());
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseAcousticEchoCanceler: ".concat(String.valueOf(z)));
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseNoiseSuppressor: ".concat(String.valueOf(z)));
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    @TargetApi(18)
    private boolean effectTypeIsVoIP(UUID uuid) {
        return !WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher() ? false : (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    private static Descriptor[] getAvailableEffects() {
        Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        descriptorArr = AudioEffect.queryEffects();
        cachedEffects = descriptorArr;
        return descriptorArr;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAecUsage().contains(Build.MODEL);
        if (contains) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Build.MODEL);
            stringBuilder.append(" is blacklisted for HW AEC usage!");
            Logging.w(TAG, stringBuilder.toString());
        }
        return contains;
    }

    @TargetApi(18)
    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    @TargetApi(18)
    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForNsUsage().contains(Build.MODEL);
        if (contains) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Build.MODEL);
            stringBuilder.append(" is blacklisted for HW NS usage!");
            Logging.w(TAG, stringBuilder.toString());
        }
        return contains;
    }

    @TargetApi(18)
    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    @TargetApi(18)
    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i) {
        StringBuilder stringBuilder = new StringBuilder("enable(audioSession=");
        stringBuilder.append(i);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        boolean z = true;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        String str2 = ", is now: ";
        String str3 = ", enable: ";
        String str4 = "enabled";
        String str5 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            this.aec = AcousticEchoCanceler.create(i);
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                boolean enabled = acousticEchoCanceler.getEnabled();
                boolean z2 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z2) != 0) {
                    Logging.e(str, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder stringBuilder3 = new StringBuilder("AcousticEchoCanceler: was ");
                stringBuilder3.append(enabled ? str4 : str5);
                stringBuilder3.append(str3);
                stringBuilder3.append(z2);
                stringBuilder3.append(str2);
                stringBuilder3.append(this.aec.getEnabled() ? str4 : str5);
                Logging.d(str, stringBuilder3.toString());
            } else {
                Logging.e(str, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            this.ns = NoiseSuppressor.create(i);
            NoiseSuppressor noiseSuppressor = this.ns;
            if (noiseSuppressor != null) {
                boolean enabled2 = noiseSuppressor.getEnabled();
                if (!(this.shouldEnableNs && canUseNoiseSuppressor())) {
                    z = false;
                }
                if (this.ns.setEnabled(z) != 0) {
                    Logging.e(str, "Failed to set the NoiseSuppressor state");
                }
                stringBuilder = new StringBuilder("NoiseSuppressor: was ");
                stringBuilder.append(enabled2 ? str4 : str5);
                stringBuilder.append(str3);
                stringBuilder.append(z);
                stringBuilder.append(str2);
                if (!this.ns.getEnabled()) {
                    str4 = str5;
                }
                stringBuilder.append(str4);
                Logging.d(str, stringBuilder.toString());
                return;
            }
            Logging.e(str, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("setAEC(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        if (!canUseAcousticEchoCanceler()) {
            Logging.w(str, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            Logging.e(str, "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("setNS(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        if (!canUseNoiseSuppressor()) {
            Logging.w(str, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            Logging.e(str, "Platform NS state can't be modified while recording");
            return false;
        }
    }
}
