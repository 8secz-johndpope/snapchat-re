package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: mjc */
public final class mjc implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(mja.CAMERA_LENSES_ACTIVATED, new hxo("lenses_first_appearance", hxr.TOOLTIP));
            builder.put(mja.LENSES_ONBOARDING_TOOLTIP_ENABLED, new hxo("lenses_onboarding_tooltip_enabled", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
