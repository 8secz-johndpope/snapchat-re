package defpackage;

import java.util.Locale;

/* renamed from: afjh */
public enum afjh {
    DISCOVER(r2),
    AUTO_ADVANCE(r3),
    NONPARTNERED_STORY(r4),
    PARTNERED_STORY(r5),
    CAMPUS_STORY(r6),
    LENS_CAROUSEL_INV(r7),
    FILTER_CAROUSEL_INV(r8),
    OFFICIAL_STORY(r8),
    PROMOTED_STORY("PROMOTED_STORY"),
    SENSITIVE_NONPARTNERED_STORY("SENSITIVE_NONPARTNERED_STORY"),
    SENSITIVE_PARTNERED_STORY("SENSITIVE_PARTNERED_STORY"),
    SENSITIVE_CAMPUS_STORY("SENSITIVE_CAMPUS_STORY"),
    E2E_TEST("E2E_TEST"),
    CHANNEL_DISALLOWING_ADS("CHANNEL_DISALLOWING_ADS"),
    GENERATED_STORY("GENERATED_STORY"),
    SENSITIVE_GENERATED_STORY("SENSITIVE_GENERATED_STORY"),
    CONTENT_INTERSTITIAL("CONTENT_INTERSTITIAL"),
    GAMES("GAMES"),
    AD_NETWORK_RTB("AD_NETWORK_RTB"),
    AD_NETWORK_SDK("AD_NETWORK_SDK"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afjh(String str) {
        this.value = str;
    }

    public static afjh a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afjh.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
