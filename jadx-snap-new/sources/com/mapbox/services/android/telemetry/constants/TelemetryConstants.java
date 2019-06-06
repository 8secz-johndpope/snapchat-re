package com.mapbox.services.android.telemetry.constants;

import android.os.Build.VERSION;
import java.util.Locale;

public class TelemetryConstants {
	public static final Locale DEFAULT_LOCALE = Locale.US;
	public static final int DEFAULT_SESSION_ID_ROTATION_HOURS = 24;
	public static final long FLUSH_DELAY_MS = 10000; // 10 s
	public static final int FLUSH_EVENTS_CAP = 180;
	public static final long FLUSH_PERIOD_MS = 180000;
	public static final String KEY_META_DATA_CN_SERVER = "com.mapbox.CnEventsServer";
	public static final String KEY_META_DATA_STAGING_ACCESS_TOKEN = "com.mapbox.TestEventsAccessToken";
	public static final String KEY_META_DATA_STAGING_SERVER = "com.mapbox.TestEventsServer";
	public static final String MAPBOX_SHARED_PREFERENCES_FILE = "MapboxSharedPreferences";
	public static final String MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_ENABLED = "mapboxTelemetryEnabled";
	public static final String MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STAGING_ACCESS_TOKEN = "mapboxTelemetryStagingAccessToken";
	public static final String MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STAGING_URL = "mapboxTelemetryStagingUrl";
	public static final String MAPBOX_SHARED_PREFERENCE_KEY_VENDOR_ID = "mapboxVendorId";
	public static final int ONE_HOUR_IN_MS = 3600000;
	public static final String OPERATING_SYSTEM;
	public static final String TELEMETRY_SERVICE_NAME = "com.mapbox.services.android.telemetry.service.TelemetryService";

	static {
		StringBuilder stringBuilder = new StringBuilder("Android - ");
		stringBuilder.append(VERSION.RELEASE);
		OPERATING_SYSTEM = stringBuilder.toString();
	}
}
