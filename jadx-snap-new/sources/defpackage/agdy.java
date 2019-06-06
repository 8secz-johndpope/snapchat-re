package defpackage;

import java.util.Locale;

/* renamed from: agdy */
public enum agdy {
    ON(r2),
    FRIENDS_ONLY(r3),
    OFF(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agdy(String str) {
        this.value = str;
    }

    public static agdy a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agdy.valueOf(str.toUpperCase(Locale.US));
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
