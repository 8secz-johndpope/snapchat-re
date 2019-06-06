package defpackage;

import java.util.Locale;

/* renamed from: ailz */
public enum ailz {
    PROBLEM(r2),
    SUGGESTION(r3),
    CRASH(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private ailz(String str) {
        this.value = str;
    }

    public static ailz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ailz.valueOf(str.toUpperCase(Locale.US));
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
