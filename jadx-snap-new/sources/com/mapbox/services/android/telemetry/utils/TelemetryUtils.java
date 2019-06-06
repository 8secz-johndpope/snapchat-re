package com.mapbox.services.android.telemetry.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.brightcove.player.event.Event;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TelemetryUtils {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", TelemetryConstants.DEFAULT_LOCALE);

    public static Location buildLocation(double d, double d2) {
        Location location = new Location(TelemetryUtils.class.getSimpleName());
        location.setLongitude(d);
        location.setLatitude(d2);
        return location;
    }

    public static String buildUUID() {
        return UUID.randomUUID().toString();
    }

    public static String generateCreateDate(Location location) {
        return location != null ? generateCreateDateFormatted(new Date(location.getTime())) : generateCreateDateFormatted(new Date());
    }

    public static String generateCreateDateFormatted(Date date) {
        return dateFormat.format(date);
    }

    public static float getAccesibilityFontScaleSize(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static String getApplicationIdentifier(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return String.format(TelemetryConstants.DEFAULT_LOCALE, "%s/%s/%s", new Object[]{context.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getApplicationState(Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Event.ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "";
        }
        String packageName = context.getPackageName();
        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return "Foreground";
            }
        }
        return "Background";
    }

    public static String getCellularCarrier(Context context) {
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        return TextUtils.isEmpty(networkOperatorName) ? "" : networkOperatorName;
    }

    public static String getCellularNetworkType(Context context) {
        switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
            case 0:
                return "Unknown";
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            default:
                return "";
        }
    }

    public static Boolean getConnectedToWifi(Context context) {
        Boolean bool = Boolean.FALSE;
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService(MapboxEvent.KEY_WIFI);
            return (PermissionsManager.isPermissionGranted(context, "android.permission.ACCESS_WIFI_STATE") && wifiManager.isWifiEnabled() && wifiManager.getConnectionInfo().getNetworkId() != -1) ? Boolean.TRUE : bool;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static String getOrientation(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? "" : "Landscape" : "Portrait";
    }

    public static int getScreenBrightness(Context context) {
        try {
            double d = (double) System.getInt(context.getContentResolver(), "screen_brightness");
            Double.isNaN(d);
            return (int) Math.floor((d * 100.0d) / 255.0d);
        } catch (SettingNotFoundException unused) {
            return -1;
        }
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(TelemetryConstants.MAPBOX_SHARED_PREFERENCES_FILE, 0);
    }

    public static int getVolumeLevel(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        double streamVolume = (double) audioManager.getStreamVolume(3);
        Double.isNaN(streamVolume);
        streamVolume *= 100.0d;
        double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
        Double.isNaN(streamMaxVolume);
        return (int) Math.floor(streamVolume / streamMaxVolume);
    }

    public static String obtainAudioType(Context context) {
        return new AudioTypeChain().setup().obtainAudioType(context);
    }
}
