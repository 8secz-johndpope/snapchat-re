package com.snapchat.android.framework.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.absi.a;

public class SoftNavAwareFrameLayout extends FrameLayout {
    public SoftNavAwareFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SoftNavAwareFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        int e = a.a.e();
        if (e > 0) {
            setClipChildren(false);
            setClipToPadding(false);
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + e);
        }
    }
}
