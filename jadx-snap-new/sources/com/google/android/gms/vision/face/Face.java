package com.google.android.gms.vision.face;

import android.graphics.PointF;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;
import java.util.List;

public class Face {
    private int mId;
    private PointF zzlgr;
    private float zzlgs;
    private float zzlgt;
    private float zzlgu;
    private float zzlgv;
    private List<Landmark> zzlgw;
    private float zzlgx;
    private float zzlgy;
    private float zzlgz;

    public Face(int i, PointF pointF, float f, float f2, float f3, float f4, Landmark[] landmarkArr, float f5, float f6, float f7) {
        this.mId = i;
        this.zzlgr = pointF;
        this.zzlgs = f;
        this.zzlgt = f2;
        this.zzlgu = f3;
        this.zzlgv = f4;
        this.zzlgw = Arrays.asList(landmarkArr);
        if (f5 < MapboxConstants.MINIMUM_ZOOM || f5 > 1.0f) {
            this.zzlgx = -1.0f;
        } else {
            this.zzlgx = f5;
        }
        if (f6 < MapboxConstants.MINIMUM_ZOOM || f6 > 1.0f) {
            this.zzlgy = -1.0f;
        } else {
            this.zzlgy = f6;
        }
        if (f7 < MapboxConstants.MINIMUM_ZOOM || f7 > 1.0f) {
            this.zzlgz = -1.0f;
        } else {
            this.zzlgz = f7;
        }
    }

    public float getHeight() {
        return this.zzlgt;
    }

    public int getId() {
        return this.mId;
    }

    public PointF getPosition() {
        return new PointF(this.zzlgr.x - (this.zzlgs / 2.0f), this.zzlgr.y - (this.zzlgt / 2.0f));
    }

    public float getWidth() {
        return this.zzlgs;
    }
}
