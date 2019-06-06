package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: qqa */
public final class qqa implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(qpy.HAS_SEEN_LEARN_MORE_DIALOG, new hxo("erase message", hxr.CLIENT_PROPERTY));
            this.a = builder.build();
        }
        return this.a;
    }
}
