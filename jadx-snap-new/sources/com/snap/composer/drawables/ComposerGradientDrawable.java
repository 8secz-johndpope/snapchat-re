package com.snap.composer.drawables;

import android.graphics.drawable.GradientDrawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akco;
import defpackage.akcr;

public final class ComposerGradientDrawable extends GradientDrawable {
    public static final Companion Companion = new Companion();
    private int a;
    private int b;
    private int[] c;
    private final float[] d = new float[8];
    private boolean e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final void populateCornerRadiusArray(float f, float f2, float f3, float f4, float[] fArr) {
            akcr.b(fArr, "cornerRadiusArray");
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f2;
            fArr[3] = f2;
            fArr[4] = f3;
            fArr[5] = f3;
            fArr[6] = f4;
            fArr[7] = f4;
        }
    }

    public final float getBottomLeftCornerRadius() {
        return this.d[6];
    }

    public final float getBottomRightCornerRadius() {
        return this.d[4];
    }

    public final int[] getComposerColors() {
        return this.c;
    }

    public final float[] getComposerCornerRadiusArray() {
        return this.d;
    }

    public final int getComposerStrokeColor() {
        return this.b;
    }

    public final int getComposerStrokeWidth() {
        return this.a;
    }

    public final boolean getHasNonNullCornerRadius() {
        return this.e;
    }

    public final float getTopLeftCornerRadius() {
        return this.d[0];
    }

    public final float getTopRightCornerRadius() {
        return this.d[2];
    }

    /* JADX WARNING: Missing block: B:5:0x000b, code skipped:
            if (r0.length != 2) goto L_0x000d;
     */
    public final void setColor(int r3) {
        /*
        r2 = this;
        r0 = r2.c;
        r1 = 2;
        if (r0 == 0) goto L_0x000d;
    L_0x0005:
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        defpackage.akcr.a();
    L_0x000a:
        r0 = r0.length;
        if (r0 == r1) goto L_0x0011;
    L_0x000d:
        r0 = new int[r1];
        r2.c = r0;
    L_0x0011:
        r0 = r2.c;
        if (r0 != 0) goto L_0x0018;
    L_0x0015:
        defpackage.akcr.a();
    L_0x0018:
        r1 = 0;
        r0[r1] = r3;
        r0 = r2.c;
        if (r0 != 0) goto L_0x0022;
    L_0x001f:
        defpackage.akcr.a();
    L_0x0022:
        r1 = 1;
        r0[r1] = r3;
        r3 = r2.c;
        super.setColors(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.drawables.ComposerGradientDrawable.setColor(int):void");
    }

    public final void setColors(int[] iArr) {
        super.setColors(iArr);
        this.c = iArr;
    }

    public final void setComposerBorderRadius(float f, float f2, float f3, float f4) {
        Companion.populateCornerRadiusArray(f, f2, f3, f4, this.d);
        if (f == MapboxConstants.MINIMUM_ZOOM && f2 == MapboxConstants.MINIMUM_ZOOM && f3 == MapboxConstants.MINIMUM_ZOOM && f4 == MapboxConstants.MINIMUM_ZOOM) {
            setCornerRadii(null);
            this.e = false;
            return;
        }
        this.e = true;
        setCornerRadii(this.d);
    }

    public final void setStroke(int i, int i2) {
        super.setStroke(i, i2);
        this.a = i;
        this.b = i2;
    }
}
