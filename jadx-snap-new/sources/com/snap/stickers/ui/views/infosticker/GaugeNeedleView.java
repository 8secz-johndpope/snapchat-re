package com.snap.stickers.ui.views.infosticker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtp;

public class GaugeNeedleView extends AppCompatImageView {
    private double a;
    private float b = MapboxConstants.MINIMUM_ZOOM;

    public GaugeNeedleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final float a() {
        return this.b;
    }

    public final void a(double d) {
        this.a = d;
    }

    public final void a(float f) {
        this.b = f;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        double d = (double) abtp.d(getContext());
        double d2 = this.a;
        Double.isNaN(d);
        i2 = (int) (d * d2);
        setMeasuredDimension((drawable.getIntrinsicWidth() * i2) / drawable.getIntrinsicHeight(), i2);
    }
}
