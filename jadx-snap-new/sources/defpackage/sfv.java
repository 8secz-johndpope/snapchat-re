package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: sfv */
public final class sfv implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(sft.NOTIFICATION_AVAILABLE_FRIEND_SUGGESTIONS, new hxo("notification_available_friend_suggestions", hxr.FEATURE_SETTING));
            builder.put(sft.NOTIFICATION_AVAILABLE_STORIES, new hxo("notification_available_stories", hxr.FEATURE_SETTING));
            builder.put(sft.NOTIFICATION_USER_TAGGING, new hxo("notification_user_tagging", hxr.FEATURE_SETTING));
            builder.put(sft.NOTIFICATION_FRIENDS_BIRTHDAY, new hxo("notification_friends_birthday", hxr.FEATURE_SETTING));
            builder.put(sft.NOTIFICATION_MEMORIES, new hxo("notification_memories", hxr.FEATURE_SETTING));
            builder.put(sft.NOTIFICATION_CREATIVE_TOOLS, new hxo("notification_creative_tools", hxr.FEATURE_SETTING));
            builder.put(sft.NOTIFICATION_MESSAGE_REMINDER, new hxo("notification_message_reminder", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
