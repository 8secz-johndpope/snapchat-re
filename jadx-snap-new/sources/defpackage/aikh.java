package defpackage;

import java.util.Locale;

/* renamed from: aikh */
public enum aikh {
    SERVER_LOST_CONTACT(r2),
    NO_PERMISSION(r3),
    NO_USER(r4),
    COLLAB_ALREADY_EXISTS(r5),
    TOO_MANY_COLLABORATORS(r6),
    ADDING_NON_FRIEND(r7),
    COLLAB_NO_EMAIL_VERIFIED(r8),
    TOO_FEW_COLLABORATORS(r8),
    REMOVE_SELF_AS_COLLAB("REMOVE_SELF_AS_COLLAB"),
    NON_PUBLIC_STORY_PRIVACY("NON_PUBLIC_STORY_PRIVACY"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aikh(String str) {
        this.value = str;
    }

    public static aikh a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aikh.valueOf(str.toUpperCase(Locale.US));
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
