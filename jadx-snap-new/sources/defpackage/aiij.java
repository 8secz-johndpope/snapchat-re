package defpackage;

import java.util.Locale;

/* renamed from: aiij */
public enum aiij {
    BITMOJI(r2),
    EMOJI(r3),
    GEOSTICKER(r4),
    SNAPCHAT(r5),
    CUSTOMSTICKER(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aiij(String str) {
        this.value = str;
    }

    public static aiij a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aiij.valueOf(str.toUpperCase(Locale.US));
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
