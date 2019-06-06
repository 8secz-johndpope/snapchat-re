package defpackage;

import java.util.Locale;

/* renamed from: agnb */
public enum agnb {
    UNSET(r2),
    WHOLE_STORY(r3),
    TILES_ONLY(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private agnb(String str) {
        this.value = str;
    }

    public static agnb a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agnb.valueOf(str.toUpperCase(Locale.US));
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
