package com.snap.composer.attributes.impl.animations;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.drawables.ComposerGradientDrawable;
import com.snap.composer.views.ComposerClippableView;
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

public final class ViewAnimator {
    public static final Companion Companion = new Companion();
    private static final ajxe a = ajxh.a(a.a);

    public static final class Companion {

        static final class a implements AnimatorUpdateListener {
            private /* synthetic */ View a;

            a(View view) {
                this.a = view;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view = this.a;
                akcr.a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setAlpha(((Float) animatedValue).floatValue());
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Float");
            }
        }

        static final class b implements AnimatorUpdateListener {
            private /* synthetic */ int a;
            private /* synthetic */ int b;
            private /* synthetic */ int c;
            private /* synthetic */ int d;
            private /* synthetic */ ComposerGradientDrawable e;

            b(int i, int i2, int i3, int i4, ComposerGradientDrawable composerGradientDrawable) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
                this.e = composerGradientDrawable;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                akcr.a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    int access$interpolate = (int) (((((float) this.b) - ((float) this.a)) * floatValue) + ((float) this.a));
                    animatedValue = ((ArgbEvaluator) ViewAnimator.a.b()).evaluate(floatValue, Integer.valueOf(this.c), Integer.valueOf(this.d));
                    if (animatedValue != null) {
                        this.e.setStroke(access$interpolate, ((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type kotlin.Int");
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Float");
            }
        }

        static final class c implements AnimatorUpdateListener {
            private /* synthetic */ float a;
            private /* synthetic */ float b;
            private /* synthetic */ float c;
            private /* synthetic */ float d;
            private /* synthetic */ float e;
            private /* synthetic */ float f;
            private /* synthetic */ float g;
            private /* synthetic */ float h;
            private /* synthetic */ ComposerGradientDrawable i;
            private /* synthetic */ View j;

            c(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, ComposerGradientDrawable composerGradientDrawable, View view) {
                this.a = f;
                this.b = f2;
                this.c = f3;
                this.d = f4;
                this.e = f5;
                this.f = f6;
                this.g = f7;
                this.h = f8;
                this.i = composerGradientDrawable;
                this.j = view;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                akcr.a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    this.i.setComposerBorderRadius((((this.b - this.a) * floatValue) + this.a), (((this.d - this.c) * floatValue) + this.c), (((this.f - this.e) * floatValue) + this.e), (((this.h - this.g) * floatValue) + this.g));
                    View view = this.j;
                    if (view instanceof ComposerClippableView) {
                        ((ComposerClippableView) view).getClipper().setBorderRadii(this.i.getComposerCornerRadiusArray(), this.i.getHasNonNullCornerRadius());
                        this.j.invalidate();
                        return;
                    }
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Float");
            }
        }

        static final class d implements AnimatorUpdateListener {
            private /* synthetic */ View a;

            d(View view) {
                this.a = view;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                akcr.a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    this.a.setElevation(((Float) animatedValue).floatValue());
                    return;
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

        public final ValueAnimator animateAlpha(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getAlpha(), f});
            ofFloat.addUpdateListener(new a(view));
            akcr.a(ofFloat, "valueAnimator");
            return ofFloat;
        }

        public final ValueAnimator animateBorder(ComposerGradientDrawable composerGradientDrawable, int i, int i2) {
            akcr.b(composerGradientDrawable, "drawable");
            int composerStrokeColor = composerGradientDrawable.getComposerStrokeColor();
            int composerStrokeWidth = composerGradientDrawable.getComposerStrokeWidth();
            Object ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            ofFloat.addUpdateListener(new b(composerStrokeWidth, i, composerStrokeColor, i2, composerGradientDrawable));
            akcr.a(ofFloat, "valueAnimator");
            return ofFloat;
        }

        public final ValueAnimator animateBorderRadius(View view, ComposerGradientDrawable composerGradientDrawable, float f, float f2, float f3, float f4) {
            View view2 = view;
            akcr.b(view, "view");
            ComposerGradientDrawable composerGradientDrawable2 = composerGradientDrawable;
            akcr.b(composerGradientDrawable, "drawable");
            float topLeftCornerRadius = composerGradientDrawable.getTopLeftCornerRadius();
            float topRightCornerRadius = composerGradientDrawable.getTopRightCornerRadius();
            float bottomRightCornerRadius = composerGradientDrawable.getBottomRightCornerRadius();
            float bottomLeftCornerRadius = composerGradientDrawable.getBottomLeftCornerRadius();
            Object ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            ofFloat.addUpdateListener(new c(topLeftCornerRadius, f, topRightCornerRadius, f2, bottomRightCornerRadius, f3, bottomLeftCornerRadius, f4, composerGradientDrawable2, view2));
            akcr.a(ofFloat, "valueAnimator");
            return ofFloat;
        }

        public final ValueAnimator animateElevation(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getElevation(), f});
            ofFloat.addUpdateListener(new d(view));
            akcr.a(ofFloat, "valueAnimator");
            return ofFloat;
        }

        public final ValueAnimator animateRotate(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getRotation(), f});
            ofFloat.addUpdateListener(new ViewAnimator$Companion$animateRotate$$inlined$animateTransformElement$1(view));
            akcr.a(ofFloat, "animator");
            return ofFloat;
        }

        public final ValueAnimator animateScaleX(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getScaleX(), f});
            ofFloat.addUpdateListener(new ViewAnimator$Companion$animateScaleX$$inlined$animateTransformElement$1(view));
            akcr.a(ofFloat, "animator");
            return ofFloat;
        }

        public final ValueAnimator animateScaleY(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getScaleY(), f});
            ofFloat.addUpdateListener(new ViewAnimator$Companion$animateScaleY$$inlined$animateTransformElement$1(view));
            akcr.a(ofFloat, "animator");
            return ofFloat;
        }

        public final ValueAnimator animateTranslationX(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getTranslationX(), f});
            ofFloat.addUpdateListener(new ViewAnimator$Companion$animateTranslationX$$inlined$animateTransformElement$1(view));
            akcr.a(ofFloat, "animator");
            return ofFloat;
        }

        public final ValueAnimator animateTranslationY(View view, float f) {
            akcr.b(view, "view");
            Object ofFloat = ValueAnimator.ofFloat(new float[]{view.getTranslationY(), f});
            ofFloat.addUpdateListener(new ViewAnimator$Companion$animateTranslationY$$inlined$animateTransformElement$1(view));
            akcr.a(ofFloat, "animator");
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
