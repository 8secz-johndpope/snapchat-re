package defpackage;

import java.util.Locale;

/* renamed from: agjw */
public enum agjw {
    SIGNED_V1_MERCHANT_AGREEMENT(r2),
    CONFIRMED_INITIAL_STORE_INFO(r3),
    STORE_APPROVED(r4),
    STORE_DISABLED(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private agjw(String str) {
        this.value = str;
    }

    public static agjw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agjw.valueOf(str.toUpperCase(Locale.US));
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
