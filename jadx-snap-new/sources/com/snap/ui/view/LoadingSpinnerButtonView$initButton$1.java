package com.snap.ui.view;

import android.widget.ImageView;
import com.snap.ui.view.ViewStubWrapper.OnInflatedListener;
import defpackage.akcr;

public final class LoadingSpinnerButtonView$initButton$1 implements OnInflatedListener<ImageView> {
    final /* synthetic */ LoadingSpinnerButtonView this$0;

    LoadingSpinnerButtonView$initButton$1(LoadingSpinnerButtonView loadingSpinnerButtonView) {
        this.this$0 = loadingSpinnerButtonView;
    }

    public final void onInflated(ImageView imageView) {
        akcr.b(imageView, "view");
        imageView.setColorFilter(this.this$0.mCheckedTextColor);
        imageView.setImageResource(this.this$0.mCheckedIconResId);
        LoadingSpinnerButtonView loadingSpinnerButtonView = this.this$0;
        loadingSpinnerButtonView.updateIconSize(imageView, loadingSpinnerButtonView.mCheckedIconSize);
    }
}
