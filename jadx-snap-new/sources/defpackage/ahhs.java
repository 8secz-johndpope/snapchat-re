package defpackage;

import java.util.Locale;

/* renamed from: ahhs */
public enum ahhs {
    VIEWABLE(r2),
    EXPIRED(r3),
    DELETED(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahhs(String str) {
        this.value = str;
    }

    public static ahhs a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahhs.valueOf(str.toUpperCase(Locale.US));
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
