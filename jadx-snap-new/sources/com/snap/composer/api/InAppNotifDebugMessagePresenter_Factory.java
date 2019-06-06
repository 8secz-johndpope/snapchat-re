package com.snap.composer.api;

import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.sdu;
import defpackage.zgb;

public final class InAppNotifDebugMessagePresenter_Factory implements aiqc<InAppNotifDebugMessagePresenter> {
    private final ajwy<zgb> a;
    private final ajwy<sdu> b;

    public InAppNotifDebugMessagePresenter_Factory(ajwy<zgb> ajwy, ajwy<sdu> ajwy2) {
        this.a = ajwy;
        this.b = ajwy2;
    }

    public static InAppNotifDebugMessagePresenter_Factory create(ajwy<zgb> ajwy, ajwy<sdu> ajwy2) {
        return new InAppNotifDebugMessagePresenter_Factory(ajwy, ajwy2);
    }

    public static InAppNotifDebugMessagePresenter newInAppNotifDebugMessagePresenter(zgb zgb, sdu sdu) {
        return new InAppNotifDebugMessagePresenter(zgb, sdu);
    }

    public static InAppNotifDebugMessagePresenter provideInstance(ajwy<zgb> ajwy, ajwy<sdu> ajwy2) {
        return new InAppNotifDebugMessagePresenter((zgb) ajwy.get(), (sdu) ajwy2.get());
    }

    public final InAppNotifDebugMessagePresenter get() {
        return provideInstance(this.a, this.b);
    }
}
