package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: awy */
public final class awy extends awt {
    public int a;
    public int b;
    private final Drawable[] c;
    private long d;
    private int[] e;
    private int[] f;
    private int g;
    private boolean[] h;
    private int i;

    public awy(Drawable[] drawableArr) {
        super(drawableArr);
        auh.b(drawableArr.length > 0, "At least one layer required!");
        this.c = drawableArr;
        this.e = new int[drawableArr.length];
        this.f = new int[drawableArr.length];
        this.g = 255;
        this.h = new boolean[drawableArr.length];
        this.i = 0;
        this.a = 2;
        Arrays.fill(this.e, 0);
        this.e[0] = 255;
        Arrays.fill(this.f, 0);
        this.f[0] = 255;
        Arrays.fill(this.h, false);
        this.h[0] = true;
    }

    private boolean a(float f) {
        int i = 0;
        boolean z = true;
        while (i < this.c.length) {
            int i2 = this.h[i] ? 1 : -1;
            int[] iArr = this.f;
            iArr[i] = (int) (((float) this.e[i]) + (((float) (i2 * 255)) * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            int[] iArr2 = this.f;
            if (iArr2[i] > 255) {
                iArr2[i] = 255;
            }
            if (this.h[i] && this.f[i] < 255) {
                z = false;
            }
            if (!this.h[i] && this.f[i] > 0) {
                z = false;
            }
            i++;
        }
        return z;
    }

    public final void a() {
        this.i++;
    }

    public final void a(int i) {
        this.a = 0;
        this.h[i] = true;
        invalidateSelf();
    }

    public final void b() {
        this.i--;
        invalidateSelf();
    }

    public final void b(int i) {
        this.a = 0;
        this.h[i] = false;
        invalidateSelf();
    }

    public final void c() {
        this.a = 0;
        Arrays.fill(this.h, true);
        invalidateSelf();
    }

    public final void d() {
        this.a = 2;
        for (int i = 0; i < this.c.length; i++) {
            this.f[i] = this.h[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A:{SYNTHETIC, EDGE_INSN: B:27:0x0075->B:25:0x0075 ?: BREAK  , EDGE_INSN: B:27:0x0075->B:25:0x0075 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Missing block: B:9:0x0025, code skipped:
            if (r0 != false) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:15:0x0044, code skipped:
            if (r0 != false) goto L_0x0048;
     */
    public final void draw(android.graphics.Canvas r9) {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = 2;
        r2 = 0;
        r3 = 1;
        if (r0 == 0) goto L_0x0028;
    L_0x0007:
        if (r0 == r3) goto L_0x000b;
    L_0x0009:
        r0 = 1;
        goto L_0x004a;
    L_0x000b:
        r0 = r8.b;
        if (r0 <= 0) goto L_0x0011;
    L_0x000f:
        r0 = 1;
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        defpackage.auh.b(r0);
        r4 = android.os.SystemClock.uptimeMillis();
        r6 = r8.d;
        r4 = r4 - r6;
        r0 = (float) r4;
        r4 = r8.b;
        r4 = (float) r4;
        r0 = r0 / r4;
        r0 = r8.a(r0);
        if (r0 == 0) goto L_0x0047;
    L_0x0027:
        goto L_0x0048;
    L_0x0028:
        r0 = r8.f;
        r4 = r8.e;
        r5 = r8.c;
        r5 = r5.length;
        java.lang.System.arraycopy(r0, r2, r4, r2, r5);
        r4 = android.os.SystemClock.uptimeMillis();
        r8.d = r4;
        r0 = r8.b;
        if (r0 != 0) goto L_0x003f;
    L_0x003c:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0040;
    L_0x003f:
        r0 = 0;
    L_0x0040:
        r0 = r8.a(r0);
        if (r0 == 0) goto L_0x0047;
    L_0x0046:
        goto L_0x0048;
    L_0x0047:
        r1 = 1;
    L_0x0048:
        r8.a = r1;
    L_0x004a:
        r1 = r8.c;
        r4 = r1.length;
        if (r2 >= r4) goto L_0x0075;
    L_0x004f:
        r1 = r1[r2];
        r4 = r8.f;
        r4 = r4[r2];
        r5 = r8.g;
        r4 = r4 * r5;
        r4 = r4 / 255;
        if (r1 == 0) goto L_0x0072;
    L_0x005c:
        if (r4 <= 0) goto L_0x0072;
    L_0x005e:
        r5 = r8.i;
        r5 = r5 + r3;
        r8.i = r5;
        r5 = r1.mutate();
        r5.setAlpha(r4);
        r4 = r8.i;
        r4 = r4 - r3;
        r8.i = r4;
        r1.draw(r9);
    L_0x0072:
        r2 = r2 + 1;
        goto L_0x004a;
    L_0x0075:
        if (r0 != 0) goto L_0x007a;
    L_0x0077:
        r8.invalidateSelf();
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awy.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        return this.g;
    }

    public final void invalidateSelf() {
        if (this.i == 0) {
            super.invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.g != i) {
            this.g = i;
            invalidateSelf();
        }
    }
}
