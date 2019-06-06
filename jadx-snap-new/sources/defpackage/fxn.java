package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: fxn */
public final class fxn implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(fxm.MDP_CONTENT_DISK_CONFIGURATION_ENABLED, "MdpMushroomDiskConfigurationEnabled");
            builder.put(fxm.MDP_CONTENT_DISK_MAX_SIZE_MB, "MdpMushroomDiskMaxSizeMb");
            builder.put(fxm.MDP_CONTENT_DISK_DEFAULT_TTL_DAY, "MdpMushroomDiskDefaultTtlDay");
            builder.put(fxm.MDP_CONTENT_DISK_REFRESH_TTL_DAY, "MdpMushroomDiskRefreshTtlDay");
            builder.put(fxm.CATCH_ALL_UNDELIVERABLE_EXCEPTIONS, "MdpMushroomCatchAllUndeliverable");
            builder.put(fxm.STATUS_413_FILTER_MAX_MIN_BYTES, "MdpMushroomStatus413MaxMin");
            this.a = builder.build();
        }
        return this.a;
    }
}
