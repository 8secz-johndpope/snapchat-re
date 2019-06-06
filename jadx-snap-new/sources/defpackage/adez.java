package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: adez */
public final class adez implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(adew.MAP_PREFETCH_FRIEND_LOCATIONS_THRESHOLD, "map.map-prefetch-friend-locations-threshold");
            this.a = builder.build();
        }
        return this.a;
    }
}
