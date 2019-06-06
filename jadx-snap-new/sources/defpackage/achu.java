package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: achu */
public final class achu implements achn, OnScaleGestureListener {
    achr a;
    public a b;
    private ScaleGestureDetector c = new ScaleGestureDetector(this.f.getContext(), this);
    private boolean d;
    private Boolean e;
    private final View f;

    /* renamed from: achu$a */
    public interface a {
        void a(achr achr, float f);

        boolean a(achr achr);

        void b(achr achr);

        void b(achr achr, float f);

        void c(achr achr);

        boolean d(achr achr);
    }

    public achu(View view) {
        akcr.b(view, "rootView");
        this.f = view;
    }

    private final boolean a(View view, int i, int i2, float f) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                Object childAt = viewGroup.getChildAt(childCount);
                akcr.a(childAt, "child");
                if (a(childAt, i - childAt.getLeft(), i2 - childAt.getTop(), f)) {
                    return true;
                }
            }
        }
        return (view instanceof achm) && ((achm) view).a();
    }

    public final boolean a(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        this.c.onTouchEvent(motionEvent);
        return this.a != null;
    }

    /* JADX WARNING: Missing block: B:52:0x00b6, code skipped:
            if (r10.a(r4) != false) goto L_0x0066;
     */
    public final boolean onScale(android.view.ScaleGestureDetector r10) {
        /*
        r9 = this;
        r0 = "detector";
        defpackage.akcr.b(r10, r0);
        r0 = r9.d;
        r1 = 0;
        if (r0 != 0) goto L_0x00b9;
    L_0x000a:
        r0 = r9.e;
        r2 = java.lang.Boolean.FALSE;
        r0 = defpackage.akcr.a(r0, r2);
        if (r0 == 0) goto L_0x0016;
    L_0x0014:
        goto L_0x00b9;
    L_0x0016:
        r0 = r10.getFocusX();
        r0 = (int) r0;
        r2 = r10.getFocusY();
        r2 = (int) r2;
        r10 = r10.getScaleFactor();
        r3 = r9.f;
        r0 = r9.a(r3, r0, r2, r10);
        r9.d = r0;
        r0 = r9.d;
        if (r0 == 0) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r0 = r9.a;
        r2 = 1065437102; // 0x3f8147ae float:1.01 double:5.2639587E-315;
        r3 = 1065185444; // 0x3f7d70a4 float:0.99 double:5.262715343E-315;
        r4 = 0;
        r5 = "delegate";
        if (r0 == 0) goto L_0x0074;
    L_0x003e:
        r6 = 1;
        if (r0 != 0) goto L_0x0042;
    L_0x0041:
        goto L_0x004f;
    L_0x0042:
        r7 = defpackage.achv.a;
        r8 = r0.ordinal();
        r7 = r7[r8];
        if (r7 == r6) goto L_0x0056;
    L_0x004c:
        r3 = 2;
        if (r7 == r3) goto L_0x0051;
    L_0x004f:
        r6 = 0;
        goto L_0x005a;
    L_0x0051:
        r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x004f;
    L_0x0055:
        goto L_0x005a;
    L_0x0056:
        r2 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r2 < 0) goto L_0x004f;
    L_0x005a:
        if (r6 == 0) goto L_0x0069;
    L_0x005c:
        r10 = r9.b;
        if (r10 != 0) goto L_0x0063;
    L_0x0060:
        defpackage.akcr.a(r5);
    L_0x0063:
        r10.b(r0);
    L_0x0066:
        r9.a = r4;
        goto L_0x00b9;
    L_0x0069:
        r2 = r9.b;
        if (r2 != 0) goto L_0x0070;
    L_0x006d:
        defpackage.akcr.a(r5);
    L_0x0070:
        r2.a(r0, r10);
        goto L_0x00b9;
    L_0x0074:
        if (r0 != 0) goto L_0x0083;
    L_0x0076:
        r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x007d;
    L_0x007a:
        r4 = defpackage.achr.PINCH_OUT;
        goto L_0x0083;
    L_0x007d:
        r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r10 <= 0) goto L_0x0083;
    L_0x0081:
        r4 = defpackage.achr.PINCH_IN;
    L_0x0083:
        if (r4 == 0) goto L_0x00b9;
    L_0x0085:
        r10 = r9.b;
        if (r10 != 0) goto L_0x008c;
    L_0x0089:
        defpackage.akcr.a(r5);
    L_0x008c:
        r10 = r10.d(r4);
        r10 = java.lang.Boolean.valueOf(r10);
        r9.e = r10;
        r10 = r9.e;
        r0 = java.lang.Boolean.FALSE;
        r10 = defpackage.akcr.a(r10, r0);
        if (r10 == 0) goto L_0x00ab;
    L_0x00a0:
        r10 = r9.b;
        if (r10 != 0) goto L_0x00a7;
    L_0x00a4:
        defpackage.akcr.a(r5);
    L_0x00a7:
        r10.c(r4);
        return r1;
    L_0x00ab:
        r10 = r9.b;
        if (r10 != 0) goto L_0x00b2;
    L_0x00af:
        defpackage.akcr.a(r5);
    L_0x00b2:
        r10 = r10.a(r4);
        if (r10 == 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x0066;
    L_0x00b9:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achu.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        this.a = null;
        this.d = false;
        this.e = null;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        achr achr = this.a;
        if (achr != null) {
            a aVar = this.b;
            if (aVar == null) {
                akcr.a("delegate");
            }
            aVar.b(achr, scaleGestureDetector.getScaleFactor());
        }
        this.a = null;
    }
}
