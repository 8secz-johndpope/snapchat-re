package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: mjd */
public final class mjd implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(mja.DEVICE_CLUSTER, "device_cluster.device_cluster");
            builder.put(mja.THIRD_PARTY_AD_TRACK_V2_URL, "3rd_party_ad_track_v2_url");
            builder.put(mja.ENABLE_EDGE_CACHE_STORY_DOWNLOADS, "lenses_properties.enable_edge_cached_story_downloads");
            builder.put(mja.LENSES_WEATHER_BASE_URL_KEY, "weather_base_url");
            this.a = builder.build();
        }
        return this.a;
    }
}
