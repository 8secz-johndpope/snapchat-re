package defpackage;

import java.util.Locale;

/* renamed from: ahgn */
public enum ahgn {
    PHONE(r2),
    ADDRESS(r3),
    WEB_LINK(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahgn(String str) {
        this.value = str;
    }

    public static ahgn a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahgn.valueOf(str.toUpperCase(Locale.US));
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
