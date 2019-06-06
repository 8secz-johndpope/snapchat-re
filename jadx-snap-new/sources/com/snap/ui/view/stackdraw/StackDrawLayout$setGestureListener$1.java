package com.snap.ui.view.stackdraw;

import android.view.MotionEvent;
import com.snap.ui.view.stackdraw.gesture.StackDrawGestureListener;

public final class StackDrawLayout$setGestureListener$1 extends InternalStackDrawGestureListener {
    final /* synthetic */ StackDrawLayout this$0;

    StackDrawLayout$setGestureListener$1(StackDrawLayout stackDrawLayout) {
        this.this$0 = stackDrawLayout;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        StackDrawGestureListener access$getGestureListener$p = this.this$0.gestureListener;
        if (access$getGestureListener$p != null) {
            access$getGestureListener$p.onDoubleTap(getLastTouchable());
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        StackDrawGestureListener access$getGestureListener$p = this.this$0.gestureListener;
        if (access$getGestureListener$p != null) {
            access$getGestureListener$p.onLongPress(getLastTouchable());
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        StackDrawGestureListener access$getGestureListener$p = this.this$0.gestureListener;
        if (access$getGestureListener$p != null) {
            access$getGestureListener$p.onSingleTapConfirmed(getLastTouchable());
        }
        return true;
    }
}
