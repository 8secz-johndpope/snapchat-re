package com.snap.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class TouchAuditingStackingLayout extends StackingLayout {
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    public interface OnInterceptTouchEventListener {
        void auditTouchEvent(MotionEvent motionEvent);
    }

    public TouchAuditingStackingLayout(Context context) {
        super(context);
    }

    public TouchAuditingStackingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchAuditingStackingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.onInterceptTouchEventListener;
        if (onInterceptTouchEventListener != null) {
            onInterceptTouchEventListener.auditTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOnInterceptTouchEventListener(OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }
}
