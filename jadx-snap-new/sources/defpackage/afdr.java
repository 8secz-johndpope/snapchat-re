package defpackage;

import java.util.Locale;

/* renamed from: afdr */
public enum afdr {
    LENS_FILTER(r2),
    GEO_FILTER(r3),
    BITMOJI_FILTER(r4),
    STICKER_PACK(r5),
    CAPTION_STYLE(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private afdr(String str) {
        this.value = str;
    }

    public static afdr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afdr.valueOf(str.toUpperCase(Locale.US));
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
