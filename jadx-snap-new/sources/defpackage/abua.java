package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import com.snapchat.android.framework.ui.animations.ArcView;
import java.util.ArrayList;

/* renamed from: abua */
public final class abua {
    public abub a;
    AnimatorSet b;
    public float c = 280.0f;
    private final View d;
    private final ArcView e;
    private AnimatorSet f;
    private boolean g;
    private float h = 0.8f;

    /* renamed from: abua$3 */
    class 3 extends AnimatorListenerAdapter {
        3() {
        }

        public final void onAnimationEnd(Animator animator) {
            abua.this.d();
        }

        public final void onAnimationStart(Animator animator) {
            abua.this.a.a(3);
        }
    }

    /* renamed from: abua$1 */
    class 1 extends abtx {
        1() {
        }

        public final void onAnimationEnd(Animator animator) {
            abua.this.b.start();
        }
    }

    /* renamed from: abua$2 */
    class 2 extends abty {
        2() {
        }

        public final void onAnimationStart(Animator animator) {
            abua.this.a.start();
        }
    }

    public abua(View view, ArcView arcView) {
        this.d = view;
        this.e = arcView;
    }

    private static AnimatorSet a(float f, float f2, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            Object obj = viewArr[0];
            if (obj != null) {
                arrayList.add(ObjectAnimator.ofFloat(obj, View.SCALE_X, new float[]{f, f2}));
                arrayList.add(ObjectAnimator.ofFloat(obj, View.SCALE_Y, new float[]{f, f2}));
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public final void a() {
        this.h = 0.95f;
    }

    public final void b() {
        if (!this.g) {
            d();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, View.ALPHA, new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            ofFloat.setStartDelay(0);
            ofFloat.addListener(new 2());
            abua.a(1.0f, this.h, this.d).setInterpolator(new OvershootInterpolator(6.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{r1, ofFloat});
            animatorSet.setDuration(150);
            this.f = animatorSet;
            abub abub = new abub(this.e);
            abub.a = MapboxConstants.ANIMATION_DURATION_SHORT;
            abub.b = MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS;
            abub.a(1);
            abub.c = this.c;
            this.a = abub;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.e, View.ALPHA, new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
            AnimatorSet a = abua.a(this.h, 1.0f, this.d);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{a, ofFloat2});
            animatorSet2.setDuration(150);
            animatorSet2.addListener(new 3());
            this.b = animatorSet2;
            this.f.start();
            this.g = true;
        }
    }

    public final void c() {
        if (this.g) {
            this.g = false;
            if (!this.b.isRunning()) {
                if (this.f.isRunning()) {
                    this.f.addListener(new 1());
                    return;
                }
                if (!this.b.isRunning()) {
                    this.b.start();
                }
            }
        }
    }

    public final void d() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f.cancel();
        }
        abub abub = this.a;
        if (abub != null) {
            abub.removeAllListeners();
            this.a.cancel();
        }
        animatorSet = this.b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.b.cancel();
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        this.e.setAlpha(MapboxConstants.MINIMUM_ZOOM);
        this.e.a();
    }
}
