package defpackage;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: cq */
public abstract class cq<V extends View> extends cx<V> {
    private Runnable a;
    OverScroller b;
    private boolean c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    /* renamed from: cq$a */
    class a implements Runnable {
        private final CoordinatorLayout a;
        private final V b;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.a = coordinatorLayout;
            this.b = v;
        }

        public final void run() {
            if (!(this.b == null || cq.this.b == null)) {
                if (cq.this.b.computeScrollOffset()) {
                    cq cqVar = cq.this;
                    cqVar.a_(this.a, this.b, cqVar.b.getCurrY());
                    kb.a(this.b, (Runnable) this);
                    return;
                }
                cq.this.a(this.a, this.b);
            }
        }
    }

    public cq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void d() {
        if (this.g == null) {
            this.g = VelocityTracker.obtain();
        }
    }

    /* Access modifiers changed, original: protected */
    public int a() {
        return c();
    }

    /* Access modifiers changed, original: protected */
    public int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int c = c();
        if (i2 != 0 && c >= i2 && c <= i3) {
            int a = id.a(i, i2, i3);
            if (c != a) {
                a_(a);
                return c - a;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public int a(V v) {
        return v.getHeight();
    }

    /* Access modifiers changed, original: protected */
    public void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* JADX WARNING: Missing block: B:14:0x002c, code skipped:
            if (r0 != 3) goto L_0x0081;
     */
    public final boolean a(android.support.design.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
        r4 = this;
        r0 = r4.f;
        if (r0 >= 0) goto L_0x0012;
    L_0x0004:
        r0 = r5.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r4.f = r0;
    L_0x0012:
        r0 = r7.getAction();
        r1 = 2;
        r2 = 1;
        if (r0 != r1) goto L_0x001f;
    L_0x001a:
        r0 = r4.c;
        if (r0 == 0) goto L_0x001f;
    L_0x001e:
        return r2;
    L_0x001f:
        r0 = r7.getActionMasked();
        r3 = 0;
        if (r0 == 0) goto L_0x005e;
    L_0x0026:
        r5 = -1;
        if (r0 == r2) goto L_0x004f;
    L_0x0029:
        if (r0 == r1) goto L_0x002f;
    L_0x002b:
        r6 = 3;
        if (r0 == r6) goto L_0x004f;
    L_0x002e:
        goto L_0x0081;
    L_0x002f:
        r6 = r4.d;
        if (r6 == r5) goto L_0x0081;
    L_0x0033:
        r6 = r7.findPointerIndex(r6);
        if (r6 == r5) goto L_0x0081;
    L_0x0039:
        r5 = r7.getY(r6);
        r5 = (int) r5;
        r6 = r4.e;
        r6 = r5 - r6;
        r6 = java.lang.Math.abs(r6);
        r0 = r4.f;
        if (r6 <= r0) goto L_0x0081;
    L_0x004a:
        r4.c = r2;
        r4.e = r5;
        goto L_0x0081;
    L_0x004f:
        r4.c = r3;
        r4.d = r5;
        r5 = r4.g;
        if (r5 == 0) goto L_0x0081;
    L_0x0057:
        r5.recycle();
        r5 = 0;
        r4.g = r5;
        goto L_0x0081;
    L_0x005e:
        r4.c = r3;
        r0 = r7.getX();
        r0 = (int) r0;
        r1 = r7.getY();
        r1 = (int) r1;
        r2 = r4.b();
        if (r2 == 0) goto L_0x0081;
    L_0x0070:
        r5 = r5.a(r6, r0, r1);
        if (r5 == 0) goto L_0x0081;
    L_0x0076:
        r4.e = r1;
        r5 = r7.getPointerId(r3);
        r4.d = r5;
        r4.d();
    L_0x0081:
        r5 = r4.g;
        if (r5 == 0) goto L_0x0088;
    L_0x0085:
        r5.addMovement(r7);
    L_0x0088:
        r5 = r4.c;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public final int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, v, a() - i, i2, i3);
    }

    /* Access modifiers changed, original: protected */
    public int b(V v) {
        return -v.getHeight();
    }

    /* Access modifiers changed, original: protected */
    public boolean b() {
        return false;
    }

    /* JADX WARNING: Missing block: B:10:0x002a, code skipped:
            if (r0 != 3) goto L_0x00f8;
     */
    public final boolean b(android.support.design.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
        r19 = this;
        r6 = r19;
        r1 = r20;
        r2 = r21;
        r7 = r22;
        r0 = r6.f;
        if (r0 >= 0) goto L_0x001a;
    L_0x000c:
        r0 = r20.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.getScaledTouchSlop();
        r6.f = r0;
    L_0x001a:
        r0 = r22.getActionMasked();
        r8 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x00d7;
    L_0x0022:
        r4 = 0;
        r5 = -1;
        if (r0 == r8) goto L_0x0068;
    L_0x0026:
        r9 = 2;
        if (r0 == r9) goto L_0x002e;
    L_0x0029:
        r1 = 3;
        if (r0 == r1) goto L_0x00c9;
    L_0x002c:
        goto L_0x00f8;
    L_0x002e:
        r0 = r6.d;
        r0 = r7.findPointerIndex(r0);
        if (r0 != r5) goto L_0x0037;
    L_0x0036:
        return r3;
    L_0x0037:
        r0 = r7.getY(r0);
        r0 = (int) r0;
        r3 = r6.e;
        r3 = r3 - r0;
        r4 = r6.c;
        if (r4 != 0) goto L_0x0052;
    L_0x0043:
        r4 = java.lang.Math.abs(r3);
        r5 = r6.f;
        if (r4 <= r5) goto L_0x0052;
    L_0x004b:
        r6.c = r8;
        if (r3 <= 0) goto L_0x0051;
    L_0x004f:
        r3 = r3 - r5;
        goto L_0x0052;
    L_0x0051:
        r3 = r3 + r5;
    L_0x0052:
        r4 = r6.c;
        if (r4 == 0) goto L_0x00f8;
    L_0x0056:
        r6.e = r0;
        r4 = r6.b(r2);
        r5 = 0;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r0.b(r1, r2, r3, r4, r5);
        goto L_0x00f8;
    L_0x0068:
        r0 = r6.g;
        if (r0 == 0) goto L_0x00c9;
    L_0x006c:
        r0.addMovement(r7);
        r0 = r6.g;
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.computeCurrentVelocity(r9);
        r0 = r6.g;
        r9 = r6.d;
        r0 = r0.getYVelocity(r9);
        r9 = r6.a(r2);
        r9 = -r9;
        r10 = r6.a;
        if (r10 == 0) goto L_0x008c;
    L_0x0087:
        r2.removeCallbacks(r10);
        r6.a = r4;
    L_0x008c:
        r10 = r6.b;
        if (r10 != 0) goto L_0x009b;
    L_0x0090:
        r10 = new android.widget.OverScroller;
        r11 = r21.getContext();
        r10.<init>(r11);
        r6.b = r10;
    L_0x009b:
        r10 = r6.b;
        r11 = 0;
        r12 = r19.c();
        r13 = 0;
        r14 = java.lang.Math.round(r0);
        r15 = 0;
        r16 = 0;
        r18 = 0;
        r17 = r9;
        r10.fling(r11, r12, r13, r14, r15, r16, r17, r18);
        r0 = r6.b;
        r0 = r0.computeScrollOffset();
        if (r0 == 0) goto L_0x00c6;
    L_0x00b9:
        r0 = new cq$a;
        r0.<init>(r1, r2);
        r6.a = r0;
        r0 = r6.a;
        defpackage.kb.a(r2, r0);
        goto L_0x00c9;
    L_0x00c6:
        r19.a(r20, r21);
    L_0x00c9:
        r6.c = r3;
        r6.d = r5;
        r0 = r6.g;
        if (r0 == 0) goto L_0x00f8;
    L_0x00d1:
        r0.recycle();
        r6.g = r4;
        goto L_0x00f8;
    L_0x00d7:
        r0 = r22.getX();
        r0 = (int) r0;
        r4 = r22.getY();
        r4 = (int) r4;
        r0 = r1.a(r2, r0, r4);
        if (r0 == 0) goto L_0x0100;
    L_0x00e7:
        r0 = r19.b();
        if (r0 == 0) goto L_0x0100;
    L_0x00ed:
        r6.e = r4;
        r0 = r7.getPointerId(r3);
        r6.d = r0;
        r19.d();
    L_0x00f8:
        r0 = r6.g;
        if (r0 == 0) goto L_0x00ff;
    L_0x00fc:
        r0.addMovement(r7);
    L_0x00ff:
        return r8;
    L_0x0100:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
