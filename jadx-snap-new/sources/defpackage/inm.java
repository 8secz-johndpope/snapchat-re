package defpackage;

import defpackage.ily.a;

/* renamed from: inm */
public enum inm implements ily {
    AD_REQUEST_LATENCY,
    AD_REQUEST_STATUS,
    AD_REQUEST_SEND,
    TRACK_REQUEST_SEND,
    TRACK_URL_MISSING,
    REQUEST_ERROR_INFO,
    RESPONSE_JSON_PARSE_LATENCY,
    MEDIA_DOWNLOAD_LATENCY,
    MEDIA_DOWNLOAD_STATUS,
    MEDIA_DOWNLOAD_ERROR,
    MEDIA_PARSE_LATENCY,
    AD_OPPPORTUNITY,
    EMPTY_RAW_USER_DATA,
    EMPTY_RAW_USER_DATA_SKIP_INIT,
    AD_CACHE_STATS,
    AD_EVICTION_COUNT,
    OPS_ISSUE,
    MEDIA_DOWNLOAD_TIMED_OUT,
    FULL_VIEW_TAP_COUNT,
    VIDEO_STALL_COUNT,
    VIDEO_FIRST_BUF_TIME,
    VIDEO_ALL_BUF_TIME,
    IDFA_FETCH_STATUS,
    IDFA_FETCH_TIME,
    IDFA_GET_STATUS,
    LAT_FETCH_STATUS,
    EXIT_LOADING_AD,
    PIXEL_COOKIE_STATUS,
    PAGED_SWIPE_UP,
    BLIZZARD_SWIPE_UP,
    TRACK_SWIPE_UP,
    WEBVIEW_ANALYTICS_ERROR,
    RETRO_PERSIST,
    RETRO_PERSISTENCE_ERROR,
    RETRO_REMOVAL_ERROR,
    RETRO_REMOVAL_COUNT,
    RETRO_RETRY,
    RETRO_RETRY_RESULT,
    RETRO_RETRY_UPDATE,
    RETRO_RETRY_DELETE,
    RETRO_INVALID_PARAMS,
    RETRO_PROCESS_NOOP,
    FIX_AD_LOADING_TIME,
    FIX_AD_LOADING_RESULT,
    AD_SOURCE_DEFAULTED,
    AD_RESPONSE_SIZE,
    AD_RESOLUTION_RESULT,
    MULTI_AUCTION_AD_RESPONSE,
    RAW_USER_DATA_TTL,
    RAW_USER_DATA_STORE_TIME;

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
        return ink.ADS;
    }

    public final ilz b() {
        return a.a(this);
    }
}
