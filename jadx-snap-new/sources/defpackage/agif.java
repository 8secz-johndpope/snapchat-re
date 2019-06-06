package defpackage;

import java.util.Locale;

/* renamed from: agif */
public enum agif {
    NO_TARGET(r2),
    CATEGORY(r3),
    PRODUCT_DEEPLINK(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agif(String str) {
        this.value = str;
    }

    public static agif a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agif.valueOf(str.toUpperCase(Locale.US));
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
