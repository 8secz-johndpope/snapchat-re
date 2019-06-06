package defpackage;

import java.util.Locale;

/* renamed from: aeda */
public enum aeda {
    IMAGE_WITH_ANIMATED(r2),
    IMAGE_WITHOUT_ANIMATED(r3),
    VIDEO_WITH_ANIMATED(r4),
    VIDEO_WITHOUT_ANIMATED(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aeda(String str) {
        this.value = str;
    }

    public static aeda a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeda.valueOf(str.toUpperCase(Locale.US));
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
