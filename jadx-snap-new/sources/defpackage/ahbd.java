package defpackage;

import java.util.Locale;

/* renamed from: ahbd */
public enum ahbd {
    FRIENDS_FEED(r2),
    SEND_TO(r3),
    MOB_CREATION(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ahbd(String str) {
        this.value = str;
    }

    public static ahbd a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahbd.valueOf(str.toUpperCase(Locale.US));
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
