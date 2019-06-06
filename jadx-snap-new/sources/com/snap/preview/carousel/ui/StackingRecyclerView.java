package com.snap.preview.carousel.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.ajwl;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class StackingRecyclerView extends RecyclerView {
    public Integer a;
    private final int b;
    private final ajxe c;
    private Float d;

    static final class b extends akcs implements akbk<ajwl<a>> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwl.i(a.OFF);
        }
    }

    public enum a {
        ON(true),
        OFF(false),
        STACKED_SWIPING(true);
        
        public final boolean isStacking;

        private a(boolean z) {
            this.isStacking = z;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(StackingRecyclerView.class), "stackingStateSubject", "getStackingStateSubject()Lio/reactivex/subjects/BehaviorSubject;");
    }

    public StackingRecyclerView(Context context) {
        akcr.b(context, "context");
        this(context, null);
    }

    public StackingRecyclerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private StackingRecyclerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        Object obj = ViewConfiguration.get(getContext());
        akcr.a(obj, "ViewConfiguration.get(context)");
        this.b = obj.getScaledTouchSlop();
        this.c = ajxh.a(b.a);
    }

    public static MotionEvent a(MotionEvent motionEvent, int i) {
        long downTime;
        long eventTime;
        int i2;
        Object obtain;
        int actionMasked = motionEvent.getActionMasked();
        String str = "MotionEvent.obtain(e.dow…ingerIndex), e.metaState)";
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                downTime = motionEvent.getDownTime();
                eventTime = motionEvent.getEventTime();
                i2 = 2;
                obtain = MotionEvent.obtain(downTime, eventTime, i2, motionEvent.getX(i), motionEvent.getY(i), motionEvent.getMetaState());
                akcr.a(obtain, str);
                return obtain;
            } else if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return motionEvent;
                }
                obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(i), motionEvent.getY(i), motionEvent.getMetaState());
                akcr.a(obtain, str);
                return obtain;
            }
        }
        downTime = motionEvent.getDownTime();
        eventTime = motionEvent.getEventTime();
        i2 = 0;
        obtain = MotionEvent.obtain(downTime, eventTime, i2, motionEvent.getX(i), motionEvent.getY(i), motionEvent.getMetaState());
        akcr.a(obtain, str);
        return obtain;
    }

    public final ajwl<a> a() {
        return (ajwl) this.c.b();
    }

    /* JADX WARNING: Missing block: B:9:0x0011, code skipped:
            if (r0 != 6) goto L_0x0042;
     */
    public final boolean a(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r6.getActionMasked();
        if (r0 == 0) goto L_0x0038;
    L_0x0006:
        r1 = 0;
        r2 = 1;
        if (r0 == r2) goto L_0x0035;
    L_0x000a:
        r3 = 2;
        if (r0 == r3) goto L_0x0014;
    L_0x000d:
        r2 = 5;
        if (r0 == r2) goto L_0x0038;
    L_0x0010:
        r2 = 6;
        if (r0 == r2) goto L_0x0035;
    L_0x0013:
        goto L_0x0042;
    L_0x0014:
        r0 = r5.d;
        if (r0 == 0) goto L_0x0035;
    L_0x0018:
        r0 = (java.lang.Number) r0;
        r0 = r0.floatValue();
        r3 = r6.getX();
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r3 = r5.b;
        r3 = (float) r3;
        r4 = 0;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0031;
    L_0x002f:
        r0 = 1;
        goto L_0x0032;
    L_0x0031:
        r0 = 0;
    L_0x0032:
        if (r0 != r2) goto L_0x0035;
    L_0x0034:
        return r4;
    L_0x0035:
        r5.d = r1;
        goto L_0x0042;
    L_0x0038:
        r0 = r6.getX();
        r0 = java.lang.Float.valueOf(r0);
        r5.d = r0;
    L_0x0042:
        r6 = super.onTouchEvent(r6);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.preview.carousel.ui.StackingRecyclerView.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        a().a(a.OFF);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
