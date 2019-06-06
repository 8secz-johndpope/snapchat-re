package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: czf */
public final class czf implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(cze.DUM_AB_VARIABLE, new hxh("DUM_AB", "b", false));
            this.a = builder.build();
        }
        return this.a;
    }
}
