package defpackage;

import java.util.Locale;

/* renamed from: agfe */
public enum agfe {
    RECENT_UPDATES_ORDER(r2),
    RANKING_ORDER(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private agfe(String str) {
        this.value = str;
    }

    public static agfe a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agfe.valueOf(str.toUpperCase(Locale.US));
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
