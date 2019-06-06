package defpackage;

import java.util.Locale;

/* renamed from: ahbc */
public enum ahbc {
    NONE(r2),
    DELTA(r3),
    FULL(r4),
    DELTA_HISTORY(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahbc(String str) {
        this.value = str;
    }

    public static ahbc a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahbc.valueOf(str.toUpperCase(Locale.US));
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
