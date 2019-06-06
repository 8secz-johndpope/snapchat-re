package com.snap.composer.views.touches;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

public final class TapGestureRecognizer$gestureDetector$1 extends SimpleOnGestureListener {
    private /* synthetic */ TapGestureRecognizer a;

    TapGestureRecognizer$gestureDetector$1(TapGestureRecognizer tapGestureRecognizer) {
        this.a = tapGestureRecognizer;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.setState(ComposerGestureRecognizerState.BEGAN);
        return true;
    }
}
