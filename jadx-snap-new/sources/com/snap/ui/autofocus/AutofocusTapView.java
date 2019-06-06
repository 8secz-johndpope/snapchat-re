package com.snap.ui.autofocus;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.kr;

public class AutofocusTapView extends View {
    private final Paint a = new Paint();
    private final Paint b;
    private final float c;
    private final float d;
    private long e;
    private final int f;
    private boolean g = true;
    private float h;
    private float i;
    private int j;
    private int k;
    private final float l;
    private final AccelerateDecelerateInterpolator m;
    private final DecelerateInterpolator n;
    private final Interpolator o;
    private final int p;
    private final Runnable q = new Runnable() {
        public final void run() {
            AutofocusTapView.this.invalidate();
        }
    };

    public AutofocusTapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a.setAntiAlias(true);
        this.a.setStyle(Style.FILL);
        this.b = new Paint();
        this.b.setAntiAlias(true);
        this.b.setStyle(Style.STROKE);
        setLayerType(1, this.b);
        this.f = (int) context.getResources().getDimension(R.dimen.autofocus_hold_anim_size);
        this.m = new AccelerateDecelerateInterpolator(context, attributeSet);
        this.n = new DecelerateInterpolator(context, attributeSet);
        this.o = kr.a(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f);
        this.l = abtp.a(1.0f, context);
        this.p = (int) getContext().getResources().getDimension(R.dimen.autofocus_crosshair_square_size);
        int i = this.p;
        this.c = (float) (i / 2);
        this.d = (float) (i / 2);
    }

    public final void a(float f, float f2) {
        setVisibility(0);
        setX(f - (((float) this.p) / 2.0f));
        setY(f2 - (((float) this.p) / 2.0f));
        this.e = SystemClock.elapsedRealtime();
        removeCallbacks(this.q);
        post(this.q);
        this.g = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    public void onDraw(android.graphics.Canvas r11) {
        /*
        r10 = this;
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r10.e;
        r0 = r0 - r2;
        r2 = r10.g;
        if (r2 == 0) goto L_0x000e;
    L_0x000b:
        r10.invalidate();
    L_0x000e:
        r0 = (float) r0;
        r1 = 0;
        r2 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r3 = 1126629376; // 0x43270000 float:167.0 double:5.566288703E-315;
        r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r4 >= 0) goto L_0x0028;
    L_0x0018:
        r4 = r10.o;
        r5 = r0 / r3;
        r4 = r4.getInterpolation(r5);
    L_0x0020:
        r4 = r4 * r2;
        r2 = java.lang.Math.round(r4);
    L_0x0025:
        r10.k = r2;
        goto L_0x004f;
    L_0x0028:
        r4 = 1143406592; // 0x44270000 float:668.0 double:5.649179163E-315;
        r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r5 >= 0) goto L_0x0031;
    L_0x002e:
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        goto L_0x0025;
    L_0x0031:
        r5 = 1146142720; // 0x4450c000 float:835.0 double:5.66269743E-315;
        r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0044;
    L_0x0038:
        r5 = r10.m;
        r4 = r0 - r4;
        r4 = r3 - r4;
        r4 = r4 / r3;
        r4 = r5.getInterpolation(r4);
        goto L_0x0020;
    L_0x0044:
        r2 = r10.q;
        r10.removeCallbacks(r2);
        r10.g = r1;
        r2 = 4;
        r10.setVisibility(r2);
    L_0x004f:
        r2 = 1140490240; // 0x43fa8000 float:501.0 double:5.63477047E-315;
        r4 = 1135017984; // 0x43a70000 float:334.0 double:5.607733933E-315;
        r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r5 >= 0) goto L_0x006b;
    L_0x0058:
        r5 = r10.f;
        r5 = (float) r5;
        r6 = r10.o;
        r7 = r0 / r4;
        r6 = r6.getInterpolation(r7);
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r6 * r7;
        r6 = r6 + r7;
        r5 = r5 * r6;
        r10.i = r5;
        goto L_0x008d;
    L_0x006b:
        r5 = 1062501089; // 0x3f547ae1 float:0.83 double:5.249452867E-315;
        r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r6 >= 0) goto L_0x0087;
    L_0x0072:
        r6 = r10.f;
        r6 = (float) r6;
        r7 = 1043207291; // 0x3e2e147b float:0.17 double:5.15412884E-315;
        r8 = r10.m;
        r9 = r0 - r4;
        r9 = r3 - r9;
        r9 = r9 / r3;
        r8 = r8.getInterpolation(r9);
        r8 = r8 * r7;
        r8 = r8 + r5;
        r6 = r6 * r8;
        goto L_0x008b;
    L_0x0087:
        r6 = r10.f;
        r6 = (float) r6;
        r6 = r6 * r5;
    L_0x008b:
        r10.i = r6;
    L_0x008d:
        r5 = 1120665600; // 0x42cc0000 float:102.0 double:5.536823734E-315;
        r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r6 >= 0) goto L_0x00a3;
    L_0x0093:
        r1 = r10.n;
        r2 = r0 / r3;
        r1 = r1.getInterpolation(r2);
    L_0x009b:
        r1 = r1 * r5;
        r1 = java.lang.Math.round(r1);
    L_0x00a0:
        r10.j = r1;
        goto L_0x00b3;
    L_0x00a3:
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x00a0;
    L_0x00a7:
        r1 = r10.m;
        r2 = r0 - r3;
        r2 = r4 - r2;
        r2 = r2 / r4;
        r1 = r1.getInterpolation(r2);
        goto L_0x009b;
    L_0x00b3:
        r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x00c5;
    L_0x00b7:
        r1 = r10.f;
        r1 = (float) r1;
        r2 = r10.o;
        r0 = r0 / r4;
        r0 = r2.getInterpolation(r0);
        r1 = r1 * r0;
        r10.h = r1;
        goto L_0x00ca;
    L_0x00c5:
        r0 = r10.f;
        r0 = (float) r0;
        r10.h = r0;
    L_0x00ca:
        r0 = r10.b;
        r1 = -1;
        r0.setColor(r1);
        r0 = r10.b;
        r2 = r10.k;
        r0.setAlpha(r2);
        r0 = r10.b;
        r2 = r10.l;
        r0.setStrokeWidth(r2);
        r0 = r10.k;
        if (r0 <= 0) goto L_0x00f1;
    L_0x00e2:
        r0 = r10.b;
        r2 = r10.i;
        r3 = 1028443341; // 0x3d4ccccd float:0.05 double:5.081185235E-315;
        r2 = r2 * r3;
        r3 = -3355444; // 0xffffffffffcccccc float:NaN double:NaN;
        r4 = 0;
        r0.setShadowLayer(r2, r4, r4, r3);
    L_0x00f1:
        r0 = r10.c;
        r2 = r10.d;
        r3 = r10.i;
        r4 = r10.b;
        r11.drawCircle(r0, r2, r3, r4);
        r0 = r10.a;
        r0.setColor(r1);
        r0 = r10.a;
        r1 = r10.j;
        r0.setAlpha(r1);
        r0 = r10.c;
        r1 = r10.d;
        r2 = r10.h;
        r3 = r10.a;
        r11.drawCircle(r0, r1, r2, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.autofocus.AutofocusTapView.onDraw(android.graphics.Canvas):void");
    }
}
