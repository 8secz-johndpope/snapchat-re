package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: qyj */
public final class qyj implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(qyi.USE_LOQ_CONVERSATIONS, new hxh("MUSHROOM_USE_OLD_BACKEND", "USE_LOQ_CONVERSATIONS", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
