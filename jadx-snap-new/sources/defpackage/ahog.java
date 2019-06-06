package defpackage;

import java.util.Locale;

/* renamed from: ahog */
public enum ahog {
    PENDING(r2),
    PUBLISHED(r3),
    DISABLED(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahog(String str) {
        this.value = str;
    }

    public static ahog a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahog.valueOf(str.toUpperCase(Locale.US));
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
