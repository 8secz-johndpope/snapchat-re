package defpackage;

import java.util.Locale;

/* renamed from: aily */
public enum aily {
    SHAKE_REPORT(r2),
    CRASH_REPORT(r3),
    IN_SETTING_REPORT(r4),
    IN_GAME(r5),
    KARMA_CRASH_REPORT(r6),
    RATING_IN_APP(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private aily(String str) {
        this.value = str;
    }

    public static aily a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aily.valueOf(str.toUpperCase(Locale.US));
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
