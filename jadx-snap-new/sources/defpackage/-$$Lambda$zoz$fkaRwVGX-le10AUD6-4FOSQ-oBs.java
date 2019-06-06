package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.widget.ImageView;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zoz$fkaRwVGX-le10AUD6-4FOSQ-oBs */
public final /* synthetic */ class -$$Lambda$zoz$fkaRwVGX-le10AUD6-4FOSQ-oBs implements AnimatorUpdateListener {
    private final /* synthetic */ ImageView f$0;
    private final /* synthetic */ ColorStateList f$1;

    public /* synthetic */ -$$Lambda$zoz$fkaRwVGX-le10AUD6-4FOSQ-oBs(ImageView imageView, ColorStateList colorStateList) {
        this.f$0 = imageView;
        this.f$1 = colorStateList;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        la.a(this.f$0, this.f$1.withAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f)));
    }
}
