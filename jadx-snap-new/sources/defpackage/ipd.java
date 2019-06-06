package defpackage;

import defpackage.ily.a;

/* renamed from: ipd */
public enum ipd implements ily {
    PROCESS_STORIES_RESPONSE,
    PROCESS_FRIENDS_STORIES,
    PROCESS_ORDERING_RESPONSE,
    PROCESS_STORY_MANAGEMENT,
    PROCESS_STORY_SYNC_STATE,
    PROCESS_DELETED_STORIES,
    DELETE_EXPIRED_STORY_SNAPS;

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
        return ink.STORIES;
    }

    public final ilz b() {
        return a.a(this);
    }
}
