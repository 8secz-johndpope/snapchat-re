package com.snap.identity.service;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.aaae;
import defpackage.aajt;
import defpackage.aipq;
import defpackage.aipu;
import defpackage.aiqf;
import defpackage.dib;
import defpackage.ilv;
import defpackage.iok;

public class ForcedLogoutBroadcastReceiver extends BroadcastReceiver {
    public dib a;
    public ilv b;

    public void onReceive(Context context, Intent intent) {
        aiqf.a(this, "broadcastReceiver");
        aiqf.a(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof aipu) {
            aipq broadcastReceiverInjector = ((aipu) application).broadcastReceiverInjector();
            aiqf.a(broadcastReceiverInjector, "%s.broadcastReceiverInjector() returned null", application.getClass());
            broadcastReceiverInjector.a(this);
            String str = "reason";
            String stringExtra = intent.getStringExtra(str);
            boolean booleanExtra = intent.getBooleanExtra("forced", false);
            aajt aaae = new aaae();
            aaae.b = stringExtra;
            aaae.a = Boolean.valueOf(booleanExtra);
            this.a.a(aaae);
            this.b.c(iok.LOGOUT.a(str, stringExtra), 1);
            try {
                context.startService(new Intent(context, ForcedLogoutService.class));
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), aipu.class.getCanonicalName()}));
    }
}
