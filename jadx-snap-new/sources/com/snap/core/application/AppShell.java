package com.snap.core.application;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import com.facebook.buck.android.support.exopackage.ExopackageApplication;
import defpackage.aipq;
import defpackage.aipt;
import defpackage.aipu;
import defpackage.aipv;
import defpackage.aipw;
import defpackage.dl;

public class AppShell extends ExopackageApplication implements aipt, aipu, aipv, aipw {
    public final void a() {
        super.a();
        dl.a((Context) this);
    }

    public aipq<Activity> activityInjector() {
        return ((aipt) this.a).activityInjector();
    }

    public aipq<BroadcastReceiver> broadcastReceiverInjector() {
        return ((aipu) this.a).broadcastReceiverInjector();
    }

    public aipq<ContentProvider> contentProviderInjector() {
        return ((aipv) this.a).contentProviderInjector();
    }

    public aipq<Service> serviceInjector() {
        return ((aipw) this.a).serviceInjector();
    }
}
