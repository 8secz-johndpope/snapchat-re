package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.eo.c;

/* renamed from: dv */
public final class dv extends fj {

    /* renamed from: dv$a */
    static class a extends AnimatorListenerAdapter {
        private final View a;
        private boolean b = false;

        a(View view) {
            this.a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            fc.a(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (kb.a.i(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public dv(int i) {
        if ((i & -4) == 0) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    private static float a(es esVar, float f) {
        if (esVar == null) {
            return f;
        }
        Float f2 = (Float) esVar.a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }

    private Animator a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        fc.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, fc.b, new float[]{f2});
        ofFloat.addListener(new a(view));
        a((c) new ep() {
            public final void a(eo eoVar) {
                fc.a(view, 1.0f);
                fc.a.d(view);
                eoVar.b((c) this);
            }
        });
        return ofFloat;
    }

    public final Animator a(View view, es esVar) {
        float a = dv.a(esVar, (float) MapboxConstants.MINIMUM_ZOOM);
        if (a == 1.0f) {
            a = MapboxConstants.MINIMUM_ZOOM;
        }
        return a(view, a, 1.0f);
    }

    public final void a(es esVar) {
        super.a(esVar);
        esVar.a.put("android:fade:transitionAlpha", Float.valueOf(fc.b(esVar.b)));
    }

    public final Animator b(View view, es esVar) {
        fc.a.c(view);
        return a(view, dv.a(esVar, 1.0f), MapboxConstants.MINIMUM_ZOOM);
    }
}
