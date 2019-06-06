package com.snap.spectacles.sharedui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.LinearInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.xab;
import defpackage.xac;

public final class SpectaclesBatteryView extends View implements xab {
    int a;
    int b;
    public float c;
    double d;
    public boolean e;
    public boolean f;
    public xac g;
    private final int h;
    private final int i;
    private final Paint j;
    private final Paint k;
    private final int l;
    private Paint m;
    private final int n;
    private final int o;
    private int p;
    private final float[] q;
    private final Path r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final Path v;
    private final Path w;
    private ValueAnimator x;
    private final AnimatorUpdateListener y;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements AnimatorUpdateListener {
        private /* synthetic */ SpectaclesBatteryView a;

        b(SpectaclesBatteryView spectaclesBatteryView) {
            this.a = spectaclesBatteryView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                if (intValue >= 950) {
                    double abs = (double) Math.abs(1750 - intValue);
                    Double.isNaN(abs);
                    abs /= 800.0d;
                    this.a.d = Math.sin(abs * 1.5707963267948966d);
                    this.a.invalidate();
                    return;
                }
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Int");
        }
    }

    static {
        a aVar = new a();
        SpectaclesBatteryView.class.getSimpleName();
    }

    public SpectaclesBatteryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private SpectaclesBatteryView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.c = 0.55f;
        this.p = -7829368;
        this.d = 1.0d;
        this.r = new Path();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new Path();
        this.w = new Path();
        this.e = true;
        this.f = true;
        this.y = new b(this);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.xaa.a.a, 0, 0);
        int color = obtainStyledAttributes.getColor(2, context.getResources().getColor(R.color.batterymeter_stroke_color));
        this.a = obtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.battery_default_stroke_width));
        this.l = obtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.battery_default_corner_radius));
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.battery_default_icon_size));
        obtainStyledAttributes.recycle();
        this.h = resources.getDimensionPixelOffset(R.dimen.battery_path_padding);
        this.n = resources.getColor(R.color.batterymeter_charging_color);
        this.o = resources.getColor(R.color.batterymeter_low_power_color);
        this.p = color;
        this.j = new Paint(1);
        this.j.setDither(true);
        this.j.setStrokeWidth((float) this.a);
        this.j.setStyle(Style.STROKE);
        this.m = new Paint(1);
        this.m.setDither(true);
        this.m.setStrokeWidth(MapboxConstants.MINIMUM_ZOOM);
        this.m.setStyle(Style.FILL);
        this.k = new Paint(1);
        b();
        akcr.a((Object) resources, "res");
        this.q = a(resources);
        this.i = resources.getDimensionPixelOffset(R.dimen.battery_low_height_threshold);
    }

    private static float[] a(Resources resources) {
        int[] intArray = resources.getIntArray(R.array.batterymeter_bolt_points);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < intArray.length; i3 += 2) {
            i = Math.max(i, intArray[i3]);
            i2 = Math.max(i2, intArray[i3 + 1]);
        }
        float[] fArr = new float[intArray.length];
        for (int i4 = 0; i4 < intArray.length; i4 += 2) {
            fArr[i4] = ((float) intArray[i4]) / ((float) i);
            int i5 = i4 + 1;
            fArr[i5] = ((float) intArray[i5]) / ((float) i2);
        }
        return fArr;
    }

    private void b() {
        Paint paint;
        int i;
        this.j.setColor(this.p);
        this.k.setColor(this.p);
        this.k.setAlpha((int) Math.round(this.d * 255.0d));
        xac xac = this.g;
        if (xac == null || !xac.d()) {
            xac = this.g;
            if (xac == null || !xac.f()) {
                paint = this.m;
                i = this.p;
            } else {
                paint = this.m;
                i = this.o;
            }
        } else {
            paint = this.m;
            i = this.n;
        }
        paint.setColor(i);
    }

    public final void a() {
        xac xac = this.g;
        if (xac == null || !xac.g()) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                if (valueAnimator != null) {
                    valueAnimator.removeUpdateListener(this.y);
                }
                valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
            }
            invalidate();
            if (this.e) {
                xac = this.g;
                if (xac != null && xac.d()) {
                    xac = this.g;
                    if (!(xac == null || xac.c())) {
                        this.x = ValueAnimator.ofInt(new int[]{0, 2550});
                        valueAnimator = this.x;
                        if (valueAnimator != null) {
                            valueAnimator.setDuration(2550);
                        }
                        valueAnimator = this.x;
                        if (valueAnimator != null) {
                            valueAnimator.setRepeatCount(-1);
                        }
                        valueAnimator = this.x;
                        if (valueAnimator != null) {
                            valueAnimator.setInterpolator(new LinearInterpolator());
                        }
                        valueAnimator = this.x;
                        if (valueAnimator != null) {
                            valueAnimator.addUpdateListener(this.y);
                        }
                        valueAnimator = this.x;
                        if (valueAnimator != null) {
                            valueAnimator.start();
                        }
                    }
                }
            }
        }
    }

    public final void a(int i) {
        this.p = i;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "c");
        xac xac = this.g;
        if (xac == null || xac.b()) {
            xac = this.g;
            Integer e = xac != null ? xac.e() : null;
            if (e == null) {
                akcr.a();
            }
            float intValue = (float) e.intValue();
            float f = intValue / 100.0f;
            this.s.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getMeasuredWidth() - getPaddingRight()), (float) (getMeasuredHeight() - getPaddingBottom()));
            this.t.set(this.s.left + ((float) Math.round(((float) getMeasuredWidth()) * 0.16f)), this.s.top, this.s.right - ((float) Math.round(((float) getMeasuredWidth()) * 0.16f)), this.s.top + ((float) this.a));
            RectF rectF = this.t;
            rectF.left += (float) this.h;
            rectF = this.t;
            rectF.right -= (float) this.h;
            rectF = this.s;
            rectF.top += this.t.bottom + 3.0f;
            rectF = this.s;
            rectF.left += (float) this.h;
            rectF = this.s;
            rectF.right -= (float) this.h;
            rectF = this.s;
            rectF.bottom -= (float) this.h;
            b();
            xac xac2 = this.g;
            if (xac2 != null && xac2.c()) {
                f = 1.0f;
            } else if (intValue <= 5.0f) {
                f = MapboxConstants.MINIMUM_ZOOM;
            }
            intValue = this.s.top + (this.s.height() * (1.0f - f));
            Path path = new Path();
            path.moveTo(this.t.left, this.t.bottom);
            path.lineTo(this.t.right, this.t.bottom);
            this.j.setStrokeWidth(((float) this.a) * 0.75f);
            canvas.drawPath(path, this.j);
            this.j.setStrokeWidth((float) this.a);
            this.v.reset();
            this.v.moveTo(this.s.left, this.s.top);
            path = this.v;
            rectF = this.s;
            int i = this.l;
            path.addRoundRect(rectF, (float) i, (float) i, Direction.CW);
            path = new Path(this.v);
            rectF = new RectF(this.s);
            rectF.top = intValue;
            rectF.top = rectF.bottom - Math.max(rectF.height(), (float) this.i);
            this.w.reset();
            this.w.addRect(rectF, Direction.CCW);
            path.op(this.w, Op.INTERSECT);
            canvas.drawPath(path, this.m);
            canvas.drawPath(this.v, this.j);
            if (this.f) {
                xac = this.g;
                if (xac != null && xac.d()) {
                    intValue = this.s.left + (this.s.width() / 6.0f);
                    f = this.s.top + (this.s.height() / 8.0f);
                    float width = this.s.right - (this.s.width() / 6.0f);
                    float height = this.s.bottom - (this.s.height() / 8.0f);
                    if (!(this.u.left == intValue && this.u.top == f && this.u.right == width && this.u.bottom == height)) {
                        this.u.set(intValue, f, width, height);
                        this.r.reset();
                        this.r.moveTo(this.u.left + (this.q[0] * this.u.width()), this.u.top + (this.q[1] * this.u.height()));
                        for (int i2 = 2; i2 < this.q.length; i2 += 2) {
                            this.r.lineTo(this.u.left + (this.q[i2] * this.u.width()), this.u.top + (this.q[i2 + 1] * this.u.height()));
                        }
                        this.r.lineTo(this.u.left + (this.q[0] * this.u.width()), this.u.top + (this.q[1] * this.u.height()));
                    }
                    canvas.drawPath(this.r, this.k);
                }
            }
        }
    }

    public final int getSuggestedMinimumHeight() {
        return (this.b + getPaddingTop()) + getPaddingBottom();
    }

    public final int getSuggestedMinimumWidth() {
        return (Math.round(((float) this.b) * this.c) + getPaddingLeft()) + getPaddingRight();
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xac xac = this.g;
        if (xac != null) {
            xac.a((xab) this);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xac xac = this.g;
        if (xac != null) {
            xac.a();
        }
    }

    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i);
        int i3 = Integer.MAX_VALUE;
        i2 = mode == 0 ? Integer.MAX_VALUE : MeasureSpec.getSize(i2);
        if (mode2 != 0) {
            i3 = MeasureSpec.getSize(i);
        }
        i = Math.min(this.b, (i2 - getPaddingTop()) - getPaddingBottom());
        i2 = Math.min((int) Math.ceil((double) (((float) this.b) * this.c)), (i3 - getPaddingLeft()) - getPaddingRight());
        mode = (int) Math.ceil((double) (((float) i) * this.c));
        if (mode > i2) {
            i = (int) Math.ceil((double) (((float) i2) / this.c));
        } else {
            i2 = mode;
        }
        setMeasuredDimension((i2 + getPaddingLeft()) + getPaddingRight(), (i + getPaddingTop()) + getPaddingBottom());
    }

    /* Access modifiers changed, original: protected|final */
    public final void onVisibilityChanged(View view, int i) {
        akcr.b(view, "changedView");
        super.onVisibilityChanged(view, i);
        xac xac = this.g;
        if (xac != null) {
            xac.a(i);
        }
    }
}
