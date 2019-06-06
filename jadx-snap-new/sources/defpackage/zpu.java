package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zpu */
public final class zpu implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(zpt.UNLOCKABLES_LOCATION_LISTENING_WINDOW_SECONDS, "location_update_listening_window_seconds");
            builder.put(zpt.SERVER_CONFIG_LOW_SENSITIVITY_REQUEST_EXPIRY_MILLIS, "low_sensitivity_response_ttl_millis");
            builder.put(zpt.SERVER_CONFIG_GTQ_AUTH_TOKEN_EXPIRATION_MILLIS, "gtq_direct_token_ttl_millis");
            builder.put(zpt.LOCATION_UPDATE_FRESHNESS_THRESHOLD_MS, "location_listening_freshness_threshold_millis");
            builder.put(zpt.LOCATION_UPDATE_PROXIMITY_THRESHOLD_METER, "location_listening_proximity_threshold_meters");
            builder.put(zpt.LOCATION_UPDATE_ACCURACY_FACTOR, "location_listening_accuracy_factor");
            builder.put(zpt.GTQ_SERVE_RETRY_COUNT, "gtq_serve_retry_count");
            builder.put(zpt.GTQ_CREATION_TRACK_RETRY_COUNT, "gtq_creation_track_retry_count");
            builder.put(zpt.GTQ_VIEW_TRACK_RETRY_COUNT, "gtq_view_track_retry_count");
            builder.put(zpt.THIRD_PARTY_AD_TRACK_V2_URL, "third_party_ad_track_v2_url");
            this.a = builder.build();
        }
        return this.a;
    }
}
