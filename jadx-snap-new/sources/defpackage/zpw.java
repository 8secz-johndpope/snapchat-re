package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zpw */
public final class zpw implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(zpt.SERVER_CONFIG_ENCODED_USER_EXPERIMENT, "UNLOCKABLES.user_experiment");
            builder.put(zpt.ORDERED_CAROUSEL_CONFIG, "UNLOCKABLES.ordered_carousel_config_v2");
            this.a = builder.build();
        }
        return this.a;
    }
}
