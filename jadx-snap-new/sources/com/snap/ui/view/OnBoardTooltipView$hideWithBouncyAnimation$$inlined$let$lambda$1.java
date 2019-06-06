package com.snap.ui.view;

import android.animation.Animator;
import defpackage.abtx;
import defpackage.akcr;

public final class OnBoardTooltipView$hideWithBouncyAnimation$$inlined$let$lambda$1 extends abtx {
    final /* synthetic */ OnBoardTooltipView this$0;

    OnBoardTooltipView$hideWithBouncyAnimation$$inlined$let$lambda$1(OnBoardTooltipView onBoardTooltipView) {
        this.this$0 = onBoardTooltipView;
    }

    public final void onAnimationEnd(Animator animator) {
        akcr.b(animator, "animation");
        this.this$0.onHideAnimationEnd();
    }
}
