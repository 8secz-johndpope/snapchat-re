package com.snap.composer.views.touches;

import android.view.MotionEvent;
import android.view.View;
import defpackage.akcr;

public class TouchGestureRecognizer extends ComposerGestureRecognizer {
    private final TouchGestureRecognizerListener a;

    public TouchGestureRecognizer(View view, TouchGestureRecognizerListener touchGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(touchGestureRecognizerListener, "listener");
        super(view);
        this.a = touchGestureRecognizerListener;
    }

    public boolean canRecognizeSimultaneously(ComposerGestureRecognizer composerGestureRecognizer) {
        akcr.b(composerGestureRecognizer, "other");
        return true;
    }

    public final TouchGestureRecognizerListener getListener() {
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public void onProcess() {
        this.a.onRecognized(this, getState(), getX(), getY());
    }

    /* Access modifiers changed, original: protected */
    public void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        ComposerGestureRecognizerState composerGestureRecognizerState = actionMasked != 0 ? (actionMasked == 1 || actionMasked == 3) ? ComposerGestureRecognizerState.ENDED : ComposerGestureRecognizerState.CHANGED : ComposerGestureRecognizerState.BEGAN;
        setState(composerGestureRecognizerState);
    }
}
