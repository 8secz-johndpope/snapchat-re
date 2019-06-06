package defpackage;

import defpackage.fth.a;

/* renamed from: rxp */
public enum rxp implements fth {
    CDN_CONFIG_RULES(a.a("{}")),
    REQUEST_ROUTING_RULES(a.a("[]")),
    BOLT_NETWORK_RULES(a.a(r1)),
    ENABLE_QUIC(a.a(true)),
    DATA_CONSUMPTION_LOGGING(a.a(false)),
    PROTOCOL_LIST(a.a("QUIC")),
    CLOSE_SESSION_ON_IP_CHANGE(a.a(true)),
    CRONET_LOGGING_ENABLED(a.a(true)),
    CRONET_LOG_JSON_FILE_SIZE_IN_MB(a.a(20)),
    LAST_REPORTED_FETCH_TIMESTAMP(a.a(0)),
    CUSTOM_FSN_ENDPOINT(a.a(r1)),
    CUSTOM_AUTH_FSN_ENDPOINT(a.a(r1)),
    TRAVEL_MODE_ENABLED(a.a(false)),
    DATA_SAVER_EXPIRATION_MILLIS(a.a(0)),
    LAST_DATA_SAVER_MODE_INTRO_PROMPT_MILLIS(a.a(0)),
    ENABLE_THROTTLE_NETWORK_REQUEST(a.a(false)),
    MDP_TCP_FAST_OPEN_MUSHROOM(a.a(0)),
    ADD_MEDIA_TYPE_INTO_REQUEST_HEADER(a.a(false)),
    BANDWIDTH_HISTORY(a.a(r1)),
    METADATA_CONCURRENCY_CONTROL_ENABLED(a.a(false)),
    METADATA_CONCURRENCY_CONTROL_CONFIG(a.a(r1)),
    LARGE_MEDIA_CONCURRENCY_CONTROL_ENABLED(a.a(false)),
    LARGE_MEDIA_CONCURRENCY_CONTROL_CONFIG(a.a(r1)),
    CRONET_IDLE_SOCKET_USED_TIMEOUT(a.a(-1)),
    CRONET_IDLE_SOCKET_UNUSED_TIMEOUT(a.a(-1)),
    NETWORK_OPS_GRAPHENE_METRICS_ENABLED(a.a(false)),
    LARGE_MEDIA_CONCURRENCY_CONTROL_BY_CONTENT_TYPE(a.a(r1)),
    FOREGROUND_PREFETCH_IS_WWAN_ENABLED(a.a(false)),
    FOREGROUND_PREFETCH_IS_OFF_PAGE_ENABLED(a.a(false)),
    FOREGROUND_PREFETCH_CONTINUE_BG_SECS(a.a(0)),
    FOREGROUND_PREFETCH_RETRY_NUM(a.a(0)),
    CONNECTIVITY_SOURCE_FRESHNESS_THRESHOLD_MILLIS(a.a(15000));
    
    private final a<?> delegate;

    private rxp(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.NETWORK;
    }
}
