package defpackage;

import java.util.Locale;

/* renamed from: aekd */
public enum aekd {
    NO_SKIN_TONE(r2),
    LIGHT(r3),
    MEDIUM_LIGHT(r4),
    MEDIUM(r5),
    MEDIUM_DARK(r6),
    DARK(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private aekd(String str) {
        this.value = str;
    }

    public static aekd a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aekd.valueOf(str.toUpperCase(Locale.US));
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
