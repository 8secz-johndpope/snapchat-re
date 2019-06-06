package defpackage;

import java.util.Locale;

/* renamed from: ahba */
public enum ahba {
    FETCH(r2),
    EDIT_NAME(r3),
    ADD_PARTICIPANTS(r4),
    LEAVE(r5),
    EDIT_NOTIFICATION(r6),
    ADD_BLOCKED_PARTICIPANT_EXCEPTIONS(r7),
    MUTE_STORY(r8),
    EDIT_MENTION_NOTIFICATION(r8),
    ADD_PARTICIPANTS_DOLPHIN("ADD_PARTICIPANTS_DOLPHIN"),
    CREATE_INVITE("CREATE_INVITE"),
    DELETE_INVITES("DELETE_INVITES"),
    ADD_PARTICIPANT_BY_INVITE("ADD_PARTICIPANT_BY_INVITE"),
    MUTE_COGNAC_NOTIFICATION("MUTE_COGNAC_NOTIFICATION"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private ahba(String str) {
        this.value = str;
    }

    public static ahba a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return ahba.valueOf(str.toUpperCase(Locale.US));
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
