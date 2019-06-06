package defpackage;

import java.util.Locale;

/* renamed from: ageg */
public enum ageg {
    OK(r2),
    REACHED_MAX_STORIES(r3),
    OVERLAPPING_LOCATION(r4),
    BAD_DISPLAYNAME(r5),
    UNKNOWN(r6),
    BAD_SUBTEXT(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private ageg(String str) {
        this.value = str;
    }

    public static ageg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ageg.valueOf(str.toUpperCase(Locale.US));
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
