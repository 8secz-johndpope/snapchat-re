package com.snap.ui.view;

import com.snap.ui.view.OnBoardTooltipView.Builder;
import defpackage.ajfc;
import defpackage.akcr;

final class OnBoardTooltipView$Builder$buildObservable$2<T, R> implements ajfc<T, R> {
    final /* synthetic */ Builder this$0;

    OnBoardTooltipView$Builder$buildObservable$2(Builder builder) {
        this.this$0 = builder;
    }

    public final OnBoardTooltipView apply(OnBoardTooltipView onBoardTooltipView) {
        akcr.b(onBoardTooltipView, "it");
        return onBoardTooltipView.initialize(this.this$0.mViewAttachTo, this.this$0.mStringId, this.this$0.mTooltipDirection, this.this$0.mColorId, this.this$0.mTextColorId, this.this$0.mTextBackgroundDrawableId, this.this$0.mTooltipMarginDpResId, this.this$0.mTooltipStringParameters, this.this$0.mTooltipMarginInPx);
    }
}
