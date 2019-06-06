package com.google.ar.core;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.cad;
import java.util.Locale;

public class Pose {
    private final cad a;
    private final float[] b;

    static {
        Pose pose = new Pose(new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM}, cad.a);
        pose = new Pose(new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM}, new float[]{((float) Math.sqrt(2.0d)) / 2.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, ((float) Math.sqrt(2.0d)) / 2.0f});
        pose = new Pose(new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM}, new float[]{((float) (-Math.sqrt(2.0d))) / 2.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, ((float) Math.sqrt(2.0d)) / 2.0f});
    }

    private Pose(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a = new cad(f4, f5, f6, f7);
        this.b = new float[]{f, f2, f3};
    }

    private Pose(float[] fArr, cad cad) {
        this.b = fArr;
        this.a = cad;
    }

    private Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", new Object[]{Float.valueOf(this.b[0]), Float.valueOf(this.b[1]), Float.valueOf(this.b[2]), Float.valueOf(this.a.b), Float.valueOf(this.a.c), Float.valueOf(this.a.d), Float.valueOf(this.a.e)});
    }
}
