package defpackage;

import java.util.Locale;

/* renamed from: afby */
public enum afby {
    FRIENDS(r2),
    EVERYONE(r3),
    CUSTOM(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private afby(String str) {
        this.value = str;
    }

    public static afby a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afby.valueOf(str.toUpperCase(Locale.US));
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
