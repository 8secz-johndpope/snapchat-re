package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: adex */
public final class adex implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(adew.EGG_HUNT, new hxh("EGG_HUNT_V2_CLIENT_ROLLOUT", "egg_hunt_v2_enabled", true));
            String str = "ENABLED";
            builder.put(adew.MAP_SCREENSHOT_ENABLED, new hxh("MAP_SCREENSHOT_ANDROID", str, true));
            builder.put(adew.DISABLE_SLOW_HEATMAP, new hxh("MAP_DISABLE_SLOW_HEAT_RENDER_ANDROID", "REMOVE_THRESHOLD", true));
            builder.put(adew.CUSTOM_TILE_FLAVOR, new hxh("ANDROID_MAP_CONTENT_V2_HEATMAP_FLAVOR", "flavor", true));
            String str2 = "MAP_V2_ANDROID_NEW";
            builder.put(adew.MAP_V2, new hxh(str2, str, true));
            builder.put(adew.MAP_V2_PASSPORT, new hxh(str2, "PASSPORT_ENABLED", true));
            builder.put(adew.MAP_V2_VIEW_STATUS, new hxh(str2, "STATUS_VIEWING_ENABLED", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
