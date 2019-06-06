package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mapbox.services.android.telemetry.MapboxEvent;
import java.util.Map;

/* renamed from: sud */
public final class sud implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "RESPONSIVE_LAYOUT";
            builder.put(suc.RESPONSIVE_LAYOUT_IMAGE_SNAPS, new hxh(str, "Enabled_Image_Snaps", true));
            builder.put(suc.RESPONSIVE_LAYOUT_VIDEO_SNAPS, new hxh(str, "Enabled_Video_Snaps", true));
            builder.put(suc.OPERA_CLOSE_ANIMATION_V2, new hxh("OPERA_CLOSE_ANIMATION_V2", "Enabled", true));
            str = "EXOPLAYER_REQUEST_TIMEOUT_RETRIES";
            builder.put(suc.EXOPLAYER_ENABLE_CUSTOM_HTTP_SETTINGS_EXOPLAYER, new hxh(str, "ENABLED", true));
            builder.put(suc.EXOPLAYER_CONNECTION_TIMEOUT, new hxh(str, "CONNECTION_TIMEOUT_MS", true));
            builder.put(suc.EXOPLAYER_REQUEST_TIMEOUT, new hxh(str, "REQUEST_TIMEOUT_MS", true));
            builder.put(suc.EXOPLAYER_REQUEST_RETRIES, new hxh(str, "REQUEST_RETRIES", true));
            str = "MUSHROOM_MEMORY_ERRORS";
            builder.put(suc.LOG_HIGH_RESOLUTION_IMAGES, new hxh(str, "enableHighResLogging", true));
            builder.put(suc.ENABLE_HARD_RESOLUTION_LIMIT_FOR_IMAGES, new hxh(str, "enableResolutionLimit", true));
            str = "MDP_OPERA_INLINE_PRELOAD_COUNT";
            builder.put(suc.INLINE_PRELOAD_ON_CELL_COUNT, new hxh(str, "cell", true));
            builder.put(suc.INLINE_PRELOAD_ON_WIFI_COUNT, new hxh(str, MapboxEvent.KEY_WIFI, true));
            str = "enabled";
            builder.put(suc.SINGLE_PAGE_RESOLUTION, new hxh("MDP_OPERA_SINGLE_PAGE_RESOLUTION", str, true));
            builder.put(suc.ENABLE_BG_WARMUP, new hxh("MDP_OPERA_BG_WARMUP", str, true));
            builder.put(suc.ASYNC_EXOPLAYER_RELEASE, new hxh("MDP_ASYNC_EXOPLAYER_RELEASE", str, false));
            builder.put(suc.USE_EXOPLAYER_FOR_LONGFORM, new hxh("MDP_BRIGHTCOVE_DEPRECATION_ANDROID", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
