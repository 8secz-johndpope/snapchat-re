package defpackage;

import java.util.Locale;

/* renamed from: afax */
public enum afax {
    SNAPCHAT(r2),
    BITMOJI(r3),
    GEOSTICKER(r4),
    EMOJI(r5),
    CUSTOM_STICKER(r6),
    BITMOJI_LENS(r7),
    UNLOCKABLE_STICKER(r8),
    GIPHY(r8),
    SNAP_CONNECT("SNAP_CONNECT"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afax(String str) {
        this.value = str;
    }

    public static afax a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afax.valueOf(str.toUpperCase(Locale.US));
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
