package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: imb */
public final class imb implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "GRAPHENE_CUSTOM_FLUSHING";
            builder.put(ima.GRAPHENE_CUSTOM_FLUSHING_ENABLED, new hxh(str, "ENABLED", false));
            builder.put(ima.GRAPHENE_CUSTOM_FLUSHING_CONTINUE_BACKGROUND_ENABLED, new hxh(str, "FLUSHING_CONTINUE_BACKGROUND_ENABLED", false));
            builder.put(ima.BACKGROUND_FLUSH_INTERVAL_SECONDS, new hxh(str, "BACKGROUND_FLUSH_INTERVAL_SECONDS", false));
            this.a = builder.build();
        }
        return this.a;
    }
}
