package com.google.android.gms.vision.face;

import android.graphics.PointF;

public final class Landmark {
    private final int zzenu;
    private final PointF zzlgr;

    public Landmark(PointF pointF, int i) {
        this.zzlgr = pointF;
        this.zzenu = i;
    }
}
