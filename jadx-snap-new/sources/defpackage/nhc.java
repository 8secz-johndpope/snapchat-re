package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: nhc */
public final class nhc implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(nhb.CREATIVE_KIT_USER_SEEN_CLEAR_CAMERA_ONBOARDING, new hxo("snap_kit_creative_kit_onboarding", hxr.TOOLTIP));
            this.a = builder.build();
        }
        return this.a;
    }
}
