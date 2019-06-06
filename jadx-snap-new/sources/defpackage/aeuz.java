package defpackage;

import java.util.Locale;

/* renamed from: aeuz */
public enum aeuz {
    SNAP_REPLAY(r2),
    UNRECOGNIZED_VALUE(r3);
    
    private final String value;

    private aeuz(String str) {
        this.value = str;
    }

    public static aeuz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeuz.valueOf(str.toUpperCase(Locale.US));
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
