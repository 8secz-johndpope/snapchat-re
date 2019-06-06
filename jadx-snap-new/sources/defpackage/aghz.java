package defpackage;

import java.util.Locale;

/* renamed from: aghz */
public enum aghz {
    PERCENTAGE(r2),
    FIXED_AMOUNT(r3),
    FREE_SHIPPING(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aghz(String str) {
        this.value = str;
    }

    public static aghz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aghz.valueOf(str.toUpperCase(Locale.US));
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
