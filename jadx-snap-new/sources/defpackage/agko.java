package defpackage;

import java.util.Locale;

/* renamed from: agko */
public enum agko {
    ADMIN(r2),
    UNRECOGNIZED_VALUE(r3);
    
    private final String value;

    private agko(String str) {
        this.value = str;
    }

    public static agko a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agko.valueOf(str.toUpperCase(Locale.US));
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
