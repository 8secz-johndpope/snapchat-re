package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: fxo */
public final class fxo implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "MDP_BG_PREFETCH_FRAMEWORK";
            builder.put(fxm.BACKGROUND_PREFETCH_IS_RECURRING, new hxh(str, "IS_RECURRING", true));
            builder.put(fxm.BACKGROUND_PREFETCH_USE_DEFAULT_WIFI_CONSTRAINT, new hxh(str, "USE_DEFAULT_WIFI_CONSTRAINT", true));
            builder.put(fxm.BACKGROUND_PREFETCH_NUM_RETRIES, new hxh(str, "NUM_RETRIES", true));
            builder.put(fxm.BACKGROUND_PREFETCH_ALWAYS_RESCHEDULE, new hxh(str, "ALWAYS_RESCHEDULE", true));
            builder.put(fxm.BACKGROUND_PREFETCH_ALLOW_BLIZZARD_LOG, new hxh(str, "ALLOW_BLIZZARD_LOG", false));
            builder.put(fxm.BACKGROUND_PREFETCH_EXPOSURE_LOGGING_FOREGROUND, new hxh(str, "EXPOSURE_LOG_FOREGROUND", true));
            builder.put(fxm.BACKGROUND_PREFETCH_FLUSH_GRAPHENE_EVENTUALLY, new hxh(str, "FLUSH_GRAPHENE_EVENTUALLY", true));
            String str2 = "MDP_MUSHROOM_BG_PREFETCH_SANITY";
            builder.put(fxm.SANITY_BACKGROUND_PREFETCH_ENABLED, new hxh(str2, "ENABLED", false));
            builder.put(fxm.SANITY_BACKGROUND_PREFETCH_RPC_ENABLED, new hxh(str2, "RPC_ENABLED", false));
            this.a = builder.build();
        }
        return this.a;
    }
}
