package com.snapchat.android.framework.analytics.startup;

import android.view.Choreographer;
import defpackage.abln;
import defpackage.ablv;
import defpackage.ablx;
import defpackage.abmb;
import defpackage.j.a;
import defpackage.k;
import defpackage.s;

public class ActivityFirstDrawObserver implements k {
    final abln a;
    private ablv b;
    private final Runnable c = new Runnable() {
        public final void run() {
            ActivityFirstDrawObserver.this.a.a(abmb.FIRST_UI_RENDERED);
        }
    };

    public ActivityFirstDrawObserver(ablx ablx) {
        this.a = ablx;
    }

    @s(a = a.ON_START)
    public void onStart() {
        this.b = ablv.a(this.c);
    }

    @s(a = a.ON_STOP)
    public void onStop() {
        Choreographer.getInstance().removeFrameCallback(this.b);
        this.b = null;
    }
}
