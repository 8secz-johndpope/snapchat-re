package defpackage;

import java.util.Locale;

/* renamed from: aiiy */
public enum aiiy {
    NONE(r2),
    VAT(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aiiy(String str) {
        this.value = str;
    }

    public static aiiy a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aiiy.valueOf(str.toUpperCase(Locale.US));
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
