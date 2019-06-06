package defpackage;

import java.util.Locale;

/* renamed from: agqm */
public enum agqm {
    FAST2X(r2),
    FAST4X(r3),
    SLOW2X(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agqm(String str) {
        this.value = str;
    }

    public static agqm a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agqm.valueOf(str.toUpperCase(Locale.US));
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
