package defpackage;

import java.util.Locale;

/* renamed from: agrf */
public enum agrf {
    INSTASNAP(r2),
    MISS_ETIKATE(r3),
    GREYSCALE(r4),
    SMOOTHING(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private agrf(String str) {
        this.value = str;
    }

    public static agrf a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agrf.valueOf(str.toUpperCase(Locale.US));
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
