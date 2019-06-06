package defpackage;

import java.util.Locale;

/* renamed from: agsq */
public enum agsq {
    LOOKSERY_V1(r2),
    GOOGLE_V1(r3),
    IOS_VISION_V1(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agsq(String str) {
        this.value = str;
    }

    public static agsq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agsq.valueOf(str.toUpperCase(Locale.US));
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
