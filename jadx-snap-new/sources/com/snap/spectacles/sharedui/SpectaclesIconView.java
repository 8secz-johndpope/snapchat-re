package com.snap.spectacles.sharedui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.wzz;
import defpackage.xak;
import defpackage.xal;
import java.util.ArrayList;
import java.util.List;

public final class SpectaclesIconView extends FrameLayout implements xal {
    ImageView a;
    ImageView b;
    int c;
    public SpectaclesBatteryView d;
    ObjectAnimator e;
    public xak f;
    public wzz g;
    public boolean h;
    private ImageView i;
    private ObjectAnimator j;
    private List<Animator> k;
    private final int l;
    private Integer m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        private /* synthetic */ SpectaclesIconView a;
        private /* synthetic */ ObjectAnimator b;

        b(SpectaclesIconView spectaclesIconView, ObjectAnimator objectAnimator) {
            this.a = spectaclesIconView;
            this.b = objectAnimator;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            ObjectAnimator objectAnimator = this.a.e;
            if (objectAnimator == null) {
                akcr.a("statusRotatingAnimator");
            }
            objectAnimator.end();
            this.b.start();
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        final /* synthetic */ SpectaclesIconView a;

        static final class a implements Runnable {
            private /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                xak xak = this.a.a.f;
                if (xak != null) {
                    xak.e();
                }
            }
        }

        c(SpectaclesIconView spectaclesIconView) {
            this.a = spectaclesIconView;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.postDelayed(new a(this), 5000);
        }

        public final void onAnimationStart(Animator animator) {
            akcr.b(animator, "animation");
            xak xak = this.a.f;
            int i = (xak != null ? xak.c() : null) == wzz.WHITE ? R.drawable.spectacles_status_complete_icon : R.drawable.spectacles_status_complete_black_icon;
            this.a.b.setImageResource(i);
            this.a.c = i;
        }
    }

    public static final class d extends AnimatorListenerAdapter {
        private /* synthetic */ SpectaclesIconView a;

        d(SpectaclesIconView spectaclesIconView) {
            this.a = spectaclesIconView;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.a.setVisibility(4);
            this.a.a.setAlpha(1.0f);
            this.a.a.setScaleX(1.0f);
            this.a.a.setScaleY(1.0f);
            xak xak = this.a.f;
            if (xak != null) {
                xak.e();
            }
        }
    }

    public static final class e extends AnimatorListenerAdapter {
        private /* synthetic */ SpectaclesIconView a;

        e(SpectaclesIconView spectaclesIconView) {
            this.a = spectaclesIconView;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            xak xak = this.a.f;
            if (xak != null) {
                xak.e();
            }
        }
    }

    public static final class f extends AnimatorListenerAdapter {
        private /* synthetic */ SpectaclesIconView a;

        f(SpectaclesIconView spectaclesIconView) {
            this.a = spectaclesIconView;
        }

        public final void onAnimationCancel(Animator animator) {
            akcr.b(animator, "animation");
            this.a.b.setRotation(MapboxConstants.MINIMUM_ZOOM);
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            this.a.b.setRotation(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    static {
        a aVar = new a();
    }

    public SpectaclesIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x013b  */
    private SpectaclesIconView(android.content.Context r11, android.util.AttributeSet r12, char r13) {
        /*
        r10 = this;
        r13 = "context";
        defpackage.akcr.b(r11, r13);
        r13 = 0;
        r10.<init>(r11, r12, r13);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
        r10.k = r0;
        r0 = defpackage.xaa.a.b;
        r12 = r11.obtainStyledAttributes(r12, r0, r13, r13);
        r0 = defpackage.wzz.BLACK;
        r0 = r0.ordinal();
        r1 = 1;
        r0 = r12.getInt(r1, r0);
        r2 = 3;
        r2 = r12.getBoolean(r2, r13);
        r10.h = r2;
        r2 = r11.getResources();
        r3 = 2131166573; // 0x7f07056d float:1.7947395E38 double:1.0529361893E-314;
        r2 = r2.getDimensionPixelSize(r3);
        r3 = 2;
        r2 = r12.getDimensionPixelSize(r3, r2);
        r10.l = r2;
        r2 = r12.hasValue(r13);
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        if (r2 == 0) goto L_0x004e;
    L_0x0044:
        r2 = r12.getColor(r13, r4);
        r2 = java.lang.Integer.valueOf(r2);
        r10.m = r2;
    L_0x004e:
        r12.recycle();
        r12 = new android.widget.ImageView;
        r12.<init>(r11);
        r10.a = r12;
        r12 = new android.widget.FrameLayout$LayoutParams;
        r2 = 17;
        r5 = -1;
        r12.<init>(r5, r5, r2);
        r2 = r10.m;
        if (r2 == 0) goto L_0x0073;
    L_0x0064:
        r2 = (java.lang.Number) r2;
        r2 = r2.intValue();
        r6 = r10.a;
        r2 = android.content.res.ColorStateList.valueOf(r2);
        defpackage.la.a(r6, r2);
    L_0x0073:
        r2 = r10.a;
        r2 = (android.view.View) r2;
        r12 = (android.view.ViewGroup.LayoutParams) r12;
        r10.addView(r2, r12);
        r12 = new android.widget.ImageView;
        r12.<init>(r11);
        r10.i = r12;
        r12 = new android.widget.FrameLayout$LayoutParams;
        r2 = 8388659; // 0x800033 float:1.1755015E-38 double:4.144548E-317;
        r12.<init>(r5, r5, r2);
        r2 = r10.m;
        if (r2 == 0) goto L_0x009d;
    L_0x008f:
        r2 = (java.lang.Number) r2;
        r2.intValue();
        r2 = r10.i;
        r6 = android.content.res.ColorStateList.valueOf(r13);
        defpackage.la.a(r2, r6);
    L_0x009d:
        r2 = r10.i;
        r2 = (android.view.View) r2;
        r12 = (android.view.ViewGroup.LayoutParams) r12;
        r10.addView(r2, r12);
        r12 = new android.widget.ImageView;
        r12.<init>(r11);
        r10.b = r12;
        r12 = r10.b;
        r2 = 4;
        r12.setVisibility(r2);
        r12 = new android.widget.FrameLayout$LayoutParams;
        r6 = 85;
        r7 = -2;
        r12.<init>(r7, r7, r6);
        r8 = r10.b;
        r8 = (android.view.View) r8;
        r12 = (android.view.ViewGroup.LayoutParams) r12;
        r10.addView(r8, r12);
        r12 = new com.snap.spectacles.sharedui.SpectaclesBatteryView;
        r8 = 6;
        r9 = 0;
        r12.<init>(r11, r9, r8);
        r10.d = r12;
        r11 = r10.d;
        r11.e = r13;
        r11.f = r13;
        r12 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r11.c = r12;
        r11.setVisibility(r2);
        r11 = new android.widget.FrameLayout$LayoutParams;
        r11.<init>(r7, r7, r6);
        r12 = r10.d;
        r12 = (android.view.View) r12;
        r11 = (android.view.ViewGroup.LayoutParams) r11;
        r10.addView(r12, r11);
        r11 = defpackage.wzz.values();
        r11 = r11[r0];
        r12 = "mode";
        defpackage.akcr.b(r11, r12);
        r12 = r10.f;
        if (r12 == 0) goto L_0x00fc;
    L_0x00f8:
        r9 = r12.c();
    L_0x00fc:
        if (r11 == r9) goto L_0x013e;
    L_0x00fe:
        r12 = r10.f;
        if (r12 == 0) goto L_0x0105;
    L_0x0102:
        r12.a(r11);
    L_0x0105:
        r12 = r10.d;
        r13 = defpackage.wzz.BLACK;
        if (r11 != r13) goto L_0x010c;
    L_0x010b:
        goto L_0x010d;
    L_0x010c:
        r4 = -1;
    L_0x010d:
        r12.a(r4);
        r12 = defpackage.wzz.WHITE;
        if (r11 != r12) goto L_0x0125;
    L_0x0114:
        r11 = r10.a;
        r12 = 2131232434; // 0x7f0806b2 float:1.8080977E38 double:1.052968729E-314;
        r11.setImageResource(r12);
        r11 = r10.i;
        r12 = 2131232437; // 0x7f0806b5 float:1.8080983E38 double:1.0529687304E-314;
    L_0x0121:
        r11.setImageResource(r12);
        goto L_0x0137;
    L_0x0125:
        r12 = defpackage.wzz.BLACK;
        if (r11 != r12) goto L_0x0137;
    L_0x0129:
        r11 = r10.a;
        r12 = 2131232433; // 0x7f0806b1 float:1.8080975E38 double:1.0529687284E-314;
        r11.setImageResource(r12);
        r11 = r10.i;
        r12 = 2131232430; // 0x7f0806ae float:1.808097E38 double:1.052968727E-314;
        goto L_0x0121;
    L_0x0137:
        r11 = r10.f;
        if (r11 == 0) goto L_0x013e;
    L_0x013b:
        r11.d();
    L_0x013e:
        r11 = defpackage.wzz.values();
        r11 = r11[r0];
        r10.g = r11;
        r11 = r10.b;
        r12 = android.view.View.ALPHA;
        r13 = new float[r3];
        r13 = {1036831949, 1065353216};
        r11 = android.animation.ObjectAnimator.ofFloat(r11, r12, r13);
        r12 = "ObjectAnimator.ofFloat(s…, View.ALPHA, 0.1f, 1.0f)";
        defpackage.akcr.a(r11, r12);
        r10.j = r11;
        r11 = r10.j;
        r12 = "statusFadingAnimator";
        if (r11 != 0) goto L_0x0163;
    L_0x0160:
        defpackage.akcr.a(r12);
    L_0x0163:
        r6 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r11.setDuration(r6);
        r11 = r10.j;
        if (r11 != 0) goto L_0x016f;
    L_0x016c:
        defpackage.akcr.a(r12);
    L_0x016f:
        r13 = 10;
        r11.setRepeatCount(r13);
        r11 = r10.j;
        if (r11 != 0) goto L_0x017b;
    L_0x0178:
        defpackage.akcr.a(r12);
    L_0x017b:
        r11.setRepeatMode(r3);
        r11 = r10.j;
        if (r11 != 0) goto L_0x0185;
    L_0x0182:
        defpackage.akcr.a(r12);
    L_0x0185:
        r13 = new android.view.animation.LinearInterpolator;
        r13.<init>();
        r13 = (android.animation.TimeInterpolator) r13;
        r11.setInterpolator(r13);
        r11 = r10.j;
        if (r11 != 0) goto L_0x0196;
    L_0x0193:
        defpackage.akcr.a(r12);
    L_0x0196:
        r12 = new com.snap.spectacles.sharedui.SpectaclesIconView$e;
        r12.<init>(r10);
        r12 = (android.animation.Animator.AnimatorListener) r12;
        r11.addListener(r12);
        r11 = r10.b;
        r12 = android.view.View.ROTATION;
        r13 = new float[r3];
        r13 = {0, 1135869952};
        r11 = android.animation.ObjectAnimator.ofFloat(r11, r12, r13);
        r12 = "ObjectAnimator.ofFloat(s…w.ROTATION, 0.0f, 360.0f)";
        defpackage.akcr.a(r11, r12);
        r10.e = r11;
        r11 = r10.e;
        r12 = "statusRotatingAnimator";
        if (r11 != 0) goto L_0x01bd;
    L_0x01ba:
        defpackage.akcr.a(r12);
    L_0x01bd:
        r2 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r11.setDuration(r2);
        r11 = r10.e;
        if (r11 != 0) goto L_0x01c9;
    L_0x01c6:
        defpackage.akcr.a(r12);
    L_0x01c9:
        r11.setRepeatCount(r5);
        r11 = r10.e;
        if (r11 != 0) goto L_0x01d3;
    L_0x01d0:
        defpackage.akcr.a(r12);
    L_0x01d3:
        r11.setRepeatMode(r1);
        r11 = r10.e;
        if (r11 != 0) goto L_0x01dd;
    L_0x01da:
        defpackage.akcr.a(r12);
    L_0x01dd:
        r13 = new android.view.animation.LinearInterpolator;
        r13.<init>();
        r13 = (android.animation.TimeInterpolator) r13;
        r11.setInterpolator(r13);
        r11 = r10.e;
        if (r11 != 0) goto L_0x01ee;
    L_0x01eb:
        defpackage.akcr.a(r12);
    L_0x01ee:
        r12 = new com.snap.spectacles.sharedui.SpectaclesIconView$f;
        r12.<init>(r10);
        r12 = (android.animation.Animator.AnimatorListener) r12;
        r11.addListener(r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.sharedui.SpectaclesIconView.<init>(android.content.Context, android.util.AttributeSet, char):void");
    }

    public final int a() {
        return this.c;
    }

    public final void a(int i) {
        this.c = i;
    }

    public final boolean a(boolean z, boolean z2) {
        for (Animator animator : this.k) {
            animator.removeAllListeners();
            animator.cancel();
        }
        this.k.clear();
        if (z) {
            this.a.setAlpha(1.0f);
            this.a.setVisibility(0);
            this.i.setVisibility(4);
            this.b.setVisibility(4);
        } else if (this.i.getVisibility() != 0) {
            Object obj;
            ArrayList arrayList = new ArrayList();
            this.a.setVisibility(0);
            this.i.setVisibility(0);
            this.a.setPivotX(MapboxConstants.MINIMUM_ZOOM);
            this.a.setPivotY(MapboxConstants.MINIMUM_ZOOM);
            this.i.setPivotX(MapboxConstants.MINIMUM_ZOOM);
            this.i.setPivotY(MapboxConstants.MINIMUM_ZOOM);
            arrayList.add(ObjectAnimator.ofFloat(this.a, View.SCALE_X, new float[]{1.0f, 0.94f}));
            arrayList.add(ObjectAnimator.ofFloat(this.a, View.SCALE_Y, new float[]{1.0f, 0.94f}));
            arrayList.add(ObjectAnimator.ofFloat(this.a, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM}));
            arrayList.add(ObjectAnimator.ofFloat(this.i, View.SCALE_X, new float[]{1.1627907f, 1.0f}));
            arrayList.add(ObjectAnimator.ofFloat(this.i, View.SCALE_Y, new float[]{1.1627907f, 1.0f}));
            arrayList.add(ObjectAnimator.ofFloat(this.i, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f}));
            String str = "statusAnimator";
            if (z2) {
                this.b.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                this.b.setVisibility(0);
                this.d.setVisibility(4);
                obj = this.b;
            } else {
                this.d.setAlpha(MapboxConstants.MINIMUM_ZOOM);
                this.d.setVisibility(0);
                this.b.setVisibility(4);
                obj = this.d;
            }
            obj = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            akcr.a(obj, str);
            obj.setStartDelay(300);
            arrayList.add(obj);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(600);
            animatorSet.playTogether(arrayList);
            this.k.add(animatorSet);
            animatorSet.addListener(new d(this));
            animatorSet.start();
            return true;
        } else {
            this.i.setAlpha(1.0f);
            this.a.setVisibility(4);
            if (z2) {
                this.b.setAlpha(1.0f);
                this.b.setVisibility(0);
            } else {
                this.d.setAlpha(1.0f);
                this.d.setVisibility(0);
                this.b.setVisibility(4);
                return false;
            }
        }
        this.d.setVisibility(4);
        return false;
    }

    public final ObjectAnimator b() {
        ObjectAnimator objectAnimator = this.j;
        if (objectAnimator == null) {
            akcr.a("statusFadingAnimator");
        }
        return objectAnimator;
    }

    public final void b(int i) {
        this.b.setImageResource(i);
    }

    public final ObjectAnimator c() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null) {
            akcr.a("statusRotatingAnimator");
        }
        return objectAnimator;
    }

    public final void d() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.6f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.6f});
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        Object ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.b, new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3});
        akcr.a(ofPropertyValuesHolder, "animatorOne");
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ofPropertyValuesHolder.setDuration(600);
        this.k.add(ofPropertyValuesHolder);
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.6f, 1.0f});
        PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.6f, 1.0f});
        PropertyValuesHolder ofFloat6 = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        Object ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.b, new PropertyValuesHolder[]{ofFloat4, ofFloat5, ofFloat6});
        akcr.a(ofPropertyValuesHolder2, "animatorTwo");
        ofPropertyValuesHolder2.setInterpolator(new AnticipateOvershootInterpolator());
        ofPropertyValuesHolder2.setDuration(600);
        this.k.add(ofPropertyValuesHolder2);
        ofPropertyValuesHolder.addListener(new b(this, ofPropertyValuesHolder2));
        ofPropertyValuesHolder2.addListener(new c(this));
        ofPropertyValuesHolder.start();
    }

    public final int getSuggestedMinimumHeight() {
        return (this.l + getPaddingTop()) + getPaddingBottom();
    }

    public final int getSuggestedMinimumWidth() {
        return (this.l + getPaddingTop()) + getPaddingBottom();
    }

    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xak xak = this.f;
        if (xak != null) {
            xak.a((xal) this);
        }
        xak = this.f;
        if (xak != null) {
            xak.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xak xak = this.f;
        if (xak != null) {
            xak.b();
        }
    }

    public final void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int mode2 = MeasureSpec.getMode(i);
        int i3 = Integer.MAX_VALUE;
        mode = mode == 0 ? Integer.MAX_VALUE : MeasureSpec.getSize(i2);
        if (mode2 != 0) {
            i3 = MeasureSpec.getSize(i);
        }
        mode = Math.min(this.l, (mode - getPaddingTop()) - getPaddingBottom());
        mode2 = Math.min((int) Math.ceil((double) (((float) this.l) * 1.2f)), (i3 - getPaddingLeft()) - getPaddingRight());
        i3 = (int) Math.ceil((double) (((float) mode) * 1.2f));
        if (i3 > mode2) {
            mode = (int) Math.ceil((double) (((float) mode2) / 1.2f));
        } else {
            mode2 = i3;
        }
        this.a.getLayoutParams().height = mode;
        this.a.getLayoutParams().width = mode2;
        float f = (float) mode;
        this.i.getLayoutParams().height = (int) (f * 0.94f);
        this.i.getLayoutParams().width = (int) (((float) mode2) * 0.94f);
        mode2 = (int) (0.4f * f);
        LayoutParams layoutParams = this.b.getLayoutParams();
        String str = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = mode2;
            layoutParams2.width = mode2;
            int i4 = (int) (0.04f * f);
            layoutParams2.rightMargin = i4;
            layoutParams2.bottomMargin = i4;
            mode = (int) (f * 0.44f);
            layoutParams = this.d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = mode;
                layoutParams2.width = mode;
                this.d.setPadding(0, 0, (int) ((((float) mode) * 0.39999998f) * 0.35f), 0);
                this.d.b = mode;
                layoutParams2.rightMargin = i4;
                layoutParams2.bottomMargin = i4;
                this.d.a = (int) (((float) getResources().getDimensionPixelOffset(R.dimen.battery_default_stroke_width)) * (((float) mode2) * 0.025f));
                super.onMeasure(i, i2);
                return;
            }
            throw new ajxt(str);
        }
        throw new ajxt(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onVisibilityChanged(View view, int i) {
        akcr.b(view, "changedView");
        super.onVisibilityChanged(view, i);
        xak xak = this.f;
        if (xak != null) {
            xak.a(i);
        }
    }
}
