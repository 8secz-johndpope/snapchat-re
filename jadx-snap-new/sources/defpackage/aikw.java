package defpackage;

import java.util.Locale;

/* renamed from: aikw */
public enum aikw {
    OK(r2),
    ERROR(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aikw(String str) {
        this.value = str;
    }

    public static aikw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aikw.valueOf(str.toUpperCase(Locale.US));
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
