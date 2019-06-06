package com.snap.messaging.foregroundService;

import android.app.Service;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.RemoteViews;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.go.c;
import defpackage.qwt;
import defpackage.sdg;
import defpackage.sfk;

public final class ScForegroundService extends Service {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private final c a() {
        String string = getString(R.string.foreground_service_sending_one_snap);
        if (VERSION.SDK_INT <= 23) {
            Object a = qwt.a(this, null).a((CharSequence) string).a(0, 0, true);
            akcr.a(a, "baseForegroundServiceNot… .setProgress(0, 0, true)");
            return a;
        }
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.foreground_service_notification_view);
        remoteViews.setTextViewText(R.id.foreground_service_sending_text, string);
        return qwt.a(this, remoteViews);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            c a = a();
            sfk sfk = new sfk();
            sfk.a(sdg.SILENT);
            startForeground(1431325696, defpackage.sfj.a.a(a, sfk));
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1431325696, qwt.a(a()));
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.getBoolean("stop_command", false)) {
                stopSelfResult(i2);
            }
        }
        return 2;
    }
}
