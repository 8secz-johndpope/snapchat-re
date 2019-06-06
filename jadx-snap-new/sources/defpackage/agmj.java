package defpackage;

import java.util.Locale;

/* renamed from: agmj */
public enum agmj {
    UNSEND(r2),
    SUCCESS(r3),
    FAILED_NOT_A_FRIEND(r4),
    FAILED_TRANSIENT(r5),
    FAILED_INVALID_SEQUENCE(r6),
    FAILED_NOT_ALLOWED(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private agmj(String str) {
        this.value = str;
    }

    public static agmj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agmj.valueOf(str.toUpperCase(Locale.US));
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
