package com.snap.messaging.chat.features.actionmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import defpackage.akcr;

public final class ActionMenuChatItemContainer extends FrameLayout {
    public int a;
    public boolean b;

    public ActionMenuChatItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ActionMenuChatItemContainer(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i2) == 0 || MeasureSpec.getSize(i2) > this.a) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final boolean performClick() {
        return super.performClick();
    }
}
