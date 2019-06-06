package com.snap.mushroom.base;

import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.dnl;
import defpackage.zgb;

public final class MainActivityPreInjector_Factory implements aiqc<MainActivityPreInjector> {
    private final ajwy<dnl> cameraPreparerProvider;
    private final ajwy<zgb> schedulersProvider;

    public MainActivityPreInjector_Factory(ajwy<zgb> ajwy, ajwy<dnl> ajwy2) {
        this.schedulersProvider = ajwy;
        this.cameraPreparerProvider = ajwy2;
    }

    public static MainActivityPreInjector_Factory create(ajwy<zgb> ajwy, ajwy<dnl> ajwy2) {
        return new MainActivityPreInjector_Factory(ajwy, ajwy2);
    }

    public static MainActivityPreInjector newMainActivityPreInjector(zgb zgb, dnl dnl) {
        return new MainActivityPreInjector(zgb, dnl);
    }

    public static MainActivityPreInjector provideInstance(ajwy<zgb> ajwy, ajwy<dnl> ajwy2) {
        return new MainActivityPreInjector((zgb) ajwy.get(), (dnl) ajwy2.get());
    }

    public final MainActivityPreInjector get() {
        return provideInstance(this.schedulersProvider, this.cameraPreparerProvider);
    }
}
