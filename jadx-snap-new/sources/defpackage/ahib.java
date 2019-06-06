package defpackage;

import java.util.Locale;

/* renamed from: ahib */
public enum ahib {
    VALID(r2),
    UNVIEWABLE(r3),
    POTENTIALLY_VIEWABLE(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahib(String str) {
        this.value = str;
    }

    public static ahib a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahib.valueOf(str.toUpperCase(Locale.US));
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
