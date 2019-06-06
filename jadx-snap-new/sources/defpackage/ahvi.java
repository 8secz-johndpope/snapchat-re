package defpackage;

import java.util.Locale;

/* renamed from: ahvi */
public enum ahvi {
    PENDING_UPLOAD(r2),
    UPLOAD_COMPLETED(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ahvi(String str) {
        this.value = str;
    }

    public static ahvi a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahvi.valueOf(str.toUpperCase(Locale.US));
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
