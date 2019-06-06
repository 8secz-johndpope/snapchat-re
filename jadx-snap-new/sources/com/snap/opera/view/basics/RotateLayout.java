package com.snap.opera.view.basics;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class RotateLayout extends ViewGroup {
    public final Rect a = new Rect();
    public int b = 0;
    int c = 0;
    boolean d = false;
    public a e = null;
    private final Matrix f = new Matrix();
    private boolean g = true;

    public interface a {
        float a(View view, int i);
    }

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int a(int i, int i2) {
        return (i == 0 && i2 == 270) ? 90 : (i == 270 && i2 == 0) ? -90 : (i == 0 && i2 == 90) ? -90 : (i == 90 && i2 == 0) ? 90 : (i == 90 && i2 == 270) ? 180 : (i == 270 && i2 == 90) ? -180 : 0;
    }

    private View a() {
        if (getChildCount() == 1) {
            return getChildAt(0);
        }
        throw new RuntimeException("RotateView should just have one child.");
    }

    public final void a(int i) {
        if (this.b != i) {
            this.g = true;
            this.b = i;
            requestLayout();
        }
    }

    public final void a(int i, Runnable runnable) {
        if (!this.d && this.b == i) {
            return;
        }
        if (this.d) {
            this.c = i;
            return;
        }
        this.c = i;
        a(runnable);
    }

    /* Access modifiers changed, original: final */
    public final void a(final Runnable runnable) {
        this.d = true;
        final int i = this.c;
        ViewPropertyAnimator listener = animate().rotation((float) a(this.b, i)).setListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
                RotateLayout.this.d = false;
            }

            public final void onAnimationEnd(Animator animator) {
                RotateLayout.this.setRotation(MapboxConstants.MINIMUM_ZOOM);
                RotateLayout.this.setScaleX(1.0f);
                RotateLayout.this.setScaleY(1.0f);
                RotateLayout.this.a(i);
                if (i != RotateLayout.this.c) {
                    RotateLayout.this.a(runnable);
                    return;
                }
                RotateLayout.this.d = false;
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }
        });
        a aVar = this.e;
        if (aVar != null) {
            listener.scaleX(aVar.a(this, i));
            listener.scaleY(this.e.a(this, i));
        }
        listener.start();
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate((float) (-this.b), ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float[] fArr = new float[]{motionEvent.getX(), motionEvent.getY()};
        float[] fArr2 = new float[2];
        this.f.mapPoints(fArr2, fArr);
        motionEvent.setLocation(fArr2[0], fArr2[1]);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        motionEvent.setLocation(fArr[0], fArr[1]);
        return dispatchTouchEvent;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.g || z) {
            RectF rectF = new RectF();
            rectF.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) (i3 - i), (float) (i4 - i2));
            this.f.setRotate((float) this.b, rectF.centerX(), rectF.centerY());
            this.f.mapRect(rectF);
            rectF.round(this.a);
            this.g = false;
        }
        View a = a();
        if (a != null) {
            a.layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        View a = a();
        if (a != null) {
            if (Math.abs(this.b % 180) == 90) {
                measureChild(a, i2, i);
            } else {
                measureChild(a, i, i2);
            }
            setMeasuredDimension(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
