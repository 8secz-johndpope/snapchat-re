package defpackage;

import java.util.Locale;

/* renamed from: aicg */
public enum aicg {
    TRIGGER_CONTEXT(r2),
    FRIEND_CONTEXT(r3),
    CAMERA_CONTEXT(r4),
    MEDIA_TYPE_CONTEXT(r5),
    ACTIONMOJI_CONTEXT(r6),
    VISUAL_CONTEXT(r7),
    LENS_APPLICABLE_CONTEXT(r8),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private aicg(String str) {
        this.value = str;
    }

    public static aicg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aicg.valueOf(str.toUpperCase(Locale.US));
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
