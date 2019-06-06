package defpackage;

import java.util.Locale;

/* renamed from: ahgg */
public enum ahgg {
    PAIRED(r2),
    NOT_PAIRED(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ahgg(String str) {
        this.value = str;
    }

    public static ahgg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahgg.valueOf(str.toUpperCase(Locale.US));
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
