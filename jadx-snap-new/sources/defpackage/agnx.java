package defpackage;

import java.util.Locale;

/* renamed from: agnx */
public enum agnx {
    SNAP_CRAFT(r2),
    FACE_CRAFT(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agnx(String str) {
        this.value = str;
    }

    public static agnx a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agnx.valueOf(str.toUpperCase(Locale.US));
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
