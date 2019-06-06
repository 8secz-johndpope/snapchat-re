package com.snap.composer.attributes.impl.gestures;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import com.snap.composer.views.touches.PinchGestureRecognizer;
import com.snap.composer.views.touches.PinchGestureRecognizerListener;
import defpackage.akcr;

public final class PinchContext implements PinchGestureRecognizerListener {
    private final ComposerAction a;

    public PinchContext(ComposerAction composerAction) {
        akcr.b(composerAction, "action");
        this.a = composerAction;
    }

    public final void onRecognized(PinchGestureRecognizer pinchGestureRecognizer, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2, float f) {
        akcr.b(pinchGestureRecognizer, MapboxEvent.KEY_GESTURE_ID);
        akcr.b(composerGestureRecognizerState, "state");
        GestureAttributesUtils gestureAttributesUtils = GestureAttributesUtils.INSTANCE;
        GestureAttributesUtils gestureAttributesUtils2 = gestureAttributesUtils;
        gestureAttributesUtils2.buildGestureParams(gestureAttributesUtils.getParams(), pinchGestureRecognizer.getView(), composerGestureRecognizerState, i, i2);
        gestureAttributesUtils.getParams().put("scale", Float.valueOf(f));
        this.a.perform(gestureAttributesUtils.getParamsContainer());
    }
}
