package defpackage;

import java.util.Locale;

/* renamed from: ahyk */
public enum ahyk {
    FRONT_FACING(r2),
    REAR_FACING(r3),
    MIXED_FACING(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahyk(String str) {
        this.value = str;
    }

    public static ahyk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahyk.valueOf(str.toUpperCase(Locale.US));
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