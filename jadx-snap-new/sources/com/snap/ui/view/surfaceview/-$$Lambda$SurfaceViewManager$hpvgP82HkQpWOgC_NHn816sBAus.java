package com.snap.ui.view.surfaceview;

import com.snap.ui.view.surfaceview.SurfaceViewManager.SurfaceViewRequest;
import defpackage.ajfb;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SurfaceViewManager$hpvgP82HkQpWOgC_NHn816sBAus implements ajfb {
    private final /* synthetic */ SurfaceViewManager f$0;

    public /* synthetic */ -$$Lambda$SurfaceViewManager$hpvgP82HkQpWOgC_NHn816sBAus(SurfaceViewManager surfaceViewManager) {
        this.f$0 = surfaceViewManager;
    }

    public final void accept(Object obj) {
        this.f$0.updatePendingClientAndRevokeSurfaceAsync((SurfaceViewRequest) obj);
    }
}
