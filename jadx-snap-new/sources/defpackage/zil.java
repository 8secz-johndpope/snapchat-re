package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: zil */
public final class zil {
    private static final ajxe a = ajxh.a(a.a);

    /* renamed from: zil$a */
    static final class a extends akcs implements akbk<Interpolator> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return kr.a(0.25f, 0.1f, 0.25f, 1.0f);
        }
    }

    /* renamed from: zil$b */
    static final class b implements Runnable {
        private /* synthetic */ View a;

        b(View view) {
            this.a = view;
        }

        public final void run() {
            this.a.setVisibility(4);
        }
    }

    static {
        new aken[1][0] = new akda(akde.a(zil.class, "core-ui_release"), "fadeOutAnimationInterpolator", "getFadeOutAnimationInterpolator()Landroid/view/animation/Interpolator;");
    }

    private static final Interpolator a() {
        return (Interpolator) a.b();
    }

    public static final void a(View view, float f, long j) {
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator translationY = animate.translationY(f);
                if (translationY != null) {
                    translationY = translationY.alpha(MapboxConstants.MINIMUM_ZOOM);
                    if (translationY != null) {
                        translationY = translationY.setDuration(j);
                        if (translationY != null) {
                            translationY = translationY.setInterpolator(zil.a());
                            if (translationY != null) {
                                ViewPropertyAnimator withEndAction = translationY.withEndAction(new b(view));
                                if (withEndAction != null) {
                                    withEndAction.start();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final void a(View view, int i, float f, float f2) {
        if (view != null) {
            view.animate().cancel();
            view.setVisibility(i);
            view.setAlpha(f);
            view.setTranslationY(f2);
        }
    }
}
