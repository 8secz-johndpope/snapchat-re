package com.mapbox.services.android.telemetry.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import com.mapbox.services.android.telemetry.TelemetryLocationReceiver;
import defpackage.hc;

public class TelemetryService extends Service {
    private static final String LOG_TAG = "TelemetryService";
    private TelemetryLocationReceiver receiver = null;

    private void shutdownTelemetryService() {
        try {
            Log.v(LOG_TAG, "Unregistering location receiver.");
            hc.a(getApplicationContext()).a(this.receiver);
        } catch (Exception e) {
            Log.e(LOG_TAG, String.format("Unregistering receiver failed: %s.", new Object[]{e.getMessage()}));
        }
    }

    public IBinder onBind(Intent intent) {
        Log.w(LOG_TAG, "The service doesn't support a binder interface.");
        return null;
    }

    public void onCreate() {
        Log.v(LOG_TAG, "Create event.");
        this.receiver = new TelemetryLocationReceiver();
        hc.a(getApplicationContext()).a(this.receiver, new IntentFilter(TelemetryLocationReceiver.INTENT_STRING));
    }

    public void onDestroy() {
        Log.v(LOG_TAG, "Destroy event.");
        shutdownTelemetryService();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.v(LOG_TAG, "Start command event.");
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        Log.v(LOG_TAG, "Task removed event.");
        shutdownTelemetryService();
    }
}
