package defpackage;

import java.util.Locale;

/* renamed from: aezb */
public enum aezb {
    SRT_INTERSTITIAL(r2),
    SRT_CONTEXT(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aezb(String str) {
        this.value = str;
    }

    public static aezb a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aezb.valueOf(str.toUpperCase(Locale.US));
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
