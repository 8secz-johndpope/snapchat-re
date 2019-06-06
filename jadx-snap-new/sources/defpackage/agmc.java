package defpackage;

import java.util.Locale;

/* renamed from: agmc */
public enum agmc {
    LIVE("live"),
    ARCHIVED("archived"),
    INVALID_ID("invalid_id"),
    EXPIRED("expired"),
    OUT_OF_REGION("out_of_region"),
    NOT_PUBLISHED("not_published"),
    RESTRICTED("restricted"),
    UNRECOGNIZED_VALUE(r9);
    
    private final String value;

    private agmc(String str) {
        this.value = str;
    }

    public static agmc a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agmc.valueOf(str.toUpperCase(Locale.US));
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
