package defpackage;

import java.util.Locale;

/* renamed from: agcm */
public enum agcm {
    CUSTOM(r2),
    MUTUAL_FRIENDS(r3),
    OUR_FRIENDS(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agcm(String str) {
        this.value = str;
    }

    public static agcm a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agcm.valueOf(str.toUpperCase(Locale.US));
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
