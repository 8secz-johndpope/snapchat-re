package com.snap.ui.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;
import defpackage.zki;

public final class PercentProgressView extends View {
    public static final Companion Companion = new Companion();
    private static final long DURATION = 300;
    private static final int MAX_PROGRESS = 100;
    private static final int STROKE_WIDTH = 2;
    private static final String TAG = "PercentProgressView";
    private static final int TEXT_SIZE = 18;
    private int progress;
    private final ValueAnimator progressAnimator = new ValueAnimator();
    private final Paint progressPaint = new Paint();
    private final RectF progressRect = new RectF();
    private final Paint ringPaint = new Paint();
    private final Paint textPaint = new Paint();
    private final Rect textRect = new Rect();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    final class UpdateListener implements AnimatorUpdateListener {
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.b(valueAnimator, "animation");
            PercentProgressView percentProgressView = PercentProgressView.this;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                percentProgressView.progress = ((Integer) animatedValue).intValue();
                PercentProgressView.this.invalidate();
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public PercentProgressView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Object resources = context.getResources();
        String str = "context.resources";
        akcr.a(resources, str);
        float f = resources.getDisplayMetrics().density * 2.0f;
        this.progressPaint.setAntiAlias(true);
        this.progressPaint.setStyle(Style.STROKE);
        this.progressPaint.setStrokeWidth(f);
        this.progressPaint.setColor(-1);
        this.ringPaint.setAntiAlias(true);
        this.ringPaint.setStyle(Style.STROKE);
        this.ringPaint.setStrokeWidth(f);
        this.ringPaint.setColor(ContextCompat.getColor(context, R.color.white_twenty_opacity));
        this.textPaint.setAntiAlias(true);
        this.textPaint.setStyle(Style.FILL);
        Paint paint = this.textPaint;
        Object resources2 = context.getResources();
        akcr.a(resources2, str);
        paint.setTextSize(resources2.getDisplayMetrics().density * 18.0f);
        this.textPaint.setTypeface(zki.a(context, 1));
        this.textPaint.setShadowLayer(MapboxConstants.MINIMUM_ZOOM, 1.0f, 3.0f, -16777216);
        this.textPaint.setColor(-1);
        setWillNotDraw(false);
        this.progressAnimator.setInterpolator(new DecelerateInterpolator());
        this.progressAnimator.setDuration(300);
        this.progressAnimator.addUpdateListener(new UpdateListener());
    }

    public static /* synthetic */ void textPaint$annotations() {
    }

    public final void animateProgress(int i) {
        if (getVisibility() == 0 && i > this.progress) {
            this.progressAnimator.setIntValues(new int[]{r0, i});
            this.progressAnimator.start();
        }
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.draw(canvas);
        canvas.drawCircle(this.progressRect.centerX(), this.progressRect.centerY(), this.progressRect.width() / 2.0f, this.ringPaint);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.progressRect, -90.0f, (((float) this.progress) * 360.0f) / 100.0f, false, this.progressPaint);
        String string = getContext().getString(R.string.percent_progress_view_text, new Object[]{Integer.valueOf(this.progress)});
        this.textPaint.setTextAlign(Align.LEFT);
        this.textPaint.getTextBounds(string, 0, string.length(), this.textRect);
        canvas.drawText(string, (this.progressRect.centerX() - ((float) this.textRect.centerX())) - ((float) this.textRect.left), this.progressRect.centerY() - ((this.textPaint.descent() + this.textPaint.ascent()) / 2.0f), this.textPaint);
    }

    public final Paint getTextPaint() {
        return this.textPaint;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i2 = getMeasuredHeight() >> 1;
        i3 = getMeasuredWidth() >> 1;
        this.progressRect.set((float) (getMeasuredWidth() >> (1 - i3)), (float) (i2 - i3), (float) ((getMeasuredWidth() >> 1) + i3), (float) (i2 + i3));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onVisibilityChanged(View view, int i) {
        akcr.b(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            this.progress = 0;
            ValueAnimator valueAnimator = this.progressAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
    }

    public final void stopProgress() {
        this.progress = 0;
        this.progressAnimator.cancel();
    }
}
