package defpackage;

import java.util.Locale;

/* renamed from: afai */
public enum afai {
    GEOLOCATION(r2),
    UNRECOGNIZED_VALUE(r3);
    
    private final String value;

    private afai(String str) {
        this.value = str;
    }

    public static afai a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afai.valueOf(str.toUpperCase(Locale.US));
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
