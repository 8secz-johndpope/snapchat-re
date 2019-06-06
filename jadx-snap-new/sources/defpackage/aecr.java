package defpackage;

import java.util.Locale;

/* renamed from: aecr */
public enum aecr {
    ADDED_BY_PHONE(r2),
    ADDED_BY_USERNAME(r3),
    ADDED_BY_QR_CODE(r4),
    ADDED_BY_ADDED_ME_BACK(r5),
    ADDED_BY_NEARBY(r6),
    ADDED_BY_SUGGESTED(r7),
    ADDED_BY_OFFICIAL_STORY_SEARCH(r8),
    ADDED_BY_DEEP_LINK(r8),
    ADDED_BY_INVITE("ADDED_BY_INVITE"),
    ADDED_BY_STORY_CHROME("ADDED_BY_STORY_CHROME"),
    ADDED_BY_SHARED_USERNAME("ADDED_BY_SHARED_USERNAME"),
    ADDED_BY_SHARED_STORY("ADDED_BY_SHARED_STORY"),
    ADDED_BY_GROUP_CHAT("ADDED_BY_GROUP_CHAT"),
    ADDED_BY_SHAZAM("ADDED_BY_SHAZAM"),
    ADDED_BY_MOB("ADDED_BY_MOB"),
    ADDED_BY_FEATURED_OFFICIAL_STORY("ADDED_BY_FEATURED_OFFICIAL_STORY"),
    ADDED_FROM_OUR_STORY("ADDED_FROM_OUR_STORY"),
    ADDED_BY_INFLUENCER_RECOMMENDATION("ADDED_BY_INFLUENCER_RECOMMENDATION"),
    ADDED_BY_DISPLAY_NAME("ADDED_BY_DISPLAY_NAME"),
    ADDED_BY_TEST("ADDED_BY_TEST"),
    ADDED_BY_MENTION("ADDED_BY_MENTION"),
    ADDED_BY_SUBSCRIPTION("ADDED_BY_SUBSCRIPTION"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private aecr(String str) {
        this.value = str;
    }

    public static aecr a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aecr.valueOf(str.toUpperCase(Locale.US));
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
