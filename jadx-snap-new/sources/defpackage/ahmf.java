package defpackage;

import java.util.Locale;

/* renamed from: ahmf */
public enum ahmf {
    ENABLED(r2),
    DISABLED(r3),
    DELETED(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahmf(String str) {
        this.value = str;
    }

    public static ahmf a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahmf.valueOf(str.toUpperCase(Locale.US));
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
