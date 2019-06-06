package com.snap.ui.view.takesnapbutton;

import android.graphics.Canvas;

public abstract class AbstractAnimatedTakeSnapButtonDisplayStyle implements TakeSnapButtonDisplayStyle {
    protected final DisplayStyleConfig config;
    boolean shouldDraw = false;

    AbstractAnimatedTakeSnapButtonDisplayStyle(DisplayStyleConfig displayStyleConfig) {
        this.config = displayStyleConfig;
    }

    public final void draw(Canvas canvas) {
        if (this.shouldDraw) {
            drawInternal(canvas);
        }
    }

    public abstract void drawInternal(Canvas canvas);

    public void onDetached() {
    }

    public void prepareAnimation() {
    }

    public void startAnimation() {
        this.shouldDraw = true;
    }

    public void stopAnimation() {
        this.shouldDraw = false;
    }
}
