package com.snapchat.android.framework.ui.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class PullToRefreshLayout extends FrameLayout {
    final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList();
    public View b;
    float c;
    private final Property<View, Float> d = new Property<View, Float>(Float.class, "") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(PullToRefreshLayout.this.c);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            Float f = (Float) obj2;
            ((View) obj).setTranslationY(f.floatValue());
            PullToRefreshLayout.this.c = f.floatValue();
            PullToRefreshLayout pullToRefreshLayout = PullToRefreshLayout.this;
            float floatValue = f.floatValue();
            Iterator it = pullToRefreshLayout.a.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(floatValue);
            }
        }
    };
    private final float e = ((float) ViewConfiguration.get(getContext()).getScaledTouchSlop());
    private final float f;
    private final int g;
    private ObjectAnimator h;
    private boolean i;
    private float j;
    private float k;
    private boolean l;

    public interface a {
        void a();

        void a(float f);
    }

    public PullToRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.abkw.a.d, 0, 0);
        try {
            this.f = obtainStyledAttributes.getDimension(1, MapboxConstants.MINIMUM_ZOOM);
            this.g = obtainStyledAttributes.getResourceId(0, -1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void a(MotionEvent motionEvent) {
        if (!this.l) {
            this.l = true;
            this.b.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getEventTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), 0));
        }
        this.b.dispatchTouchEvent(motionEvent);
        this.j = motionEvent.getY();
        this.k = this.c;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public final void b(a aVar) {
        this.a.remove(aVar);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(this.g);
    }

    /* JADX WARNING: Missing block: B:6:0x000e, code skipped:
            if (r0 != 3) goto L_0x006e;
     */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r0 = r5.getActionMasked();
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x002d;
    L_0x0008:
        if (r0 == r2) goto L_0x002a;
    L_0x000a:
        r3 = 2;
        if (r0 == r3) goto L_0x0011;
    L_0x000d:
        r5 = 3;
        if (r0 == r5) goto L_0x002a;
    L_0x0010:
        goto L_0x006e;
    L_0x0011:
        r0 = r4.i;
        if (r0 == 0) goto L_0x006e;
    L_0x0015:
        r0 = r5.getY();
        r3 = r4.j;
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r3 = r4.e;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x006e;
    L_0x0026:
        r4.onTouchEvent(r5);
        return r2;
    L_0x002a:
        r4.i = r1;
        goto L_0x006e;
    L_0x002d:
        r4.i = r2;
        r5 = r5.getY();
        r4.j = r5;
        r5 = r4.c;
        r4.k = r5;
        r4.l = r2;
        r5 = r4.h;
        if (r5 != 0) goto L_0x0061;
    L_0x003f:
        r5 = r4.b;
        r0 = r4.d;
        r2 = new float[r2];
        r3 = 0;
        r2[r1] = r3;
        r5 = android.animation.ObjectAnimator.ofFloat(r5, r0, r2);
        r4.h = r5;
        r5 = r4.h;
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r5.setDuration(r2);
        r5 = r4.h;
        r0 = new android.view.animation.DecelerateInterpolator;
        r2 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r0.<init>(r2);
        r5.setInterpolator(r0);
    L_0x0061:
        r5 = r4.h;
        r5 = r5.isStarted();
        if (r5 == 0) goto L_0x006e;
    L_0x0069:
        r5 = r4.h;
        r5.end();
    L_0x006e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.android.framework.ui.views.PullToRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() >= this.j ? this.c > MapboxConstants.MINIMUM_ZOOM || !this.b.canScrollVertically(-1) : this.c > MapboxConstants.MINIMUM_ZOOM) {
            int actionMasked;
            if (this.l) {
                this.l = false;
                actionMasked = motionEvent.getActionMasked();
                motionEvent.setAction(3);
                this.b.dispatchTouchEvent(motionEvent);
                motionEvent.setAction(actionMasked);
            }
            this.d.set(this.b, Float.valueOf((float) Math.pow((double) Math.max(MapboxConstants.MINIMUM_ZOOM, this.k + (motionEvent.getY() - this.j)), 0.93d)));
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                if (this.h.isStarted()) {
                    this.h.cancel();
                }
                this.h.setFloatValues(new float[]{this.c, MapboxConstants.MINIMUM_ZOOM});
                this.h.start();
                if (!this.a.isEmpty() && this.c > this.f) {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } else {
            a(motionEvent);
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 3 || actionMasked2 == 1) {
            this.i = false;
        }
        return false;
    }
}
