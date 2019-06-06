package defpackage;

import java.util.Locale;

/* renamed from: ager */
public enum ager {
    DISCOVER_CHANNEL(r2),
    STORY(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private ager(String str) {
        this.value = str;
    }

    public static ager a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ager.valueOf(str.toUpperCase(Locale.US));
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
