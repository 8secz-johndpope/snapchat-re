package com.snap.notification.service;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.aipn;
import defpackage.aipp;
import defpackage.akcr;
import defpackage.sdb;

public final class ClearNotificationIntentService extends IntentService {
    public aipn<sdb> a;

    public ClearNotificationIntentService() {
        super("ClearNotificationIntentService");
    }

    public final IBinder onBind(Intent intent) {
        akcr.b(intent, "intent");
        return null;
    }

    public final void onCreate() {
        aipp.a((Service) this);
        super.onCreate();
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("n_key");
            if (stringExtra != null) {
                aipn aipn = this.a;
                if (aipn == null) {
                    akcr.a("systemNotificationManager");
                }
                ((sdb) aipn.get()).a(stringExtra, true);
            }
        }
    }
}
