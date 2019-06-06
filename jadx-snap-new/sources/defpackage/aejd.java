package defpackage;

import java.util.Locale;

/* renamed from: aejd */
public enum aejd {
    DELETED_BY_ADDED_ME(r2),
    DELETED_BY_ADD_FRIENDS(r3),
    DELETED_BY_CAMERA(r4),
    DELETED_BY_CHAT(r5),
    DELETED_BY_CHAT_BURGER(r6),
    DELETED_BY_CHAT_FEED(r7),
    DELETED_BY_EXTERNAL(r8),
    DELETED_BY_FULL_QUICK_ADD(r8),
    DELETED_BY_MY_FRIENDS("DELETED_BY_MY_FRIENDS"),
    DELETED_BY_REPORT_USER("DELETED_BY_REPORT_USER"),
    DELETED_BY_SEARCH("DELETED_BY_SEARCH"),
    DELETED_BY_STORY("DELETED_BY_STORY"),
    DELETED_BY_STORY_FEED("DELETED_BY_STORY_FEED"),
    DELETED_BY_STORY_VIEWERS_LIST("DELETED_BY_STORY_VIEWERS_LIST"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aejd(String str) {
        this.value = str;
    }

    public static aejd a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aejd.valueOf(str.toUpperCase(Locale.US));
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
