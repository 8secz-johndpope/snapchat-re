package com.snap.ui.view.takesnapbutton;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;

public class SolidRedFillingDisplayStyle extends AbstractAnimatedTakeSnapButtonDisplayStyle {
    private final Paint redCirclePaint = new Paint();
    private boolean shouldDrawRedCircle = false;

    public SolidRedFillingDisplayStyle(DisplayStyleConfig displayStyleConfig) {
        super(displayStyleConfig);
        this.redCirclePaint.setAntiAlias(true);
        this.redCirclePaint.setStyle(Style.FILL);
        this.redCirclePaint.setColor(-65536);
    }

    /* Access modifiers changed, original: 0000 */
    public void drawInternal(Canvas canvas) {
        canvas.drawCircle(this.config.getCenterX(), this.config.getCenterY(), ((1.0f - this.config.getCircleRadius()) * 0.75f) * ((float) this.config.getOuterRadius()), this.redCirclePaint);
    }

    public void prepareAnimation() {
        if (this.shouldDrawRedCircle) {
            startAnimation();
        } else {
            stopAnimation();
        }
    }

    public void setShouldDrawRedCircle(boolean z) {
        this.shouldDrawRedCircle = z;
    }
}
