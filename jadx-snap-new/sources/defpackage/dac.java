package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: dac */
public final class dac implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(dab.BATTERY_MONITORING, "performance.SHOULD_RUN_BATTERY_MONITORING");
            this.a = builder.build();
        }
        return this.a;
    }
}
