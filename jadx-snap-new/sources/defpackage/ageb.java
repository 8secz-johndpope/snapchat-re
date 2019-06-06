package defpackage;

import java.util.Locale;

/* renamed from: ageb */
public enum ageb {
    CUSTOM(r2),
    GEOFENCE(r3),
    PRIVATE(r4),
    GROUP_CHAT(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private ageb(String str) {
        this.value = str;
    }

    public static ageb a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ageb.valueOf(str.toUpperCase(Locale.US));
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
