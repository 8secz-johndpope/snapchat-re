package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: clf */
public final class clf implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ADS_HOLDOUT_01";
            builder.put(cld.IS_NOT_IN_ADS_HOLDOUT, new hxh(str, "SHOW_ADS", true));
            builder.put(cld.IS_NOT_IN_ADS_FF_HOLDOUT, new hxh(str, "ADS_IN_AA", true));
            str = "enabled";
            builder.put(cld.SNAP_ADS_GATING_ENABLED, new hxh("SNAP_ADS_MUSHROOM_GATING", str, true));
            builder.put(cld.ENABLE_DISCOVER_AD, new hxh("SNAP_ADS_DISCOVER_ADS_MUSHROOM", str, true));
            builder.put(cld.ENABLE_OUR_STORY_AD, new hxh("SNAP_ADS_OURSTORY_ADS_MUSHROOM", str, true));
            builder.put(cld.ENABLE_USER_STORY_AD, new hxh("SNAP_ADS_USERSTORY_ADS_MUSHROOM", str, true));
            builder.put(cld.ENABLE_ADS_IN_SHOWS, new hxh("SNAP_ADS_ADS_IN_SHOWS_MUSHROOM", str, true));
            builder.put(cld.ENABLE_CONTENT_INTERSTITIAL_ADS, new hxh("SNAP_ADS_CONTENT_INTERSTITIAL_ADS_MUSHROOM", str, true));
            builder.put(cld.ENABLE_COMMERCIAL_WHITELISTING, new hxh("SNAP_ADS_MUSHROOM_ENABLE_COMMERCIAL_WHITELIST", str, true));
            builder.put(cld.ENABLE_GZIP_FOR_REQUEST, new hxh("ADS_GZIP_REQUEST", "EnableGzip", true));
            builder.put(cld.ENABLE_AD_CREATIVE_PREVIEW, new hxh("SNAP_ADS_ENABLE_AD_PREVIEW_MUSHROOM", str, true));
            String str2 = "ENABLE";
            builder.put(cld.ENABLE_LOWER_THRESHOLD_FOR_SWIPE_UP, new hxh("SNAPADS_LOWER_THRESHOLD_FOR_SWIPE_UP_MUSHROOM", str2, true));
            builder.put(cld.ENABLE_SHADOW_REQUESTS, new hxh("SNAP_ADS_MUSHROOM_ENABLE_SHADOW", str, true));
            builder.put(cld.ENABLE_AD_RESPONSE_PROTO_PAYLOAD, new hxh("SNAP_ADS_MUSHROOM_ENABLE_AD_RENDER_DATA_PROTO", str, true));
            builder.put(cld.ENABLE_PETRA, new hxh("SNAP_ADS_MUSHROOM_ENABLE_PETRA", str, true));
            builder.put(cld.ENABLE_DPA, new hxh("SNAP_ADS_MUSHROOM_ENABLE_DPA", str, true));
            builder.put(cld.SKIP_FIRST_SAFE_URL_BROWSING_CHECK, new hxh("SNAPADS_SAFE_BROWSER_CHECK_MUSHROOM", "skip_safe_browsing_check_ads", true));
            builder.put(cld.ENABLE_V2_COOKIE_MANAGER, new hxh("SNAP_ADS_MUSHROOM_COOKIE_MANAGER_V2", str, true));
            builder.put(cld.SNAPCHAT_TRACKING_CLIENT_TTL_MS, new hxh("SNAPADS_PIXEL_COOKIE_TTL_Mushroom", "tllInMs", true));
            String str3 = "SNAP_ADS_MUSHROOM_AD_CACHING";
            builder.put(cld.AD_CACHING_ENABLE, new hxh(str3, "enable_ads_caching", true));
            builder.put(cld.NO_FILL_AD_RESPONSE_CACHING_ENABLE, new hxh("SNAP_ADS_AD_CACHING_NOFILL", str2, true));
            builder.put(cld.AD_CACHING_TTL_SEC, new hxh(str3, "ads_caching_ttl_sec", true));
            str3 = "SNAPADS_MULTI_AUCTION_MUSHROOM_AUTO_ADVANCE";
            builder.put(cld.MULTI_AUCTION_REQUEST_AUTO_ADVANCE_ENABLED, new hxh(str3, str2, true));
            builder.put(cld.MULTI_AUCTION_REQUEST_AUTO_ADVANCE_SIZE, new hxh(str3, "REQUEST_SIZE", true));
            builder.put(cld.VIEW_RECEIPT_ENABLED, new hxh("SNAPADS_VIEW_RECEIPTS_MUSHROOM", str2, true));
            str2 = "time_out_seconds";
            builder.put(cld.SNAP_ADS_DISCOVER_MEDIA_DOWNLOAD_TIMEOUT_SECONDS, new hxh("SNAP_ADS_MUSHROOM_DISCOVER_MEDIA_DOWNLOAD_TIMEOUT", str2, true));
            builder.put(cld.SNAP_ADS_FIXED_AD_SLOT_LOADING_TIMEOUT_SECONDS, new hxh("SNAP_ADS_MUSHROOM_DISCOVER_ADS_LOADING_TIMEOUT", str2, true));
            str2 = "SNAP_ADS_MUSHROOM_DISCOVER_OPT_PREV_SLOTS";
            builder.put(cld.DISCARD_PREVIOUS_AD_SLOTS, new hxh(str2, "should_discard", true));
            builder.put(cld.REORDER_PREVIOUS_AD_SLOTS, new hxh(str2, "should_reorder", true));
            builder.put(cld.ENABLE_UNSKIPPABLE_ATTACHMENT, new hxh("SNAP_ADS_MUSHROOM_COMMERCIAL_ATTACHMENT", str, true));
            builder.put(cld.ENABLE_NON_BLOCKING_AD_MEDIA_DOWNLOAD_OPT, new hxh("SNAP_ADS_MUSHROOM_NONBLOCKING_MEDIA_OPT", str, true));
            str = "snapads_track_request_disk_persistence_mushroom";
            builder.put(cld.SNAP_ADS_RETRO_IS_ENABLED, new hxh(str, "is_enabled", true));
            builder.put(cld.SNAP_ADS_RETRO_INITIAL_RETRY_DELAY_MILLIS, new hxh(str, "initial_retry_delay_millis", true));
            builder.put(cld.SNAP_ADS_RETRO_MAX_NETWORK_RETRIES_PERSISTENCE, new hxh(str, "max_network_retries_persistence", true));
            builder.put(cld.SNAP_ADS_RETRO_MAX_NETWORK_RETRIES, new hxh(str, "max_network_retries", true));
            builder.put(cld.SNAP_ADS_RETRO_MAX_AGE_MILLIS, new hxh(str, "max_age_millis", true));
            builder.put(cld.SNAP_ADS_RETRO_MAX_RETRO_RETRIES, new hxh(str, "max_retro_retries", true));
            builder.put(cld.SNAP_ADS_RETRO_ENABLE_GRAPHENE_FLUSH, new hxh(str, "graphene_flush_enabled", true));
            builder.put(cld.SNAP_ADS_RETRO_ENABLE_PROCESS, new hxh(str, "process_enabled", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
