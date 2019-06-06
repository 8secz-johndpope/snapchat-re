package defpackage;

import java.util.Locale;

/* renamed from: aibz */
public enum aibz {
    USES_FRIEND_MOJI(r2),
    AR_SEGMENTATION_SKY(r3),
    AR_SEGMENTATION_PORTRAIT(r4),
    BASIC_AR_SEGMENTATION_SKY(r5),
    BASIC_AR_SEGMENTATION_PORTRAIT(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private aibz(String str) {
        this.value = str;
    }

    public static aibz a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aibz.valueOf(str.toUpperCase(Locale.US));
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
