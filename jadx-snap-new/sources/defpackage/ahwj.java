package defpackage;

import java.util.Locale;

/* renamed from: ahwj */
public enum ahwj {
    NOT_SUBMITTED(r2),
    PENDING_REVIEW(r3),
    APPROVED(r4),
    REJECTED(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahwj(String str) {
        this.value = str;
    }

    public static ahwj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahwj.valueOf(str.toUpperCase(Locale.US));
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
