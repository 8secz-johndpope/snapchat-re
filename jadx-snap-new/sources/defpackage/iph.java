package defpackage;

import defpackage.ily.a;

/* renamed from: iph */
public enum iph implements ily {
    LOAD_WEB_NAVIGATION_TIMING_ERROR,
    LOAD_WEB_PAINT_TIMING_ERROR,
    LOAD_WEB_MEMORY_USAGE_ERROR,
    LOAD_RESOURCE_REQUEST_SIZE_ERROR,
    USER_AGENT_CONSTRUCT_ERROR,
    CONTENT_MANAGER_REQUEST_FAIL,
    CONTENT_MANAGER_REQUEST_ERROR,
    JS_BRIDGE_ON_ERROR,
    SAFE_BROWSING_VALIDATION_FAIL,
    EXPERIMENTS_SYNC_ERROR,
    COOKIE_MANAGER_SET_COOKIE_ERROR,
    SAFE_BROWSING_LATENCY,
    LOAD_URL_ERROR;

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
        return ink.WEB;
    }

    public final ilz b() {
        return a.a(this);
    }
}
