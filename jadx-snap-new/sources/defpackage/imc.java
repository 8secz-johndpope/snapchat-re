package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: imc */
public final class imc implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(ima.GRAPHENE_HOST, "graphene.graphene_default_host");
            this.a = builder.build();
        }
        return this.a;
    }
}
