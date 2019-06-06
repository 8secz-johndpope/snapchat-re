package com.mapbox.services.android.telemetry;

public interface TelemetryListener {
    void onHttpFailure(String str);

    void onHttpResponse(boolean z, int i);

    void onSendEvents(int i);
}
