package defpackage;

import java.util.Locale;

/* renamed from: afdh */
public enum afdh {
    FENCE(r2),
    NONE(r3),
    CONCEPT_IDS(r4),
    USER_IDS(r5),
    USER_AND_GROUP_IDS(r6),
    COUNTRIES(r7),
    GLOBAL(r8),
    TARGETING_EXPRESSION(r8),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afdh(String str) {
        this.value = str;
    }

    public static afdh a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afdh.valueOf(str.toUpperCase(Locale.US));
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
