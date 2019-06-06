package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: gsg */
public final class gsg implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(gse.CRASH_SAMPLE_RATE, new hxo("crash_sample_rate", hxr.FEATURE_SETTING));
            builder.put(gse.CRASH_REPORT_ENABLED, new hxo("crash_report_enabled", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
