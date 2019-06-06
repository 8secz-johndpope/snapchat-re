package defpackage;

import defpackage.ily.a;

/* renamed from: inu */
public enum inu implements ily {
    TOTAL_REQUEST_COUNT,
    TOTAL_BOLT_REQUEST_COUNT,
    TOTAL_NETWORK_REQUEST_COUNT,
    TOTAL_IMPORT_REQUEST_COUNT,
    SUCCESS_REQUEST_COUNT,
    FAILED_BOLT_RESOLVE_COUNT,
    BOLT_RESOLVE_TIMEOUT_COUNT,
    FAILED_REQUEST_COUNT,
    FAILED_NETWORK_REQUEST_COUNT,
    FAILED_IMPORT_REQUEST_COUNT,
    CANCELLED_REQUEST_COUNT,
    CACHE_MISS_COUNT,
    REJECTED_PREFETCH_COUNT,
    TOTAL_LATENCY,
    SUCCESS_REQUESTS_TOTAL_LATENCY,
    BOLT_RESOLVE_LATENCY,
    BOLT_WRAPPER_READ_LATENCY,
    CACHE_MISS_LATENCY,
    CACHE_HIT_LATENCY,
    NETWORK_LATENCY,
    NETWORK_QUEUING_LATENCY,
    NETWORK_TOTAL_LATENCY,
    NETWORK_PROCESS_LATENCY,
    CONTENT_INJECT_LATENCY,
    REQUEST_DEDUP_COUNT,
    NETWORK_RESPONSE_SIZE,
    TOTAL_ASSET_BYTES,
    NUMBER_OF_ASSETS,
    CACHE_MAX_TTL,
    CACHE_MAX_SIZE,
    CACHE_REFRESH_TTL;

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
        return ink.CONTENT_MANAGER;
    }

    public final ilz b() {
        return a.a(this);
    }
}
