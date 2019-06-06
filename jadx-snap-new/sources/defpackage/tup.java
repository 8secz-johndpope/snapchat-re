package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: tup */
public final class tup implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(tum.FAST_MOTION_FILTER_ENABLED, "camera-config-provider.fast-motion-filter-enabled");
            builder.put(tum.SNAP_CROP_ENABLED, "camera-config-provider.mushroom-snap-crop");
            this.a = builder.build();
        }
        return this.a;
    }
}
