package com.snapchat.android.framework.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abkw.a;
import defpackage.abqo;
import defpackage.abtw;

public class LoadingSpinnerView extends View {
    public int a;
    public Float b;
    private final RectF c;
    private final RectF d;
    private final Path e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final abqo i;
    private final long j;
    private final boolean k;
    private boolean l;
    private float m;
    private int n;
    private float o;

    public LoadingSpinnerView(Context context) {
        this(context, null);
    }

    public LoadingSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.h = new Paint(1);
        this.i = new abqo();
        this.l = false;
        this.m = MapboxConstants.MINIMUM_ZOOM;
        this.a = 1;
        this.b = null;
        this.o = MapboxConstants.MINIMUM_ZOOM;
        this.j = SystemClock.elapsedRealtime();
        this.k = 1 ^ abtw.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
        this.f.setStyle(Style.STROKE);
        this.f.setStrokeCap(Cap.ROUND);
        this.g.setStyle(Style.FILL_AND_STROKE);
        this.g.setStrokeCap(Cap.ROUND);
        this.g.setStrokeJoin(Join.ROUND);
        this.n = obtainStyledAttributes.getColor(0, -3355444);
        c(this.n);
        this.h.setColor(Color.rgb(127, 127, 127));
        this.h.setStyle(Style.FILL);
        obtainStyledAttributes.recycle();
    }

    private void a() {
        if (this.l) {
            this.f.setShadowLayer(this.m, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, -16777216);
        } else {
            this.f.clearShadowLayer();
        }
    }

    private void c(int i) {
        this.f.setColor(i);
        this.g.setColor(i);
    }

    public final void a(int i) {
        if (this.n != i) {
            this.n = i;
            c(this.n);
        }
    }

    public final void a(boolean z) {
        this.l = z;
        setLayerType(this.l ? 1 : 0, null);
        a();
        postInvalidateOnAnimation();
    }

    public final void b(int i) {
        if (i != this.a) {
            this.a = i;
            postInvalidateOnAnimation();
        }
    }

    public void onDraw(Canvas canvas) {
        int i = this.a;
        if (i == 1) {
            if (this.k) {
                postInvalidateOnAnimation();
            }
            float elapsedRealtime = (((float) ((int) (SystemClock.elapsedRealtime() - this.j))) / 1000.0f) * 360.0f;
            long j = -180;
            Float f = this.b;
            if (f != null) {
                j = (long) (f.floatValue() * -360.0f);
            }
            long j2 = j;
            Canvas canvas2 = canvas;
            canvas2.drawArc(this.c, elapsedRealtime + 90.0f, 180.0f, false, this.f);
            canvas2.drawArc(this.d, 90.0f - elapsedRealtime, (float) j2, false, this.f);
            return;
        }
        if (i == 2) {
            canvas.drawCircle((float) (getHeight() / 2), (float) (getWidth() / 2), ((float) (getWidth() / 2)) - this.o, this.h);
            canvas.drawCircle((float) (getHeight() / 2), (float) (getWidth() / 2), ((float) (getWidth() / 2)) - this.o, this.f);
            canvas.drawPath(this.e, this.g);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) i) / 12.0f;
        float f2 = ((float) i2) / 12.0f;
        this.o = f;
        this.f.setStrokeWidth(f);
        this.g.setStrokeWidth(f);
        this.m = 0.7f * f;
        a();
        this.c.set(f * 3.0f, 3.0f * f2, f * 9.0f, 9.0f * f2);
        this.d.set(f, f2, f * 11.0f, 11.0f * f2);
        this.e.reset();
        float f3 = (float) ((i * 3) / 8);
        f2 = (float) (i2 / 2);
        this.e.moveTo(f3, f2);
        this.e.lineTo(f3, (float) (i2 / 3));
        this.e.lineTo((float) ((i * 11) / 16), f2);
        this.e.lineTo(f3, (float) ((i2 * 2) / 3));
        this.e.lineTo(f3, f2);
    }
}
