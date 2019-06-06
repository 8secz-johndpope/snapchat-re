package defpackage;

import java.util.Locale;

/* renamed from: agjh */
public enum agjh {
    BITMOJI(r2),
    REGULAR(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agjh(String str) {
        this.value = str;
    }

    public static agjh a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agjh.valueOf(str.toUpperCase(Locale.US));
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
