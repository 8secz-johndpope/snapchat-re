package defpackage;

import defpackage.ily.a;

/* renamed from: inz */
public enum inz implements ily {
    PARSE_PROMOTED_STORY_CARD,
    PRE_INFLATE_ALL_VIEWS,
    DEEPLINK_RECEIVED,
    DEEPLINK_HANDLED,
    DEEPLINK_ERROR,
    DEEPLINK_DURATION,
    SHARE_START,
    SHARE_ERROR,
    SHARE_READY,
    SHARE_READY_DURATION;

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
        return ink.DISCOVER_FEED;
    }

    public final ilz b() {
        return a.a(this);
    }
}
