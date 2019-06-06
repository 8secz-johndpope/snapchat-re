package com.snapchat.android.framework.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SafeViewPager extends ViewPager {
    public SafeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (b() == 0 && getChildCount() == 0) ? false : super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return getChildCount() == 0 ? false : super.onTouchEvent(motionEvent);
    }
}
