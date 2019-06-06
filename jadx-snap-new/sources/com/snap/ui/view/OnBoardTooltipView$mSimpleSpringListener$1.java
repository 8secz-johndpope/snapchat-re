package com.snap.ui.view;

import defpackage.akcr;
import defpackage.azs;
import defpackage.azt;

public final class OnBoardTooltipView$mSimpleSpringListener$1 extends azs {
    final /* synthetic */ OnBoardTooltipView this$0;

    OnBoardTooltipView$mSimpleSpringListener$1(OnBoardTooltipView onBoardTooltipView) {
        this.this$0 = onBoardTooltipView;
    }

    public final void onSpringUpdate(azt azt) {
        if (azt == null) {
            akcr.a();
        }
        this.this$0.setTooltipAnimationScale((float) azt.d.a);
    }
}
