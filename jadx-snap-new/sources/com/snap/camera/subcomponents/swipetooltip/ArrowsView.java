package com.snap.camera.subcomponents.swipetooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.ihh;
import defpackage.ihl;
import defpackage.ihm;

public final class ArrowsView extends View {
    private final Drawable a;
    private final int b;
    private final int c;
    private int d;
    private int e;
    private final int f;
    private long g;
    private final ihm h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ArrowsView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        this(context, attributeSet, new ihl());
    }

    private ArrowsView(Context context, AttributeSet attributeSet, ihh ihh) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        akcr.b(ihh, "clock");
        super(context, attributeSet);
        this.a = getResources().getDrawable(R.drawable.swipe_tooltip_arrow);
        this.b = a(2);
        this.c = a(15);
        Object obj = this.a;
        String str = "drawable";
        akcr.a(obj, str);
        this.d = obj.getIntrinsicWidth();
        obj = this.a;
        akcr.a(obj, str);
        this.e = obj.getIntrinsicHeight();
        this.f = 1400;
        this.h = new ihm(ihh);
    }

    private final int a(int i) {
        float f = (float) i;
        Object resources = getResources();
        akcr.a(resources, "resources");
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    private final void a(int i, int i2, int i3, Canvas canvas) {
        i2 += i * this.b;
        i = this.d + i2;
        if (i2 >= 0 && i <= getWidth()) {
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setBounds(new Rect(i2, 0, i, this.e));
                drawable.setAlpha(i3);
                drawable.draw(canvas);
            }
        }
    }

    private final int b(int i) {
        i = (int) ((((float) (1400 - (((long) i) * this.g))) / 1400.0f) * 255.0f);
        return i > 255 ? 255 : i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.onDraw(canvas);
        int c = (int) ((this.h.c() % 1400) / this.g);
        int b = b(c);
        int b2 = b(c - (this.c / this.b));
        a(c, 0, b, canvas);
        a(c, -this.c, b2, canvas);
        postInvalidateDelayed(this.g);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        this.h.a();
        setMeasuredDimension(a(44), a(30));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.g = (long) (((float) (this.b * 1400)) / ((float) getWidth()));
    }
}
