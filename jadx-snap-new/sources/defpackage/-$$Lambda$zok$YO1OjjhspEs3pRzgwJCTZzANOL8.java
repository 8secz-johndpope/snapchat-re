package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zok$YO1OjjhspEs3pRzgwJCTZzANOL8 */
public final /* synthetic */ class -$$Lambda$zok$YO1OjjhspEs3pRzgwJCTZzANOL8 implements AnimatorUpdateListener {
    private final /* synthetic */ Drawable f$0;
    private final /* synthetic */ Drawable f$1;
    private final /* synthetic */ View f$2;

    public /* synthetic */ -$$Lambda$zok$YO1OjjhspEs3pRzgwJCTZzANOL8(Drawable drawable, Drawable drawable2, View view) {
        this.f$0 = drawable;
        this.f$1 = drawable2;
        this.f$2 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        zok.a(this.f$0, this.f$1, this.f$2, valueAnimator);
    }
}
