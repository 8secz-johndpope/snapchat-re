package com.snapchat.map.feature.slider;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

public class ScalingZoomSliderIndicatorView extends View {
    public int a;
    public int b;
    public int c;
    public int d = -1;
    public ValueAnimator e;
    public ValueAnimator f;
    ValueAnimator g;
    public Drawable h;
    private final Paint i = new Paint();
    private int j;
    private int k;
    private int l;
    private RectF m;
    private int n;

    /* renamed from: com.snapchat.map.feature.slider.ScalingZoomSliderIndicatorView$2 */
    public class AnonymousClass2 extends AnimatorListenerAdapter {
        private /* synthetic */ boolean b;
        private /* synthetic */ AnimatorListener c;

        public AnonymousClass2(boolean z, AnimatorListener animatorListener) {
            this.b = z;
            this.c = animatorListener;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.b) {
                ScalingZoomSliderIndicatorView.this.g = ValueAnimator.ofInt(new int[]{ScalingZoomSliderIndicatorView.this.d, ScalingZoomSliderIndicatorView.this.a});
                ScalingZoomSliderIndicatorView.this.g.setDuration(100);
                ScalingZoomSliderIndicatorView.this.g.setStartDelay(2000);
                ScalingZoomSliderIndicatorView.this.g.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ScalingZoomSliderIndicatorView.a(ScalingZoomSliderIndicatorView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                if (this.c != null) {
                    ScalingZoomSliderIndicatorView.this.g.addListener(this.c);
                }
                ScalingZoomSliderIndicatorView.this.g.start();
            }
        }
    }

    public ScalingZoomSliderIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static /* synthetic */ void a(ScalingZoomSliderIndicatorView scalingZoomSliderIndicatorView, int i) {
        scalingZoomSliderIndicatorView.d = i;
        scalingZoomSliderIndicatorView.invalidate();
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f.removeAllListeners();
            this.f.cancel();
            this.f.end();
            this.f = null;
        }
        valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.g.removeAllListeners();
            this.g.cancel();
            this.g.end();
            this.g = null;
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.j = i3;
        this.k = i2;
        this.l = i;
        this.a = i4;
        this.b = i5;
        this.c = i6;
        if (this.d == -1) {
            this.d = i4;
        }
        this.m = new RectF((float) i2, (float) i, (float) (i2 + this.c), (float) (i + this.j));
        this.i.setColor(-1);
        this.i.setShadowLayer(15.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, getResources().getColor(R.color.map_black_forty_opacity));
        this.n = getResources().getDimensionPixelSize(R.dimen.emoji_size);
        setLayerType(1, null);
    }

    public final void b() {
        if (this.d != this.a) {
            a();
            this.d = this.a;
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.m;
        rectF.left = (float) ((this.k + this.c) - this.d);
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, this.i);
        Drawable drawable = this.h;
        if (drawable != null && this.d > this.n + 10) {
            Rect copyBounds = drawable.copyBounds();
            copyBounds.left = (int) (this.m.left + 10.0f);
            int i = copyBounds.left;
            int i2 = this.n;
            copyBounds.right = i + i2;
            copyBounds.top = (this.l + (this.j / 2)) - (i2 / 2);
            copyBounds.bottom = copyBounds.top + this.n;
            this.h.setBounds(copyBounds);
            this.h.draw(canvas);
        }
    }
}
