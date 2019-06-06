package defpackage;

import java.util.Locale;

/* renamed from: ahbk */
public enum ahbk {
    FORWARD(r2),
    BACKWARD(r3),
    BACKWARD_SAVED(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahbk(String str) {
        this.value = str;
    }

    public static ahbk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahbk.valueOf(str.toUpperCase(Locale.US));
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
