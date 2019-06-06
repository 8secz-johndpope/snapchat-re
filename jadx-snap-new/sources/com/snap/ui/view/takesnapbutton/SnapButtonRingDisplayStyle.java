package com.snap.ui.view.takesnapbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;

public class SnapButtonRingDisplayStyle implements TakeSnapButtonDisplayStyle {
    private static final int BORDER_STROKE_ALPHA = 76;
    private final Paint borderPaint;
    private DisplayStyleConfig config;
    private PorterDuffColorFilter ringColorFilter = null;
    private final Paint ringPaint = new Paint();

    public SnapButtonRingDisplayStyle(DisplayStyleConfig displayStyleConfig) {
        this.ringPaint.setAntiAlias(true);
        this.ringPaint.setStyle(Style.STROKE);
        this.ringPaint.setStrokeWidth(displayStyleConfig.getWhiteStrokeWidth());
        this.ringPaint.setColor(-1);
        this.borderPaint = new Paint();
        this.borderPaint.setColor(-16777216);
        this.borderPaint.setAlpha(76);
        this.borderPaint.setAntiAlias(true);
        this.borderPaint.setStyle(Style.STROKE);
        this.borderPaint.setStrokeWidth(displayStyleConfig.getBorderStrokeWidth());
        this.config = displayStyleConfig;
    }

    public void draw(Canvas canvas) {
        this.ringPaint.setColorFilter(this.ringColorFilter);
        this.borderPaint.setColorFilter(this.ringColorFilter);
        this.borderPaint.setStrokeWidth(this.config.getBorderStrokeWidth() / this.config.getScaleX());
        this.ringPaint.setStrokeWidth(this.config.getWhiteStrokeWidth() / this.config.getScaleX());
        canvas.drawCircle(this.config.getCenterX(), this.config.getCenterY(), (float) this.config.getOuterRadius(), this.borderPaint);
        canvas.drawCircle(this.config.getCenterX(), this.config.getCenterY(), (float) this.config.getOuterRadius(), this.ringPaint);
    }

    public int getBorderStrokeAlpha() {
        return 76;
    }

    public PorterDuffColorFilter getRingColorFilter() {
        return this.ringColorFilter;
    }

    public void onDetached() {
    }

    public void prepareAnimation() {
    }

    public void setBorderAlpha(int i) {
        this.borderPaint.setAlpha(i);
    }

    public void setRingColorFilter(ColorStateList colorStateList) {
        this.ringColorFilter = colorStateList == null ? null : new PorterDuffColorFilter(colorStateList.getDefaultColor(), Mode.SRC_ATOP);
    }

    public void startAnimation() {
    }

    public void stopAnimation() {
    }
}
