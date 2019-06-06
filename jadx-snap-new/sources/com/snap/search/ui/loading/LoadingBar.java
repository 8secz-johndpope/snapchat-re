package com.snap.search.ui.loading;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akcr;

public final class LoadingBar extends FrameLayout {
    public AnimatorListenerAdapter a;
    private ImageView b;
    private int c;
    private AnimatorSet d;
    private AnimatorSet e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends AnimatorListenerAdapter {
        private /* synthetic */ LoadingBar a;

        b(LoadingBar loadingBar) {
            this.a = loadingBar;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            super.onAnimationEnd(animator);
            this.a.b();
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        private /* synthetic */ LoadingBar a;
        private /* synthetic */ LoadingBar b;

        public c(LoadingBar loadingBar, LoadingBar loadingBar2) {
            this.a = loadingBar;
            this.b = loadingBar2;
        }

        public final void onAnimationEnd(Animator animator) {
            akcr.b(animator, "animation");
            super.onAnimationEnd(animator);
            this.b.b();
            this.a.b();
        }
    }

    static {
        a aVar = new a();
    }

    public LoadingBar(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        View.inflate(context, R.layout.search_loading_bar, this);
        View findViewById = findViewById(R.id.loading_bar_rounded_image);
        if (findViewById != null) {
            this.b = (ImageView) findViewById;
            this.c = getResources().getDimensionPixelSize(R.dimen.search_loading_bar_min_width);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.ImageView");
    }

    public final void a() {
        this.a = null;
        AnimatorSet animatorSet = this.e;
        if (animatorSet == null) {
            akcr.a("fadeAnimatorSet");
        }
        animatorSet.removeAllListeners();
    }

    public final void a(int i, long j, long j2) {
        setAlpha(MapboxConstants.MINIMUM_ZOOM);
        Object resources = getResources();
        akcr.a(resources, "resources");
        resources = resources.getConfiguration();
        akcr.a(resources, "resources.configuration");
        i = resources.getLayoutDirection() == 0 ? i - this.c : this.c - i;
        this.d = new AnimatorSet();
        AnimatorSet animatorSet = this.d;
        String str = "scrollAnimatorSet";
        if (animatorSet == null) {
            akcr.a(str);
        }
        animatorSet.setStartDelay(j);
        animatorSet = this.d;
        if (animatorSet == null) {
            akcr.a(str);
        }
        ImageView imageView = this.b;
        String str2 = "loadingBarImage";
        if (imageView == null) {
            akcr.a(str2);
        }
        Object ofInt = ObjectAnimator.ofInt(imageView, "scrollX", new int[]{i, 0});
        akcr.a(ofInt, "objectAnimator");
        ofInt.setDuration(j2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play((Animator) ofInt);
        this.e = new AnimatorSet();
        animatorSet = this.e;
        String str3 = "fadeAnimatorSet";
        if (animatorSet == null) {
            akcr.a(str3);
        }
        animatorSet.setStartDelay(j);
        AnimatorSet animatorSet2 = this.e;
        if (animatorSet2 == null) {
            akcr.a(str3);
        }
        Animator[] animatorArr = new Animator[2];
        ObjectAnimator objectAnimator = new ObjectAnimator();
        String str4 = "alpha";
        objectAnimator.setPropertyName(str4);
        objectAnimator.setFloatValues(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        objectAnimator.setDuration(500);
        animatorArr[0] = objectAnimator;
        objectAnimator = new ObjectAnimator();
        objectAnimator.setPropertyName(str4);
        objectAnimator.setFloatValues(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
        objectAnimator.setDuration(500);
        objectAnimator.setStartDelay(j2);
        animatorArr[1] = objectAnimator;
        animatorSet2.playSequentially(animatorArr);
        this.a = new b(this);
        AnimatorSet animatorSet3 = this.e;
        if (animatorSet3 == null) {
            akcr.a(str3);
        }
        animatorSet3.setTarget(this);
        animatorSet3 = this.d;
        if (animatorSet3 == null) {
            akcr.a(str);
        }
        ImageView imageView2 = this.b;
        if (imageView2 == null) {
            akcr.a(str2);
        }
        animatorSet3.setTarget(imageView2);
    }

    /* JADX WARNING: Missing block: B:11:0x0022, code skipped:
            if (r0.getListeners().isEmpty() != false) goto L_0x0024;
     */
    public final void b() {
        /*
        r3 = this;
        r0 = r3.a;
        r1 = "fadeAnimatorSet";
        if (r0 == 0) goto L_0x0032;
    L_0x0006:
        r0 = r3.e;
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        defpackage.akcr.a(r1);
    L_0x000d:
        r0 = r0.getListeners();
        if (r0 == 0) goto L_0x0024;
    L_0x0013:
        r0 = r3.e;
        if (r0 != 0) goto L_0x001a;
    L_0x0017:
        defpackage.akcr.a(r1);
    L_0x001a:
        r0 = r0.getListeners();
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0032;
    L_0x0024:
        r0 = r3.e;
        if (r0 != 0) goto L_0x002b;
    L_0x0028:
        defpackage.akcr.a(r1);
    L_0x002b:
        r2 = r3.a;
        r2 = (android.animation.Animator.AnimatorListener) r2;
        r0.addListener(r2);
    L_0x0032:
        r0 = r3.d;
        if (r0 != 0) goto L_0x003b;
    L_0x0036:
        r2 = "scrollAnimatorSet";
        defpackage.akcr.a(r2);
    L_0x003b:
        r0.start();
        r0 = r3.e;
        if (r0 != 0) goto L_0x0045;
    L_0x0042:
        defpackage.akcr.a(r1);
    L_0x0045:
        r0.start();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.search.ui.loading.LoadingBar.b():void");
    }

    public final void c() {
        AnimatorSet animatorSet = this.e;
        String str = "fadeAnimatorSet";
        if (animatorSet == null) {
            akcr.a(str);
        }
        animatorSet.removeAllListeners();
        this.a = null;
        animatorSet = this.d;
        if (animatorSet == null) {
            akcr.a("scrollAnimatorSet");
        }
        animatorSet.end();
        animatorSet = this.e;
        if (animatorSet == null) {
            akcr.a(str);
        }
        animatorSet.end();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }
}
