package com.snap.camera.subcomponents.cameramode.portrait;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;

public class FaceDetectionBoxView extends View {
    public List<Rect> a;
    public boolean b = false;
    private Bitmap c;
    private final Paint d = new Paint();
    private final Matrix e = new Matrix();
    private final Interpolator f = new LinearInterpolator();
    private boolean g = false;
    private long h;
    private long i;
    private float j = MapboxConstants.MINIMUM_ZOOM;

    public FaceDetectionBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3) {
        this.e.reset();
        this.e.postRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        this.e.postTranslate((float) i2, (float) i3);
        canvas.drawBitmap(bitmap, this.e, this.d);
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A:{SYNTHETIC, RETURN} */
    public void onDraw(android.graphics.Canvas r10) {
        /*
        r9 = this;
        r0 = r9.b;
        if (r0 == 0) goto L_0x00fd;
    L_0x0004:
        r0 = r9.a;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x00fd;
    L_0x000a:
        r0 = r9.g;
        if (r0 != 0) goto L_0x0017;
    L_0x000e:
        r0 = 1;
        r9.g = r0;
        r0 = android.os.SystemClock.elapsedRealtime();
        r9.h = r0;
    L_0x0017:
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r9.h;
        r0 = r0 - r2;
        r9.i = r0;
        r0 = r9.i;
        r2 = 7000; // 0x1b58 float:9.809E-42 double:3.4585E-320;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0032;
    L_0x0028:
        r0 = android.os.SystemClock.elapsedRealtime();
        r9.h = r0;
        r0 = 0;
        r9.i = r0;
    L_0x0032:
        r0 = r9.i;
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r6 = 0;
        r7 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r8 >= 0) goto L_0x004b;
    L_0x003d:
        r2 = r9.f;
        r0 = (float) r0;
    L_0x0040:
        r0 = r0 / r7;
        r0 = r2.getInterpolation(r0);
    L_0x0045:
        r9.j = r0;
        r9.invalidate();
        goto L_0x0065;
    L_0x004b:
        r4 = 1800; // 0x708 float:2.522E-42 double:8.893E-321;
        r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r8 >= 0) goto L_0x0054;
    L_0x0051:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0045;
    L_0x0054:
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r8 >= 0) goto L_0x005f;
    L_0x005a:
        r2 = r9.f;
        r4 = r4 - r0;
        r0 = (float) r4;
        goto L_0x0040;
    L_0x005f:
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x0065;
    L_0x0063:
        r9.j = r6;
    L_0x0065:
        r0 = r9.j;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00fd;
    L_0x006b:
        r0 = r9.c;
        if (r0 == 0) goto L_0x0075;
    L_0x006f:
        r0 = r0.isRecycled();
        if (r0 == 0) goto L_0x0086;
    L_0x0075:
        r0 = r9.getContext();
        r0 = r0.getResources();
        r1 = 2131231490; // 0x7f080302 float:1.8079062E38 double:1.0529682625E-314;
        r0 = android.graphics.BitmapFactory.decodeResource(r0, r1);
        r9.c = r0;
    L_0x0086:
        r0 = r9.c;
        r1 = r9.a;
        r7 = r1.iterator();
    L_0x008e:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x00fd;
    L_0x0094:
        r1 = r7.next();
        r8 = r1;
        r8 = (android.graphics.Rect) r8;
        r1 = r0.getWidth();
        r1 = (float) r1;
        r2 = r8.width();
        r2 = (float) r2;
        r1 = r1 / r2;
        r2 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 >= 0) goto L_0x008e;
    L_0x00ad:
        r1 = r9.j;
        r2 = r9.d;
        r3 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r1 = r1 * r3;
        r1 = (int) r1;
        r2.setAlpha(r1);
        r4 = 90;
        r5 = r8.left;
        r6 = r8.top;
        r1 = r9;
        r2 = r10;
        r3 = r0;
        r1.a(r2, r3, r4, r5, r6);
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r1 = r8.right;
        r2 = r0.getWidth();
        r5 = r1 - r2;
        r6 = r8.top;
        r1 = r9;
        r2 = r10;
        r1.a(r2, r3, r4, r5, r6);
        r4 = 0;
        r5 = r8.left;
        r1 = r8.bottom;
        r2 = r0.getHeight();
        r6 = r1 - r2;
        r1 = r9;
        r2 = r10;
        r1.a(r2, r3, r4, r5, r6);
        r4 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r1 = r8.right;
        r2 = r0.getWidth();
        r5 = r1 - r2;
        r1 = r8.bottom;
        r2 = r0.getHeight();
        r6 = r1 - r2;
        r1 = r9;
        r2 = r10;
        r1.a(r2, r3, r4, r5, r6);
        goto L_0x008e;
    L_0x00fd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.camera.subcomponents.cameramode.portrait.FaceDetectionBoxView.onDraw(android.graphics.Canvas):void");
    }

    /* Access modifiers changed, original: protected */
    public void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            this.b = true;
            return;
        }
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
            this.c = null;
        }
        this.b = false;
        this.g = false;
        this.a = null;
    }
}
