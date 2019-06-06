package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: yjb */
public final class yjb implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(yiz.FRIEND_STORY_NOTIFICATION_TIMEOUT_MIN, new hxh("ANDROID_FRIEND_STORY_NOTIFICATION_TIMEOUT_MIN", "TIMEOUT_MIN", true));
            String str = "ENABLED";
            builder.put(yiz.FRIEND_STORY_NOTIFICATION_ICON, new hxh("ANDROID_FRIEND_STORY_NOTIFICATION_ICON", str, true));
            builder.put(yiz.OPT_IN_FRIEND_NOTIFICATION_ENABLED, new hxh("PU_FRIEND_STORY_NOTIFICATION_OPT_IN_ANDROID", str, true));
            builder.put(yiz.STORY_SNAP_CONTENT_CACHE_SIZE_BYTES, new hxh("MDP_MUSHROOM_STORY_SNAP_CACHE_SIZE", "size_in_bytes", true));
            str = "enabled";
            builder.put(yiz.USE_COF_USER_STORY_VIDEO_MEDIA_SELECTION, new hxh("MDP_MUSHROOM_COF_USER_STORY_VIDEO_MEDIA_SELECTION", str, true));
            builder.put(yiz.FRIEND_AND_PRIVATE_STORIES_INTERWEAVE, new hxh("PU_FRIEND_STORIES_INTERWEAVE_ANDROID_MUSHROOM", str, true));
            builder.put(yiz.GEO_STORIES_POSTABLE, new hxh("PU_GEO_SEND_FILTER", "can_post", true));
            builder.put(yiz.IS_ENTIRE_STORY_SAVING_ENABLED, new hxh("PU_SAVE_ENTIRE_STORY_ANDROID", str, true));
            String str2 = "PU_SENDTO_STORY_SIMPLIFY_V1_ANDROID";
            builder.put(yiz.SENDTO_CUSTOM_STORIES_ABOVE_FOLD_RECENCY_HR, new hxh(str2, "recent_custom_story_hr", true));
            builder.put(yiz.SENDTO_CUSTOM_STORIES_ABOVE_FOLD_MAX_CNT, new hxh(str2, "max_custom_story_above_fold_cnt", true));
            builder.put(yiz.ENABLE_PRIVATE_STORY_BUTTON_IN_SEND_TO, new hxh("PU_ENABLE_PRIVATE_STORY_BUTTON_IN_SEND_TO", str, true));
            builder.put(yiz.SHOW_PRIVATE_STORY_RECENTS_SECTION, new hxh("PU_PRIVATE_STORY_RECENTS_SECTION_ANDROID", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
