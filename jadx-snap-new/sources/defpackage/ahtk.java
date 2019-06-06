package defpackage;

import java.util.Locale;

/* renamed from: ahtk */
public enum ahtk {
    ACTIVE(r2),
    PENDING(r3),
    REJECTED(r4),
    COMPLETED(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ahtk(String str) {
        this.value = str;
    }

    public static ahtk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahtk.valueOf(str.toUpperCase(Locale.US));
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
