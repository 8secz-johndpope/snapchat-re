package com.snap.mushroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.snap.mushroom.MainActivity;
import defpackage.zjh;

public class AppDeckView extends zjh {
    private boolean c = false;

    public AppDeckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (getContext() instanceof MainActivity) {
            try {
                return super.getChildDrawingOrder(i, i2);
            } catch (IllegalStateException unused) {
            }
        }
        return i2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.c = false;
        }
        return this.c ? false : super.onInterceptTouchEvent(motionEvent);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.c = z;
    }
}
