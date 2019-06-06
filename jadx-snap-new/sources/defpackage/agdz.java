package defpackage;

import java.util.Locale;

/* renamed from: agdz */
public enum agdz {
    FRIENDS(r2),
    FRIENDS_OF_FRIENDS(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agdz(String str) {
        this.value = str;
    }

    public static agdz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agdz.valueOf(str.toUpperCase(Locale.US));
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
