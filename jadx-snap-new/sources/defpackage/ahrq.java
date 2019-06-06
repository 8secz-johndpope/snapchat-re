package defpackage;

import java.util.Locale;

/* renamed from: ahrq */
public enum ahrq {
    FORM_WITH_INPUT_FILED(r2),
    NO_FORM_BUT_INPUT_FIELD(r3),
    PASSWORD_FIELD_INPUT(r4),
    SPECIAL_FILENAME_PATTERN_PRESENT(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahrq(String str) {
        this.value = str;
    }

    public static ahrq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahrq.valueOf(str.toUpperCase(Locale.US));
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
