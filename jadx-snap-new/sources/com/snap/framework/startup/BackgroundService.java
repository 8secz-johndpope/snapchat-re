package com.snap.framework.startup;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BackgroundService extends Service {
    public static boolean a;

    public interface a {
        void onException(Exception exception);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        a = true;
        if (intent != null) {
            intent.getBooleanExtra("sba", false);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
