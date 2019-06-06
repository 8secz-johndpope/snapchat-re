package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zoy$78BBCGXykWNxKkuFsIsfCBNXyF8 */
public final /* synthetic */ class -$$Lambda$zoy$78BBCGXykWNxKkuFsIsfCBNXyF8 implements AnimatorUpdateListener {
    private final /* synthetic */ TextView f$0;
    private final /* synthetic */ CharSequence f$1;
    private final /* synthetic */ CharSequence f$2;

    public /* synthetic */ -$$Lambda$zoy$78BBCGXykWNxKkuFsIsfCBNXyF8(TextView textView, CharSequence charSequence, CharSequence charSequence2) {
        this.f$0 = textView;
        this.f$1 = charSequence;
        this.f$2 = charSequence2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zoy.a(this.f$0, this.f$1, this.f$2, valueAnimator);
    }
}
