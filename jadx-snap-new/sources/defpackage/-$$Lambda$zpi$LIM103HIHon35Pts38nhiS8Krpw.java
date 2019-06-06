package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zpi$LIM103HIHon35Pts38nhiS8Krpw */
public final /* synthetic */ class -$$Lambda$zpi$LIM103HIHon35Pts38nhiS8Krpw implements AnimatorUpdateListener {
    private final /* synthetic */ View f$0;

    public /* synthetic */ -$$Lambda$zpi$LIM103HIHon35Pts38nhiS8Krpw(View view) {
        this.f$0 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
