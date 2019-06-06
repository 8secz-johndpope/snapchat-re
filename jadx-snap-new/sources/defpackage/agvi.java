package defpackage;

import java.util.Locale;

/* renamed from: agvi */
public enum agvi {
    MEMORIES(r2),
    CAMERA_ROLL_ONLY(r3),
    MEMORIES_AND_CAMERA_ROLL(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agvi(String str) {
        this.value = str;
    }

    public static agvi a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agvi.valueOf(str.toUpperCase(Locale.US));
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
