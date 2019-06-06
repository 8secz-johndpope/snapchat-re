package defpackage;

import java.util.Locale;

/* renamed from: ahlv */
public enum ahlv {
    NONE(r2),
    EAN_13(r3),
    EAN_8(r4),
    UPC_A(r5),
    UPC_E(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private ahlv(String str) {
        this.value = str;
    }

    public static ahlv a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahlv.valueOf(str.toUpperCase(Locale.US));
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
