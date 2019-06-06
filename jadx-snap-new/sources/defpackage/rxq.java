package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rxq */
public final class rxq implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(rxp.DATA_CONSUMPTION_LOGGING, new hxh("DATA_CONSUMPTION_TRACKING_MUSHROOM", str, true));
            builder.put(rxp.ENABLE_THROTTLE_NETWORK_REQUEST, new hxh("MDP_MUSHROOM_NETWORK_REQUEST_THROTTLE", "ENABLE_THROTTLE", true));
            builder.put(rxp.MDP_TCP_FAST_OPEN_MUSHROOM, new hxh("MDP_TCP_FAST_OPEN_MUSHROOM", "MODE", true));
            String str2 = "ANDROID_CONCURRENCY_CONTROL";
            builder.put(rxp.METADATA_CONCURRENCY_CONTROL_ENABLED, new hxh(str2, "METADATA_ENABLED", true));
            builder.put(rxp.METADATA_CONCURRENCY_CONTROL_CONFIG, new hxh(str2, "METADATA_CONFIG", true));
            builder.put(rxp.LARGE_MEDIA_CONCURRENCY_CONTROL_ENABLED, new hxh(str2, "LARGE_MEDIA_ENABLED", true));
            builder.put(rxp.LARGE_MEDIA_CONCURRENCY_CONTROL_CONFIG, new hxh(str2, "LARGE_MEDIA_CONFIG", true));
            str2 = "MDP_MUSHROOM_CRONET_IDLE_SOCKET_TIMEOUT";
            builder.put(rxp.CRONET_IDLE_SOCKET_USED_TIMEOUT, new hxh(str2, "USED_TIMEOUT", true));
            builder.put(rxp.CRONET_IDLE_SOCKET_UNUSED_TIMEOUT, new hxh(str2, "UNUSED_TIMEOUT", true));
            builder.put(rxp.NETWORK_OPS_GRAPHENE_METRICS_ENABLED, new hxh("ANDROID_GRAPHENE_NETWORK_METRICS", str, true));
            builder.put(rxp.LARGE_MEDIA_CONCURRENCY_CONTROL_BY_CONTENT_TYPE, new hxh("MDP_MUSHROOM_CONCURRENCY_CONTROL_BY_CONTENT_TYPE", str, true));
            str = "MDP_MUSHROOM_FOREGROUND_PREFETCH";
            builder.put(rxp.FOREGROUND_PREFETCH_IS_WWAN_ENABLED, new hxh(str, "isWWANEnabled", true));
            builder.put(rxp.FOREGROUND_PREFETCH_IS_OFF_PAGE_ENABLED, new hxh(str, "isOffPageEnabled", true));
            builder.put(rxp.FOREGROUND_PREFETCH_CONTINUE_BG_SECS, new hxh(str, "continueBackgroundSeconds", true));
            builder.put(rxp.FOREGROUND_PREFETCH_RETRY_NUM, new hxh(str, "retryNum", true));
            builder.put(rxp.CONNECTIVITY_SOURCE_FRESHNESS_THRESHOLD_MILLIS, new hxh("MDP_MUSHROOM_CONNECTIVITY_SOURCE", "FRESHNESS_THRESHOLD_MILLIS", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
