package defpackage;

import java.util.Locale;

/* renamed from: aica */
public enum aica {
    UNKNOWN(r2),
    FRIEND_FILTER(r3),
    FRAME_FILTER(r4),
    COMMUNITY_FILTER(r5),
    EVENT_FILTER(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aica(String str) {
        this.value = str;
    }

    public static aica a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aica.valueOf(str.toUpperCase(Locale.US));
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
