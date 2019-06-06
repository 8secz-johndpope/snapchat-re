package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: gvv */
public final class gvv implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(gvt.CATEGORY_SECTIONS, new hxh("PU_CATEGORY_SECTIONS_ANDROID", str, true));
            String str2 = "IS_ENABLED";
            builder.put(gvt.DF_INITIAL_PAGE_DB_CACHE, new hxh("PU_DF_INTIAL_PAGE_DB_CACHE", str2, true));
            String str3 = "PU_FRIEND_STORIES_TEACHING_ANDROID_MUSHROOM";
            String str4 = "enabled";
            builder.put(gvt.FRIEND_TEACHING_BUTTON_ENABLED, new hxh(str3, str4, true));
            builder.put(gvt.FRIEND_TEACHING_BUTTON_COOLDOWN_HOURS, new hxh(str3, "cooldown_hours", true));
            builder.put(gvt.FRIEND_TEACHING_BUTTON_TRIGGER_HOURS, new hxh(str3, "trigger_hours", true));
            builder.put(gvt.FRIEND_TEACHING_BUTTON_NUM_UNVIEWED_STORIES, new hxh(str3, "num_unviewed_stories", true));
            str3 = "MDP_MUSHROOM_BG_PREFETCH_FRIEND_STORY";
            builder.put(gvt.BACKGROUND_PREFETCH_ENABLE_FRIEND_STORY, new hxh(str3, str, false));
            String str5 = "NUM_STORY_TO_PREFETCH";
            builder.put(gvt.BACKGROUND_PREFETCH_NUM_FRIEND_STORY, new hxh(str3, str5, false));
            String str6 = "NUM_SNAPS_PER_STORY";
            builder.put(gvt.BACKGROUND_PREFETCH_NUM_SNAPS_PER_FRIEND_STORY, new hxh(str3, str6, false));
            builder.put(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_DELAY_MINS, new hxh(str3, "DELAY_TIME_MINS", false));
            builder.put(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_TIMEOUT_MINS, new hxh(str3, "TIMEOUT_MINS", false));
            builder.put(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_PREFETCH_FIXED_TIME, new hxh(str3, "PREFETCH_FIXED_TIME", false));
            builder.put(gvt.BACKGROUND_PREFETCH_FRIEND_STORY_SKIP_DOWNLOADED_STORIES, new hxh(str3, "SKIP_DOWNLOADED_STORIES", false));
            str3 = "MDP_MUSHROOM_BG_PREFETCH_DISCOVER_SUBSCRIPTION";
            builder.put(gvt.BACKGROUND_PREFETCH_ENABLE_SUBSCRIPTION_STORY, new hxh(str3, str, false));
            builder.put(gvt.BACKGROUND_PREFETCH_NUM_SUBSCRIPTION_STORY, new hxh(str3, str5, false));
            builder.put(gvt.BACKGROUND_PREFETCH_NUM_SNAPS_PER_SUBSCRIPTION_STORY, new hxh(str3, str6, false));
            builder.put(gvt.BACKGROUND_PREFETCH_SUBSCRIPTION_STORY_DELAY_MINS, new hxh(str3, "DELAY_TIME_MINUTES", false));
            builder.put(gvt.BACKGROUND_PREFETCH_SUBSCRIPTION_STORY_TIMEOUT_MINS, new hxh(str3, "TIMEOUT_MINUTES", false));
            builder.put(gvt.FRIEND_STORY_BG_TO_FG_RESUME_ANDROID, new hxh("PU_FRIEND_STORY_BG_TO_FG_RESUME_ANDROID", str2, true));
            str2 = "PU_OPT_IN_NOTIFICATIONS_ANDROID";
            builder.put(gvt.OPT_IN_NOTIFICATIONS_ENABLED, new hxh(str2, str, true));
            builder.put(gvt.OPT_IN_NOTIFICATIONS_ENABLE_SOUND, new hxh(str2, "ENABLE_SOUND", true));
            builder.put(gvt.OPT_IN_NOTIFICATIONS_PROMPT_ALL, new hxh(str2, "ENABLE_PROMPT_ALL", true));
            builder.put(gvt.OPT_IN_NOTIFICATIONS_DROP_DOWN_PROMPT_ENABLED, new hxh(str2, "ENABLE_PROMPT", true));
            builder.put(gvt.OPT_IN_NOTIFICATIONS_SWIPE_UP_PROMPT_ENABLED, new hxh(str2, "ENABLE_SWIPE_UP_PROMPT", true));
            builder.put(gvt.OPT_IN_NOTIFICATIONS_CLOSE_TO_FIRST_STORY, new hxh(str2, "CLOSE_TO_FIRST_STORY_IN_SECTION", true));
            builder.put(gvt.OPT_IN_USER_NOTIFICATIONS_ENABLED, new hxh(str2, "ENABLE_PUBLIC_USER", true));
            builder.put(gvt.OPT_IN_USER_NOTIFICATIONS_PROMPT_DROP_DOWN, new hxh(str2, "ENABLE_PUBLIC_USER_DROPDOWN", true));
            builder.put(gvt.OPT_IN_NOTIFICATIONS_HOLDOUT, new hxh(str2, "HOLDOUT", true));
            str2 = "RANKING_STORIES_BYPASS_FSN_ANDROID";
            builder.put(gvt.RANKING_STORIES_BYPASS_FSN_ANDROID_ENABLED, new hxh(str2, str, true));
            builder.put(gvt.RANKING_STORIES_BYPASS_FSN_ANDROID_BASE_URL, new hxh(str2, "BASE_URL", true));
            str2 = "PU_SHARED_STORY_PREFETCHING_LOGIC_ANDROID";
            builder.put(gvt.SHARED_STORY_PREFETCHING_LOGIC_ENABLED, new hxh(str2, str4, true));
            builder.put(gvt.FF_STORY_IMPRESSION_PREFETCHING_ENABLED, new hxh("PU_FF_STORY_IMPRESSION_PREFETCHING_ANDROID", str4, true));
            builder.put(gvt.FRIEND_STORY_SNAP_PREFETCH_COUNT, new hxh(str2, "friend_story_snap_prefetch_count", true));
            builder.put(gvt.OVERFLOW_FRIEND_STORY_PREFETCH_COUNT, new hxh(str2, "overflow_friend_story_prefetch_count", true));
            builder.put(gvt.MAX_PARALLEL_DOWNLOAD_COUNT, new hxh(str2, "max_parallel_download_count", true));
            builder.put(gvt.ENABLE_RECOMMENDED_SUBSCRIPTIONS, new hxh("DF_FILL_SUBSCRIPTION_BLANK_SPACE_ANDROID", str, true));
            str2 = "PU_REPORT_TILE_ACTION_SHEET_ANDROID";
            builder.put(gvt.ENABLE_REPORT_TILE_PUBLISHER, new hxh(str2, "ENABLED_PUBLISHER", true));
            builder.put(gvt.ENABLE_REPORT_TILE_PUBLIC_USER, new hxh(str2, "ENABLED_PUBLIC_USER", true));
            builder.put(gvt.ENABLE_CHANNEL_PIVOT, new hxh("PU_SUBSCRIPTIONS_CHANNEL_PIVOT_ANDROID", "Enabled", true));
            builder.put(gvt.SHOW_TEAM_SNAPCHAT_STORY_ON_DISCOVER, new hxh("MOVE_TEAM_SNAPCHAT_STORY_TO_DISCOVER_MUSHROOM", "SHOW_TEAM_SNAPCHAT_STORY_ON_DISCOVER", true));
            builder.put(gvt.PRELOAD_DISCOVER_FEED, new hxh("PU_DF_MUSHROOM_PRELOAD_V2", str, true));
            builder.put(gvt.ENABLE_PRIVATE_STORY_SHOWS_FRIEND_DISPLAY_NAME, new hxh("PU_ENABLE_PRIVATE_STORY_SHOWS_FRIEND_DISPLAY_NAME", str4, true));
            builder.put(gvt.ENABLE_PRIVATE_STORY_OVERLAY_ICON, new hxh("PU_ENABLE_PRIVATE_STORY_OVERLAY_ICON", str4, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
