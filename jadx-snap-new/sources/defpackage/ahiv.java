package defpackage;

import java.util.Locale;

/* renamed from: ahiv */
public enum ahiv {
    UNKNOWN(r2),
    GATEWAY_REJECTED(r3),
    INTERNAL_ERROR(r4),
    INVALID_CREDIT_CARD(r5),
    INVALID_POSTAL_CODE(r6),
    PROCESSOR_DECLINED(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private ahiv(String str) {
        this.value = str;
    }

    public static ahiv a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahiv.valueOf(str.toUpperCase(Locale.US));
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
