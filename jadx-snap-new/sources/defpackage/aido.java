package defpackage;

import java.util.Locale;

/* renamed from: aido */
public enum aido {
    RESERVED_TRAFFIC(r2),
    UNRECOGNIZED_VALUE(r3);
    
    private final String value;

    private aido(String str) {
        this.value = str;
    }

    public static aido a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aido.valueOf(str.toUpperCase(Locale.US));
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
