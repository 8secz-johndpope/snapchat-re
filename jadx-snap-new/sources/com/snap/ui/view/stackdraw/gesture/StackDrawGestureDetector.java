package com.snap.ui.view.stackdraw.gesture;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.snap.ui.view.stackdraw.InternalStackDrawGestureListener;
import defpackage.akcr;

public final class StackDrawGestureDetector extends GestureDetector {
    private final InternalStackDrawGestureListener mGestureListener;

    public StackDrawGestureDetector(Context context, InternalStackDrawGestureListener internalStackDrawGestureListener) {
        akcr.b(context, "context");
        akcr.b(internalStackDrawGestureListener, "mGestureListener");
        super(context, internalStackDrawGestureListener);
        this.mGestureListener = internalStackDrawGestureListener;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent, StackDrawLayoutTouchable stackDrawLayoutTouchable) {
        akcr.b(motionEvent, "ev");
        akcr.b(stackDrawLayoutTouchable, "touchable");
        this.mGestureListener.setLastTouchable(stackDrawLayoutTouchable);
        return super.onTouchEvent(motionEvent);
    }
}
