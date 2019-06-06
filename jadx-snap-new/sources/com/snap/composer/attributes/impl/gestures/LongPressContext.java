package com.snap.composer.attributes.impl.gestures;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import com.snap.composer.views.touches.LongPressGestureRecognizer;
import com.snap.composer.views.touches.LongPressGestureRecognizerListener;
import defpackage.akcr;

public final class LongPressContext implements LongPressGestureRecognizerListener {
    private final ComposerAction a;

    public LongPressContext(ComposerAction composerAction) {
        akcr.b(composerAction, "action");
        this.a = composerAction;
    }

    public final void onRecognized(LongPressGestureRecognizer longPressGestureRecognizer, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2) {
        akcr.b(longPressGestureRecognizer, MapboxEvent.KEY_GESTURE_ID);
        akcr.b(composerGestureRecognizerState, "state");
        this.a.perform(GestureAttributesUtils.INSTANCE.getGestureParams(longPressGestureRecognizer.getView(), composerGestureRecognizerState, i, i2));
    }
}
