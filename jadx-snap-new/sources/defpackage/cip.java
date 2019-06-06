package defpackage;

import defpackage.fth.a;
import java.util.concurrent.TimeUnit;

/* renamed from: cip */
public enum cip implements fth {
    ENABLE_DEBUG_REQUEST(a.a(false)),
    DEBUG_AD_ID(a.a(r2)),
    ENABLE_TEST_GROUP_QA(a.a(false)),
    SNAP_ADS_LOG_VIEWER(a.a(false)),
    USER_AD_ID(a.a(r2)),
    USER_AD_ID_TIMESTAMP(a.a(0)),
    USER_AD_ID_TTL_MS(a.a(TimeUnit.DAYS.toMillis(30))),
    LIMIT_AD_TRACKING_ENABLED(a.a(false)),
    RAW_AD_USER_DATA(a.a(r2)),
    USER_DATA(a.a(r2)),
    AUDIENCE_MATCH_OPT_OUT(a.a(false)),
    EXTERNAL_ACTIVITY_MATCH_OPT_OUT(a.a(false)),
    RAW_USER_DATA_TIMESTAMP(a.a(0)),
    RAW_USER_DATA_TTL_MS(a.a(TimeUnit.MINUTES.toMillis(5))),
    SCEID(a.a(r2)),
    PIXEL_TOKEN(a.a(r2));
    
    private final a<?> delegate;

    private cip(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.AD_INFO;
    }
}
