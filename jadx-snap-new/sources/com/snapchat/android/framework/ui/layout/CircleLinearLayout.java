package com.snapchat.android.framework.ui.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import defpackage.abui;

public class CircleLinearLayout extends abui {
    private Path a = new Path();

    public CircleLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.clipPath(this.a);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = ((float) i) / 2.0f;
        this.a.addCircle(f, ((float) i2) / 2.0f, f, Direction.CW);
    }
}
