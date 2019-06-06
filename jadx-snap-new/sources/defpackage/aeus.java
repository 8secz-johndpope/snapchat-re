package defpackage;

import java.util.Locale;

/* renamed from: aeus */
public enum aeus {
    ANDROID(r2),
    IOS(r3),
    SERVER(r4),
    UNRECOGNIZED_VALUE(r5);
    
    private final String value;

    private aeus(String str) {
        this.value = str;
    }

    public static aeus a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeus.valueOf(str.toUpperCase(Locale.US));
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
