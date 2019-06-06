package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: kbe */
public final class kbe extends BitmapDrawable implements kbd {
    private final Paint A;
    private final Paint B;
    private boolean C;
    private WeakReference<Bitmap> D;
    private ScaleToFit E;
    private float F;
    private float G;
    private boolean a;
    private boolean b;
    private final float[] c;
    private float[] d;
    private RectF e;
    private RectF f;
    private RectF g;
    private RectF h;
    private Matrix i;
    private Matrix j;
    private Matrix k;
    private Matrix l;
    private Matrix m;
    private Matrix n;
    private Matrix o;
    private Matrix p;
    private float q;
    private int r;
    private float s;
    private float t;
    private boolean u;
    private final RectF v;
    private final RectF w;
    private final Path x;
    private final Path y;
    private boolean z;

    public kbe(Resources resources, Bitmap bitmap) {
        this(resources, bitmap, null);
    }

    private kbe(Resources resources, Bitmap bitmap, Paint paint) {
        super(resources, bitmap);
        this.a = false;
        this.b = false;
        this.c = new float[8];
        this.d = new float[8];
        this.e = new RectF();
        this.f = new RectF();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new Matrix();
        this.j = new Matrix();
        this.k = new Matrix();
        this.l = new Matrix();
        this.m = new Matrix();
        this.p = new Matrix();
        this.q = MapboxConstants.MINIMUM_ZOOM;
        this.r = 0;
        this.s = MapboxConstants.MINIMUM_ZOOM;
        this.t = MapboxConstants.MINIMUM_ZOOM;
        this.u = false;
        this.v = new RectF();
        this.w = new RectF();
        this.x = new Path();
        this.y = new Path();
        this.z = true;
        this.A = new Paint();
        this.B = new Paint(1);
        this.C = true;
        this.F = 1.0f;
        this.G = 1.0f;
        if (paint != null) {
            this.A.set(paint);
        }
        this.A.setFlags(1);
        this.B.setStyle(Style.STROKE);
    }

    public static kbe a(Resources resources, BitmapDrawable bitmapDrawable) {
        return new kbe(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
    }

    public final void a() {
        Preconditions.checkState(true);
        Arrays.fill(this.c, MapboxConstants.MINIMUM_ZOOM);
        this.b = false;
        this.z = true;
        invalidateSelf();
    }

    public final void a(int i, float f, float f2) {
        if (this.r != i || this.q != f || this.s != f2) {
            this.r = i;
            this.q = f;
            this.s = f2;
            this.z = true;
            invalidateSelf();
        }
    }

    public final void a(ScaleToFit scaleToFit, float f, float f2) {
        this.E = scaleToFit;
        this.F = f;
        this.G = f2;
        invalidateSelf();
    }

    public final void a(boolean z) {
        this.a = z;
        this.z = true;
        invalidateSelf();
    }

    public final void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.c, MapboxConstants.MINIMUM_ZOOM);
            this.b = false;
        } else {
            Preconditions.checkArgument(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.c, 0, 8);
            this.b = false;
            for (int i = 0; i < 8; i++) {
                this.b |= fArr[i] > MapboxConstants.MINIMUM_ZOOM ? 1 : 0;
            }
        }
        this.z = true;
        invalidateSelf();
    }

    public final void b() {
    }

    public final void c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARNING: Missing block: B:26:0x0097, code skipped:
            if (r0.equals(r8.o) == false) goto L_0x0099;
     */
    public final void draw(android.graphics.Canvas r9) {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = 1;
        r2 = 0;
        r3 = 0;
        if (r0 != 0) goto L_0x0011;
    L_0x0007:
        r0 = r8.b;
        if (r0 != 0) goto L_0x0011;
    L_0x000b:
        r0 = r8.q;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0019;
    L_0x0011:
        r0 = r8.getBitmap();
        if (r0 == 0) goto L_0x0019;
    L_0x0017:
        r0 = 1;
        goto L_0x001a;
    L_0x0019:
        r0 = 0;
    L_0x001a:
        if (r0 != 0) goto L_0x0020;
    L_0x001c:
        super.draw(r9);
        return;
    L_0x0020:
        r0 = r8.k;
        r0.reset();
        r0 = r8.e;
        r4 = r8.getBounds();
        r0.set(r4);
        r0 = r8.g;
        r4 = r8.getBitmap();
        r4 = r4.getWidth();
        r4 = (float) r4;
        r5 = r8.getBitmap();
        r5 = r5.getHeight();
        r5 = (float) r5;
        r0.set(r3, r3, r4, r5);
        r0 = r8.h;
        r4 = r8.getBounds();
        r0.set(r4);
        r0 = r8.i;
        r4 = r8.g;
        r5 = r8.h;
        r6 = r8.E;
        if (r6 != 0) goto L_0x005a;
    L_0x0058:
        r6 = android.graphics.Matrix.ScaleToFit.FILL;
    L_0x005a:
        r0.setRectToRect(r4, r5, r6);
        r0 = r8.i;
        r4 = r8.F;
        r5 = r8.G;
        r6 = r8.h;
        r6 = r6.centerX();
        r7 = r8.h;
        r7 = r7.centerY();
        r0.postScale(r4, r5, r6, r7);
        r0 = r8.n;
        if (r0 == 0) goto L_0x0079;
    L_0x0076:
        r0.reset();
    L_0x0079:
        r0 = r8.k;
        r4 = r8.l;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0099;
    L_0x0083:
        r0 = r8.i;
        r4 = r8.j;
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0099;
    L_0x008d:
        r0 = r8.n;
        if (r0 == 0) goto L_0x00c5;
    L_0x0091:
        r4 = r8.o;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x00c5;
    L_0x0099:
        r8.C = r1;
        r0 = r8.k;
        r4 = r8.m;
        r0.invert(r4);
        r0 = r8.p;
        r4 = r8.k;
        r0.set(r4);
        r0 = r8.p;
        r4 = r8.i;
        r0.preConcat(r4);
        r0 = r8.l;
        r4 = r8.k;
        r0.set(r4);
        r0 = r8.j;
        r4 = r8.i;
        r0.set(r4);
        r0 = r8.o;
        if (r0 == 0) goto L_0x00c5;
    L_0x00c2:
        r0.reset();
    L_0x00c5:
        r0 = r8.e;
        r4 = r8.f;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x00d8;
    L_0x00cf:
        r8.z = r1;
        r0 = r8.f;
        r4 = r8.e;
        r0.set(r4);
    L_0x00d8:
        r0 = r8.z;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 == 0) goto L_0x0160;
    L_0x00de:
        r0 = r8.a;
        if (r0 == 0) goto L_0x0102;
    L_0x00e2:
        r0 = r8.v;
        r5 = r8.e;
        r0.set(r5);
        r0 = r8.v;
        r0.inset(r3, r3);
        r0 = r8.w;
        r5 = r8.e;
        r0.set(r5);
        r0 = r8.w;
        r5 = r8.q;
        r6 = r5 / r4;
        r5 = r5 / r4;
        r0.inset(r6, r5);
    L_0x00ff:
        r8.z = r2;
        goto L_0x0160;
    L_0x0102:
        r0 = r8.y;
        r0.reset();
        r0 = r8.e;
        r5 = r8.q;
        r6 = r5 / r4;
        r5 = r5 / r4;
        r0.inset(r6, r5);
        r0 = 0;
    L_0x0112:
        r5 = 8;
        if (r0 >= r5) goto L_0x0126;
    L_0x0116:
        r5 = r8.d;
        r6 = r8.c;
        r6 = r6[r0];
        r6 = r6 + r3;
        r7 = r8.q;
        r7 = r7 / r4;
        r6 = r6 - r7;
        r5[r0] = r6;
        r0 = r0 + 1;
        goto L_0x0112;
    L_0x0126:
        r0 = r8.y;
        r5 = r8.e;
        r6 = r8.d;
        r7 = android.graphics.Path.Direction.CW;
        r0.addRoundRect(r5, r6, r7);
        r0 = r8.e;
        r5 = r8.q;
        r6 = -r5;
        r6 = r6 / r4;
        r5 = -r5;
        r5 = r5 / r4;
        r0.inset(r6, r5);
        r0 = r8.x;
        r0.reset();
        r0 = r8.e;
        r0.inset(r3, r3);
        r0 = r8.x;
        r5 = r8.e;
        r6 = r8.c;
        r7 = android.graphics.Path.Direction.CW;
        r0.addRoundRect(r5, r6, r7);
        r0 = r8.e;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0.inset(r5, r5);
        r0 = r8.x;
        r5 = android.graphics.Path.FillType.WINDING;
        r0.setFillType(r5);
        goto L_0x00ff;
    L_0x0160:
        r0 = r8.getBitmap();
        r5 = r8.D;
        if (r5 == 0) goto L_0x016e;
    L_0x0168:
        r5 = r5.get();
        if (r5 == r0) goto L_0x0183;
    L_0x016e:
        r5 = new java.lang.ref.WeakReference;
        r5.<init>(r0);
        r8.D = r5;
        r5 = r8.A;
        r6 = new android.graphics.BitmapShader;
        r7 = android.graphics.Shader.TileMode.CLAMP;
        r6.<init>(r0, r7, r7);
        r5.setShader(r6);
        r8.C = r1;
    L_0x0183:
        r0 = r8.C;
        if (r0 == 0) goto L_0x0194;
    L_0x0187:
        r0 = r8.A;
        r0 = r0.getShader();
        r1 = r8.p;
        r0.setLocalMatrix(r1);
        r8.C = r2;
    L_0x0194:
        r0 = r9.save();
        r1 = r8.m;
        r9.concat(r1);
        r1 = r8.a;
        if (r1 == 0) goto L_0x01c4;
    L_0x01a1:
        r1 = r8.v;
        r1 = r1.centerX();
        r2 = r8.v;
        r2 = r2.centerY();
        r5 = r8.v;
        r5 = r5.width();
        r6 = r8.v;
        r6 = r6.height();
        r5 = java.lang.Math.min(r5, r6);
        r5 = r5 / r4;
        r6 = r8.A;
        r9.drawCircle(r1, r2, r5, r6);
        goto L_0x01cb;
    L_0x01c4:
        r1 = r8.x;
        r2 = r8.A;
        r9.drawPath(r1, r2);
    L_0x01cb:
        r1 = r8.q;
        r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x0218;
    L_0x01d1:
        r2 = r8.B;
        r2.setStrokeWidth(r1);
        r1 = r8.B;
        r2 = r8.r;
        r3 = r8.A;
        r3 = r3.getAlpha();
        r2 = defpackage.kbb.a(r2, r3);
        r1.setColor(r2);
        r1 = r8.a;
        if (r1 == 0) goto L_0x0211;
    L_0x01eb:
        r1 = r8.w;
        r1 = r1.width();
        r2 = r8.w;
        r2 = r2.height();
        r1 = java.lang.Math.min(r1, r2);
        r1 = r1 / r4;
        r2 = r8.s;
        r1 = r1 + r2;
        r2 = r8.w;
        r2 = r2.centerX();
        r3 = r8.w;
        r3 = r3.centerY();
        r4 = r8.B;
        r9.drawCircle(r2, r3, r1, r4);
        goto L_0x0218;
    L_0x0211:
        r1 = r8.y;
        r2 = r8.B;
        r9.drawPath(r1, r2);
    L_0x0218:
        r9.restoreToCount(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbe.draw(android.graphics.Canvas):void");
    }

    public final void setAlpha(int i) {
        if (i != this.A.getAlpha()) {
            this.A.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A.setColorFilter(colorFilter);
        super.setColorFilter(colorFilter);
    }
}
