package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: tnu */
public final class tnu implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(tns.EXAMPLE_GLOBAL_PROP_LONG, "global.example-global-prop-long");
            builder.put(tns.EXAMPLE_GLOBAL_PROP_FLOAT, "global.example-global-prop-value");
            this.a = builder.build();
        }
        return this.a;
    }
}
