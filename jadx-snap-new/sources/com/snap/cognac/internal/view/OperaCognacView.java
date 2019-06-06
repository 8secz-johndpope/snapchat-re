package com.snap.cognac.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public final class OperaCognacView extends RelativeLayout {
    public OperaCognacView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
