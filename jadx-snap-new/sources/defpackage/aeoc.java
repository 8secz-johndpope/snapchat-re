package defpackage;

import java.util.Locale;

/* renamed from: aeoc */
public enum aeoc {
    INVITE_BY_LINK(r2),
    INVITE_BY_SNAP(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aeoc(String str) {
        this.value = str;
    }

    public static aeoc a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeoc.valueOf(str.toUpperCase(Locale.US));
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
