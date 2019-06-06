package com.snapchat.android.framework.ui.animations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class ArcView extends View {
    public final Paint a = new Paint(1);
    public int b = -1;
    public float c = MapboxConstants.MINIMUM_ZOOM;
    public float d = MapboxConstants.MINIMUM_ZOOM;
    public boolean e = false;
    public int f = 30;
    private final RectF g = new RectF();
    private final Paint h = new Paint(1);
    private int i = -65536;
    private Integer j;

    public ArcView(Context context) {
        super(context);
    }

    public ArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.d = MapboxConstants.MINIMUM_ZOOM;
    }

    public final void a(int i) {
        this.i = i;
        this.h.setColor(this.i);
    }

    public final void b(int i) {
        Preconditions.checkArgument(i > 0);
        this.j = Integer.valueOf(i);
        this.h.setStrokeWidth((float) i);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawArc(this.g, this.c, this.d, false, this.a);
        }
        canvas.drawArc(this.g, this.c, this.d, false, this.h);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Integer num = this.j;
        i3 = num != null ? num.intValue() : i / this.f;
        this.h.setStyle(Style.STROKE);
        float f = (float) i3;
        this.h.setStrokeWidth(f);
        this.h.setColor(this.i);
        i4 = (int) (f * 1.75f);
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeWidth((float) i4);
        this.a.setColor(this.b);
        if (!this.e) {
            i4 = 0;
        }
        i3 = Math.max(i3, i4) / 2;
        f = (float) i3;
        this.g.set(f, f, (float) (i - i3), (float) (i2 - i3));
    }
}
