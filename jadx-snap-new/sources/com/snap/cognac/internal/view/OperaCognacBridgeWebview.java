package com.snap.cognac.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.acbq;

public final class OperaCognacBridgeWebview extends acbq {
    public OperaCognacBridgeWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public final boolean canScrollVertically(int i) {
        return true;
    }

    public final void computeScroll() {
    }
}
