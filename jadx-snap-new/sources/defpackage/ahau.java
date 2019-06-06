package defpackage;

import java.util.Locale;

/* renamed from: ahau */
public enum ahau {
    NO_LENS_BUTTON(r2),
    STATIC_LENS_BUTTON(r3),
    DYNAMIC_LENS_BUTTON(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahau(String str) {
        this.value = str;
    }

    public static ahau a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahau.valueOf(str.toUpperCase(Locale.US));
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
