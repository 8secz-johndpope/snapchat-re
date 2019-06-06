package defpackage;

import java.util.Locale;

/* renamed from: aeev */
public enum aeev {
    DEFAULT(r2),
    BIGTEXT_LEFT(r3),
    BIGTEXT_CENTER(r4),
    BIGTEXT_RIGHT(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aeev(String str) {
        this.value = str;
    }

    public static aeev a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeev.valueOf(str.toUpperCase(Locale.US));
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
