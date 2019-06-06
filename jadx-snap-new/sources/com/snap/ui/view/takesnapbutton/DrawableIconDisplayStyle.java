package com.snap.ui.view.takesnapbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class DrawableIconDisplayStyle implements TakeSnapButtonDisplayStyle {
    private final DisplayStyleConfig config;
    private Drawable iconDrawable;
    private boolean shouldDraw = false;

    public DrawableIconDisplayStyle(DisplayStyleConfig displayStyleConfig, Context context, int i) {
        this.config = displayStyleConfig;
        this.iconDrawable = getIconDrawable(context, i);
    }

    private Drawable getIconDrawable(Context context, int i) {
        if (this.iconDrawable == null) {
            this.iconDrawable = context.getResources().getDrawable(i);
        }
        return this.iconDrawable;
    }

    public void draw(Canvas canvas) {
        if (this.shouldDraw) {
            float intrinsicWidth = (float) (this.iconDrawable.getIntrinsicWidth() / 2);
            float intrinsicHeight = (float) (this.iconDrawable.getIntrinsicHeight() / 2);
            this.iconDrawable.setBounds((int) (this.config.getCenterX() - intrinsicWidth), (int) (this.config.getCenterY() - intrinsicHeight), (int) (this.config.getCenterX() + intrinsicWidth), (int) (this.config.getCenterY() + intrinsicHeight));
            this.iconDrawable.draw(canvas);
        }
    }

    public void onDetached() {
    }

    public void prepareAnimation() {
    }

    public void setShouldDraw(boolean z) {
        this.shouldDraw = z;
    }

    public void startAnimation() {
    }

    public void stopAnimation() {
    }
}
