package com.snap.composer.views.touches;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import defpackage.akcr;

public final class DragGestureRecognizer$gestureDetector$1 extends SimpleOnGestureListener {
    private /* synthetic */ DragGestureRecognizer a;

    DragGestureRecognizer$gestureDetector$1(DragGestureRecognizer dragGestureRecognizer) {
        this.a = dragGestureRecognizer;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        akcr.b(motionEvent, "start");
        if (this.a.getState() == ComposerGestureRecognizerState.POSSIBLE) {
            if (this.a.shouldRecognize(f, f2)) {
                this.a.recognize(motionEvent);
            } else {
                this.a.setState(ComposerGestureRecognizerState.FAILED);
            }
        }
        DragGestureRecognizer dragGestureRecognizer = this.a;
        dragGestureRecognizer.a = dragGestureRecognizer.a - f;
        dragGestureRecognizer = this.a;
        dragGestureRecognizer.b = dragGestureRecognizer.b - f2;
        return true;
    }
}
