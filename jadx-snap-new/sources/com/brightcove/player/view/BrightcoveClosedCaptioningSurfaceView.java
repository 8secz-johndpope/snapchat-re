package com.brightcove.player.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.media.SubtitleController.Anchor;
import android.media.SubtitleTrack.RenderingWidget;
import android.media.SubtitleTrack.RenderingWidget.OnChangedListener;
import android.os.Looper;

public class BrightcoveClosedCaptioningSurfaceView extends BrightcoveSurfaceView implements Anchor {
    private RenderingWidget c;
    private OnChangedListener d;

    static {
        BrightcoveClosedCaptioningSurfaceView.class.getSimpleName();
    }

    public BrightcoveClosedCaptioningSurfaceView(Context context) {
        super(context);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c != null) {
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            this.c.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public Looper getSubtitleLooper() {
        return Looper.getMainLooper();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RenderingWidget renderingWidget = this.c;
        if (renderingWidget != null) {
            renderingWidget.onAttachedToWindow();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RenderingWidget renderingWidget = this.c;
        if (renderingWidget != null) {
            renderingWidget.onDetachedFromWindow();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c != null) {
            this.c.setSize((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        }
    }

    @TargetApi(19)
    public void setSubtitleWidget(RenderingWidget renderingWidget) {
        if (this.c != renderingWidget) {
            boolean isAttachedToWindow = isAttachedToWindow();
            RenderingWidget renderingWidget2 = this.c;
            if (renderingWidget2 != null) {
                if (isAttachedToWindow) {
                    renderingWidget2.onDetachedFromWindow();
                }
                this.c.setOnChangedListener(null);
            }
            this.c = renderingWidget;
            if (renderingWidget != null) {
                if (this.d == null) {
                    this.d = new OnChangedListener() {
                    };
                }
                setWillNotDraw(false);
                renderingWidget.setOnChangedListener(this.d);
                if (isAttachedToWindow) {
                    renderingWidget.onAttachedToWindow();
                    requestLayout();
                }
            } else {
                setWillNotDraw(true);
            }
            invalidate();
        }
    }
}
