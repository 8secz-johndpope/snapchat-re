package defpackage;

import com.google.gson.reflect.TypeToken;
import defpackage.fth.a;
import java.util.concurrent.TimeUnit;

/* renamed from: zpt */
public enum zpt implements fth {
    UNLOCKABLES_GATING_ENABLED(a.a(true)),
    UNLOCKABLES_SUPPLY_GTQ_CHECKSUM_REQUEST(a.a(false)),
    UNLOCKABLES_PROCESS_GTQ_CHECKSUM_RESPONSE(a.a(false)),
    UNLOCKABLES_NETWORK_REQUEST_ENABLED(a.a(true)),
    GEOFILTER_ALLOW_GEOFILTER_PAGE_SECTION_UPDATE(a.a(true)),
    UNLOCKABLES_LOCATION_LISTENING_WINDOW_SECONDS(a.a(30)),
    GTQ_SERVER_ENDPOINT(a.a(zpx.PROD)),
    GTQ_SERVER_CUSTOM_HOST_URL(a.a(r2)),
    GTQ_SERVE_PATH(a.a("/v2/direct_serve_unlockables")),
    GTQ_CREATION_TRACK_PATH(a.a("/track/creation")),
    GTQ_VIEW_TRACK_PATH(a.a("/track/view")),
    TWEAK_FORCE_LOW_SENSITIVITY_REQUEST(a.a(false)),
    SERVER_CONFIG_ENCODED_USER_EXPERIMENT(a.a(r2)),
    SERVER_CONFIG_LOW_SENSITIVITY_REQUEST_EXPIRY_MILLIS(a.a(TimeUnit.HOURS.toMillis(1))),
    SERVER_CONFIG_GTQ_AUTH_TOKEN_EXPIRATION_MILLIS(a.a(TimeUnit.DAYS.toMillis(1))),
    LOCATION_UPDATE_FRESHNESS_THRESHOLD_MS(a.a(TimeUnit.MINUTES.toMillis(1))),
    LOCATION_UPDATE_PROXIMITY_THRESHOLD_METER(a.a(200.0f)),
    LOCATION_UPDATE_ACCURACY_FACTOR(a.a(2.0f)),
    OPPORTUNITY_ID(a.a(new 1().getType(), "null")),
    GTQ_AUTH_PAYLOAD(a.a(r2)),
    LAST_KNOWN_COUNTRY_CODE(a.a(r2)),
    SNAP_SCORE(a.a(0)),
    LAST_LOW_SENSITIVITY_RESPONSE_TIME_MILLIS(a.a(0)),
    GTQ_SERVE_RETRY_COUNT(a.a(0)),
    GTQ_CREATION_TRACK_RETRY_COUNT(a.a(2)),
    GTQ_VIEW_TRACK_RETRY_COUNT(a.a(2)),
    THIRD_PARTY_AD_TRACK_V2_URL(a.a("https://usc.adserver.snapads.com/v2/track/")),
    GTQ_TRACK_PROTO_TRACK(a.a(false)),
    ENABLE_DETAILED_GTQ_SERVE_RESPONSE_DEBUG_LOGGING(a.a(false)),
    ORDERED_CAROUSEL_CONFIG(a.a(r2)),
    UNLOCK_LENS_EXPIRATION_TIMESTAMP_MILLIS(a.a(-1));
    
    private final a<?> delegate;

    /* renamed from: zpt$1 */
    static class 1 extends TypeToken<ajwj<afju>> {
        1() {
        }
    }

    private zpt(a<?> aVar) {
        this.delegate = aVar;
    }

    public final a<?> a() {
        return this.delegate;
    }

    public final ftg b() {
        return ftg.UNLOCKABLES;
    }
}
