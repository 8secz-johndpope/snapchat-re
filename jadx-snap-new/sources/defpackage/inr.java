package defpackage;

import defpackage.ily.a;

/* renamed from: inr */
public enum inr implements ily {
    INIT,
    GET_CONFIG,
    EVAL_RULE,
    RETRIEVE_RULE,
    RETRIEVE_RULE_MISMATCH,
    UNKNOWN_PROPERTY,
    PROPERTY_CACHE_HIT,
    SYNC_REQUEST,
    SYNC_REQUEST_ERROR,
    DB_UPDATE,
    FETCH_SNAP_TOKEN,
    AB_METRICS;

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
        return ink.CIRCUMSTANCE_ENGINE;
    }

    public final ilz b() {
        return a.a(this);
    }
}
