package defpackage;

import java.util.Locale;

/* renamed from: aetq */
public enum aetq {
    NOT_REACHABLE(r2),
    REACHABLE(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aetq(String str) {
        this.value = str;
    }

    public static aetq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aetq.valueOf(str.toUpperCase(Locale.US));
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
