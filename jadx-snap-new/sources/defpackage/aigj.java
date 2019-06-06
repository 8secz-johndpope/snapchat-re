package defpackage;

import java.util.Locale;

/* renamed from: aigj */
public enum aigj {
    AUTO_REJECTED(r2),
    AUTO_ACCEPTED(r3),
    AUTO_UNDECIDED(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aigj(String str) {
        this.value = str;
    }

    public static aigj a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aigj.valueOf(str.toUpperCase(Locale.US));
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
