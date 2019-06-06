package com.mapbox.mapboxsdk;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.maps.SystemInfo;
import com.mapbox.mapboxsdk.storage.FileSource;

public class MapboxNatives {
    private static boolean sLoaded;
    private static boolean sWrappedLayerLoaded;

    public static SystemInfo getSystemInfo(Context context) {
        float f = context.getResources().getDisplayMetrics().density;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        MemoryInfo memoryInfo = new MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Event.ACTIVITY);
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        long j = memoryInfo.availMem;
        if (VERSION.SDK_INT >= 16) {
            j = memoryInfo.totalMem;
        }
        if (availableProcessors < 0) {
            throw new IllegalArgumentException("availableProcessors cannot be negative.");
        } else if (j >= 0) {
            return new SystemInfo(f, availableProcessors, j, context.getCacheDir().getAbsolutePath(), FileSource.getCachePath(context));
        } else {
            throw new IllegalArgumentException("totalMemory cannot be negative.");
        }
    }

    public static void load() {
        if (!sLoaded) {
            sLoaded = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                System.loadLibrary("mapbox-gl");
                return;
            }
            throw new IllegalArgumentException("This was not called on a background thread, it will crash Mapbox later.");
        }
    }

    public static synchronized void loadWrapperLayer() {
        synchronized (MapboxNatives.class) {
            if (sWrappedLayerLoaded) {
                return;
            }
            sWrappedLayerLoaded = true;
            System.loadLibrary("wrapped-custom-layer");
        }
    }
}
