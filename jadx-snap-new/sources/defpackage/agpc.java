package defpackage;

import java.util.Locale;

/* renamed from: agpc */
public enum agpc {
    WEATHER(r2),
    SPEED(r3),
    BATTERY(r4),
    DATE(r5),
    ALTITUDE(r6),
    RATING(r7),
    VENUE(r8),
    GROUP(r8),
    MENTION("MENTION"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private agpc(String str) {
        this.value = str;
    }

    public static agpc a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agpc.valueOf(str.toUpperCase(Locale.US));
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
