package com.snap.composer.attributes.impl.gestures;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import com.snap.composer.views.touches.TapGestureRecognizer;
import com.snap.composer.views.touches.TapGestureRecognizerListener;
import defpackage.akcr;

public final class TapContext implements TapGestureRecognizerListener {
    private final ComposerAction a;

    public TapContext(ComposerAction composerAction) {
        akcr.b(composerAction, "action");
        this.a = composerAction;
    }

    public final void onRecognized(TapGestureRecognizer tapGestureRecognizer, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2) {
        akcr.b(tapGestureRecognizer, MapboxEvent.KEY_GESTURE_ID);
        akcr.b(composerGestureRecognizerState, "state");
        if (composerGestureRecognizerState == ComposerGestureRecognizerState.ENDED) {
            this.a.perform(GestureAttributesUtils.INSTANCE.getGestureParams(tapGestureRecognizer.getView(), composerGestureRecognizerState, i, i2));
        }
    }
}
