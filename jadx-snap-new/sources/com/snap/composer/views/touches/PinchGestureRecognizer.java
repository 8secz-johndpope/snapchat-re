package com.snap.composer.views.touches;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import defpackage.akcr;

public class PinchGestureRecognizer extends ComposerGestureRecognizer {
    private float a = 1.0f;
    private final ScaleGestureDetector b;
    private final PinchGestureRecognizerListener c;

    public PinchGestureRecognizer(View view, PinchGestureRecognizerListener pinchGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(pinchGestureRecognizerListener, "listener");
        super(view);
        this.c = pinchGestureRecognizerListener;
        this.b = new ScaleGestureDetector(view.getContext(), new PinchGestureRecognizer$gestureDetector$1(this));
        this.b.setQuickScaleEnabled(false);
    }

    public boolean canRecognizeSimultaneously(ComposerGestureRecognizer composerGestureRecognizer) {
        akcr.b(composerGestureRecognizer, "other");
        return akcr.a(composerGestureRecognizer.getClass(), (Object) DragGestureRecognizer.class) || akcr.a(composerGestureRecognizer.getClass(), (Object) RotateGestureRecognizer.class);
    }

    public final PinchGestureRecognizerListener getListener() {
        return this.c;
    }

    /* Access modifiers changed, original: protected */
    public void onProcess() {
        this.c.onRecognized(this, getState(), getX(), getY(), this.a);
    }

    public void onReset() {
        super.onReset();
        this.a = 1.0f;
    }

    /* Access modifiers changed, original: protected */
    public void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        this.b.onTouchEvent(motionEvent);
    }
}
