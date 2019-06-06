package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: tnt */
public final class tnt implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(tns.EXAMPLE_ANOTHER_GLOBAL_PROP2, new hxh("TEST_STUDY", "TEST_VARIABLE", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
