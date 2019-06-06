package defpackage;

import java.util.Locale;

/* renamed from: aigi */
public enum aigi {
    IN_REVIEW(r2),
    REJECTED(r3),
    ACCEPTED(r4),
    EXPIRED(r5),
    REVOKED(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aigi(String str) {
        this.value = str;
    }

    public static aigi a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aigi.valueOf(str.toUpperCase(Locale.US));
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
