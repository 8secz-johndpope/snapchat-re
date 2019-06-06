package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: yjc */
public final class yjc implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(yiz.SEEN_MY_STORY_ONBOARDING, new hxo("my_story", hxr.TOOLTIP));
            builder.put(yiz.SEEN_OUR_STORY_ONBOARDING, new hxo("our_story_attribution_tos_accepted", hxr.CLIENT_PROPERTY));
            builder.put(yiz.SHOW_GEO_STORY_ONBOARDING, new hxo("Determines if the Geo Story info dialog should be shown for a specific story", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
