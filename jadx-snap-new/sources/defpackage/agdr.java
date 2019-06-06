package defpackage;

import java.util.Locale;

/* renamed from: agdr */
public enum agdr {
    CAN_AUTOSAVE(r2),
    AUTOSAVE_ENABLED(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agdr(String str) {
        this.value = str;
    }

    public static agdr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agdr.valueOf(str.toUpperCase(Locale.US));
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
