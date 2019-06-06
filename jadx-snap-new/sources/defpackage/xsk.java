package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.looksery.sdk.listener.AnalyticsListener;
import java.util.Map;

/* renamed from: xsk */
public final class xsk implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(xsj.LEARNED_SEARCH_RESULTS_COUNT, new hxh("L_SEARCH_MUSHROOM", AnalyticsListener.ANALYTICS_COUNT_KEY, true));
            String str = "enabled";
            builder.put(xsj.BITMOJI_SMART_REPLY_ENABLED, new hxh("BITMOJI_SMART_REPLY_MUSHROOM", str, true));
            builder.put(xsj.MENTION_STICKER_ENABLED, new hxh("MENTION_STICKER_ANDROID", str, true));
            builder.put(xsj.STICKERS_METADATA_JITTER_ANDROID, new hxh("STICKERS_METADATA_JITTER_ANDROID", "jitter_in_minutes", true));
            builder.put(xsj.BITMOJI_CHAT_FIRST_TAB, new hxh("BITMOJI_CHAT_FIRST_TAB", str, true));
            String str2 = "BITMOJI_THUMBNAILS_MUSHROOM";
            builder.put(xsj.BITMOJI_THUMBNAILS_STICKER_PICKER, new hxh(str2, str, true));
            builder.put(xsj.BITMOJI_HIGH_RES_PREVIEW, new hxh(str2, "allow_high_res", true));
            builder.put(xsj.FORMATTED_SEARCH_TAGS, new hxh("STICKER_SEARCH_TAGS_FORMATTED", "ENABLED", true));
            builder.put(xsj.VENUE_STICKERS_MUSHROOM, new hxh("VENUE_STICKERS_MUSHROOM", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
