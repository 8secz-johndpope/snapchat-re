package com.snap.commerce.lib.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ProductDetailsRecyclerView$cwc3H8U6R6f5RRAghc0a6uza7L4 implements AnimatorUpdateListener {
    private final /* synthetic */ ProductDetailsRecyclerView f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ -$$Lambda$ProductDetailsRecyclerView$cwc3H8U6R6f5RRAghc0a6uza7L4(ProductDetailsRecyclerView productDetailsRecyclerView, int i) {
        this.f$0 = productDetailsRecyclerView;
        this.f$1 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.a(this.f$1, valueAnimator);
    }
}
