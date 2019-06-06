package defpackage;

import java.util.Locale;

/* renamed from: ahiw */
public enum ahiw {
    BRAINTREE(r2),
    UNKNOWN_CREDIT_CARD_PROVIDER(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ahiw(String str) {
        this.value = str;
    }

    public static ahiw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahiw.valueOf(str.toUpperCase(Locale.US));
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
