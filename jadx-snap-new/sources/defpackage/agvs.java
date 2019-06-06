package defpackage;

import java.util.Locale;

/* renamed from: agvs */
public enum agvs {
    GCS_ONLY(r2),
    S3_COMPATIBLE(r3),
    S3_ERROR_HANDLING(r4),
    DYNAMIC(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private agvs(String str) {
        this.value = str;
    }

    public static agvs a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agvs.valueOf(str.toUpperCase(Locale.US));
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
