package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abum */
public final class abum implements OnTouchListener {
    Runnable a;
    private final View b;
    private final View c;
    private final List<View> d;
    private final List<View> e;
    private final boolean f;
    private final boolean g;
    private AnimatorSet h;
    private final int i;
    private float j;
    private final float k;
    private final float l;
    private final int m;
    private final int n;
    private VelocityTracker o;
    private final Rect p;
    private final abuq q;

    /* renamed from: abum$1 */
    class 1 implements AnimatorListener {
        1() {
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (abum.this.a != null) {
                abum.this.a.run();
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    public abum(Context context, View view, View view2, List<View> list, List<View> list2, Runnable runnable) {
        this(context, view, view2, list, list2, runnable, (byte) 0);
    }

    private abum(Context context, View view, View view2, List<View> list, List<View> list2, Runnable runnable, byte b) {
        this(view, view2, list, list2, true, true, runnable, (float) ViewConfiguration.get(context).getScaledTouchSlop(), (float) ViewConfiguration.get(context).getScaledPagingTouchSlop(), ViewConfiguration.get(context).getScaledMaximumFlingVelocity(), ViewConfiguration.get(context).getScaledMinimumFlingVelocity(), context.getResources().getDisplayMetrics().heightPixels);
    }

    private abum(View view, View view2, List<View> list, List<View> list2, boolean z, boolean z2, Runnable runnable, float f, float f2, int i, int i2, int i3) {
        this.k = f;
        this.l = f2;
        this.m = i;
        this.n = i2;
        this.i = i3;
        this.p = new Rect();
        this.b = view;
        this.c = view2;
        this.d = list;
        this.e = list2;
        this.f = true;
        this.g = true;
        this.a = runnable;
        this.q = null;
    }

    private boolean a() {
        AnimatorSet animatorSet = this.h;
        return animatorSet != null && animatorSet.isStarted();
    }

    private void b() {
        if (!a()) {
            ArrayList arrayList = new ArrayList(this.d.size() + 1);
            for (View ofFloat : this.d) {
                arrayList.add(ObjectAnimator.ofFloat(ofFloat, View.ALPHA, new float[]{ofFloat.getAlpha(), 1.0f}));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.c, View.TRANSLATION_Y, new float[]{this.c.getTranslationY(), MapboxConstants.MINIMUM_ZOOM}));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.h = animatorSet;
            double abs = (double) Math.abs(this.c.getTranslationY());
            Double.isNaN(abs);
            abs *= 2.0d;
            double d = (double) this.i;
            Double.isNaN(d);
            this.h.setDuration((long) ((abs / d) * 200.0d));
            this.h.start();
        }
    }

    private void c() {
        this.j = -1.0f;
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private float d() {
        return ((float) (this.i - this.b.getMeasuredHeight())) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
        r9 = this;
        r10 = r9.a();
        r0 = 1;
        if (r10 == 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r10 = r11.getAction();
        r1 = r11.getRawY();
        r2 = r9.j;
        r2 = r1 - r2;
        if (r10 == 0) goto L_0x0166;
    L_0x0016:
        r3 = 0;
        r4 = 2;
        r5 = 0;
        if (r10 == r0) goto L_0x0078;
    L_0x001b:
        if (r10 == r4) goto L_0x0026;
    L_0x001d:
        r11 = 3;
        if (r10 == r11) goto L_0x0022;
    L_0x0020:
        goto L_0x017b;
    L_0x0022:
        r9.c();
        return r5;
    L_0x0026:
        r10 = r9.o;
        if (r10 != 0) goto L_0x0030;
    L_0x002a:
        r10 = android.view.VelocityTracker.obtain();
        r9.o = r10;
    L_0x0030:
        r10 = r9.o;
        r10.addMovement(r11);
        r10 = r9.g;
        if (r10 == 0) goto L_0x0040;
    L_0x0039:
        r10 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r10 <= 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r10 = 0;
        goto L_0x0044;
    L_0x0040:
        r10 = java.lang.Float.valueOf(r2);
    L_0x0044:
        if (r10 == 0) goto L_0x004f;
    L_0x0046:
        r11 = r9.c;
        r10 = r10.floatValue();
        r11.setTranslationY(r10);
    L_0x004f:
        r10 = r9.i;
        r11 = r10 / 2;
        r11 = (float) r11;
        r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r11 <= 0) goto L_0x017b;
    L_0x0058:
        r10 = (float) r10;
        r11 = r9.d();
        r10 = r10 - r11;
        r2 = r2 / r10;
        r10 = r9.d;
        r10 = r10.iterator();
    L_0x0065:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x017b;
    L_0x006b:
        r11 = r10.next();
        r11 = (android.view.View) r11;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = r1 - r2;
        r11.setAlpha(r1);
        goto L_0x0065;
    L_0x0078:
        r10 = r9.o;
        if (r10 != 0) goto L_0x007e;
    L_0x007c:
        r10 = 0;
        goto L_0x008d;
    L_0x007e:
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r9.m;
        r6 = (float) r6;
        r10.computeCurrentVelocity(r1, r6);
        r10 = r9.o;
        r10 = r10.getYVelocity();
        r10 = (int) r10;
    L_0x008d:
        r1 = r9.l;
        r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0099;
    L_0x0093:
        r1 = r9.n;
        if (r10 <= r1) goto L_0x0099;
    L_0x0097:
        r10 = 1;
        goto L_0x009a;
    L_0x0099:
        r10 = 0;
    L_0x009a:
        r1 = java.lang.Math.abs(r2);
        r6 = r9.k;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 > 0) goto L_0x00d4;
    L_0x00a4:
        r1 = r9.e;
        r1 = r1.iterator();
    L_0x00aa:
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x00cf;
    L_0x00b0:
        r6 = r1.next();
        r6 = (android.view.View) r6;
        r7 = r9.p;
        r6.getGlobalVisibleRect(r7);
        r6 = r9.p;
        r7 = r11.getRawX();
        r7 = (int) r7;
        r8 = r11.getRawY();
        r8 = (int) r8;
        r6 = r6.contains(r7, r8);
        if (r6 == 0) goto L_0x00aa;
    L_0x00cd:
        r11 = 1;
        goto L_0x00d0;
    L_0x00cf:
        r11 = 0;
    L_0x00d0:
        if (r11 == 0) goto L_0x00d4;
    L_0x00d2:
        r11 = 1;
        goto L_0x00d5;
    L_0x00d4:
        r11 = 0;
    L_0x00d5:
        if (r11 != 0) goto L_0x0162;
    L_0x00d7:
        r11 = r9.f;
        if (r11 == 0) goto L_0x015f;
    L_0x00db:
        r11 = java.lang.Math.abs(r2);
        r1 = r9.k;
        r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1));
        if (r11 <= 0) goto L_0x00e7;
    L_0x00e5:
        if (r10 == 0) goto L_0x015f;
    L_0x00e7:
        r10 = r9.a();
        if (r10 != 0) goto L_0x0162;
    L_0x00ed:
        r10 = new java.util.ArrayList;
        r11 = r9.d;
        r11 = r11.size();
        r11 = r11 + r0;
        r10.<init>(r11);
        r11 = r9.d;
        r11 = r11.iterator();
    L_0x00ff:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x011f;
    L_0x0105:
        r1 = r11.next();
        r1 = (android.view.View) r1;
        r2 = android.view.View.ALPHA;
        r6 = new float[r4];
        r7 = r1.getAlpha();
        r6[r5] = r7;
        r6[r0] = r3;
        r1 = android.animation.ObjectAnimator.ofFloat(r1, r2, r6);
        r10.add(r1);
        goto L_0x00ff;
    L_0x011f:
        r11 = r9.c;
        r1 = android.view.View.TRANSLATION_Y;
        r2 = new float[r4];
        r3 = r9.c;
        r3 = r3.getTranslationY();
        r2[r5] = r3;
        r3 = r9.i;
        r3 = (float) r3;
        r4 = r9.d();
        r3 = r3 - r4;
        r2[r0] = r3;
        r11 = android.animation.ObjectAnimator.ofFloat(r11, r1, r2);
        r10.add(r11);
        r11 = new android.animation.AnimatorSet;
        r11.<init>();
        r11.playTogether(r10);
        r9.h = r11;
        r10 = r9.h;
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r10.setDuration(r1);
        r10 = r9.h;
        r11 = new abum$1;
        r11.<init>();
        r10.addListener(r11);
        r10 = r9.h;
        r10.start();
        goto L_0x0162;
    L_0x015f:
        r9.b();
    L_0x0162:
        r9.c();
        goto L_0x017b;
    L_0x0166:
        r9.j = r1;
        r10 = r9.o;
        if (r10 != 0) goto L_0x0173;
    L_0x016c:
        r10 = android.view.VelocityTracker.obtain();
        r9.o = r10;
        goto L_0x0176;
    L_0x0173:
        r10.clear();
    L_0x0176:
        r10 = r9.o;
        r10.addMovement(r11);
    L_0x017b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abum.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
