package com.snap.bitmoji.ui.avatar.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akcr;

public final class GenderPickerSquareTopRoundBottomLayout extends FrameLayout {
    public GenderPickerSquareTopRoundBottomLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f = (float) width;
        float f2 = f / 2.0f;
        int save = canvas.save();
        Path path = new Path();
        float f3 = (float) height;
        RectF rectF = new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f, f3 - f2);
        RectF rectF2 = new RectF(MapboxConstants.MINIMUM_ZOOM, (float) (height - width), f, f3);
        path.addRect(rectF, Direction.CW);
        path.addRoundRect(rectF2, f2, f2, Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }
}
