package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: jie */
public final class jie implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(jic.ENABLE_BIRTHDAY_PARTY, new hxo("is_birthday_party_enabled", hxr.FEATURE_SETTING));
            builder.put(jic.DEFAULT_EMOJI_SKIN_TONE, new hxo("default_emoji_skin_tone", hxr.FEATURE_SETTING));
            builder.put(jic.HAS_SEEN_ENABLE_PUSH_NOTIFICATION_PROMPT, new hxo("notification_prompt", hxr.TOOLTIP));
            builder.put(jic.HAS_SEEN_VERIFY_PHONE_NUMBER_PROMPT, new hxo("profile_v3_phone_number_verification_prompt", hxr.TOOLTIP));
            builder.put(jic.FEED_HEADER_PROMPT_V2_STATE_SYNC, new hxo("feed_header_prompt_v2_state_sync", hxr.FEATURE_SETTING));
            builder.put(jic.HAS_DISMISSED_ENABLE_PUSH_NOTIFICATION_PROMPT, new hxo("has_dismissed_enable_push_notification_prompt", hxr.FEATURE_SETTING));
            builder.put(jic.HAS_DISMISSED_VERIFY_PHONE_NUMBER_PROMPT, new hxo("has_dismissed_verify_phone_number_prompt", hxr.FEATURE_SETTING));
            builder.put(jic.REGISTER_TO_VOTE_PAGE_LINK, new hxo("register_to_vote_page_link", hxr.FEATURE_SETTING));
            builder.put(jic.MUSHROOM_OPTED_IN, new hxo("mushroom_opted_in", hxr.FEATURE_SETTING));
            builder.put(jic.RES_14_DAY_IN_MS, new hxo("res_14_day_in_ms", hxr.FEATURE_SETTING));
            builder.put(jic.RES_7_DAY_IN_MS, new hxo("res_7_day_in_ms", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
