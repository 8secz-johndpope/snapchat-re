package defpackage;

import java.util.Locale;

/* renamed from: aifr */
public enum aifr {
    ALL_FRIENDS(r2),
    ALL_FRIENDS_WITH_BLACKLIST(r3),
    WHITELIST_FRIENDS(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aifr(String str) {
        this.value = str;
    }

    public static aifr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aifr.valueOf(str.toUpperCase(Locale.US));
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
