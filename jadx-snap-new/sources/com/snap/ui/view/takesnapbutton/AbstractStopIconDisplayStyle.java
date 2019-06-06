package com.snap.ui.view.takesnapbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.TakeSnapButton;
import defpackage.azs;
import defpackage.azt;

abstract class AbstractStopIconDisplayStyle extends AbstractAnimatedTakeSnapButtonDisplayStyle {
    private static final float STOP_ICON_SIZE = 22.0f;
    private final Paint stopButtonPaint;
    private azt stopIconAndButtonFillSpring = null;
    private final float stopIconFullSize;
    private final RectF stopIconRectF = new RectF();
    private float stopIconSize;

    AbstractStopIconDisplayStyle(DisplayStyleConfig displayStyleConfig, Context context, int i) {
        super(displayStyleConfig);
        this.stopIconFullSize = TakeSnapButton.convertDpToPixel(STOP_ICON_SIZE, context);
        this.stopButtonPaint = new Paint();
        this.stopButtonPaint.setAntiAlias(true);
        this.stopButtonPaint.setStyle(Style.FILL);
        this.stopButtonPaint.setColor(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawInternal(Canvas canvas) {
        RectF rectF = this.stopIconRectF;
        float f = this.stopIconSize;
        canvas.drawRoundRect(rectF, f / 11.0f, f / 11.0f, this.stopButtonPaint);
    }

    /* Access modifiers changed, original: protected */
    public azt getSpring() {
        if (this.stopIconAndButtonFillSpring == null) {
            this.stopIconAndButtonFillSpring = this.config.createSpring();
        }
        return this.stopIconAndButtonFillSpring;
    }

    public void onDetached() {
        azt azt = this.stopIconAndButtonFillSpring;
        if (azt != null) {
            azt.a();
            this.stopIconAndButtonFillSpring = null;
        }
    }

    public void prepareAnimation() {
        this.stopIconSize = MapboxConstants.MINIMUM_ZOOM;
    }

    public void startAnimation() {
        super.startAnimation();
        azt spring = getSpring();
        spring.a(new azs() {
            public void onSpringUpdate(azt azt) {
                AbstractStopIconDisplayStyle.this.stopIconSize = ((float) azt.d.a) * AbstractStopIconDisplayStyle.this.stopIconFullSize;
                AbstractStopIconDisplayStyle.this.stopIconRectF.set(AbstractStopIconDisplayStyle.this.config.getCenterX() - (AbstractStopIconDisplayStyle.this.stopIconSize / 2.0f), AbstractStopIconDisplayStyle.this.config.getCenterY() - (AbstractStopIconDisplayStyle.this.stopIconSize / 2.0f), AbstractStopIconDisplayStyle.this.config.getCenterX() + (AbstractStopIconDisplayStyle.this.stopIconSize / 2.0f), AbstractStopIconDisplayStyle.this.config.getCenterY() + (AbstractStopIconDisplayStyle.this.stopIconSize / 2.0f));
            }
        });
        spring.b(1.0d);
        spring.c(10.0d);
    }

    public void stopAnimation() {
        super.stopAnimation();
        azt azt = this.stopIconAndButtonFillSpring;
        if (azt != null) {
            azt.a(0.0d);
            this.stopIconAndButtonFillSpring.c();
            this.stopIconAndButtonFillSpring.d();
        }
    }
}
