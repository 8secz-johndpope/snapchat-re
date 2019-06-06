package com.snap.ui.view.surfaceview;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SurfaceViewManager$WbE0UnAEnXzzcqOG2G4c-aBDDpM implements Runnable {
    private final /* synthetic */ SurfaceViewManager f$0;

    public /* synthetic */ -$$Lambda$SurfaceViewManager$WbE0UnAEnXzzcqOG2G4c-aBDDpM(SurfaceViewManager surfaceViewManager) {
        this.f$0 = surfaceViewManager;
    }

    public final void run() {
        this.f$0.revokeSurfaceSync();
    }
}
