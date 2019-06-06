package defpackage;

import java.util.Locale;

/* renamed from: affo */
public enum affo {
    DIRECT(r2),
    RESUMABLE(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private affo(String str) {
        this.value = str;
    }

    public static affo a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return affo.valueOf(str.toUpperCase(Locale.US));
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
