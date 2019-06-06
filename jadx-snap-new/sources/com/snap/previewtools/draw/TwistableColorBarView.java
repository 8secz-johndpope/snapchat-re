package com.snap.previewtools.draw;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class TwistableColorBarView extends ImageView {
    private boolean a;
    private final PointF b = new PointF();
    private final PointF c = new PointF();
    private ValueAnimator d;
    private final Rect e;
    private final ajxe f;

    static final class b implements AnimatorUpdateListener {
        private /* synthetic */ TwistableColorBarView a;

        b(TwistableColorBarView twistableColorBarView) {
            this.a = twistableColorBarView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.invalidate();
        }
    }

    static final class a extends akcs implements akbk<float[]> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return new float[84];
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(TwistableColorBarView.class), "meshVertices", "getMeshVertices()[F");
    }

    public TwistableColorBarView(Context context, AttributeSet attributeSet) {
        String str = "context";
        akcr.b(context, str);
        super(context, attributeSet);
        Rect rect = new Rect();
        Object context2 = getContext();
        akcr.a(context2, str);
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.drawing_color_picker_within_picker_touch_tolerance);
        int i = -dimensionPixelSize;
        Object context3 = getContext();
        akcr.a(context3, str);
        int dimensionPixelSize2 = context3.getResources().getDimensionPixelSize(R.dimen.drawing_color_picker_width) + dimensionPixelSize;
        Object context4 = getContext();
        akcr.a(context4, str);
        rect.set(i, i, dimensionPixelSize2, context4.getResources().getDimensionPixelSize(R.dimen.drawing_color_picker_height) + dimensionPixelSize);
        this.e = rect;
        this.f = ajxh.a(a.a);
    }

    private final float[] a() {
        return (float[]) this.f.b();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z;
            if (action == 1) {
                z = false;
            } else if (action == 2) {
                z = this.e.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                ValueAnimator valueAnimator;
                if (z) {
                    valueAnimator = this.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.c.x = motionEvent.getX();
                    this.c.y = motionEvent.getY();
                } else if (this.a) {
                    valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
                    valueAnimator.setDuration(50);
                    valueAnimator.setInterpolator(new AccelerateInterpolator());
                    valueAnimator.addUpdateListener(new b(this));
                    valueAnimator.start();
                    this.d = valueAnimator;
                }
            }
            this.a = z;
        } else {
            this.b.x = motionEvent.getX();
            this.b.y = motionEvent.getY();
        }
        invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Missing block: B:5:0x0016, code skipped:
            if (r2.isRunning() == true) goto L_0x0018;
     */
    public final void draw(android.graphics.Canvas r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = "canvas";
        defpackage.akcr.b(r1, r2);
        r2 = r0.a;
        r3 = 1;
        if (r2 != 0) goto L_0x0018;
    L_0x000e:
        r2 = r0.d;
        if (r2 == 0) goto L_0x00de;
    L_0x0012:
        r2 = r2.isRunning();
        if (r2 != r3) goto L_0x00de;
    L_0x0018:
        r2 = r19.getBackground();
        r2 = r2 instanceof android.graphics.drawable.BitmapDrawable;
        if (r2 == 0) goto L_0x00de;
    L_0x0020:
        r2 = r19.getBackground();
        if (r2 == 0) goto L_0x00d6;
    L_0x0026:
        r2 = (android.graphics.drawable.BitmapDrawable) r2;
        r2 = r2.getBitmap();
        r4 = r19.getWidth();
        r4 = (float) r4;
        r5 = "bitmap";
        defpackage.akcr.a(r2, r5);
        r5 = r2.getWidth();
        r5 = (float) r5;
        r4 = r4 / r5;
        r5 = r19.getHeight();
        r5 = (float) r5;
        r6 = r2.getHeight();
        r6 = (float) r6;
        r5 = r5 / r6;
        r1.scale(r4, r5);
        r4 = r0.d;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r4 == 0) goto L_0x0069;
    L_0x0050:
        r4 = r4.isRunning();
        if (r4 != r3) goto L_0x0069;
    L_0x0056:
        r4 = r0.d;
        if (r4 == 0) goto L_0x005f;
    L_0x005a:
        r4 = r4.getAnimatedValue();
        goto L_0x0060;
    L_0x005f:
        r4 = 0;
    L_0x0060:
        r4 = (java.lang.Float) r4;
        if (r4 == 0) goto L_0x0069;
    L_0x0064:
        r4 = r4.floatValue();
        goto L_0x006b;
    L_0x0069:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x006b:
        r7 = r0.c;
        r7 = r7.x;
        r8 = r0.b;
        r8 = r8.x;
        r7 = r7 - r8;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = r7 * r8;
        r7 = r7 * r4;
        r4 = r0.c;
        r4 = r4.y;
        r4 = r4 / r5;
        r5 = r19.a();
        r8 = r2.getWidth();
        r8 = (float) r8;
        r9 = r2.getHeight();
        r9 = (float) r9;
        r10 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r10 = r9 / r10;
        r12 = 0;
    L_0x0090:
        r13 = 20;
        if (r12 > r13) goto L_0x00c5;
    L_0x0094:
        r13 = (float) r12;
        r13 = r13 * r10;
        r14 = 0;
    L_0x0097:
        if (r14 > r3) goto L_0x00c1;
    L_0x0099:
        r15 = r12 << 1;
        r15 = r15 + r14;
        r15 = r15 << r3;
        r16 = r15 + 1;
        r17 = r4 - r13;
        r3 = 0;
        r18 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1));
        if (r18 < 0) goto L_0x00a9;
    L_0x00a6:
        r17 = r17 / r4;
        goto L_0x00ad;
    L_0x00a9:
        r18 = r9 - r4;
        r17 = r17 / r18;
    L_0x00ad:
        r17 = r17 * r17;
        r11 = r6 - r17;
        r3 = defpackage.abpf.a(r11, r3, r6);
        r11 = (float) r14;
        r11 = r11 * r8;
        r3 = r3 * r7;
        r11 = r11 + r3;
        r5[r15] = r11;
        r5[r16] = r13;
        r14 = r14 + 1;
        r3 = 1;
        goto L_0x0097;
    L_0x00c1:
        r12 = r12 + 1;
        r3 = 1;
        goto L_0x0090;
    L_0x00c5:
        r3 = 1;
        r4 = 20;
        r5 = r19.a();
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1 = r20;
        r1.drawBitmapMesh(r2, r3, r4, r5, r6, r7, r8, r9);
        return;
    L_0x00d6:
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable";
        r1.<init>(r2);
        throw r1;
    L_0x00de:
        super.draw(r20);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.previewtools.draw.TwistableColorBarView.draw(android.graphics.Canvas):void");
    }
}
