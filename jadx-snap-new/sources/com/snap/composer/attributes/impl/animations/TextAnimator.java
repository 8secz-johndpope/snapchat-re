package com.snap.composer.attributes.impl.animations;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class TextAnimator {
    public static final Companion Companion = new Companion();
    private static final ajxe a = ajxh.a(a.a);

    public static final class Companion {

        static final class a implements AnimatorUpdateListener {
            private /* synthetic */ int a;
            private /* synthetic */ int b;
            private /* synthetic */ TextView c;

            a(int i, int i2, TextView textView) {
                this.a = i;
                this.b = i2;
                this.c = textView;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                akcr.a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    animatedValue = ((ArgbEvaluator) TextAnimator.a.b()).evaluate(((Float) animatedValue).floatValue(), Integer.valueOf(this.a), Integer.valueOf(this.b));
                    if (animatedValue != null) {
                        this.c.setTextColor(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type kotlin.Int");
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Float");
            }
        }

        static {
            new aken[1][0] = new akdc(akde.a(Companion.class), "argbEvaluator", "getArgbEvaluator()Landroid/animation/ArgbEvaluator;");
        }

        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ValueAnimator animateTextColor(TextView textView, int i) {
            akcr.b(textView, "view");
            int currentTextColor = textView.getCurrentTextColor();
            Object ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            ofFloat.addUpdateListener(new a(currentTextColor, i, textView));
            akcr.a(ofFloat, "valueAnimator");
            return ofFloat;
        }
    }

    static final class a extends akcs implements akbk<ArgbEvaluator> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArgbEvaluator();
        }
    }
}
