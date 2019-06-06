package defpackage;

import java.util.Locale;

/* renamed from: ahvv */
public enum ahvv {
    ASCENDING(r2),
    DEFAULT(r3),
    DESCENDING(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahvv(String str) {
        this.value = str;
    }

    public static ahvv a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahvv.valueOf(str.toUpperCase(Locale.US));
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
