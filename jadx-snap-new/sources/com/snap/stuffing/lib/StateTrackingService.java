package com.snap.stuffing.lib;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public final class StateTrackingService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
