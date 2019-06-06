package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: cle */
public final class cle implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(cld.SNAP_ADS_GATING_ENABLED, "overall_ad_enabled");
            builder.put(cld.ENABLE_DISCOVER_AD, "discover_ad_enabled");
            builder.put(cld.ENABLE_OUR_STORY_AD, "our_story_ad_enabled");
            builder.put(cld.ENABLE_USER_STORY_AD, "user_story_ad_enabled");
            builder.put(cld.ENABLE_ADS_IN_SHOWS, "ad_in_shows_enabled");
            builder.put(cld.ENABLE_CONTENT_INTERSTITIAL_ADS, "content_interstitial_ad_enabled");
            builder.put(cld.ENABLE_COGNAC_AD, "cognac_ad_enabled");
            builder.put(cld.ENABLE_WEBVIEW_PERFORMANCE_LOGGING, "webview_loading_metric_enabled");
            builder.put(cld.SNAPCHAT_TRACKING_HOST, "pixel_tracking_host");
            builder.put(cld.SNAPCHAT_PIXEL_TRACKING_PATH, "pixel_tracking_path");
            builder.put(cld.SNAPCHAT_PIXEL_TRACKING_COOKIE_NAME, "pixel_tracking_cookie_name");
            builder.put(cld.SNAPCHAT_PIXEL_TRACKING_CLIENT_TTL_COOKIE_NAME, "pixel_tracking_client_ttl_cookie_name");
            builder.put(cld.SNAPCHAT_TRACKING_CLIENT_TTL_MS, "pixel_tracking_client_ttl_millis");
            builder.put(cld.AD_MEDIA_CACHING_TTL_DAY, "ad_media_cache_ttl_days");
            builder.put(cld.VIEW_RECEIPT_TTL_SEC, "ad_view_receipt_ttl_seconds");
            builder.put(cld.AD_CREATIVE_PREVIEW_PAYLOAD_VERSION, "ad_creative_preview_payload_version");
            builder.put(cld.COGNAC_AD_NO_FILL_RETRY_DELAY_SECONDS, "cognac_ad_no_fill_delay");
            builder.put(cld.MUSHROOM_DISCOVER_AD_BATCH_NETWORK_REQUEST_TIMEOUT_SECONDS, "batch_ad_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_MULTI_AUCTION_AD_NETWORK_REQUEST_TIMEOUT_SECONDS, "multi_auction_ad_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_PUBLISHER_AD_SERVE_NETWORK_REQUEST_TIMEOUT_SECONDS, "publisher_ad_serve_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_DYNAMIC_AD_SERVE_NETWORK_REQUEST_TIMEOUT_SECONDS, "dynamic_ad_serve_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_INIT_NETWORK_REQUEST_TIMEOUT_SECONDS, "ad_init_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_THIRD_PARTY_TRACK_NETWORK_REQUEST_TIMEOUT_SECONDS, "ad_3p_track_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_AD_INTEREST_NETWORK_REQUEST_TIMEOUT_SECONDS, "ad_interest_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_PIXEL_TRACK_NETWORK_REQUEST_TIMEOUT_SECONDS, "pixel_track_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_AD_TRACK_NETWORK_REQUEST_TIMEOUT_SECONDS, "ad_track_network_request_timeout_seconds");
            builder.put(cld.MUSHROOM_RETRO_NETWORK_REQUEST_WITH_RETRY_TIMEOUT_SECONDS, "retro_network_request_with_retry_timeout_seconds");
            builder.put(cld.INIT_RESPONSE_TTL_MS, "ad_init_response_ttl_millis");
            this.a = builder.build();
        }
        return this.a;
    }
}
