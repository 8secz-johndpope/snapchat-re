package defpackage;

import java.util.Locale;

/* renamed from: aggv */
public enum aggv {
    IMAGE(r2),
    VIDEO(r3),
    VIDEO_NO_SOUND(r4),
    GIF(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aggv(String str) {
        this.value = str;
    }

    public static aggv a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aggv.valueOf(str.toUpperCase(Locale.US));
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
