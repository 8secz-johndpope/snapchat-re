package defpackage;

import java.util.Locale;

/* renamed from: aghm */
public enum aghm {
    SHOPIFY(r2),
    UNRECOGNIZED_VALUE(r3);
    
    private final String value;

    private aghm(String str) {
        this.value = str;
    }

    public static aghm a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aghm.valueOf(str.toUpperCase(Locale.US));
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
