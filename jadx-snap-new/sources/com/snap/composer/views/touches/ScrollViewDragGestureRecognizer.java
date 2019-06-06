package com.snap.composer.views.touches;

import android.view.MotionEvent;
import android.view.View;
import defpackage.akcr;

public final class ScrollViewDragGestureRecognizer extends DragGestureRecognizer {
    private boolean a;
    private boolean b;

    public ScrollViewDragGestureRecognizer(View view, DragGestureRecognizerListener dragGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(dragGestureRecognizerListener, "listener");
        super(view, dragGestureRecognizerListener);
    }

    public final boolean isAnimatingScroll() {
        return this.b;
    }

    public final boolean isHorizontalScroll() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        super.onUpdate(motionEvent);
        if (this.b && motionEvent.getActionMasked() == 0 && getState() == ComposerGestureRecognizerState.POSSIBLE) {
            recognize(motionEvent);
        }
    }

    public final void setAnimatingScroll(boolean z) {
        this.b = z;
    }

    public final void setHorizontalScroll(boolean z) {
        this.a = z;
    }

    public final boolean shouldRecognize(float f, float f2) {
        return this.a ? Math.abs(f) > Math.abs(f2) : Math.abs(f2) > Math.abs(f);
    }
}
