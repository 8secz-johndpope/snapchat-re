package defpackage;

import java.util.Locale;

/* renamed from: afxx */
public enum afxx {
    OTP(r2),
    SMS(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private afxx(String str) {
        this.value = str;
    }

    public static afxx a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afxx.valueOf(str.toUpperCase(Locale.US));
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
