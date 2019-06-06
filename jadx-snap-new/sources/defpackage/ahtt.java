package defpackage;

import java.util.Locale;

/* renamed from: ahtt */
public enum ahtt {
    ENTITY_ACTIVE(r2),
    ENTITY_PAUSED(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ahtt(String str) {
        this.value = str;
    }

    public static ahtt a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahtt.valueOf(str.toUpperCase(Locale.US));
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
