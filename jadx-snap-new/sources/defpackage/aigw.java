package defpackage;

import java.util.Locale;

/* renamed from: aigw */
public enum aigw {
    IOS(r2),
    ANDROID(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aigw(String str) {
        this.value = str;
    }

    public static aigw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aigw.valueOf(str.toUpperCase(Locale.US));
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
