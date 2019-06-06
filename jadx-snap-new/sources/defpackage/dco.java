package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: dco */
public final class dco implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(dcn.ARE_BENCHMARKS_ENABLED, "BenchmarksEnabled");
            builder.put(dcn.BLACKLISTED_BENCHMARKS, "BlacklistedBenchmarks");
            this.a = builder.build();
        }
        return this.a;
    }
}
