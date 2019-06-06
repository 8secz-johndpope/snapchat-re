package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.lx.a;

/* renamed from: cn */
public final class cn {
    private static final boolean v = (VERSION.SDK_INT < 18);
    private float A;
    private float B;
    private float C;
    private float D;
    private Typeface E;
    private Typeface F;
    private Typeface G;
    private boolean H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private float O;
    private float P;
    private float Q;
    private int R;
    public boolean a;
    public float b;
    public final Rect c;
    public final Rect d;
    public int e = 16;
    public int f = 16;
    public ColorStateList g;
    public ColorStateList h;
    public float i;
    public float j;
    public CharSequence k;
    public CharSequence l;
    public boolean m;
    public Bitmap n;
    public Paint o;
    public float p;
    public float q;
    public int[] r;
    public boolean s;
    public final TextPaint t;
    public Interpolator u;
    private final View w;
    private final RectF x;
    private float y = 15.0f;
    private float z = 15.0f;

    public cn(View view) {
        this.w = view;
        this.t = new TextPaint(129);
        this.d = new Rect();
        this.c = new Rect();
        this.x = new RectF();
    }

    private static float a(float f, float f2, float f3, Interpolator interpolator) {
        if (interpolator != null) {
            f3 = interpolator.getInterpolation(f3);
        }
        return f + (f3 * (f2 - f));
    }

    private static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    private void a(float f) {
        TextPaint textPaint;
        int a;
        b(f);
        this.i = cn.a(this.C, this.D, f, null);
        this.j = cn.a(this.A, this.B, f, null);
        c(cn.a(this.y, this.z, f, this.u));
        if (this.h != this.g) {
            textPaint = this.t;
            a = cn.a(d(), e(), f);
        } else {
            textPaint = this.t;
            a = e();
        }
        textPaint.setColor(a);
        this.t.setShadowLayer(cn.a(this.O, this.K, f, null), cn.a(this.P, this.L, f, null), cn.a(this.Q, this.M, f, null), cn.a(this.R, this.N, f));
        kb.a.c(this.w);
    }

    private static boolean a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    public static boolean a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private static boolean a(Typeface typeface, Typeface typeface2) {
        return !(typeface == null || typeface.equals(typeface2)) || (typeface == null && typeface2 != null);
    }

    private void b(float f) {
        this.x.left = cn.a((float) this.c.left, (float) this.d.left, f, null);
        this.x.top = cn.a(this.A, this.B, f, null);
        this.x.right = cn.a((float) this.c.right, (float) this.d.right, f, null);
        this.x.bottom = cn.a((float) this.c.bottom, (float) this.d.bottom, f, null);
    }

    private boolean b(CharSequence charSequence) {
        Object obj = 1;
        if (kb.a.j(this.w) != 1) {
            obj = null;
        }
        return (obj != null ? it.b : it.a).a(charSequence, charSequence.length());
    }

    private Typeface c(int i) {
        TypedArray obtainStyledAttributes = this.w.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                Typeface create = Typeface.create(string, 0);
                return create;
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void c(float f) {
        d(f);
        boolean z = v && this.q != 1.0f;
        this.m = z;
        if (this.m) {
            g();
        }
        kb.a.c(this.w);
    }

    private int d() {
        int[] iArr = this.r;
        return iArr != null ? this.g.getColorForState(iArr, 0) : this.g.getDefaultColor();
    }

    private void d(float f) {
        if (this.k != null) {
            float f2;
            Object obj;
            float width = (float) this.d.width();
            float width2 = (float) this.c.width();
            boolean z = true;
            if (cn.a(f, this.z)) {
                Object obj2;
                f = this.z;
                this.q = 1.0f;
                if (cn.a(this.G, this.E)) {
                    this.G = this.E;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                f2 = f;
                obj = obj2;
            } else {
                f2 = this.y;
                if (cn.a(this.G, this.F)) {
                    this.G = this.F;
                    obj = 1;
                } else {
                    obj = null;
                }
                if (cn.a(f, this.y)) {
                    this.q = 1.0f;
                } else {
                    this.q = f / this.y;
                }
                f = this.z / this.y;
                width = width2 * f > width ? Math.min(width / f, width2) : width2;
            }
            if (width > MapboxConstants.MINIMUM_ZOOM) {
                obj = (this.J == f2 && !this.s && obj == null) ? null : 1;
                this.J = f2;
                this.s = false;
            }
            if (this.l == null || r6 != null) {
                this.t.setTextSize(this.J);
                this.t.setTypeface(this.G);
                TextPaint textPaint = this.t;
                if (this.q == 1.0f) {
                    z = false;
                }
                textPaint.setLinearText(z);
                CharSequence ellipsize = TextUtils.ellipsize(this.k, this.t, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.l)) {
                    this.l = ellipsize;
                    this.H = b(this.l);
                }
            }
        }
    }

    private int e() {
        int[] iArr = this.r;
        return iArr != null ? this.h.getColorForState(iArr, 0) : this.h.getDefaultColor();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    private void f() {
        /*
        r11 = this;
        r0 = r11.J;
        r1 = r11.z;
        r11.d(r1);
        r1 = r11.l;
        r2 = 0;
        r3 = 0;
        if (r1 == 0) goto L_0x0018;
    L_0x000d:
        r4 = r11.t;
        r5 = r1.length();
        r1 = r4.measureText(r1, r2, r5);
        goto L_0x0019;
    L_0x0018:
        r1 = 0;
    L_0x0019:
        r4 = r11.f;
        r5 = r11.H;
        r4 = defpackage.jp.a(r4, r5);
        r5 = r4 & 112;
        r6 = 80;
        r7 = 48;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r5 == r7) goto L_0x0053;
    L_0x002b:
        if (r5 == r6) goto L_0x004d;
    L_0x002d:
        r5 = r11.t;
        r5 = r5.descent();
        r9 = r11.t;
        r9 = r9.ascent();
        r5 = r5 - r9;
        r5 = r5 / r8;
        r9 = r11.t;
        r9 = r9.descent();
        r5 = r5 - r9;
        r9 = r11.d;
        r9 = r9.centerY();
        r9 = (float) r9;
        r9 = r9 + r5;
        r11.B = r9;
        goto L_0x0061;
    L_0x004d:
        r5 = r11.d;
        r5 = r5.bottom;
        r5 = (float) r5;
        goto L_0x005f;
    L_0x0053:
        r5 = r11.d;
        r5 = r5.top;
        r5 = (float) r5;
        r9 = r11.t;
        r9 = r9.ascent();
        r5 = r5 - r9;
    L_0x005f:
        r11.B = r5;
    L_0x0061:
        r5 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r4 = r4 & r5;
        r9 = 5;
        r10 = 1;
        if (r4 == r10) goto L_0x0079;
    L_0x0069:
        if (r4 == r9) goto L_0x0073;
    L_0x006b:
        r1 = r11.d;
        r1 = r1.left;
        r1 = (float) r1;
        r11.D = r1;
        goto L_0x0084;
    L_0x0073:
        r4 = r11.d;
        r4 = r4.right;
        r4 = (float) r4;
        goto L_0x0081;
    L_0x0079:
        r4 = r11.d;
        r4 = r4.centerX();
        r4 = (float) r4;
        r1 = r1 / r8;
    L_0x0081:
        r4 = r4 - r1;
        r11.D = r4;
    L_0x0084:
        r1 = r11.y;
        r11.d(r1);
        r1 = r11.l;
        if (r1 == 0) goto L_0x0097;
    L_0x008d:
        r3 = r11.t;
        r4 = r1.length();
        r3 = r3.measureText(r1, r2, r4);
    L_0x0097:
        r1 = r11.e;
        r2 = r11.H;
        r1 = defpackage.jp.a(r1, r2);
        r2 = r1 & 112;
        if (r2 == r7) goto L_0x00cb;
    L_0x00a3:
        if (r2 == r6) goto L_0x00c5;
    L_0x00a5:
        r2 = r11.t;
        r2 = r2.descent();
        r4 = r11.t;
        r4 = r4.ascent();
        r2 = r2 - r4;
        r2 = r2 / r8;
        r4 = r11.t;
        r4 = r4.descent();
        r2 = r2 - r4;
        r4 = r11.c;
        r4 = r4.centerY();
        r4 = (float) r4;
        r4 = r4 + r2;
        r11.A = r4;
        goto L_0x00d9;
    L_0x00c5:
        r2 = r11.c;
        r2 = r2.bottom;
        r2 = (float) r2;
        goto L_0x00d7;
    L_0x00cb:
        r2 = r11.c;
        r2 = r2.top;
        r2 = (float) r2;
        r4 = r11.t;
        r4 = r4.ascent();
        r2 = r2 - r4;
    L_0x00d7:
        r11.A = r2;
    L_0x00d9:
        r1 = r1 & r5;
        if (r1 == r10) goto L_0x00ec;
    L_0x00dc:
        if (r1 == r9) goto L_0x00e6;
    L_0x00de:
        r1 = r11.c;
        r1 = r1.left;
        r1 = (float) r1;
    L_0x00e3:
        r11.C = r1;
        goto L_0x00f6;
    L_0x00e6:
        r1 = r11.c;
        r1 = r1.right;
        r1 = (float) r1;
        goto L_0x00f4;
    L_0x00ec:
        r1 = r11.c;
        r1 = r1.centerX();
        r1 = (float) r1;
        r3 = r3 / r8;
    L_0x00f4:
        r1 = r1 - r3;
        goto L_0x00e3;
    L_0x00f6:
        r11.h();
        r11.c(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn.f():void");
    }

    private void g() {
        if (this.n == null && !this.c.isEmpty() && !TextUtils.isEmpty(this.l)) {
            a((float) MapboxConstants.MINIMUM_ZOOM);
            this.p = this.t.ascent();
            this.I = this.t.descent();
            TextPaint textPaint = this.t;
            CharSequence charSequence = this.l;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.I - this.p);
            if (round > 0 && round2 > 0) {
                this.n = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                Canvas canvas = new Canvas(this.n);
                CharSequence charSequence2 = this.l;
                canvas.drawText(charSequence2, 0, charSequence2.length(), MapboxConstants.MINIMUM_ZOOM, ((float) round2) - this.t.descent(), this.t);
                if (this.o == null) {
                    this.o = new Paint(3);
                }
            }
        }
    }

    private void h() {
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            bitmap.recycle();
            this.n = null;
        }
    }

    public final void a() {
        boolean z = this.d.width() > 0 && this.d.height() > 0 && this.c.width() > 0 && this.c.height() > 0;
        this.a = z;
    }

    public final void a(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.w.getContext(), i, a.z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.h = obtainStyledAttributes.getColorStateList(3);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.z = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.z);
        }
        this.N = obtainStyledAttributes.getInt(6, 0);
        this.L = obtainStyledAttributes.getFloat(7, MapboxConstants.MINIMUM_ZOOM);
        this.M = obtainStyledAttributes.getFloat(8, MapboxConstants.MINIMUM_ZOOM);
        this.K = obtainStyledAttributes.getFloat(9, MapboxConstants.MINIMUM_ZOOM);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.E = c(i);
        }
        c();
    }

    public final void a(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.k)) {
            this.k = charSequence;
            this.l = null;
            h();
            c();
        }
    }

    public final void b() {
        a(this.b);
    }

    public final void b(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.w.getContext(), i, a.z);
        if (obtainStyledAttributes.hasValue(3)) {
            this.g = obtainStyledAttributes.getColorStateList(3);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.y = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.y);
        }
        this.R = obtainStyledAttributes.getInt(6, 0);
        this.P = obtainStyledAttributes.getFloat(7, MapboxConstants.MINIMUM_ZOOM);
        this.Q = obtainStyledAttributes.getFloat(8, MapboxConstants.MINIMUM_ZOOM);
        this.O = obtainStyledAttributes.getFloat(9, MapboxConstants.MINIMUM_ZOOM);
        obtainStyledAttributes.recycle();
        if (VERSION.SDK_INT >= 16) {
            this.F = c(i);
        }
        c();
    }

    public final void c() {
        if (this.w.getHeight() > 0 && this.w.getWidth() > 0) {
            f();
            b();
        }
    }
}
