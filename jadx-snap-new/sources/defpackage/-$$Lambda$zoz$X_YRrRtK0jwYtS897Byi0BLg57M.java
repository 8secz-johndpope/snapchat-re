package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.widget.ImageView;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zoz$X_YRrRtK0jwYtS897Byi0BLg57M */
public final /* synthetic */ class -$$Lambda$zoz$X_YRrRtK0jwYtS897Byi0BLg57M implements AnimatorUpdateListener {
    private final /* synthetic */ ArgbEvaluator f$0;
    private final /* synthetic */ int f$1;
    private final /* synthetic */ int f$2;
    private final /* synthetic */ ImageView f$3;

    public /* synthetic */ -$$Lambda$zoz$X_YRrRtK0jwYtS897Byi0BLg57M(ArgbEvaluator argbEvaluator, int i, int i2, ImageView imageView) {
        this.f$0 = argbEvaluator;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = imageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        la.a(this.f$3, ColorStateList.valueOf(((Integer) this.f$0.evaluate(((Float) valueAnimator.getAnimatedValue()).floatValue(), Integer.valueOf(this.f$1), Integer.valueOf(this.f$2))).intValue()));
    }
}
