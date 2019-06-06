package defpackage;

import java.util.Locale;

/* renamed from: afne */
public enum afne {
    DISK_USAGE(r2),
    NETWORK_REQUEST(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private afne(String str) {
        this.value = str;
    }

    public static afne a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afne.valueOf(str.toUpperCase(Locale.US));
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
