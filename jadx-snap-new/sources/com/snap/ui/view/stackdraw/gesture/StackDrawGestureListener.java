package com.snap.ui.view.stackdraw.gesture;

public interface StackDrawGestureListener {
    void onDoubleTap(StackDrawLayoutTouchable stackDrawLayoutTouchable);

    void onLongPress(StackDrawLayoutTouchable stackDrawLayoutTouchable);

    void onSingleTapConfirmed(StackDrawLayoutTouchable stackDrawLayoutTouchable);
}
