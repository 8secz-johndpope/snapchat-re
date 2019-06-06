package defpackage;

import java.util.Locale;

/* renamed from: aial */
public enum aial {
    IMAGE(r2),
    VIDEO(r3),
    VIDEO_NO_SOUND(r4),
    VIDEO_SOUND_LAGUNA(r5),
    VIDEO_NO_SOUND_LAGUNA(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aial(String str) {
        this.value = str;
    }

    public static aial a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aial.valueOf(str.toUpperCase(Locale.US));
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
