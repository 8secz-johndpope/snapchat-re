package com.snap.ui.view.takesnapbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.azs;
import defpackage.azt;

public class HandsFreeStopIconDisplayStyle extends AbstractStopIconDisplayStyle {
    private static final int BUTTON_FILL_ALPHA = 102;
    private final Paint buttonFillPaint = new Paint();
    private float buttonFillRadius;

    public HandsFreeStopIconDisplayStyle(DisplayStyleConfig displayStyleConfig, Context context) {
        super(displayStyleConfig, context, -65536);
        this.buttonFillPaint.setAntiAlias(true);
        this.buttonFillPaint.setStyle(Style.FILL);
        this.buttonFillPaint.setColor(-1);
        this.buttonFillPaint.setAlpha(102);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawInternal(Canvas canvas) {
        canvas.drawCircle(this.config.getCenterX(), this.config.getCenterX(), this.buttonFillRadius, this.buttonFillPaint);
        super.drawInternal(canvas);
    }

    public /* bridge */ /* synthetic */ void onDetached() {
        super.onDetached();
    }

    public void prepareAnimation() {
        this.buttonFillRadius = MapboxConstants.MINIMUM_ZOOM;
    }

    public void startAnimation() {
        super.startAnimation();
        getSpring().a(new azs() {
            public void onSpringUpdate(azt azt) {
                HandsFreeStopIconDisplayStyle.this.buttonFillRadius = ((float) azt.d.a) * ((float) HandsFreeStopIconDisplayStyle.this.config.getOuterRadius());
            }
        });
    }

    public /* bridge */ /* synthetic */ void stopAnimation() {
        super.stopAnimation();
    }
}
