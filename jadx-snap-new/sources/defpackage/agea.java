package defpackage;

import java.util.Locale;

/* renamed from: agea */
public enum agea {
    RANK_CUSTOM(r2),
    RANK_GEOFENCE_1D(r3),
    RANK_GEOFENCE_2D(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agea(String str) {
        this.value = str;
    }

    public static agea a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agea.valueOf(str.toUpperCase(Locale.US));
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
