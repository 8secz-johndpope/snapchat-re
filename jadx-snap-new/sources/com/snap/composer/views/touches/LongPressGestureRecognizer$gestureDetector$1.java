package com.snap.composer.views.touches;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import defpackage.akcr;
import defpackage.akdp;

public final class LongPressGestureRecognizer$gestureDetector$1 extends SimpleOnGestureListener {
    private /* synthetic */ LongPressGestureRecognizer a;

    LongPressGestureRecognizer$gestureDetector$1(LongPressGestureRecognizer longPressGestureRecognizer) {
        this.a = longPressGestureRecognizer;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        if (!this.a.getDestroyed() && this.a.getState() == ComposerGestureRecognizerState.POSSIBLE && this.a.getAllowSelfTrigger()) {
            this.a.setState(ComposerGestureRecognizerState.BEGAN);
            LongPressGestureRecognizerListener listener = this.a.getListener();
            LongPressGestureRecognizer longPressGestureRecognizer = this.a;
            listener.onRecognized(longPressGestureRecognizer, longPressGestureRecognizer.getState(), akdp.a(motionEvent.getX()), akdp.a(motionEvent.getY()));
        }
    }
}
