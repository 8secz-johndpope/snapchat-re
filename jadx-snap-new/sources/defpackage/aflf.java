package defpackage;

import java.util.Locale;

/* renamed from: aflf */
public enum aflf {
    IMAGE(r2),
    VIDEO(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aflf(String str) {
        this.value = str;
    }

    public static aflf a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aflf.valueOf(str.toUpperCase(Locale.US));
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
