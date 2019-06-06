package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zpi$5r0I6X8lpQPBaLDzflw4S5oQUKU */
public final /* synthetic */ class -$$Lambda$zpi$5r0I6X8lpQPBaLDzflw4S5oQUKU implements AnimatorUpdateListener {
    private final /* synthetic */ View f$0;

    public /* synthetic */ -$$Lambda$zpi$5r0I6X8lpQPBaLDzflw4S5oQUKU(View view) {
        this.f$0 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zpi.a(this.f$0, valueAnimator);
    }
}
