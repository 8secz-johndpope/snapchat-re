package defpackage;

import java.util.Locale;

/* renamed from: afaw */
public enum afaw {
    CHAT(r2),
    PREVIEW(r3),
    LENSES(r4),
    ODG(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private afaw(String str) {
        this.value = str;
    }

    public static afaw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afaw.valueOf(str.toUpperCase(Locale.US));
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
