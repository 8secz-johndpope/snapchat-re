package defpackage;

import java.util.Locale;

/* renamed from: ahtw */
public enum ahtw {
    AD_ACCOUNT(r2),
    AD_CAMPAIGN(r3),
    AD_SQUAD(r4),
    AD(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahtw(String str) {
        this.value = str;
    }

    public static ahtw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahtw.valueOf(str.toUpperCase(Locale.US));
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
