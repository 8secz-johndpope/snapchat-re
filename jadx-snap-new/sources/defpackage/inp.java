package defpackage;

import defpackage.ily.a;

/* renamed from: inp */
public enum inp implements ily {
    COULD_NOT_PARSE_PROTO,
    NETWORK_MAPPING_DISK_TIME,
    NETWORK_MAPPING_REFRESH_TIME,
    NETWORK_MAPPING_REQ_TIME,
    NO_RESOLVED_URLS,
    PROVIDE_CLIENT_RULES_TIME,
    PROVIDE_NETWORK_MAPPING_TIME,
    RESOLVE_TIME,
    STORY_TO_URL_TIME,
    STORY_URL_COMPARISON,
    UNREPLACED_PLACEHOLDER;

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
        return ink.BOLT;
    }

    public final ilz b() {
        return a.a(this);
    }
}
