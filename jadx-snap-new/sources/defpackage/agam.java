package defpackage;

import java.util.Locale;

/* renamed from: agam */
public enum agam {
    SUBSCRIPTION(r2),
    LIVE(r3),
    FEATURED(r4),
    SHOW(r5),
    OTHER(r6),
    PUBLISHERS(r7),
    SPONSORED(r8),
    OFFICIAL(r8),
    MAP("MAP"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private agam(String str) {
        this.value = str;
    }

    public static agam a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agam.valueOf(str.toUpperCase(Locale.US));
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
