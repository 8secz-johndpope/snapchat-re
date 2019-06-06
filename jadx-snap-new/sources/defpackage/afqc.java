package defpackage;

import java.util.Locale;

/* renamed from: afqc */
public enum afqc {
    OTP(r2),
    SMS(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private afqc(String str) {
        this.value = str;
    }

    public static afqc a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afqc.valueOf(str.toUpperCase(Locale.US));
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
