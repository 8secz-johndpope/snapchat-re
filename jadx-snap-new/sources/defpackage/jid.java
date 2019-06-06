package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: jid */
public final class jid implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "GROWTH_SEND_TO_RECENTS_RANKING_ANDROID_V3";
            builder.put(jic.RECENTS_INIT_SIZE_KEY, new hxh(str, "recents_init_size", true));
            builder.put(jic.RECENTS_INCREMENT_KEY, new hxh(str, "recents_increment", true));
            builder.put(jic.RECENTS_MAX_SIZE_KEY, new hxh(str, "recents_max_size", true));
            str = "enabled";
            builder.put(jic.NEW_PROFILE_ACTIVITY_CARDS, new hxh("ANDROID_NEW_PROFILE_ACTIVITY_CARDS", str, true));
            builder.put(jic.ANDROID_RESURRECT_TRIGGER_BADGE, new hxh("ANDROID_RESURRECT_TRIGGER", str, true));
            String str2 = "ST_PRESELECT_FOR_GROUP_CREATION";
            builder.put(jic.SEND_TO_PRESELECT_RECIPIENTS_IN_CREATE_GROUP, new hxh(str2, str2, true));
            builder.put(jic.SEND_TO_SECTIONS_IN_ORDER_LOADING, new hxh("ST_SECTION_INORDER_ANDROID", "in_order", true));
            builder.put(jic.SEND_TO_SCROLLBAR_V2_ENABLE, new hxh("SEND_TO_SCROLL_BAR_V2", "ST_SCROLL_BAR_V2", true));
            builder.put(jic.SEND_TO_LAST_SNAP_RECIPIENTS_BUTTON_TYPE, new hxh("SEND_TO_LAST_SNAP_RECIPIENTS_BUTTON", "ST_LAST_SNAP_RECIPIENTS_BUTTON_TYPE", true));
            builder.put(jic.SEND_TO_NEW_GROUP_SECTION, new hxh(str2, "ST_NEW_GROUP_SECTION_ENABLE", true));
            str2 = "ENABLE";
            String str3 = "ST_SDL";
            builder.put(jic.SEND_TO_SDL, new hxh(str3, str2, true));
            builder.put(jic.SEND_TO_SDL_STORIES, new hxh(str3, "ENABLE_STORIES", true));
            str3 = "ST_SEARCH_V2";
            builder.put(jic.ST_SEARCH_V2_ENABLE, new hxh(str3, str3, true));
            builder.put(jic.ST_SELECTION_V2_ENABLE, new hxh(str3, "ST_TAPPING_V2", true));
            builder.put(jic.ST_NEW_USER_EXPERIENCE_V2_ENABLE, new hxh("ST_NEW_USER_EXPERIENCE", str2, true));
            str2 = "MUSHROOM_ENABLED";
            str3 = "MUSHROOM_AB";
            builder.put(jic.MUSHROOM_AB_ENABLED, new hxh(str3, str2, true));
            String str4 = "MUSHROOM_EXP";
            builder.put(jic.MUSHROOM_EXP_ENABLED, new hxh(str4, str2, true));
            str2 = "ENABLE_SETTINGS_OPT_OUT";
            builder.put(jic.MUSHROOM_AB_ENABLE_SETTINGS_OPT_OUT, new hxh(str3, str2, true));
            builder.put(jic.MUSHROOM_EXP_ENABLE_SETTINGS_OPT_OUT, new hxh(str4, str2, true));
            builder.put(jic.ALL_UPDATES_CHECKSUM_ENABLED, new hxh("MUSHROOM_ALL_UPDATES_CHECKSUM", str, true));
            builder.put(jic.IS_ADD_FRIENDS_V11, new hxh("ADD_FRIENDS_V11_MUSHROOM", str, true));
            builder.put(jic.ADDED_ME_POST_ACCEPT_V2_TYPE, new hxh("ADDED_ME_POST_ACCEPT_V2_MUSHROOM", "ADDED_ME_POST_ACCEPT_V2_TYPE", true));
            builder.put(jic.QUICK_ADD_IN_DF_V2, new hxh("QUICK_ADD_IN_DF_MUSHROOM", str, true));
            builder.put(jic.APP_BADGE_FOR_FRIEND_REQUEST_TYPE, new hxh("APP_BADGE_FOR_FRIEND_REQUEST_MUSHROOM", "APP_BADGE_FOR_FRIEND_REQUEST_TYPE", true));
            builder.put(jic.FULL_CONTACT_SYNC_REPEATEDLY, new hxh("ANDROID_CONTACT_SYNC_REPEATEDLY", "FULL_CONTACT_SYNC_REPEATEDLY", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
