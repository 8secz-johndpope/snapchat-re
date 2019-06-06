package defpackage;

import java.util.Locale;

/* renamed from: aeuv */
public enum aeuv {
    PRELOAD(r2),
    WIFI_ONLY_PRELOAD(r3),
    NO_PRELOAD(r4),
    POOR_CONNECTION_PRELOAD(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aeuv(String str) {
        this.value = str;
    }

    public static aeuv a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeuv.valueOf(str.toUpperCase(Locale.US));
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
