package com.snapchat.android.framework.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abkw.a;

public class TriangleView extends View {
    protected final Path a;
    protected final Path b;
    private final Paint c;
    private final Paint d;

    public TriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public TriangleView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.c = new Paint();
        this.d = new Paint();
        this.a = new Path();
        this.b = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j);
        this.c.setAntiAlias(true);
        this.c.setStyle(Style.FILL);
        this.d.setAntiAlias(true);
        this.d.setStyle(Style.STROKE);
        b(obtainStyledAttributes.getColor(2, -1));
        a(obtainStyledAttributes.getColor(0, 0));
        a(obtainStyledAttributes.getDimension(1, MapboxConstants.MINIMUM_ZOOM));
        obtainStyledAttributes.recycle();
    }

    public final void a(float f) {
        this.d.setStrokeWidth(f);
    }

    public final void a(int i) {
        this.d.setColor(i);
    }

    public final void b(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        canvas.drawPath(this.a, this.c);
        if (this.d.getStrokeWidth() > MapboxConstants.MINIMUM_ZOOM) {
            canvas.drawPath(this.b, this.d);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.b.reset();
        float f = (float) i2;
        this.b.moveTo(MapboxConstants.MINIMUM_ZOOM, f);
        float f2 = (float) i;
        this.b.lineTo(f2 / 2.0f, MapboxConstants.MINIMUM_ZOOM);
        this.b.lineTo(f2, f);
        this.a.set(this.b);
        this.a.close();
    }
}
