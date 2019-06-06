package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: dji */
public final class dji implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(djg.CONFIG_OVERRIDE, "blizzard.blizzard_client_config_v2");
            this.a = builder.build();
        }
        return this.a;
    }
}
