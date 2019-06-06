package com.snapchat.android.framework.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abkw.a;

public class RoundedFrameLayout extends FrameLayout {
    private static final Paint a = new Paint() {
        {
            setAntiAlias(true);
            setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
    };
    private static final Paint b = new Paint() {
        {
            setAntiAlias(true);
            setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        }
    };
    private static final Paint c = new Paint() {
        {
            setAntiAlias(true);
            setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        }
    };
    private final Path d;
    private final RectF e;
    private final float[] f;
    private boolean g;
    private boolean h;

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.d = new Path();
        this.e = new RectF();
        this.f = new float[8];
        this.h = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.e, 0, 0);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                float[] fArr = this.f;
                float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                this.f[1] = dimensionPixelSize2;
                fArr[0] = dimensionPixelSize2;
                fArr = this.f;
                float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                this.f[3] = dimensionPixelSize3;
                fArr[2] = dimensionPixelSize3;
                fArr = this.f;
                float dimensionPixelSize4 = (float) obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
                this.f[5] = dimensionPixelSize4;
                fArr[4] = dimensionPixelSize4;
                float[] fArr2 = this.f;
                float dimensionPixelSize5 = (float) obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
                this.f[7] = dimensionPixelSize5;
                fArr2[6] = dimensionPixelSize5;
                this.g = obtainStyledAttributes.getBoolean(5, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void a() {
        this.d.reset();
        if (this.g) {
            float centerX = this.e.centerX();
            float centerY = this.e.centerY();
            a(centerX, centerY, (float) ((int) Math.min(centerX, centerY)));
            return;
        }
        b();
    }

    private void a(float f, float f2, float f3) {
        Path path;
        Direction direction;
        if (VERSION.SDK_INT > 26) {
            this.d.addRect(this.e, Direction.CW);
            path = this.d;
            direction = Direction.CCW;
        } else {
            path = this.d;
            direction = Direction.CW;
        }
        path.addCircle(f, f2, f3, direction);
    }

    private void a(Canvas canvas) {
        int i = 0;
        Object obj = (isHardwareAccelerated() && getLayerType() == 2) ? 1 : null;
        if (obj == null) {
            i = canvas.saveLayer(this.e, c, 31);
        }
        b(canvas);
        if (obj == null) {
            canvas.restoreToCount(i);
        }
    }

    private void b() {
        Path path;
        RectF rectF;
        float[] fArr;
        Direction direction;
        if (VERSION.SDK_INT > 26) {
            this.d.addRect(this.e, Direction.CW);
            path = this.d;
            rectF = this.e;
            fArr = this.f;
            direction = Direction.CCW;
        } else {
            path = this.d;
            rectF = this.e;
            fArr = this.f;
            direction = Direction.CW;
        }
        path.addRoundRect(rectF, fArr, direction);
    }

    private void b(Canvas canvas) {
        Path path;
        Paint paint;
        if (VERSION.SDK_INT > 26) {
            path = this.d;
            paint = b;
        } else {
            path = this.d;
            paint = a;
        }
        canvas.drawPath(path, paint);
    }

    public final void a(float f) {
        float[] fArr = this.f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = f;
        fArr[4] = f;
        fArr[7] = f;
        fArr[6] = f;
        a();
        invalidate();
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        if (getClipChildren()) {
            super.dispatchDraw(canvas);
            a(canvas);
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h) {
            setLayerType(2, null);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        i2 = getMeasuredHeight();
        if (((int) this.e.right) != i || ((int) this.e.bottom) != i2) {
            this.e.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) getMeasuredWidth(), (float) getMeasuredHeight());
            a();
        }
    }
}
