package defpackage;

import java.util.Locale;

/* renamed from: afdu */
public enum afdu {
    FILTER(r2),
    LENS(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private afdu(String str) {
        this.value = str;
    }

    public static afdu a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afdu.valueOf(str.toUpperCase(Locale.US));
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
