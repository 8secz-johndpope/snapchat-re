package com.snap.ui.view.scrollbar;

import android.view.animation.Animation;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abtv;
import defpackage.akcr;

public final class SnapScrollBarIndicator$hideIndicatorTextView$1 extends abtv {
    final /* synthetic */ Runnable $scrollbarDismiss;
    final /* synthetic */ SnapScrollBarIndicator this$0;

    SnapScrollBarIndicator$hideIndicatorTextView$1(SnapScrollBarIndicator snapScrollBarIndicator, Runnable runnable) {
        this.this$0 = snapScrollBarIndicator;
        this.$scrollbarDismiss = runnable;
    }

    public final void onAnimationEnd(Animation animation) {
        akcr.b(animation, "animation");
        Runnable runnable = this.$scrollbarDismiss;
        if (runnable != null) {
            runnable.run();
        }
        this.this$0.indicatorText.setVisibility(4);
        this.this$0.targetShownFraction = MapboxConstants.MINIMUM_ZOOM;
    }
}
