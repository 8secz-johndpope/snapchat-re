package defpackage;

import java.util.Locale;

/* renamed from: aeyg */
public enum aeyg {
    REMOTE_WEB_PAGE(r2),
    COGNAC(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aeyg(String str) {
        this.value = str;
    }

    public static aeyg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeyg.valueOf(str.toUpperCase(Locale.US));
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
