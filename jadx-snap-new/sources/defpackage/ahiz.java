package defpackage;

import java.util.Locale;

/* renamed from: ahiz */
public enum ahiz {
    AMEX(r2),
    DINERS_CLUB(r3),
    DISCOVER(r4),
    JCB(r5),
    MAESTRO(r6),
    MASTERCARD(r7),
    VISA(r8),
    UNKNOWN_CREDIT_CARD_TYPE(r8),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahiz(String str) {
        this.value = str;
    }

    public static ahiz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahiz.valueOf(str.toUpperCase(Locale.US));
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
