package defpackage;

import java.util.Locale;

/* renamed from: aese */
public enum aese {
    CAMERA_ROLL(r2),
    CUSTOM_STICKER_SAVE(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aese(String str) {
        this.value = str;
    }

    public static aese a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aese.valueOf(str.toUpperCase(Locale.US));
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
