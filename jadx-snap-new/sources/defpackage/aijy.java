package defpackage;

import java.util.Locale;

/* renamed from: aijy */
public enum aijy {
    GUEST_USER(r2),
    SNAPCHAT_ADS_API_USER(r3),
    SNAPCHAT_USER(r4),
    SNAPCHAT_MOBILE_USER(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aijy(String str) {
        this.value = str;
    }

    public static aijy a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aijy.valueOf(str.toUpperCase(Locale.US));
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
