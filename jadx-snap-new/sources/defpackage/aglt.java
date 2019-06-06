package defpackage;

import java.util.Locale;

/* renamed from: aglt */
public enum aglt {
    INVALID_RECIPIENT(r2),
    ERROR(r3),
    CREATED(r4),
    CONFLICT(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aglt(String str) {
        this.value = str;
    }

    public static aglt a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aglt.valueOf(str.toUpperCase(Locale.US));
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
