package com.mapbox.services.android.telemetry.navigation;

import android.location.Location;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.mapbox.services.android.telemetry.utils.TelemetryUtils;
import java.util.Date;
import java.util.Hashtable;
import org.json.JSONObject;

public class MapboxNavigationEvent {
    private static final int EVENT_VERSION = 3;
    public static final String KEY_ABSOLUTE_DISTANCE_TO_DESTINATION = "absoluteDistanceToDestination";
    public static final String KEY_APPLICATION_STATE = "applicationState";
    public static final String KEY_ARRIVAL_TIMESTAMP = "arrivalTimestamp";
    public static final String KEY_AUDIO_TYPE = "audioType";
    public static final String KEY_BATTERY_LEVEL = "batteryLevel";
    public static final String KEY_BATTERY_PLUGGED_IN = "batteryPluggedIn";
    public static final String KEY_COMMENT = "comment";
    public static final String KEY_CONNECTIVITY = "connectivity";
    public static final String KEY_CREATED = "created";
    public static final String KEY_DESCRIPTIONS = "description";
    public static final String KEY_DEVICE = "device";
    public static final String KEY_DISTANCE = "distance";
    public static final String KEY_DISTANCE_COMPLETED = "distanceCompleted";
    public static final String KEY_DISTANCE_REMAINING = "distanceRemaining";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_DURATION_REMAINING = "durationRemaining";
    public static final String KEY_ESTIMATED_DISTANCE = "estimatedDistance";
    public static final String KEY_ESTIMATED_DURATION = "estimatedDuration";
    public static final String KEY_EVENT = "event";
    public static final String KEY_EVENT_VERSION = "eventVersion";
    public static final String KEY_FEEDBACK_ID = "feedbackId";
    public static final String KEY_FEEDBACK_TYPE = "feedbackType";
    public static final String KEY_GEOMETRY = "geometry";
    public static final String KEY_LAT = "lat";
    public static final String KEY_LNG = "lng";
    public static final String KEY_LOCATIONS_AFTER = "locationsAfter";
    public static final String KEY_LOCATIONS_BEFORE = "locationsBefore";
    public static final String KEY_LOCATION_ENGINE = "locationEngine";
    public static final String KEY_NEW_DISTANCE_REMAINING = "newDistanceRemaining";
    public static final String KEY_NEW_DURATION_REMAINING = "newDurationRemaining";
    public static final String KEY_NEW_GEOMETRY = "newGeometry";
    public static final String KEY_OPERATING_SYSTEM = "operatingSystem";
    public static final String KEY_ORIGINAL_ESTIMATED_DISTANCE = "originalEstimatedDistance";
    public static final String KEY_ORIGINAL_ESTIMATED_DURATION = "originalEstimatedDuration";
    public static final String KEY_ORIGINAL_GEOMETRY = "originalGeometry";
    public static final String KEY_ORIGINAL_REQUEST_IDENTIFIER = "originalRequestIdentifier";
    public static final String KEY_ORIGINAL_STEP_COUNT = "originalStepCount";
    public static final String KEY_PERCENT_TIME_IN_FOREGROUND = "percentTimeInForeground";
    public static final String KEY_PERCENT_TIME_IN_PORTRAIT = "percentTimeInPortrait";
    public static final String KEY_PREVIOUS_INSTRUCTION = "previousInstruction";
    public static final String KEY_PREVIOUS_MODIFIER = "previousModifier";
    public static final String KEY_PREVIOUS_NAME = "previousName";
    public static final String KEY_PREVIOUS_TYPE = "previousType";
    public static final String KEY_PROFILE = "profile";
    public static final String KEY_RATING = "rating";
    public static final String KEY_REQUEST_IDENTIFIER = "requestIdentifier";
    public static final String KEY_REROUTE_COUNT = "rerouteCount";
    public static final String KEY_SCREENSHOT = "screenshot";
    public static final String KEY_SCREEN_BRIGHTNESS = "screenBrightness";
    public static final String KEY_SDK_IDENTIFIER = "sdkIdentifier";
    public static final String KEY_SDK_VERSION = "sdkVersion";
    public static final String KEY_SECONDS_SINCE_LAST_REROUTE = "secondsSinceLastReroute";
    public static final String KEY_SESSION_IDENTIFIER = "sessionIdentifier";
    public static final String KEY_SIMULATION = "simulation";
    public static final String KEY_START_TIMESTAMP = "startTimestamp";
    public static final String KEY_STEP = "step";
    public static final String KEY_STEP_COUNT = "stepCount";
    public static final String KEY_UPCOMING_INSTRUCTION = "upcomingInstruction";
    public static final String KEY_UPCOMING_MODIFIER = "upcomingModifier";
    public static final String KEY_UPCOMING_NAME = "upcomingName";
    public static final String KEY_UPCOMING_TYPE = "upcomingType";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_VOLUME_LEVEL = "volumeLevel";
    public static final String TYPE_ARRIVE = "navigation.arrive";
    public static final String TYPE_CANCEL = "navigation.cancel";
    public static final String TYPE_DEPART = "navigation.depart";
    public static final String TYPE_FEEDBACK = "navigation.feedback";
    public static final String TYPE_REROUTE = "navigation.reroute";
    public static final String TYPE_TURNSTILE = "navigation.turnstile";

    private static void addArrivalTimestamp(Hashtable<String, Object> hashtable, Date date) {
        hashtable.put(KEY_ARRIVAL_TIMESTAMP, date == null ? JSONObject.NULL : TelemetryUtils.generateCreateDateFormatted(date));
    }

    private static void addPairIntoEventIfNeeded(Hashtable<String, Object> hashtable, String str, String str2) {
        if (str2 == null || str2.equalsIgnoreCase("null")) {
            hashtable.put(str, JSONObject.NULL);
        } else {
            hashtable.put(str, str2);
        }
    }

    public static Hashtable<String, Object> buildArriveEvent(String str, String str2, String str3, double d, double d2, String str4, String str5, int i, int i2, int i3, Date date, int i4, int i5, int i6, boolean z, String str6, String str7, String str8, int i7, int i8, String str9, int i9, int i10) {
        Hashtable metadata = getMetadata(str, str2, str3, d, d2, str4, str5, i, i2, i3, z, str6, str7, str8, i7, i8, str9, i9, i10);
        metadata.put("event", TYPE_ARRIVE);
        metadata.put(KEY_START_TIMESTAMP, TelemetryUtils.generateCreateDateFormatted(date));
        metadata.put(KEY_DISTANCE_COMPLETED, Integer.valueOf(i4));
        metadata.put(KEY_DISTANCE_REMAINING, Integer.valueOf(i5));
        metadata.put(KEY_DURATION_REMAINING, Integer.valueOf(i6));
        return metadata;
    }

    public static Hashtable<String, Object> buildCancelEvent(String str, String str2, String str3, double d, double d2, String str4, String str5, int i, int i2, int i3, Date date, int i4, int i5, int i6, boolean z, String str6, String str7, String str8, int i7, int i8, String str9, Date date2, int i9, int i10) {
        Hashtable metadata = getMetadata(str, str2, str3, d, d2, str4, str5, i, i2, i3, z, str6, str7, str8, i7, i8, str9, i9, i10);
        metadata.put("event", TYPE_CANCEL);
        metadata.put(KEY_START_TIMESTAMP, TelemetryUtils.generateCreateDateFormatted(date));
        metadata.put(KEY_DISTANCE_COMPLETED, Integer.valueOf(i4));
        metadata.put(KEY_DISTANCE_REMAINING, Integer.valueOf(i5));
        metadata.put(KEY_DURATION_REMAINING, Integer.valueOf(i6));
        addArrivalTimestamp(metadata, date2);
        return metadata;
    }

    public static Hashtable<String, Object> buildDepartEvent(String str, String str2, String str3, double d, double d2, String str4, String str5, int i, int i2, int i3, boolean z, String str6, String str7, String str8, int i4, int i5, String str9, int i6, int i7, int i8, int i9, int i10, Date date) {
        Hashtable metadata = getMetadata(str, str2, str3, d, d2, str4, str5, i, i2, i3, z, str6, str7, str8, i4, i5, str9, i6, i7);
        metadata.put("event", TYPE_DEPART);
        metadata.put(KEY_START_TIMESTAMP, TelemetryUtils.generateCreateDateFormatted(date));
        metadata.put(KEY_DISTANCE_COMPLETED, Integer.valueOf(i8));
        metadata.put(KEY_DISTANCE_REMAINING, Integer.valueOf(i9));
        metadata.put(KEY_DURATION_REMAINING, Integer.valueOf(i10));
        return metadata;
    }

    public static Hashtable<String, Object> buildFeedbackEvent(String str, String str2, String str3, double d, double d2, String str4, String str5, int i, int i2, int i3, Date date, String str6, Location[] locationArr, Location[] locationArr2, int i4, int i5, int i6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, int i7, int i8, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i9, int i10, int i11, int i12, int i13, int i14) {
        Location[] locationArr3 = locationArr;
        Location[] locationArr4 = locationArr2;
        String str23 = str;
        String str24 = str2;
        String str25 = str3;
        double d3 = d;
        double d4 = d2;
        String str26 = str4;
        String str27 = str5;
        int i15 = i;
        int i16 = i2;
        int i17 = i3;
        boolean z2 = z;
        String str28 = str11;
        String str29 = str12;
        String str30 = str13;
        int i18 = i7;
        int i19 = i8;
        String str31 = str14;
        int i20 = i13;
        int i21 = i14;
        NavigationLocation navigationLocation = new NavigationLocation();
        Hashtable metadata = getMetadata(str23, str24, str25, d3, d4, str26, str27, i15, i16, i17, z2, str28, str29, str30, i18, i19, str31, i20, i21);
        metadata.put(KEY_STEP, getStepMetadata(str15, str16, str17, str18, str19, str20, str21, str22, i9, i10, i11, i12));
        metadata.put("event", TYPE_FEEDBACK);
        metadata.put("description", str7);
        metadata.put("userId", str8);
        metadata.put(KEY_FEEDBACK_ID, str9);
        metadata.put(KEY_SCREENSHOT, str10);
        metadata.put(KEY_START_TIMESTAMP, TelemetryUtils.generateCreateDateFormatted(date));
        metadata.put(KEY_FEEDBACK_TYPE, str6);
        metadata.put(KEY_LOCATIONS_BEFORE, locationArr3 != null ? navigationLocation.getSerializedJson(locationArr3) : JSONObject.NULL);
        NavigationLocation navigationLocation2 = navigationLocation;
        locationArr4 = locationArr2;
        metadata.put(KEY_LOCATIONS_AFTER, locationArr4 != null ? navigationLocation2.getSerializedJson(locationArr4) : JSONObject.NULL);
        metadata.put(KEY_DISTANCE_COMPLETED, Integer.valueOf(i4));
        metadata.put(KEY_DISTANCE_REMAINING, Integer.valueOf(i5));
        metadata.put(KEY_DURATION_REMAINING, Integer.valueOf(i6));
        return metadata;
    }

    public static Hashtable<String, Object> buildRerouteEvent(String str, String str2, String str3, double d, double d2, String str4, String str5, int i, int i2, int i3, Date date, Location[] locationArr, Location[] locationArr2, int i4, int i5, int i6, int i7, int i8, int i9, String str6, String str7, boolean z, String str8, String str9, String str10, int i10, int i11, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i12, int i13, int i14, int i15, int i16, int i17) {
        Location[] locationArr3 = locationArr;
        Location[] locationArr4 = locationArr2;
        String str20 = str;
        String str21 = str2;
        String str22 = str3;
        double d3 = d;
        double d4 = d2;
        String str23 = str4;
        String str24 = str5;
        int i18 = i;
        int i19 = i2;
        int i20 = i3;
        boolean z2 = z;
        String str25 = str8;
        String str26 = str9;
        String str27 = str10;
        int i21 = i10;
        int i22 = i11;
        String str28 = str11;
        int i23 = i16;
        int i24 = i17;
        NavigationLocation navigationLocation = new NavigationLocation();
        Hashtable metadata = getMetadata(str20, str21, str22, d3, d4, str23, str24, i18, i19, i20, z2, str25, str26, str27, i21, i22, str28, i23, i24);
        metadata.put(KEY_STEP, getStepMetadata(str12, str13, str14, str15, str16, str17, str18, str19, i12, i13, i14, i15));
        metadata.put("event", TYPE_REROUTE);
        metadata.put(KEY_FEEDBACK_ID, str6);
        metadata.put(KEY_START_TIMESTAMP, TelemetryUtils.generateCreateDateFormatted(date));
        metadata.put(KEY_LOCATIONS_BEFORE, locationArr3 != null ? navigationLocation.getSerializedJson(locationArr3) : JSONObject.NULL);
        NavigationLocation navigationLocation2 = navigationLocation;
        locationArr4 = locationArr2;
        metadata.put(KEY_LOCATIONS_AFTER, locationArr4 != null ? navigationLocation2.getSerializedJson(locationArr4) : JSONObject.NULL);
        metadata.put(KEY_DISTANCE_COMPLETED, Integer.valueOf(i4));
        metadata.put(KEY_DISTANCE_REMAINING, Integer.valueOf(i5));
        metadata.put(KEY_DURATION_REMAINING, Integer.valueOf(i6));
        metadata.put(KEY_NEW_DISTANCE_REMAINING, Integer.valueOf(i7));
        metadata.put(KEY_NEW_DURATION_REMAINING, Integer.valueOf(i8));
        metadata.put(KEY_NEW_GEOMETRY, str7);
        metadata.put(KEY_SECONDS_SINCE_LAST_REROUTE, Integer.valueOf(i9));
        return metadata;
    }

    public static Hashtable<String, Object> buildTurnstileEvent(String str, String str2) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("event", TYPE_TURNSTILE);
        hashtable.put("operatingSystem", TelemetryConstants.OPERATING_SYSTEM);
        hashtable.put("sdkIdentifier", str);
        hashtable.put("sdkVersion", str2);
        return hashtable;
    }

    private static Hashtable<String, Object> getMetadata(String str, String str2, String str3, double d, double d2, String str4, String str5, int i, int i2, int i3, boolean z, String str6, String str7, String str8, int i4, int i5, String str9, int i6, int i7) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("operatingSystem", TelemetryConstants.OPERATING_SYSTEM);
        String str10 = str;
        hashtable.put("sdkIdentifier", str);
        str10 = str2;
        hashtable.put("sdkVersion", str2);
        hashtable.put(KEY_EVENT_VERSION, Integer.valueOf(3));
        str10 = str3;
        hashtable.put(KEY_SESSION_IDENTIFIER, str3);
        hashtable.put("lat", Double.valueOf(d));
        hashtable.put("lng", Double.valueOf(d2));
        str10 = str4;
        hashtable.put(KEY_GEOMETRY, str4);
        hashtable.put("created", TelemetryUtils.generateCreateDate(null));
        str10 = str5;
        hashtable.put(KEY_PROFILE, str5);
        hashtable.put(KEY_ESTIMATED_DISTANCE, Integer.valueOf(i));
        hashtable.put(KEY_ESTIMATED_DURATION, Integer.valueOf(i2));
        hashtable.put(KEY_STEP_COUNT, Integer.valueOf(i6));
        hashtable.put(KEY_ORIGINAL_STEP_COUNT, Integer.valueOf(i7));
        hashtable.put(KEY_REROUTE_COUNT, Integer.valueOf(i3));
        hashtable.put(KEY_SIMULATION, Boolean.valueOf(z));
        addPairIntoEventIfNeeded(hashtable, KEY_ORIGINAL_REQUEST_IDENTIFIER, str6);
        addPairIntoEventIfNeeded(hashtable, KEY_REQUEST_IDENTIFIER, str7);
        hashtable.put(KEY_ORIGINAL_GEOMETRY, str8);
        hashtable.put(KEY_ORIGINAL_ESTIMATED_DISTANCE, Integer.valueOf(i4));
        hashtable.put(KEY_ORIGINAL_ESTIMATED_DURATION, Integer.valueOf(i5));
        return hashtable;
    }

    private static JSONObject getStepMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4) {
        Object str9;
        Object str22;
        Hashtable hashtable = new Hashtable();
        String str10 = KEY_UPCOMING_INSTRUCTION;
        if (str9 == null) {
            str9 = JSONObject.NULL;
        }
        hashtable.put(str10, str9);
        str9 = KEY_UPCOMING_TYPE;
        if (str22 == null) {
            str22 = JSONObject.NULL;
        }
        hashtable.put(str9, str22);
        str9 = KEY_UPCOMING_MODIFIER;
        if (str3 != null) {
            hashtable.put(str9, str3);
        } else {
            hashtable.put(str9, JSONObject.NULL);
        }
        str9 = KEY_UPCOMING_NAME;
        if (str4 != null) {
            hashtable.put(str9, str4);
        } else {
            hashtable.put(str9, JSONObject.NULL);
        }
        str9 = KEY_PREVIOUS_INSTRUCTION;
        if (str5 != null) {
            hashtable.put(str9, str5);
        } else {
            hashtable.put(str9, JSONObject.NULL);
        }
        str9 = KEY_PREVIOUS_TYPE;
        if (str6 != null) {
            hashtable.put(str9, str6);
        } else {
            hashtable.put(str9, JSONObject.NULL);
        }
        str9 = KEY_PREVIOUS_MODIFIER;
        if (str7 != null) {
            hashtable.put(str9, str7);
        } else {
            hashtable.put(str9, JSONObject.NULL);
        }
        str9 = KEY_PREVIOUS_NAME;
        if (str8 != null) {
            hashtable.put(str9, str8);
        } else {
            hashtable.put(str9, JSONObject.NULL);
        }
        hashtable.put(KEY_DISTANCE, Integer.valueOf(i));
        hashtable.put("duration", Integer.valueOf(i2));
        hashtable.put(KEY_DISTANCE_REMAINING, Integer.valueOf(i3));
        hashtable.put(KEY_DURATION_REMAINING, Integer.valueOf(i4));
        return new JSONObject(hashtable);
    }
}
