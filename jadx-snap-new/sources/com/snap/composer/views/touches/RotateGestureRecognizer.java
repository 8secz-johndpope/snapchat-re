package com.snap.composer.views.touches;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.attributes.impl.gestures.RotationTracker;
import defpackage.akcr;

public class RotateGestureRecognizer extends ComposerGestureRecognizer {
    private final RotationTracker a = new RotationTracker();
    private float b;
    private final ScaleGestureDetector c;
    private final RotateGestureRecognizerListener d;

    public RotateGestureRecognizer(View view, RotateGestureRecognizerListener rotateGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(rotateGestureRecognizerListener, "listener");
        super(view);
        this.d = rotateGestureRecognizerListener;
        this.c = new ScaleGestureDetector(view.getContext(), new RotateGestureRecognizer$gestureDetector$1(this));
        this.c.setQuickScaleEnabled(false);
    }

    public boolean canRecognizeSimultaneously(ComposerGestureRecognizer composerGestureRecognizer) {
        akcr.b(composerGestureRecognizer, "other");
        return akcr.a(composerGestureRecognizer.getClass(), (Object) DragGestureRecognizer.class) || akcr.a(composerGestureRecognizer.getClass(), (Object) PinchGestureRecognizer.class);
    }

    public final RotateGestureRecognizerListener getListener() {
        return this.d;
    }

    /* Access modifiers changed, original: protected */
    public void onProcess() {
        this.d.onRecognized(this, getState(), getX(), getY(), this.b);
    }

    public void onReset() {
        super.onReset();
        this.b = MapboxConstants.MINIMUM_ZOOM;
    }

    /* Access modifiers changed, original: protected */
    public void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        this.c.onTouchEvent(motionEvent);
        this.a.onTouchEvent(motionEvent);
        this.b = this.a.getRotation();
    }
}
