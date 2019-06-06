package defpackage;

import java.util.Locale;

/* renamed from: aiby */
public enum aiby {
    OPEN_CAMERA(r2),
    ONE_TO_ONE_CHAT(r3),
    GROUP_CHAT(r4),
    GROUP_STORY(r5),
    UNRECOGNIZED_VALUE(r6);
    
    private final String value;

    private aiby(String str) {
        this.value = str;
    }

    public static aiby a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aiby.valueOf(str.toUpperCase(Locale.US));
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
