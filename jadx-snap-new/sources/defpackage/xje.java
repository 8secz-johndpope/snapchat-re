package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: xje */
public final class xje implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(xjd.HAS_SEEN_LAGUNA_ONBOARDING_FLOW, new hxo("laguna_onboarding", hxr.TOOLTIP));
            builder.put(xjd.HAS_SEEN_MALIBU_ONBOARDING_FLOW, new hxo("malibu_onboarding", hxr.TOOLTIP));
            builder.put(xjd.HAS_SEEN_NEPTUNE_ONBOARDING_FLOW, new hxo("neptune_onboarding", hxr.TOOLTIP));
            builder.put(xjd.HAS_SEEN_PSYCHOMANTIS_ONBOARDING_FLOW, new hxo("psychomantis_onboarding", hxr.TOOLTIP));
            builder.put(xjd.SPECTACLES_SNAP_STORE_ENABLED, new hxo("spectacles_snap_store_enabled", hxr.FEATURE_SETTING));
            builder.put(xjd.SPECTACLES_SNAP_STORE_DEEPLINK, new hxo("spectacles_snap_store_deeplink", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
