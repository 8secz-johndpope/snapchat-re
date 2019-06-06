package defpackage;

import java.util.Locale;

/* renamed from: ahet */
public enum ahet {
    CONTACT_FRIEND_SUGGESTION(r2),
    SENDTO_USER_SUGGESTION(r3),
    STORY_USER_SUGGESTION(r4),
    CONTACT_USER_SUGGESTION(r5),
    NEW_SNAPCHATTER_SUGGESTION(r6),
    FRIEND_GRAPH_SUGGESTION(r7),
    UNRECOGNIZED_VALUE(r8);
    
    private final String value;

    private ahet(String str) {
        this.value = str;
    }

    public static ahet a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahet.valueOf(str.toUpperCase(Locale.US));
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
