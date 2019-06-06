package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: gvw */
public final class gvw implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(gvt.NEW_USER_ONBOARDING_STORY_TOOLTIP, new hxo("new_user_onboarding_story_tooltip", hxr.FEATURE_SETTING));
            builder.put(gvt.LAST_WATCHED_FRIEND_STORY_DF_MS, new hxo("last_watched_friend_story_df_ms", hxr.FEATURE_SETTING));
            builder.put(gvt.SHOW_TEAM_SNAPCHAT_STORY_ON_DISCOVER, new hxo("discover_feed_enable_team_snapchat", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
