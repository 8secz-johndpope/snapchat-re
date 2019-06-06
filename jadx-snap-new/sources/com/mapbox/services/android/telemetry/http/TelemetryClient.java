package com.mapbox.services.android.telemetry.http;

import android.text.TextUtils;
import android.util.Log;
import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.mapbox.services.android.telemetry.utils.MathUtils;
import defpackage.akgy;
import defpackage.akgz;
import defpackage.akho;
import defpackage.akhq;
import defpackage.akhq.a;
import defpackage.akht;
import defpackage.akhu;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public class TelemetryClient {
    private static final akho JSON = akho.a("application/json; charset=utf-8");
    private static final String LOG_TAG = "TelemetryClient";
    private String accessToken = null;
    private akhq client;
    private boolean debugLoggingEnabled = false;
    private boolean enableCnEndpoint = false;
    private String eventsCnEndpoint = MapboxEvent.MAPBOX_EVENTS_CN_BASE_URL;
    private String eventsEndpoint = MapboxEvent.MAPBOX_EVENTS_BASE_URL;
    private boolean stagingEnvironment = false;
    private String userAgent = null;

    public TelemetryClient(String str) {
        this.accessToken = str;
        a aVar = new a();
        akgz buildCertificatePinner = buildCertificatePinner();
        if (buildCertificatePinner != null) {
            aVar.k = buildCertificatePinner;
            aVar = aVar.a(new GzipRequestInterceptor());
            aVar.r = true;
            this.client = aVar.a();
            return;
        }
        throw new NullPointerException("certificatePinner == null");
    }

    private akgz buildCertificatePinner() {
        akgz.a aVar = new akgz.a();
        String str = "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=";
        String str2 = "sha256/5kJvNEMw0KjrCAu7eXY5HZdvyCS13BbA0VJG1RSP91w=";
        String str3;
        if (isStagingEnvironment()) {
            str3 = "cloudfront-staging.tilestream.net";
            aVar.a(str3, "sha256/3euxrJOrEZI15R4104UsiAkDqe007EPyZ6eTL/XxdAY=").a(str3, str2).a(str3, str);
        } else {
            str3 = "events.mapbox.com";
            String str4 = "events.mapbox.cn";
            str2 = "snap.events.mapbox.com";
            aVar.a(str3, "sha256/BhynraKizavqoC5U26qgYuxLZst6pCu9J5stfL6RSYY=").a(str3, "sha256/owrR9U9FWDWtrFF+myoRIu75JwU4sJwzvhCNLZoY37g=").a(str3, "sha256/SQVGZiOrQXi+kqxcvWWE96HhfydlLVqFr4lQTqI5qqo=").a(str3, "sha256/yJLOJQLNTPNSOh3Btyg9UA1icIoZZssWzG0UmVEJFfA=").a(str3, "sha256/Tb0uHZ/KQjWh8N9+CZFLc4zx36LONQ55l6laDi1qtT4=").a(str3, "sha256/RRM1dGqnDFsCJXBTHky16vi1obOlCgFFn/yOhI/y+ho=").a(str3, "sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=").a(str3, "sha256/yGp2XoimPmIK24X3bNV1IaK+HqvbGEgqar5nauDdC5E=").a(str4, "sha256/gakY+fylqW6kp6piqnaQNLZFzT8HlhzP5lsGJk5WguE=").a(str4, str2).a(str4, str).a(str2, "sha256/qjl/5X6sDeDCP4DEcR4VFPw0qa/El98EU/ZHwY0jTx0=").a(str2, "sha256/Xw7GYmoUa7YVrYJj7t7RnqYcO58dRFLYEL7UEOuIlX8=");
        }
        return aVar.a();
    }

    private void sendEventsWrapped(Vector<Hashtable<String, Object>> vector, akgy akgy) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Hashtable hashtable = (Hashtable) it.next();
            JSONObject jSONObject = new JSONObject();
            String str = "sdkIdentifier";
            jSONObject.putOpt(str, hashtable.get(str));
            String str2 = "sdkVersion";
            jSONObject.putOpt(str2, hashtable.get(str2));
            String str3 = MapboxNavigationEvent.KEY_EVENT_VERSION;
            jSONObject.putOpt(str3, hashtable.get(str3));
            str3 = MapboxNavigationEvent.KEY_SESSION_IDENTIFIER;
            jSONObject.putOpt(str3, hashtable.get(str3));
            str3 = MapboxNavigationEvent.KEY_ORIGINAL_REQUEST_IDENTIFIER;
            jSONObject.putOpt(str3, hashtable.get(str3));
            str3 = MapboxNavigationEvent.KEY_REQUEST_IDENTIFIER;
            jSONObject.putOpt(str3, hashtable.get(str3));
            str3 = "lat";
            jSONObject.putOpt(str3, hashtable.get(str3));
            String str4 = "lng";
            jSONObject.putOpt(str4, hashtable.get(str4));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ORIGINAL_GEOMETRY, hashtable.get(MapboxNavigationEvent.KEY_ORIGINAL_GEOMETRY));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ORIGINAL_ESTIMATED_DISTANCE, hashtable.get(MapboxNavigationEvent.KEY_ORIGINAL_ESTIMATED_DISTANCE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ORIGINAL_ESTIMATED_DURATION, hashtable.get(MapboxNavigationEvent.KEY_ORIGINAL_ESTIMATED_DURATION));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_AUDIO_TYPE, hashtable.get(MapboxNavigationEvent.KEY_AUDIO_TYPE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_GEOMETRY, hashtable.get(MapboxNavigationEvent.KEY_GEOMETRY));
            String str5 = "created";
            jSONObject.putOpt(str5, hashtable.get(str5));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PROFILE, hashtable.get(MapboxNavigationEvent.KEY_PROFILE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_SIMULATION, hashtable.get(MapboxNavigationEvent.KEY_SIMULATION));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ESTIMATED_DISTANCE, hashtable.get(MapboxNavigationEvent.KEY_ESTIMATED_DISTANCE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ESTIMATED_DURATION, hashtable.get(MapboxNavigationEvent.KEY_ESTIMATED_DURATION));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_REROUTE_COUNT, hashtable.get(MapboxNavigationEvent.KEY_REROUTE_COUNT));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_DEVICE, hashtable.get(MapboxNavigationEvent.KEY_DEVICE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_VOLUME_LEVEL, hashtable.get(MapboxNavigationEvent.KEY_VOLUME_LEVEL));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_SCREEN_BRIGHTNESS, hashtable.get(MapboxNavigationEvent.KEY_SCREEN_BRIGHTNESS));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_BATTERY_PLUGGED_IN, hashtable.get(MapboxNavigationEvent.KEY_BATTERY_PLUGGED_IN));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_CONNECTIVITY, hashtable.get(MapboxNavigationEvent.KEY_CONNECTIVITY));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_FEEDBACK_TYPE, hashtable.get(MapboxNavigationEvent.KEY_FEEDBACK_TYPE));
            jSONObject.putOpt("description", hashtable.get("description"));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_LOCATIONS_BEFORE, hashtable.get(MapboxNavigationEvent.KEY_LOCATIONS_BEFORE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_LOCATIONS_AFTER, hashtable.get(MapboxNavigationEvent.KEY_LOCATIONS_AFTER));
            String str6 = "userId";
            jSONObject.putOpt(str6, hashtable.get(str6));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_FEEDBACK_ID, hashtable.get(MapboxNavigationEvent.KEY_FEEDBACK_ID));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_SCREENSHOT, hashtable.get(MapboxNavigationEvent.KEY_SCREENSHOT));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_NEW_DISTANCE_REMAINING, hashtable.get(MapboxNavigationEvent.KEY_NEW_DISTANCE_REMAINING));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_NEW_DURATION_REMAINING, hashtable.get(MapboxNavigationEvent.KEY_NEW_DURATION_REMAINING));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_NEW_GEOMETRY, hashtable.get(MapboxNavigationEvent.KEY_NEW_GEOMETRY));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_START_TIMESTAMP, hashtable.get(MapboxNavigationEvent.KEY_START_TIMESTAMP));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_DISTANCE_COMPLETED, hashtable.get(MapboxNavigationEvent.KEY_DISTANCE_COMPLETED));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_DISTANCE_REMAINING, hashtable.get(MapboxNavigationEvent.KEY_DISTANCE_REMAINING));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_DURATION_REMAINING, hashtable.get(MapboxNavigationEvent.KEY_DURATION_REMAINING));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_SECONDS_SINCE_LAST_REROUTE, hashtable.get(MapboxNavigationEvent.KEY_SECONDS_SINCE_LAST_REROUTE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ARRIVAL_TIMESTAMP, hashtable.get(MapboxNavigationEvent.KEY_ARRIVAL_TIMESTAMP));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_STEP, hashtable.get(MapboxNavigationEvent.KEY_STEP));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_STEP_COUNT, hashtable.get(MapboxNavigationEvent.KEY_STEP_COUNT));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_LOCATION_ENGINE, hashtable.get(MapboxNavigationEvent.KEY_LOCATION_ENGINE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ABSOLUTE_DISTANCE_TO_DESTINATION, hashtable.get(MapboxNavigationEvent.KEY_ABSOLUTE_DISTANCE_TO_DESTINATION));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PERCENT_TIME_IN_FOREGROUND, hashtable.get(MapboxNavigationEvent.KEY_PERCENT_TIME_IN_FOREGROUND));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PERCENT_TIME_IN_PORTRAIT, hashtable.get(MapboxNavigationEvent.KEY_PERCENT_TIME_IN_PORTRAIT));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_UPCOMING_INSTRUCTION, hashtable.get(MapboxNavigationEvent.KEY_UPCOMING_INSTRUCTION));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_UPCOMING_MODIFIER, hashtable.get(MapboxNavigationEvent.KEY_UPCOMING_MODIFIER));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_UPCOMING_NAME, hashtable.get(MapboxNavigationEvent.KEY_UPCOMING_NAME));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PREVIOUS_INSTRUCTION, hashtable.get(MapboxNavigationEvent.KEY_PREVIOUS_INSTRUCTION));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PREVIOUS_TYPE, hashtable.get(MapboxNavigationEvent.KEY_PREVIOUS_TYPE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PREVIOUS_MODIFIER, hashtable.get(MapboxNavigationEvent.KEY_PREVIOUS_MODIFIER));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_PREVIOUS_NAME, hashtable.get(MapboxNavigationEvent.KEY_PREVIOUS_NAME));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_UPCOMING_TYPE, hashtable.get(MapboxNavigationEvent.KEY_UPCOMING_TYPE));
            jSONObject.putOpt("duration", hashtable.get("duration"));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_DISTANCE, hashtable.get(MapboxNavigationEvent.KEY_DISTANCE));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_ORIGINAL_STEP_COUNT, hashtable.get(MapboxNavigationEvent.KEY_ORIGINAL_STEP_COUNT));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_RATING, hashtable.get(MapboxNavigationEvent.KEY_RATING));
            jSONObject.putOpt(MapboxNavigationEvent.KEY_COMMENT, hashtable.get(MapboxNavigationEvent.KEY_COMMENT));
            String str7 = "event";
            jSONObject.putOpt(str7, hashtable.get(str7));
            jSONObject.putOpt(str5, hashtable.get(str5));
            jSONObject.putOpt(str6, hashtable.get(str6));
            jSONObject.putOpt(MapboxEvent.KEY_ENABLED_TELEMETRY, hashtable.get(MapboxEvent.KEY_ENABLED_TELEMETRY));
            jSONObject.putOpt("source", hashtable.get("source"));
            jSONObject.putOpt("sessionId", hashtable.get("sessionId"));
            jSONObject.putOpt(str3, hashtable.get(str3));
            jSONObject.putOpt(str, hashtable.get(str));
            jSONObject.putOpt(str2, hashtable.get(str2));
            if (hashtable.containsKey(str4)) {
                double doubleValue = ((Double) hashtable.get(str4)).doubleValue();
                if (doubleValue < -180.0d || doubleValue > 180.0d) {
                    doubleValue = MathUtils.wrap(doubleValue, -180.0d, 180.0d);
                }
                jSONObject.put(str4, doubleValue);
            }
            jSONObject.putOpt(MapboxEvent.KEY_ALTITUDE, hashtable.get(MapboxEvent.KEY_ALTITUDE));
            jSONObject.putOpt(MapboxEvent.KEY_ZOOM, hashtable.get(MapboxEvent.KEY_ZOOM));
            jSONObject.putOpt("operatingSystem", hashtable.get("operatingSystem"));
            jSONObject.putOpt(str6, hashtable.get(str6));
            jSONObject.putOpt(MapboxEvent.KEY_MODEL, hashtable.get(MapboxEvent.KEY_MODEL));
            jSONObject.putOpt(MapboxEvent.KEY_RESOLUTION, hashtable.get(MapboxEvent.KEY_RESOLUTION));
            jSONObject.putOpt(MapboxEvent.KEY_ACCESSIBILITY_FONT_SCALE, hashtable.get(MapboxEvent.KEY_ACCESSIBILITY_FONT_SCALE));
            jSONObject.putOpt("batteryLevel", hashtable.get("batteryLevel"));
            jSONObject.putOpt(MapboxEvent.KEY_PLUGGED_IN, hashtable.get(MapboxEvent.KEY_PLUGGED_IN));
            jSONObject.putOpt(MapboxEvent.KEY_WIFI, hashtable.get(MapboxEvent.KEY_WIFI));
            str = "orientation";
            if (hashtable.containsKey(str)) {
                str2 = (String) hashtable.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.putOpt(str, str2);
                }
            }
            str = MapboxEvent.KEY_CARRIER;
            if (hashtable.containsKey(str)) {
                str2 = (String) hashtable.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.putOpt(str, str2);
                }
            }
            str = "applicationState";
            if (hashtable.containsKey(str) && !TextUtils.isEmpty((String) hashtable.get(str))) {
                jSONObject.putOpt(str, hashtable.get(str));
            }
            str = (String) hashtable.get(str7);
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(MapboxEvent.TYPE_MAP_CLICK)) {
                jSONObject.put(MapboxEvent.KEY_GESTURE_ID, hashtable.get(MapboxEvent.KEY_GESTURE_ID));
            }
            str = MapboxEvent.KEY_CELLULAR_NETWORK_TYPE;
            if (hashtable.containsKey(str)) {
                jSONObject.put(str, TextUtils.isEmpty((String) hashtable.get(str)) ? null : hashtable.get(str));
            }
            jSONArray.put(jSONObject);
        }
        akhu create = akhu.create(JSON, jSONArray.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getEventsEndpoint());
        stringBuilder.append("/events/v2?access_token=");
        stringBuilder.append(getAccessToken());
        String stringBuilder2 = stringBuilder.toString();
        if (isDebugLoggingEnabled() || isStagingEnvironment()) {
            Log.d(LOG_TAG, String.format("Sending POST to %s with %d event(s) (user agent: %s) with payload: %s", new Object[]{stringBuilder2, Integer.valueOf(vector.size()), getUserAgent(), r0}));
        }
        try {
            this.client.newCall(new akht.a().a(stringBuilder2).a("User-Agent", getUserAgent()).a(LensTextInputConstants.REQUEST_METHOD, create).a()).a(akgy);
        } catch (InternalError unused) {
        }
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getEventsEndpoint() {
        return isEnableCnEndpoint() ? this.eventsCnEndpoint : this.eventsEndpoint;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isDebugLoggingEnabled() {
        return this.debugLoggingEnabled;
    }

    public boolean isEnableCnEndpoint() {
        return this.enableCnEndpoint;
    }

    public boolean isStagingEnvironment() {
        return this.stagingEnvironment;
    }

    public void sendEvents(Vector<Hashtable<String, Object>> vector, akgy akgy) {
        if (!(vector == null || vector.size() == 0)) {
            try {
                sendEventsWrapped(vector, akgy);
            } catch (Exception e) {
                Log.e(LOG_TAG, String.format("Request preparation failed: %s.", new Object[]{e.getMessage()}));
            }
        }
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setDebugLoggingEnabled(boolean z) {
        this.debugLoggingEnabled = z;
    }

    public void setEnableCnEndpoint() {
        this.enableCnEndpoint = true;
    }

    public void setEventsEndpoint(String str) {
        this.eventsEndpoint = str;
    }

    public void setStagingEnvironment(boolean z) {
        this.stagingEnvironment = z;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}
