package defpackage;

import java.util.Locale;

/* renamed from: aewo */
public enum aewo {
    FRIENDSHIP_PROFILE(r2),
    GROUP_PROFILE(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aewo(String str) {
        this.value = str;
    }

    public static aewo a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aewo.valueOf(str.toUpperCase(Locale.US));
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
