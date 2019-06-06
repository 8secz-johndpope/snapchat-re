package com.snap.opera.view;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.absl;
import defpackage.alsn;

public class FitWidthImageView extends alsn {
    public int a;
    public int b;
    public boolean c = true;

    public FitWidthImageView(Context context) {
        super(context);
        a(context);
    }

    public FitWidthImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        absl absl = new absl(context);
        this.a = absl.a();
        this.b = absl.c();
        b(false);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public boolean canScrollHorizontally(int i) {
        return this.d.e() > 1.000001f;
    }

    public boolean canScrollVertically(int i) {
        RectF c = this.d.c();
        return this.d.e() > 1.000001f && (c == null || c.top < -1.0E-6f);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.c) {
            Drawable drawable = getDrawable();
            if (this.d.m) {
                setMeasuredDimension(this.a, this.b);
            } else if (drawable != null) {
                i2 = getMeasuredWidth();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > 0) {
                    setMeasuredDimension(i2, (int) ((((float) i2) * ((float) drawable.getIntrinsicHeight())) / ((float) intrinsicWidth)));
                }
            }
        }
    }
}
