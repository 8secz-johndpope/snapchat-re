package defpackage;

import java.util.Locale;

/* renamed from: agcp */
public enum agcp {
    UNKNOWN(r2),
    TILE_HORIZONTAL(r3),
    LARGE_CIRCULAR_HORIZONTAL(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agcp(String str) {
        this.value = str;
    }

    public static agcp a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agcp.valueOf(str.toUpperCase(Locale.US));
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
