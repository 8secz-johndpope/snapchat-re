package com.snap.camera.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtp;
import defpackage.abtw;
import defpackage.eol;

public class CameraLongPressView extends View {
    public float a;
    public float b;
    public long c;
    public boolean d = false;
    public boolean e = false;
    public eol f;
    public a g;
    public int h;
    public final Runnable i = new Runnable() {
        public final void run() {
            CameraLongPressView.this.invalidate();
        }
    };
    private final Context j;
    private final float k;
    private final float l;
    private long m;
    private long n = -1;
    private boolean o = true;
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final Paint r;
    private final Paint s;
    private final AccelerateInterpolator t;
    private final DecelerateInterpolator u;

    /* renamed from: com.snap.camera.view.CameraLongPressView$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[b.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|5|6|7|8|10) */
        /* JADX WARNING: Missing block: B:11:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.snap.camera.view.CameraLongPressView.b.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.camera.view.CameraLongPressView$AnonymousClass2.<clinit>():void");
        }
    }

    public interface a {
        void onLongPressDraw(float f, float f2, int i, eol eol);
    }

    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public CameraLongPressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = context;
        this.r = new Paint();
        this.r.setAntiAlias(true);
        this.r.setStyle(Style.STROKE);
        this.r.setColor(-1);
        this.r.setStrokeWidth(abtp.a(2.8f, this.j));
        this.s = new Paint();
        this.s.setAntiAlias(true);
        this.s.setColor(-1);
        this.s.setStyle(Style.FILL);
        this.h = 1;
        this.k = abtp.a(56.0f, this.j);
        this.l = abtp.a(70.0f, this.j);
        this.t = new AccelerateInterpolator(context, attributeSet);
        this.u = new DecelerateInterpolator(context, attributeSet);
        this.o = abtw.a(this.j) ^ 1;
    }

    private float a(long j) {
        return (j > 750 ? (((float) (1500 - j)) * 0.20000005f) / 750.0f : this.u.getInterpolation(((float) j) / 750.0f) * 0.20000005f) + 1.0f;
    }

    private void a(Canvas canvas, int i, float f, float f2, float f3, float f4, RectF rectF, int i2) {
        float f5 = ((float) i) * f4;
        f4 = this.a;
        float f6 = f4 - f2;
        float f7 = this.b;
        rectF.set(f6, f7 - f2, f4 + f2, f7 + f2);
        this.r.setStrokeWidth(f);
        int i3 = 1;
        if (i2 == 1) {
            i3 = -1;
        }
        f = (float) i3;
        canvas.drawArc(rectF, MapboxConstants.MINIMUM_ZOOM - (f5 * f), f * f3, false, this.r);
    }

    public final void a(boolean z) {
        if (this.d && this.h == 2) {
            this.e = z;
            this.h = 3;
            this.m = System.currentTimeMillis();
        }
    }

    public void cancelLongPress() {
        if (this.d) {
            removeCallbacks(this.i);
            this.d = false;
            this.e = false;
            this.h = 1;
            setVisibility(8);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.c);
        if (this.d) {
            if (this.o) {
                invalidate();
            } else {
                postInvalidateDelayed(1000);
            }
        }
        int i = AnonymousClass2.a[this.h - 1];
        if (i != 1) {
            float f;
            float min;
            float min2;
            float min3;
            float a;
            Canvas canvas2;
            int i2;
            float f2;
            if (i == 2) {
                Canvas canvas3 = canvas;
                if (this.o) {
                    f = (float) currentTimeMillis;
                    min = Math.min(abtp.a(2.8f, this.j), abtp.a((2.8f * f) / 500.0f, this.j));
                    min2 = Math.min(0.108f * f, 216.0f);
                    min3 = Math.min(f * 0.077f, 216.0f);
                    a = a(Math.min(System.currentTimeMillis() - this.n, 1500));
                    canvas2 = canvas;
                    i2 = currentTimeMillis;
                    f2 = min;
                    a(canvas2, i2, f2, this.k * a, min2, 0.36f, this.p, 2);
                    a(canvas2, i2, f2, this.l * a, min3, 0.225f, this.q, 1);
                    this.g.onLongPressDraw(this.a, this.b, currentTimeMillis, this.f);
                }
            } else if (i == 3) {
                if (this.o) {
                    i = (int) (System.currentTimeMillis() - this.m);
                    float f3 = (float) i;
                    if (f3 > 500.0f) {
                        cancelLongPress();
                    }
                    min = f3 / 500.0f;
                    float max = Math.max(abtp.a((1.0f - min) * 2.8f, this.j), MapboxConstants.MINIMUM_ZOOM);
                    min2 = (float) currentTimeMillis;
                    float f4 = (float) (i * 2);
                    f = Math.max((Math.min(min2, 2000.0f) - f4) * 0.108f, MapboxConstants.MINIMUM_ZOOM);
                    min3 = Math.max((Math.min(min2, 2800.0f) - f4) * 0.077f, MapboxConstants.MINIMUM_ZOOM);
                    a = a(Math.min(System.currentTimeMillis() - this.n, 1500));
                    canvas2 = canvas;
                    i2 = currentTimeMillis;
                    f2 = max;
                    a(canvas2, i2, f2, this.k * a, f, 0.36f, this.p, 2);
                    a(canvas2, i2, f2, this.l * a, min3, 0.225f, this.q, 1);
                    if (this.e) {
                        float interpolation = (this.l * 14.0f) * this.t.getInterpolation(min);
                        this.s.setAlpha(102);
                        canvas.drawCircle(this.a, this.b, interpolation, this.s);
                    }
                    return;
                }
                cancelLongPress();
            }
        }
    }
}
