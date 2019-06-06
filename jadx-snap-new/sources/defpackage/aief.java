package defpackage;

import java.util.Locale;

/* renamed from: aief */
public enum aief {
    AE(r2),
    AU(r3),
    BR(r4),
    CA(r5),
    DE(r6),
    FR(r7),
    GB(r8),
    SA(r8),
    US(juk.c),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aief(String str) {
        this.value = str;
    }

    public static aief a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aief.valueOf(str.toUpperCase(Locale.US));
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
