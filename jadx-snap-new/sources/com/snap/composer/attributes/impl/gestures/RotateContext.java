package com.snap.composer.attributes.impl.gestures;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import com.snap.composer.views.touches.RotateGestureRecognizer;
import com.snap.composer.views.touches.RotateGestureRecognizerListener;
import defpackage.akcr;

public final class RotateContext implements RotateGestureRecognizerListener {
    private final ComposerAction a;

    public RotateContext(ComposerAction composerAction) {
        akcr.b(composerAction, "action");
        this.a = composerAction;
    }

    public final void onRecognized(RotateGestureRecognizer rotateGestureRecognizer, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2, float f) {
        akcr.b(rotateGestureRecognizer, MapboxEvent.KEY_GESTURE_ID);
        akcr.b(composerGestureRecognizerState, "state");
        GestureAttributesUtils gestureAttributesUtils = GestureAttributesUtils.INSTANCE;
        GestureAttributesUtils gestureAttributesUtils2 = gestureAttributesUtils;
        gestureAttributesUtils2.buildGestureParams(gestureAttributesUtils.getParams(), rotateGestureRecognizer.getView(), composerGestureRecognizerState, i, i2);
        gestureAttributesUtils.getParams().put("rotation", Float.valueOf(f));
        this.a.perform(gestureAttributesUtils.getParamsContainer());
    }
}
