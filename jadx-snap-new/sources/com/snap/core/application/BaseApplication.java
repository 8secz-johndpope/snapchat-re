package com.snap.core.application;

import android.support.multidex.MultiDexApplication;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.aipt;
import defpackage.aipu;
import defpackage.aipv;
import defpackage.aipw;
import defpackage.akcr;
import defpackage.fxb;
import defpackage.gpp;

public abstract class BaseApplication<T extends gpp> extends MultiDexApplication implements aipt, aipu, aipv, aipw {
    public final void onCreate() {
        super.onCreate();
        AppContext.setApplicationContext(this);
        akcr.a("applicationCore");
        fxb fxb = null;
        fxb.a();
    }

    public final void onTerminate() {
        super.onTerminate();
        akcr.a("applicationCore");
        null.a.dispose();
        null.c.b();
    }
}
