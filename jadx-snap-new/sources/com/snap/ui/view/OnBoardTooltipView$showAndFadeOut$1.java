package com.snap.ui.view;

import android.view.animation.Animation;
import defpackage.abtv;
import defpackage.akcr;

public final class OnBoardTooltipView$showAndFadeOut$1 extends abtv {
    final /* synthetic */ OnBoardTooltipView this$0;

    OnBoardTooltipView$showAndFadeOut$1(OnBoardTooltipView onBoardTooltipView) {
        this.this$0 = onBoardTooltipView;
    }

    public final void onAnimationEnd(Animation animation) {
        akcr.b(animation, "animation");
        this.this$0.onHideAnimationEnd();
    }
}
