package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

/* renamed from: zim */
public class zim extends Drawable {
    private static final zio n = new zio(0);
    public long a = Long.MIN_VALUE;
    protected int b;
    protected long c;
    protected long d;
    protected final akbk<ajxw> e;
    private final Rect f = new Rect();
    private final RectF g = new RectF();
    private final Path h = new Path();
    private zio i = n;
    private Drawable j;
    private Drawable k;
    private int l = 255;
    private final Context m;

    /* renamed from: zim$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public zim(Context context, akbk<ajxw> akbk) {
        akcr.b(context, "context");
        akcr.b(akbk, "viewInvalidater");
        this.m = context;
        this.e = akbk;
    }

    public final void a(long j) {
        this.a = j;
        this.b = 1;
        this.e.invoke();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A:{SYNTHETIC, Splitter:B:19:0x002c} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037  */
    public final void a(defpackage.zio r5) {
        /*
        r4 = this;
        defpackage.abmr.a();
        r0 = r4.i;
        r0 = defpackage.akcr.a(r0, r5);
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = 0;
        if (r5 == 0) goto L_0x0012;
    L_0x000f:
        r1 = r5.a;
        goto L_0x0013;
    L_0x0012:
        r1 = 0;
    L_0x0013:
        if (r5 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r5.b;
        if (r2 != r1) goto L_0x001a;
    L_0x0019:
        goto L_0x001c;
    L_0x001a:
        r0 = r5.b;
    L_0x001c:
        r2 = 0;
        if (r1 != 0) goto L_0x0021;
    L_0x001f:
        r1 = r2;
        goto L_0x0027;
    L_0x0021:
        r3 = r4.m;	 Catch:{ NotFoundException -> 0x001f }
        r1 = android.support.v4.content.ContextCompat.getDrawable(r3, r1);	 Catch:{ NotFoundException -> 0x001f }
    L_0x0027:
        r4.j = r1;
        if (r0 != 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0033;
    L_0x002c:
        r1 = r4.m;	 Catch:{ NotFoundException -> 0x0033 }
        r0 = android.support.v4.content.ContextCompat.getDrawable(r1, r0);	 Catch:{ NotFoundException -> 0x0033 }
        r2 = r0;
    L_0x0033:
        r4.k = r2;
        if (r5 != 0) goto L_0x0039;
    L_0x0037:
        r5 = n;
    L_0x0039:
        r4.i = r5;
        r5 = r4.e;
        r5.invoke();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zim.a(zio):void");
    }

    public void draw(Canvas canvas) {
        long currentTimeMillis;
        long j;
        int i;
        akcr.b(canvas, "canvas");
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(this.f);
            drawable.setAlpha(drawable.getAlpha());
            drawable.draw(canvas);
        }
        if (this.b != 2) {
            currentTimeMillis = System.currentTimeMillis() - this.a;
            j = 500;
            i = 0;
        } else if (this.c != 0) {
            currentTimeMillis = this.d - System.currentTimeMillis();
            j = this.c;
            i = 1;
        } else {
            return;
        }
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        } else if (currentTimeMillis > j) {
            currentTimeMillis = j;
        } else {
            this.e.invoke();
        }
        float f = ((float) currentTimeMillis) / ((float) j);
        if (i != 1) {
            if (i == 0) {
                f = 1.0f - f;
            } else {
                throw new ajxk();
            }
        }
        f *= 360.0f;
        if (f < 360.0f) {
            Drawable drawable2 = this.k;
            if (drawable2 != null) {
                float f2;
                if (i != 0) {
                    f2 = -90.0f - f;
                } else {
                    f2 = -90.0f + f;
                    f = 360.0f - f;
                }
                float f3 = f;
                float f4 = f2;
                this.h.reset();
                double width = (double) this.f.width();
                Double.isNaN(width);
                width /= 2.0d;
                double height = (double) this.f.height();
                Double.isNaN(height);
                f = (float) Math.hypot(width, height / 2.0d);
                float centerX = (float) this.f.centerX();
                f2 = (float) this.f.centerY();
                this.h.moveTo(centerX, f2);
                height = (double) f4;
                this.h.lineTo((((float) Math.cos(Math.toRadians(height))) * f) + centerX, (((float) Math.sin(Math.toRadians(height))) * f) + f2);
                if (VERSION.SDK_INT < 21) {
                    this.g.set((float) this.f.left, (float) this.f.top, (float) this.f.right, (float) this.f.bottom);
                    this.h.addArc(this.g, f4, f3);
                } else {
                    this.h.addArc((float) this.f.left, (float) this.f.top, (float) this.f.right, (float) this.f.bottom, f4, f3);
                }
                this.h.lineTo(centerX, f2);
                this.h.close();
                canvas.save();
                canvas.clipPath(this.h);
                drawable2.setBounds(this.f);
                drawable2.setAlpha(this.l);
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
    }

    public int getAlpha() {
        return this.l;
    }

    public int getOpacity() {
        return -3;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        if (rect != null) {
            this.f.set(rect);
        }
    }

    public void setAlpha(int i) {
        this.l = i;
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
