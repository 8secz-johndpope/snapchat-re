package defpackage;

import java.util.Locale;

/* renamed from: agaw */
public enum agaw {
    DISCOVER(r2),
    SHARED_STORY(r3),
    PROMOTED_STORY(r4),
    MAP_CARD(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private agaw(String str) {
        this.value = str;
    }

    public static agaw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agaw.valueOf(str.toUpperCase(Locale.US));
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
