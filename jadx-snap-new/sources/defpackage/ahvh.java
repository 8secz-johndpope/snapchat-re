package defpackage;

import java.util.Locale;

/* renamed from: ahvh */
public enum ahvh {
    NOT_PUBLISHED(r2),
    PUBLISH_IN_PROGRESS(r3),
    PUBLISH_COMPLETE(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahvh(String str) {
        this.value = str;
    }

    public static ahvh a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahvh.valueOf(str.toUpperCase(Locale.US));
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
