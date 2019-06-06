package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: gsf */
public final class gsf implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(gse.CRASH_REPORT_FOR_BETA, new hxh("CRASH_REPORT_V2_MUSHROOM", "ENABLED", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
