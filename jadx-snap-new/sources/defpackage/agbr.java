package defpackage;

import java.util.Locale;

/* renamed from: agbr */
public enum agbr {
    LEFT_TO_RIGHT(r2),
    RIGHT_TO_LEFT(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agbr(String str) {
        this.value = str;
    }

    public static agbr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agbr.valueOf(str.toUpperCase(Locale.US));
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
