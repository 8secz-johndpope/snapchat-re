package defpackage;

import java.util.Locale;

/* renamed from: ailq */
public enum ailq {
    WIFI(r2),
    CELLULAR(r3),
    OFFLINE(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ailq(String str) {
        this.value = str;
    }

    public static ailq a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ailq.valueOf(str.toUpperCase(Locale.US));
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
