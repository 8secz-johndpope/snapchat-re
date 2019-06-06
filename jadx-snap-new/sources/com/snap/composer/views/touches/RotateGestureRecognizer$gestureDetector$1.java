package com.snap.composer.views.touches;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import defpackage.akcr;

public final class RotateGestureRecognizer$gestureDetector$1 extends SimpleOnScaleGestureListener {
    private /* synthetic */ RotateGestureRecognizer a;

    RotateGestureRecognizer$gestureDetector$1(RotateGestureRecognizer rotateGestureRecognizer) {
        this.a = rotateGestureRecognizer;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        if (this.a.getState() == ComposerGestureRecognizerState.POSSIBLE) {
            this.a.setState(ComposerGestureRecognizerState.BEGAN);
        }
        return super.onScaleBegin(scaleGestureDetector);
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        akcr.b(scaleGestureDetector, "detector");
        super.onScaleEnd(scaleGestureDetector);
        this.a.setState(ComposerGestureRecognizerState.ENDED);
    }
}
