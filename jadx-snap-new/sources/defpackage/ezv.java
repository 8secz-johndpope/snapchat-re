package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ezv */
public final class ezv implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "COGNAC_WHITELIST";
            builder.put(ezu.COGNAC_GATING_ENABLED, new hxh(str, "enabled", true));
            builder.put(ezu.COGNAC_RV_RATE_LIMIT, new hxh(str, "rv_rate_limit", true));
            str = "COGNAC_PRELOADING_ANDROID";
            builder.put(ezu.COGNAC_BACKGROUND_PRELOAD, new hxh(str, "ENABLE_BACKGROUND_PRELOADING", true));
            builder.put(ezu.COGNAC_PRELOAD_ON_FEED, new hxh(str, "ENABLE_PRELOAD_ON_FEED_PAGE", true));
            builder.put(ezu.INACTIVE_DAYS_THRESHOLD, new hxh(str, "INACTIVE_DAYS_THRESHOLD", true));
            builder.put(ezu.COGNAC_BACKGROUND_PRELOAD_COUNT, new hxh(str, "BACKGROUND_PRELOADING_COUNT", true));
            builder.put(ezu.COGNAC_NOTIFICATION_EXPIRATION_THRESHOLD, new hxh("COGNAC_NOTIFICATION_NAVIGATION", "open_app_time_threshold", true));
            str = "COGNAC_ADS_RATELIMIT_ANDROID";
            builder.put(ezu.COGNAC_AD_COUNT, new hxh(str, "AD_COUNT", true));
            builder.put(ezu.COGNAC_AD_CAP_SEC, new hxh(str, "AD_CAP_SEC", true));
            builder.put(ezu.COGNAC_AD_ENABLED, new hxh(str, "AD_ENABLED", true));
            builder.put(ezu.COGNAC_AD_DURATION_SEC, new hxh(str, "AD_DURATION_SEC", true));
            builder.put(ezu.COGNAC_APPLIST_EXPIRATION_IN_SECONDS, new hxh("COGNAC_APPLIST_CACHE_TTL", "expiration_in_seconds", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
