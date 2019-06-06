package defpackage;

import java.util.Locale;

/* renamed from: aihw */
public enum aihw {
    FILTER(r2),
    LENS(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aihw(String str) {
        this.value = str;
    }

    public static aihw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aihw.valueOf(str.toUpperCase(Locale.US));
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
