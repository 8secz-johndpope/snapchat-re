package com.snap.ui.view.stackdraw;

import com.snap.ui.view.stackdraw.gesture.StackDrawLayoutTouchable;
import defpackage.akcr;
import defpackage.zkj;

public class InternalStackDrawGestureListener extends zkj {
    public StackDrawLayoutTouchable lastTouchable;

    public final StackDrawLayoutTouchable getLastTouchable() {
        StackDrawLayoutTouchable stackDrawLayoutTouchable = this.lastTouchable;
        if (stackDrawLayoutTouchable == null) {
            akcr.a("lastTouchable");
        }
        return stackDrawLayoutTouchable;
    }

    public final void setLastTouchable(StackDrawLayoutTouchable stackDrawLayoutTouchable) {
        akcr.b(stackDrawLayoutTouchable, "<set-?>");
        this.lastTouchable = stackDrawLayoutTouchable;
    }
}
