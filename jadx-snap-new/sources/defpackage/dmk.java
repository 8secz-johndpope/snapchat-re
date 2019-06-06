package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: dmk */
public final class dmk implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(dmj.NETWORK_RULES_PROTO, "BOLT_NETWORK_RULES_PROTO");
            builder.put(dmj.USER_COUNTRY, "BOLT_USER_COUNTRY_FOR_UPLOAD");
            builder.put(dmj.CONTENT_DESCRIPTOR_RESOLVE_TIMEOUT_MS, "BOLT_CONTENT_DESCRIPTOR_RESOLVE_TIMEOUT_MS");
            builder.put(dmj.CONTENT_OBJECT_RESOLVE_TIMEOUT_MS, "BOLT_CONTENT_OBJECT_RESOLVE_TIMEOUT_MS");
            this.a = builder.build();
        }
        return this.a;
    }
}
