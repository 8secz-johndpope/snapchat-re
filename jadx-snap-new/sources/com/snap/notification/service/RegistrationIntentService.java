package com.snap.notification.service;

import android.app.Service;
import android.support.v4.app.SnapJobIntentService;
import defpackage.aipn;
import defpackage.aipp;
import defpackage.sco;

public class RegistrationIntentService extends SnapJobIntentService {
    public aipn<sco> c;

    public final void a() {
        ((sco) this.c.get()).a(this);
    }

    public void onCreate() {
        aipp.a((Service) this);
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
