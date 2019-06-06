package com.snap.composer.attributes.impl.gestures;

import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.views.touches.ComposerGestureRecognizerState;
import com.snap.composer.views.touches.DragGestureRecognizer;
import com.snap.composer.views.touches.DragGestureRecognizerListener;
import defpackage.akcr;
import java.util.Map;

public final class DragContext implements DragGestureRecognizerListener {
    private final ComposerAction a;

    public DragContext(ComposerAction composerAction) {
        akcr.b(composerAction, "action");
        this.a = composerAction;
    }

    public final void onRecognized(DragGestureRecognizer dragGestureRecognizer, ComposerGestureRecognizerState composerGestureRecognizerState, int i, int i2, int i3, int i4, float f, float f2) {
        DragGestureRecognizer dragGestureRecognizer2 = dragGestureRecognizer;
        akcr.b(dragGestureRecognizer, MapboxEvent.KEY_GESTURE_ID);
        ComposerGestureRecognizerState composerGestureRecognizerState2 = composerGestureRecognizerState;
        akcr.b(composerGestureRecognizerState, "state");
        Object context = dragGestureRecognizer.getView().getContext();
        akcr.a(context, "gesture.view.context");
        context = context.getResources();
        akcr.a(context, "gesture.view.context.resources");
        float f3 = context.getDisplayMetrics().density;
        GestureAttributesUtils gestureAttributesUtils = GestureAttributesUtils.INSTANCE;
        GestureAttributesUtils gestureAttributesUtils2 = gestureAttributesUtils;
        gestureAttributesUtils2.buildGestureParams(gestureAttributesUtils.getParams(), dragGestureRecognizer.getView(), composerGestureRecognizerState2, i, i2);
        Map params = gestureAttributesUtils.getParams();
        params.put("deltaX", Float.valueOf(((float) i3) / f3));
        params.put("deltaY", Float.valueOf(((float) i4) / f3));
        params.put("velocityX", Float.valueOf(f / f3));
        params.put("velocityY", Float.valueOf(f2 / f3));
        this.a.perform(gestureAttributesUtils.getParamsContainer());
    }
}
