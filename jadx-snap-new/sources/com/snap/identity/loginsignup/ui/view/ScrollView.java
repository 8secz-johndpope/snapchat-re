package com.snap.identity.loginsignup.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public final class ScrollView extends FrameLayout {
    public ScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 0) {
            if (getChildCount() <= 1) {
                View childAt = getChildAt(0);
                android.widget.ScrollView scrollView = new android.widget.ScrollView(getContext());
                removeView(childAt);
                addView(scrollView, new LayoutParams(-1, -2, 16));
                scrollView.addView(childAt);
                return;
            }
            throw new IllegalStateException("ScrollView cannot have more than 1 child view");
        }
    }
}
