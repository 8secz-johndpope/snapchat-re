package com.mapbox.mapboxsdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException;
import com.mapbox.mapboxsdk.location.LocationSource;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.alsj;

public final class Mapbox {
    private static Mapbox INSTANCE;
    private String accessToken;
    private Boolean connected;
    private Context context;
    private LocationSource locationSource;

    Mapbox(Context context, String str, LocationSource locationSource) {
        this.context = context;
        this.accessToken = str;
        this.locationSource = locationSource;
    }

    public static String getAccessToken() {
        validateMapbox();
        validateAccessToken();
        return INSTANCE.accessToken;
    }

    public static Context getApplicationContext() {
        return INSTANCE.context;
    }

    public static synchronized Mapbox getInstance(Context context, String str) {
        Mapbox mapbox;
        synchronized (Mapbox.class) {
            if (INSTANCE == null) {
                context = context.getApplicationContext();
                INSTANCE = new Mapbox(context, str, null);
                if (MapboxConstants.ENABLE_MAPBOX_LOCATION_SERVICE) {
                    LocationSource locationSource = new LocationSource(context);
                    locationSource.setPriority(0);
                    try {
                        TelemetryAccessor.initializeTelemetry(context, str, locationSource);
                    } catch (Exception e) {
                        alsj.a(e, "Unable to instantiate Mapbox telemetry", new Object[0]);
                    }
                    ConnectivityReceiver.instance(context);
                }
            }
            mapbox = INSTANCE;
        }
        return mapbox;
    }

    public static LocationSource getLocationSource() {
        return INSTANCE.locationSource;
    }

    public static synchronized Boolean isConnected() {
        synchronized (Mapbox.class) {
            Boolean bool;
            if (INSTANCE.connected != null) {
                bool = INSTANCE.connected;
                return bool;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) INSTANCE.context.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY)).getActiveNetworkInfo();
            boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            bool = Boolean.valueOf(z);
            return bool;
        }
    }

    public static synchronized void setConnected(Boolean bool) {
        synchronized (Mapbox.class) {
            INSTANCE.connected = bool;
        }
    }

    private static void validateAccessToken() {
        String str = INSTANCE.accessToken;
        if (TextUtils.isEmpty(str) || !(str.toLowerCase(MapboxConstants.MAPBOX_LOCALE).startsWith("pk.") || str.toLowerCase(MapboxConstants.MAPBOX_LOCALE).startsWith("sk."))) {
            throw new MapboxConfigurationException();
        }
    }

    private static void validateMapbox() {
        if (INSTANCE == null) {
            throw new MapboxConfigurationException();
        }
    }

    public final void setAccessToken(String str) {
        validateAccessToken();
        this.accessToken = str;
    }
}
