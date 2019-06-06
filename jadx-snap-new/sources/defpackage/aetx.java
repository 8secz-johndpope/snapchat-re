package defpackage;

import java.util.Locale;

/* renamed from: aetx */
public enum aetx {
    APNS(r2),
    VOIP(r3),
    GCM(r4),
    USER_NOTIFICATION(r5),
    SCCP_MESSAGE(r6),
    SCCP_NOTIFICATION(r7),
    LOCAL(r8),
    FCM(r8),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aetx(String str) {
        this.value = str;
    }

    public static aetx a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aetx.valueOf(str.toUpperCase(Locale.US));
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
