package defpackage;

import java.util.Locale;

/* renamed from: affr */
public enum affr {
    GCS(r2),
    S3(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private affr(String str) {
        this.value = str;
    }

    public static affr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return affr.valueOf(str.toUpperCase(Locale.US));
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
