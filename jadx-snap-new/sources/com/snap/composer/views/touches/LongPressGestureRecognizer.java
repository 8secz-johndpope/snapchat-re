package com.snap.composer.views.touches;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.akcr;

public class LongPressGestureRecognizer extends ComposerGestureRecognizer {
    private boolean a;
    private final GestureDetector b;
    private final LongPressGestureRecognizerListener c;

    public LongPressGestureRecognizer(View view, LongPressGestureRecognizerListener longPressGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(longPressGestureRecognizerListener, "listener");
        super(view);
        this.c = longPressGestureRecognizerListener;
        this.b = new GestureDetector(view.getContext(), new LongPressGestureRecognizer$gestureDetector$1(this));
    }

    public final boolean getAllowSelfTrigger() {
        return this.a;
    }

    public final LongPressGestureRecognizerListener getListener() {
        return this.c;
    }

    /* Access modifiers changed, original: protected */
    public void onProcess() {
    }

    public void onReset() {
        this.a = false;
    }

    /* Access modifiers changed, original: protected */
    public void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        if (getState() == ComposerGestureRecognizerState.POSSIBLE) {
            this.a = true;
            this.b.onTouchEvent(motionEvent);
        }
    }

    public final void setAllowSelfTrigger(boolean z) {
        this.a = z;
    }
}
