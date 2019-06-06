package com.snap.mushroom.base;

import com.snap.mushroom.MainActivity;
import defpackage.ajej;
import defpackage.ajfq;
import defpackage.dnh;
import defpackage.dnl;
import defpackage.gvl.a;
import defpackage.zgb;

public class MainActivityPreInjector implements ActivityPreInjector<MainActivity> {
    private static final String TAG = "MainActivityPreInjector";
    private final dnl cameraPreparer;
    private final zgb schedulersProvider;

    public MainActivityPreInjector(zgb zgb, dnl dnl) {
        this.schedulersProvider = zgb;
        this.cameraPreparer = dnl;
    }

    public ajej inceptionTask(MainActivity mainActivity) {
        this.cameraPreparer.a(dnh.f.callsite(TAG));
        return a.c(mainActivity.getIntent()) ? ajfq.INSTANCE : zgb.a(dnh.f.callsite("mainActivityPreInjectionInflation")).h().a(new -$$Lambda$MainActivityPreInjector$RfI_MgULIQRMQPF_xLYbZ4qAJj8(mainActivity));
    }
}
