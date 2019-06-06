package com.snap.composer.attributes.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.extensions.ViewUtils;
import com.snap.composer.views.ComposerSpinnerView;
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

public final class SpinnerViewAttributesBinder implements AttributesBinder<ComposerSpinnerView> {
    public static final Companion Companion = new Companion();
    private static final Object b = new Object();
    private final ajxe a = ajxh.a(b.a);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    static final class a implements AnimatorUpdateListener {
        private /* synthetic */ SpinnerViewAttributesBinder a;
        private /* synthetic */ int b;
        private /* synthetic */ int c;
        private /* synthetic */ ComposerSpinnerView d;

        a(SpinnerViewAttributesBinder spinnerViewAttributesBinder, int i, int i2, ComposerSpinnerView composerSpinnerView) {
            this.a = spinnerViewAttributesBinder;
            this.b = i;
            this.c = i2;
            this.d = composerSpinnerView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            akcr.a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                animatedValue = ((ArgbEvaluator) this.a.a.b()).evaluate(((Float) animatedValue).floatValue(), Integer.valueOf(this.b), Integer.valueOf(this.c));
                if (animatedValue != null) {
                    this.d.setSpinnerColor(((Integer) animatedValue).intValue());
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Int");
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Float");
        }
    }

    static final class b extends akcs implements akbk<ArgbEvaluator> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArgbEvaluator();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpinnerViewAttributesBinder.class), "argbEvaluator", "getArgbEvaluator()Landroid/animation/ArgbEvaluator;");
    }

    private final ValueAnimator a(ComposerSpinnerView composerSpinnerView, int i) {
        int spinnerColor = composerSpinnerView.getSpinnerColor();
        Object ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.addUpdateListener(new a(this, spinnerColor, i, composerSpinnerView));
        akcr.a(ofFloat, "valueAnimator");
        return ofFloat;
    }

    public final void applyColor(ComposerSpinnerView composerSpinnerView, int i, ComposerAnimator composerAnimator) {
        akcr.b(composerSpinnerView, "view");
        View view = composerSpinnerView;
        ViewUtils.INSTANCE.cancelAnimation(view, b);
        if (composerAnimator == null) {
            composerSpinnerView.setSpinnerColor(i);
        } else {
            composerAnimator.addValueAnimator(b, view, a(composerSpinnerView, i));
        }
    }

    public final void bindAttributes(AttributesBindingContext<ComposerSpinnerView> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
        attributesBindingContext.getBindingContext().bindColorAttribute("color", false, new SpinnerViewAttributesBinder$bindAttributes$$inlined$bindColorAttribute$1(this, this));
    }

    public final ComposerSpinnerView getMeasurerPlaceholderView() {
        return null;
    }

    public final Class<ComposerSpinnerView> getViewClass() {
        return ComposerSpinnerView.class;
    }

    public final void resetColor(ComposerSpinnerView composerSpinnerView, ComposerAnimator composerAnimator) {
        akcr.b(composerSpinnerView, "view");
        View view = composerSpinnerView;
        ViewUtils.INSTANCE.cancelAnimation(view, b);
        if (composerAnimator == null) {
            composerSpinnerView.setSpinnerColor(-1);
        } else {
            composerAnimator.addValueAnimator(b, view, a(composerSpinnerView, -1));
        }
    }
}
