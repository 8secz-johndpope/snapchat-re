package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: wxi */
public final class wxi implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(wxh.EXP_ENABLED, new hxh("SHAZAM_MUSHROOM_ROLLOUT", "SHAZAM_ENABLED", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
