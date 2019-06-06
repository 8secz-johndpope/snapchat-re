package com.snap.composer.views.touches;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.akcr;

public class TapGestureRecognizer extends ComposerGestureRecognizer {
    private final GestureDetector a;
    private final TapGestureRecognizerListener b;

    public TapGestureRecognizer(View view, TapGestureRecognizerListener tapGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(tapGestureRecognizerListener, "listener");
        super(view);
        this.b = tapGestureRecognizerListener;
        this.a = new GestureDetector(view.getContext(), new TapGestureRecognizer$gestureDetector$1(this));
    }

    public final TapGestureRecognizerListener getListener() {
        return this.b;
    }

    /* Access modifiers changed, original: protected */
    public void onProcess() {
        this.b.onRecognized(this, getState(), getX(), getY());
    }

    /* Access modifiers changed, original: protected */
    public void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        if (getState() == ComposerGestureRecognizerState.POSSIBLE) {
            this.a.onTouchEvent(motionEvent);
        }
    }
}
