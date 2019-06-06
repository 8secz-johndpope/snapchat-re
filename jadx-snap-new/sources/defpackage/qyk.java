package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: qyk */
public final class qyk implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(qyi.EMAIL_VERIFICATION_PROMPT_GRACE_PERIOD_SECS, new hxo("email_verification_prompt_grace_period_secs", hxr.FEATURE_SETTING));
            builder.put(qyi.EMAIL_VERIFICATION_PROMPT_TO_SHOW_AT_SECS, new hxo("email_verification_prompt_show_at_secs", hxr.FEATURE_SETTING));
            builder.put(qyi.FEED_HEADER_PROMPT_V2, new hxo("feed_header_prompt_v2", hxr.FEATURE_SETTING));
            builder.put(qyi.TOOLTIP_HAS_SEEN_TAP_TO_WATCH_THIS_SNAP, new hxo("feed_snap_tooltip", hxr.TOOLTIP));
            this.a = builder.build();
        }
        return this.a;
    }
}
