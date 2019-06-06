package defpackage;

import java.util.Locale;

/* renamed from: aepw */
public enum aepw {
    SNAPPABLE(r2),
    REQUIRES_BITMOJI(r3),
    REQUIRES_FRIENDMOJI(r4),
    SUPPORTS_MAGIC_MOMENT(r5),
    SUPPORTS_WORLD_LENS_POST_CAPTURE(r6),
    SUPPORTS_NEWPORT_DEPTH(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private aepw(String str) {
        this.value = str;
    }

    public static aepw a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aepw.valueOf(str.toUpperCase(Locale.US));
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
