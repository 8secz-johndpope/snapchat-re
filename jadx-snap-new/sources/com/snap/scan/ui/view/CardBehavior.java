package com.snap.scan.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.idc;
import defpackage.ihp;

public final class CardBehavior extends android.support.design.widget.CoordinatorLayout.b<View> {
    float a;
    Animator b;
    final akbk<ajxw> c;
    private final OvershootInterpolator d;
    private final float e;
    private final float f;

    public static final class a extends AnimatorListenerAdapter {
        private /* synthetic */ CardBehavior a;
        private /* synthetic */ View b;

        public a(CardBehavior cardBehavior, View view) {
            this.a = cardBehavior;
            this.b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            CardBehavior cardBehavior = this.a;
            cardBehavior.b = null;
            cardBehavior.a = MapboxConstants.MINIMUM_ZOOM;
            CardBehavior.b(this.b);
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        private /* synthetic */ CardBehavior a;
        private /* synthetic */ View b;

        public b(CardBehavior cardBehavior, View view) {
            this.a = cardBehavior;
            this.b = view;
        }

        public final void onAnimationStart(Animator animator) {
            CardBehavior cardBehavior = this.a;
            cardBehavior.b = null;
            cardBehavior.a = MapboxConstants.MINIMUM_ZOOM;
            CardBehavior.b(this.b);
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        private /* synthetic */ ObjectAnimator a;
        private /* synthetic */ int b;
        private /* synthetic */ CardBehavior c;

        public c(ObjectAnimator objectAnimator, int i, CardBehavior cardBehavior) {
            this.a = objectAnimator;
            this.b = i;
            this.c = cardBehavior;
        }

        public final void onAnimationCancel(Animator animator) {
            this.c.a = idc.a((ValueAnimator) this.a);
        }
    }

    public static final class d extends AnimatorListenerAdapter {
        private /* synthetic */ CardBehavior a;

        public d(CardBehavior cardBehavior) {
            this.a = cardBehavior;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.c.invoke();
        }
    }

    private CardBehavior(akbk<ajxw> akbk) {
        akcr.b(akbk, "onDismissListener");
        this.e = 2.0f;
        this.f = 0.002f;
        this.c = akbk;
        this.d = new OvershootInterpolator(2.0f);
    }

    public /* synthetic */ CardBehavior(akbk akbk, byte b) {
        this(akbk);
    }

    private final float a(float f) {
        return f / ((Math.abs(this.a) * 0.002f) + 1.0f);
    }

    private final void a() {
        Animator animator = this.b;
        if (animator != null) {
            animator.cancel();
            this.b = null;
        }
    }

    static void b(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).stopScroll();
        }
    }

    private final void c(View view) {
        if (view instanceof ViewGroup) {
            for (View translationY : ihp.b((ViewGroup) view)) {
                translationY.setTranslationY(this.a);
            }
        }
    }

    /* JADX WARNING: Missing block: B:19:0x006f, code skipped:
            if (r0 == null) goto L_0x0071;
     */
    private final void d(android.view.View r10) {
        /*
        r9 = this;
        r0 = r10 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x008e;
    L_0x0004:
        r0 = r9.a;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 == 0) goto L_0x008e;
    L_0x000b:
        r0 = r9.b;
        if (r0 != 0) goto L_0x008e;
    L_0x000f:
        r0 = r10;
        r0 = (android.view.ViewGroup) r0;
        r0 = defpackage.ihp.b(r0);
        r2 = new java.util.ArrayList;
        r3 = 10;
        r3 = defpackage.ajyn.a(r0, r3);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r0 = r0.iterator();
        r3 = 0;
        r4 = 0;
    L_0x0029:
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x005b;
    L_0x002f:
        r5 = r0.next();
        r6 = r4 + 1;
        if (r4 >= 0) goto L_0x003a;
    L_0x0037:
        defpackage.ajym.a();
    L_0x003a:
        r5 = (android.view.View) r5;
        r7 = 1;
        r7 = new float[r7];
        r7[r3] = r1;
        r8 = "translationY";
        r5 = android.animation.ObjectAnimator.ofFloat(r5, r8, r7);
        if (r4 != 0) goto L_0x0056;
    L_0x0049:
        r7 = r5;
        r7 = (android.animation.Animator) r7;
        r8 = new com.snap.scan.ui.view.CardBehavior$c;
        r8.<init>(r5, r4, r9);
        r8 = (android.animation.Animator.AnimatorListener) r8;
        r7.addListener(r8);
    L_0x0056:
        r2.add(r5);
        r4 = r6;
        goto L_0x0029;
    L_0x005b:
        r2 = (java.util.List) r2;
        r2 = (java.util.Collection) r2;
        r0 = defpackage.idc.a(r2);
        if (r0 == 0) goto L_0x0071;
    L_0x0065:
        r1 = new com.snap.scan.ui.view.CardBehavior$a;
        r1.<init>(r9, r10);
        r1 = (android.animation.Animator.AnimatorListener) r1;
        r0.addListener(r1);
        if (r0 != 0) goto L_0x007f;
    L_0x0071:
        r0 = defpackage.idb.a();
        r1 = new com.snap.scan.ui.view.CardBehavior$b;
        r1.<init>(r9, r10);
        r1 = (android.animation.Animator.AnimatorListener) r1;
        r0.addListener(r1);
    L_0x007f:
        r1 = r9.d;
        r1 = (android.animation.TimeInterpolator) r1;
        r0.setInterpolator(r1);
        r0.start();
        r9.b = r0;
        b(r10);
    L_0x008e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.scan.ui.view.CardBehavior.d(android.view.View):void");
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        akcr.b(coordinatorLayout, "parent");
        akcr.b(view, "child");
        akcr.b(view2, "target");
        if (i == 0) {
            if (this.a >= ((float) (coordinatorLayout.getHeight() / 7))) {
                a();
                Animator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", new float[]{(float) coordinatorLayout.getHeight()});
                ofFloat.addListener(new d(this));
                ((ObjectAnimator) ofFloat).start();
                this.b = ofFloat;
                return;
            }
            d(view2);
        }
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        akcr.b(coordinatorLayout, "parent");
        akcr.b(view, "child");
        akcr.b(view2, "target");
        if (i4 != 0) {
            Animator animator = this.b;
            if (animator == null || !animator.isRunning()) {
                if (i5 == 0) {
                    this.a -= a((float) i4);
                } else if (i5 == 1 && this.b == null) {
                    float a = a((float) i4);
                    float f = this.a * 2.0f;
                    if (Math.abs(a) > Math.abs(f)) {
                        this.a -= a + f;
                    } else {
                        d(view2);
                    }
                }
                c(view2);
            }
        }
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        akcr.b(coordinatorLayout, "parent");
        akcr.b(view, "child");
        akcr.b(view2, "directTargetChild");
        akcr.b(view3, "target");
        a();
        return true;
    }
}
