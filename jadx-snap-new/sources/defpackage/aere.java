package defpackage;

import java.util.Locale;

/* renamed from: aere */
public enum aere {
    SKIP_UNLOCKABLES(r2),
    SKIP_VENUES(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aere(String str) {
        this.value = str;
    }

    public static aere a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aere.valueOf(str.toUpperCase(Locale.US));
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
