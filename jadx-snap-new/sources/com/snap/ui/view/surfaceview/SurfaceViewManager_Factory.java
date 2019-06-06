package com.snap.ui.view.surfaceview;

import android.app.Activity;
import defpackage.ablx;
import defpackage.absi;
import defpackage.abss;
import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.iib;
import defpackage.zgb;
import defpackage.zkq;

public final class SurfaceViewManager_Factory implements aiqc<SurfaceViewManager> {
    private final ajwy<Activity> activityProvider;
    private final ajwy<zkq> insetsDetectorProvider;
    private final ajwy<ablx> launchTrackerProvider;
    private final ajwy<abss> releaseManagerProvider;
    private final ajwy<zgb> schedulersProvider;
    private final ajwy<iib> screenParameterProvider;
    private final ajwy<absi> softNavBarDetectorProvider;

    public SurfaceViewManager_Factory(ajwy<abss> ajwy, ajwy<Activity> ajwy2, ajwy<ablx> ajwy3, ajwy<zkq> ajwy4, ajwy<iib> ajwy5, ajwy<zgb> ajwy6, ajwy<absi> ajwy7) {
        this.releaseManagerProvider = ajwy;
        this.activityProvider = ajwy2;
        this.launchTrackerProvider = ajwy3;
        this.insetsDetectorProvider = ajwy4;
        this.screenParameterProvider = ajwy5;
        this.schedulersProvider = ajwy6;
        this.softNavBarDetectorProvider = ajwy7;
    }

    public static SurfaceViewManager_Factory create(ajwy<abss> ajwy, ajwy<Activity> ajwy2, ajwy<ablx> ajwy3, ajwy<zkq> ajwy4, ajwy<iib> ajwy5, ajwy<zgb> ajwy6, ajwy<absi> ajwy7) {
        return new SurfaceViewManager_Factory(ajwy, ajwy2, ajwy3, ajwy4, ajwy5, ajwy6, ajwy7);
    }

    public static SurfaceViewManager newSurfaceViewManager(abss abss, Activity activity, ablx ablx, zkq zkq, iib iib, zgb zgb, absi absi) {
        return new SurfaceViewManager(abss, activity, ablx, zkq, iib, zgb, absi);
    }

    public static SurfaceViewManager provideInstance(ajwy<abss> ajwy, ajwy<Activity> ajwy2, ajwy<ablx> ajwy3, ajwy<zkq> ajwy4, ajwy<iib> ajwy5, ajwy<zgb> ajwy6, ajwy<absi> ajwy7) {
        return new SurfaceViewManager((abss) ajwy.get(), (Activity) ajwy2.get(), (ablx) ajwy3.get(), (zkq) ajwy4.get(), (iib) ajwy5.get(), (zgb) ajwy6.get(), (absi) ajwy7.get());
    }

    public final SurfaceViewManager get() {
        return provideInstance(this.releaseManagerProvider, this.activityProvider, this.launchTrackerProvider, this.insetsDetectorProvider, this.screenParameterProvider, this.schedulersProvider, this.softNavBarDetectorProvider);
    }
}
