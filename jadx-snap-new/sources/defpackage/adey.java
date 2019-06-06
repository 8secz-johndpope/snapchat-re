package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: adey */
public final class adey implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(adew.EXPLORE_SETTING_TOOLTIP, new hxo("map_explore_settings_tooltip", hxr.TOOLTIP));
            builder.put(adew.EXPLORE_EMPTY_MY_STATUS_TOOLTIP, new hxo("map_explore_empty_my_status_tooltip", hxr.TOOLTIP));
            builder.put(adew.NYC_HAS_SEEN_SUBMIT_ANYWHERE, new hxo("nyc_submit_anywhere", hxr.TOOLTIP));
            builder.put(adew.MAP_USAGE_DATA_SHARING_ENABLED, new hxo("map_usage_data_sharing_enabled", hxr.FEATURE_SETTING));
            builder.put(adew.ALLOW_INCOMING_FRIEND_LOCATION_REQUESTS, new hxo("allow_incoming_friend_location_requests", hxr.FEATURE_SETTING));
            builder.put(adew.NYC_SHARING_NOTIFICATION_COUNT, new hxo("nyc_sharing_notification_count", hxr.FEATURE_SETTING));
            builder.put(adew.NYC_SHARING_LAST_SEEN_TIMESTAMP, new hxo("nyc_sharing_notification_last_seen_timestamp", hxr.FEATURE_SETTING));
            builder.put(adew.LAST_MAP_OPEN_TIMESTAMP, new hxo("LAST_MAP_OPEN_TIMESTAMP", hxr.CLIENT_PROPERTY));
            builder.put(adew.MAP_LOCATION_SHARING_NOTIFICATION, new hxo("map_location_sharing_notification", hxr.TOOLTIP));
            builder.put(adew.ZERO_ONBOARDING_SETTINGS_TOOLTIP_LAST_OPEN, new hxo("zero_onboarding_last_shown_time", hxr.FEATURE_SETTING));
            builder.put(adew.ZERO_ONBOARDING_SETTINGS_TOOLTIP_SEEN, new hxo("zero_onboarding_settings_tooltip_seen", hxr.FEATURE_SETTING));
            builder.put(adew.ZERO_ONBOARDING_SHARING_SETTINGS_TOOLTIP_SEEN, new hxo("zero_onboarding_sharing_settings_tooltip_seen", hxr.FEATURE_SETTING));
            builder.put(adew.MAP_PLACES_ONBOARDING_SEEN, new hxo("map_places_onboarded", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
