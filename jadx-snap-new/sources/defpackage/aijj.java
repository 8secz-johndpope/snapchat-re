package defpackage;

import java.util.Locale;

/* renamed from: aijj */
public enum aijj {
    LEFT(r2),
    RIGHT(r3),
    CENTER(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aijj(String str) {
        this.value = str;
    }

    public static aijj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aijj.valueOf(str.toUpperCase(Locale.US));
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
