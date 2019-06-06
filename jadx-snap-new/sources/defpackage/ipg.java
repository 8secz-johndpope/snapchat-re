package defpackage;

import defpackage.ily.a;

/* renamed from: ipg */
public enum ipg implements ily {
    AUTOMEASURE,
    REQUEST_LATENCY,
    REQUEST_STATUS,
    REQUEST_ERROR_INFO,
    DATABASE_MODEL_SERIALIZATION,
    DATABASE_MODEL_DESERIALIZATION,
    DB_DESERIALIZATION_FAILED,
    REQUEST_CALLSITE,
    DATABASE_QUERY,
    DATABASE_QUERY_LATENCY,
    GTQ_SERVE_SENSITIVITY,
    CHECKSUM_MISMATCH,
    CHECKSUM_MISSING,
    CHECKSUM_LIST_SIZE_REQUEST,
    CHECKSUM_LIST_SIZE_RESPONSE,
    FULL_GEOFILTER_SIZE_RESPONSE;

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
        return ink.UNLOCKABLES;
    }

    public final ilz b() {
        return a.a(this);
    }
}
