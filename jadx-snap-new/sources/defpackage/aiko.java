package defpackage;

import java.util.Locale;

/* renamed from: aiko */
public enum aiko {
    DISPLAY_NAME(r2),
    USERNAME(r3),
    BIRTHDAY(r4),
    PASSWORD(r5),
    EMAIL(r6),
    PHONE_NUMBER(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private aiko(String str) {
        this.value = str;
    }

    public static aiko a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aiko.valueOf(str.toUpperCase(Locale.US));
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
