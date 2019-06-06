package defpackage;

import java.util.Locale;

/* renamed from: aerq */
public enum aerq {
    EQUAL(r2),
    DELTA(r3),
    NOT_EQUAL(r4),
    NOT_SUPPORT(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aerq(String str) {
        this.value = str;
    }

    public static aerq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aerq.valueOf(str.toUpperCase(Locale.US));
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
