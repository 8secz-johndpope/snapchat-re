package defpackage;

import java.util.Locale;

/* renamed from: afgp */
public enum afgp {
    PHONE_NUMBER(r2),
    COUNTRY_CODE(r3),
    VERIFICATION_CODE(r4),
    METHOD(r5),
    CAPTCHA(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private afgp(String str) {
        this.value = str;
    }

    public static afgp a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afgp.valueOf(str.toUpperCase(Locale.US));
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
