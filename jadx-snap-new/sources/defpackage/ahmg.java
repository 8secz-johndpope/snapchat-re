package defpackage;

import java.util.Locale;

/* renamed from: ahmg */
public enum ahmg {
    ENABLED(r2),
    DISABLED(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ahmg(String str) {
        this.value = str;
    }

    public static ahmg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahmg.valueOf(str.toUpperCase(Locale.US));
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
