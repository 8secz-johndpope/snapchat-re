package defpackage;

import defpackage.ily.a;

/* renamed from: ine */
public enum ine implements ily {
    FRIEND_STORY_PUSH_RECEIVED,
    FRIEND_STORY_PUSH_SYNCED,
    FRIEND_STORY_PUSH_PROCESSED,
    FRIEND_STORY_PUSH_FAILED,
    FRIEND_STORY_PUSH_FAILED_INVALID,
    FRIEND_STORY_PUSH_ERROR_SYNC,
    FRIEND_STORY_PUSH_ERROR_DISPLAY,
    FRIEND_STORY_PUSH_ERROR_CACHE,
    FRIEND_STORY_PUSH_ERROR_TIMEOUT,
    FRIEND_STORY_PUSH_ERROR_BITMOJI,
    FRIEND_STORY_PUSH_ERROR_THUMB,
    FRIEND_STORY_PUSH_ERROR_RENDER;

    public final ilz a(String str, Enum<?> enumR) {
        akcr.b(str, "shortKey");
        akcr.b(enumR, "shortValue");
        return a.a((ily) this, str, (Enum) enumR);
    }

    public final ilz a(String str, String str2) {
        akcr.b(str, "shortKey");
        akcr.b(str2, "shortValue");
        return a.a((ily) this, str, str2);
    }

    public final ilz a(String str, boolean z) {
        akcr.b(str, "shortKey");
        return a.a((ily) this, str, z);
    }

    public final ink a() {
        return ink.STORY_NOTIFICATION;
    }

    public final ilz b() {
        return a.a(this);
    }
}
