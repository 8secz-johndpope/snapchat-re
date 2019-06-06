package com.snap.ui.view;

import android.view.View;
import com.snap.ui.view.OnBoardTooltipView.Builder;
import com.snapchat.android.R;
import defpackage.ajfc;
import defpackage.akcr;

final class OnBoardTooltipView$Builder$buildObservable$1<T, R> implements ajfc<T, R> {
    final /* synthetic */ Builder this$0;

    OnBoardTooltipView$Builder$buildObservable$1(Builder builder) {
        this.this$0 = builder;
    }

    public final OnBoardTooltipView apply(OnBoardTooltipView onBoardTooltipView) {
        akcr.b(onBoardTooltipView, "it");
        View.inflate(this.this$0.mContext, R.layout.onboard_tooltip_layout, onBoardTooltipView);
        return onBoardTooltipView;
    }
}
