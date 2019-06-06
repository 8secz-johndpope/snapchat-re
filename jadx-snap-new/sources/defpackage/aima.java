package defpackage;

import java.util.Locale;

/* renamed from: aima */
public enum aima {
    LIGHT(r2),
    MEDIUM(r3),
    HARD(r4),
    HARDER(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aima(String str) {
        this.value = str;
    }

    public static aima a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aima.valueOf(str.toUpperCase(Locale.US));
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
