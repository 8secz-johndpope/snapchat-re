package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.akcr;

public final class SwipeableMessageLinearLayout extends LinearLayout {
    public SwipeableMessageLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SwipeableMessageLinearLayout(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, 0);
    }
}
