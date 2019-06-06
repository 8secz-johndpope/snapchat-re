package com.snap.ui.view.placeholder;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import defpackage.ajej;
import defpackage.akcr;

public final class NeonPlaceholderViewFactory$createPlaceholderView$1$2 implements OnAttachStateChangeListener {
    final /* synthetic */ ajej $disposable;

    NeonPlaceholderViewFactory$createPlaceholderView$1$2(ajej ajej) {
        this.$disposable = ajej;
    }

    public final void onViewAttachedToWindow(View view) {
        akcr.b(view, "view");
    }

    public final void onViewDetachedFromWindow(View view) {
        akcr.b(view, "view");
        this.$disposable.dispose();
    }
}
