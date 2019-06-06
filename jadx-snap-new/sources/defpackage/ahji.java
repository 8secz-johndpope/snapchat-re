package defpackage;

import java.util.Locale;

/* renamed from: ahji */
public enum ahji {
    CREDIT_CARD(r2),
    LINE_OF_CREDIT(r3),
    UNKNOWN_PAYMENT_METHOD_TYPE(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahji(String str) {
        this.value = str;
    }

    public static ahji a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahji.valueOf(str.toUpperCase(Locale.US));
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
