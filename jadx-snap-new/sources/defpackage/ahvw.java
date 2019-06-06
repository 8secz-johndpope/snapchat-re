package defpackage;

import java.util.Locale;

/* renamed from: ahvw */
public enum ahvw {
    SORT_BY_AD_DISPLAY_NAME(r2),
    SORT_BY_END_TIMESTAMP(r3),
    SORT_BY_LAST_UPDATED_TIMESTAMP(r4),
    SORT_BY_START_TIMESTAMP(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahvw(String str) {
        this.value = str;
    }

    public static ahvw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahvw.valueOf(str.toUpperCase(Locale.US));
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
