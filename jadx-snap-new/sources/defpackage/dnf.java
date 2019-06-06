package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: dnf */
public final class dnf implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(dnd.HAS_SEEN_TAKE_SNAP_ONBOARDING_MESSAGE, new hxo("snap", hxr.TOOLTIP));
            builder.put(dnd.HANDS_FREE_ENABLED_COUNT, new hxo("hands_free_enabled_count", hxr.FEATURE_SETTING));
            builder.put(dnd.HANDS_FREE_SEEN_COUNT, new hxo("hands_free_seen_count", hxr.FEATURE_SETTING));
            builder.put(dnd.SEEN_FRIENDS_PAGE_ONBOARDING_TOOLTIP, new hxo("seen_friends_page_onboarding_tooltip", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
