package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View.OnTouchListener;

/* renamed from: emv */
public final class emv implements OnTouchListener {
    boolean a;
    private final OnTouchListener b;
    private final dqe c;
    private final GestureDetector d;
    private final GestureDetector e;
    private final ScaleGestureDetector f;

    public emv(Context context, OnTouchListener onTouchListener, final dqe dqe) {
        this.b = onTouchListener;
        this.c = dqe;
        this.d = new GestureDetector(context, new SimpleOnGestureListener() {
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                dqe.b((int) motionEvent.getX(), (int) motionEvent.getY());
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
                dqe.c((int) motionEvent.getX(), (int) motionEvent.getY());
                emv.this.a = true;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                dqe.a((int) motionEvent.getX(), (int) motionEvent.getY());
                return true;
            }
        });
        this.e = new GestureDetector(context, new SimpleOnGestureListener() {
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                dqe.a(f2);
                return true;
            }
        });
        this.e.setIsLongpressEnabled(false);
        this.f = new ScaleGestureDetector(context, new SimpleOnScaleGestureListener() {
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                dqe.b(scaleGestureDetector.getScaleFactor());
                return true;
            }
        });
    }

    /* JADX WARNING: Missing block: B:12:0x002f, code skipped:
            if (r3 != 3) goto L_0x0051;
     */
    public final boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
        /*
        r2 = this;
        r0 = r4.getAction();
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r0 = 0;
        r2.a = r0;
    L_0x0009:
        r0 = r2.b;
        r3 = r0.onTouch(r3, r4);
        r0 = 1;
        if (r3 != 0) goto L_0x0051;
    L_0x0012:
        r3 = r2.d;
        r3.onTouchEvent(r4);
        r3 = r2.e;
        r3.onTouchEvent(r4);
        r3 = r2.f;
        r3.onTouchEvent(r4);
        r3 = r2.a;
        if (r3 == 0) goto L_0x0051;
    L_0x0025:
        r3 = r4.getAction();
        if (r3 == r0) goto L_0x0042;
    L_0x002b:
        r1 = 2;
        if (r3 == r1) goto L_0x0032;
    L_0x002e:
        r1 = 3;
        if (r3 == r1) goto L_0x0042;
    L_0x0031:
        goto L_0x0051;
    L_0x0032:
        r3 = r2.c;
        r1 = r4.getX();
        r1 = (int) r1;
        r4 = r4.getY();
        r4 = (int) r4;
        r3.d(r1, r4);
        goto L_0x0051;
    L_0x0042:
        r3 = r2.c;
        r1 = r4.getX();
        r1 = (int) r1;
        r4 = r4.getY();
        r4 = (int) r4;
        r3.e(r1, r4);
    L_0x0051:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emv.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
