package defpackage;

import java.util.Locale;

/* renamed from: ahww */
public enum ahww {
    BITMOJI(r2),
    STICKERS(r3),
    SNAPART(r4),
    HOMETAB(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahww(String str) {
        this.value = str;
    }

    public static ahww a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahww.valueOf(str.toUpperCase(Locale.US));
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
