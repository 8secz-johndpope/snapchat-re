package com.snap.cognac.internal.opera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import defpackage.akcr;
import defpackage.jo;
import defpackage.zpj;

public final class StatusBarLayout extends LinearLayout {
    public jo a;

    public static final class a extends SimpleOnGestureListener {
        private final float a;
        private final View b;

        public a(Context context, View view) {
            akcr.b(context, "context");
            akcr.b(view, "statusPanel");
            this.b = view;
            Object obj = ViewConfiguration.get(context);
            String str = "ViewConfiguration.get(context)";
            akcr.a(obj, str);
            int scaledMaximumFlingVelocity = obj.getScaledMaximumFlingVelocity();
            Object obj2 = ViewConfiguration.get(context);
            akcr.a(obj2, str);
            int scaledMinimumFlingVelocity = obj2.getScaledMinimumFlingVelocity();
            this.a = (((float) (scaledMaximumFlingVelocity - scaledMinimumFlingVelocity)) * 0.2f) + ((float) scaledMinimumFlingVelocity);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (f2 <= this.a) {
                return false;
            }
            zpj.a(this.b.getContext(), this.b.getWindowToken());
            return true;
        }
    }

    public StatusBarLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jo joVar = this.a;
        return (joVar != null ? joVar.a(motionEvent) : false) || super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jo joVar = this.a;
        if (joVar != null) {
            joVar.a(motionEvent);
        }
        performClick();
        return true;
    }

    public final boolean performClick() {
        return super.performClick();
    }
}
