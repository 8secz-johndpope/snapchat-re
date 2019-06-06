package defpackage;

import java.util.Locale;

/* renamed from: ahjw */
public enum ahjw {
    EVERYONE(r2),
    NO_ONE(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ahjw(String str) {
        this.value = str;
    }

    public static ahjw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahjw.valueOf(str.toUpperCase(Locale.US));
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
