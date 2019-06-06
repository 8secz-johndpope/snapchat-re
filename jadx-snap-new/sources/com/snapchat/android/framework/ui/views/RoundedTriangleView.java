package com.snapchat.android.framework.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abkw.a;

public class RoundedTriangleView extends TriangleView {
    private final float c;
    private final float d;
    private final int e;

    public RoundedTriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private RoundedTriangleView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.g);
        this.c = obtainStyledAttributes.getDimension(0, MapboxConstants.MINIMUM_ZOOM);
        this.d = obtainStyledAttributes.getDimension(2, MapboxConstants.MINIMUM_ZOOM);
        this.e = obtainStyledAttributes.getInteger(1, 45);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        this.b.reset();
        float f = (float) i6;
        this.b.moveTo(MapboxConstants.MINIMUM_ZOOM, f);
        Path path = this.b;
        float f2 = this.c;
        path.arcTo(new RectF(-f2, f - (f2 * 2.0f), f2, f), 90.0f, (float) (-this.e));
        path = this.b;
        float f3 = (float) i5;
        f2 = f3 / 2.0f;
        double d = (double) f2;
        double d2 = (double) this.d;
        double d3 = (double) (this.e + 90);
        Double.isNaN(d3);
        d3 = Math.cos(d3 * 0.017453292519943295d);
        Double.isNaN(d2);
        d2 *= d3;
        Double.isNaN(d);
        float f4 = (float) (d + d2);
        float f5 = this.d;
        double d4 = (double) f5;
        double d5 = (double) f5;
        float f6 = f3;
        double d6 = (double) (this.e + 90);
        Double.isNaN(d6);
        d6 = Math.sin(d6 * 0.017453292519943295d);
        Double.isNaN(d5);
        d5 *= d6;
        Double.isNaN(d4);
        path.lineTo(f4, (float) (d4 - d5));
        path = this.b;
        f3 = this.d;
        RectF rectF = new RectF(f2 - f3, MapboxConstants.MINIMUM_ZOOM, f2 + f3, f3 * 2.0f);
        int i7 = this.e;
        path.arcTo(rectF, (float) (270 - i7), (float) (i7 << 1));
        path = this.b;
        d6 = (double) i5;
        double d7 = (double) this.c;
        d = (double) (this.e + 90);
        Double.isNaN(d);
        d = Math.cos(d * 0.017453292519943295d);
        Double.isNaN(d7);
        d7 *= d;
        Double.isNaN(d6);
        float f7 = (float) (d6 + d7);
        d6 = (double) i6;
        float f8 = this.c;
        d7 = (double) f8;
        d = (double) f8;
        d2 = (double) (this.e + 90);
        Double.isNaN(d2);
        d2 = Math.sin(d2 * 0.017453292519943295d);
        Double.isNaN(d);
        d *= d2;
        Double.isNaN(d7);
        d7 -= d;
        Double.isNaN(d6);
        path.lineTo(f7, (float) (d6 - d7));
        Path path2 = this.b;
        float f9 = this.c;
        RectF rectF2 = new RectF(f6 - f9, f - (2.0f * f9), f9 + f6, f);
        int i8 = this.e;
        path2.arcTo(rectF2, (float) (i8 + 90), (float) (-i8));
        this.a.set(this.b);
        f += 3.0f;
        this.a.lineTo(f6, f);
        this.a.lineTo(MapboxConstants.MINIMUM_ZOOM, f);
        this.a.close();
    }
}
