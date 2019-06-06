package defpackage;

import java.util.Locale;

/* renamed from: agdk */
public enum agdk {
    FRIEND(r2),
    SHARED_STORY(r3),
    MOB_STORY(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agdk(String str) {
        this.value = str;
    }

    public static agdk a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agdk.valueOf(str.toUpperCase(Locale.US));
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
