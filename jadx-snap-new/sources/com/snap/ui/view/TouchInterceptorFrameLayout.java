package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.akco;
import defpackage.akcr;

public final class TouchInterceptorFrameLayout extends FrameLayout {
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    public interface OnInterceptTouchEventListener {
        boolean onInterceptTouchEvent(MotionEvent motionEvent);
    }

    public TouchInterceptorFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ TouchInterceptorFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, akco akco) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.onInterceptTouchEventListener;
        return onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(motionEvent) : false;
    }

    public final void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }
}
