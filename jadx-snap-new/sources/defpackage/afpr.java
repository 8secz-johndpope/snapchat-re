package defpackage;

import java.util.Locale;

/* renamed from: afpr */
public enum afpr {
    ODLV_EMAIL(r2),
    ODLV_SMS(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private afpr(String str) {
        this.value = str;
    }

    public static afpr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afpr.valueOf(str.toUpperCase(Locale.US));
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
