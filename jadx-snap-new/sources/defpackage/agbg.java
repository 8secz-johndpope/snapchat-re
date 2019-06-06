package defpackage;

import java.util.Locale;

/* renamed from: agbg */
public enum agbg {
    MISSING_CHECK_SUM(r2),
    LOGIN(r3),
    FETCH_CONVERSATION(r4),
    CHEETAH_PROFILE(r5),
    FRIEND_API(r6),
    MOB_STORY(r7),
    P2R(r8),
    APP_FORGROUND(r8),
    UFS_PARTIAL("UFS_PARTIAL"),
    USER_RETRY("USER_RETRY"),
    PAGINATION("PAGINATION"),
    BACKGROUND_FETCH("BACKGROUND_FETCH"),
    NOTIFICATION_FETCH("NOTIFICATION_FETCH"),
    MAP_FETCH("MAP_FETCH"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private agbg(String str) {
        this.value = str;
    }

    public static agbg a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agbg.valueOf(str.toUpperCase(Locale.US));
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
