package defpackage;

import java.util.Locale;

/* renamed from: aecg */
public enum aecg {
    LIVE(r2),
    USER(r3),
    DISCOVER(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aecg(String str) {
        this.value = str;
    }

    public static aecg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aecg.valueOf(str.toUpperCase(Locale.US));
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
