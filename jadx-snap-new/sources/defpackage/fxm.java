package defpackage;

import defpackage.fth.a;

/* renamed from: fxm */
public enum fxm implements fth {
    LAST_DISK_SWEEP_TIME_MILLIS(a.a(-1)),
    BACKGROUND_PREFETCH_IS_RECURRING(a.a(true)),
    BACKGROUND_PREFETCH_USE_DEFAULT_WIFI_CONSTRAINT(a.a(true)),
    BACKGROUND_PREFETCH_NUM_RETRIES(a.a(3)),
    BACKGROUND_PREFETCH_ALWAYS_RESCHEDULE(a.a(false)),
    BACKGROUND_PREFETCH_ALLOW_BLIZZARD_LOG(a.a(true)),
    BACKGROUND_PREFETCH_EXPOSURE_LOGGING_FOREGROUND(a.a(true)),
    BACKGROUND_PREFETCH_FLUSH_GRAPHENE_EVENTUALLY(a.a(true)),
    SANITY_BACKGROUND_PREFETCH_ENABLED(a.a(false)),
    SANITY_BACKGROUND_PREFETCH_RPC_ENABLED(a.a(true)),
    MDP_CONTENT_DISK_CONFIGURATION_ENABLED(a.a(r7)),
    MDP_CONTENT_DISK_MAX_SIZE_MB(a.a(-1)),
    MDP_CONTENT_DISK_DEFAULT_TTL_DAY(a.a(-1)),
    MDP_CONTENT_DISK_REFRESH_TTL_DAY(a.a(-1)),
    CATCH_ALL_UNDELIVERABLE_EXCEPTIONS(a.a(false)),
    STATUS_413_FILTER_MAX_MIN_BYTES(a.a(3145728)),
    SAMPLING_UUID(a.a(r7));
    
    public static final int DEFAULT_BACKGROUND_PREFETCH_NUM_RETRIES = 0;
    private final a<?> delegate;

    private fxm(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.CORE;
    }
}
