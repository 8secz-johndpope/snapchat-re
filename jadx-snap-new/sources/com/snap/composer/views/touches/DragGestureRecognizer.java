package com.snap.composer.views.touches;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.akcr;

public class DragGestureRecognizer extends ComposerGestureRecognizer {
    private float a;
    private float b;
    private float c;
    private float d;
    private VelocityTracker e;
    private final GestureDetector f;
    private final DragGestureRecognizerListener g;

    public DragGestureRecognizer(View view, DragGestureRecognizerListener dragGestureRecognizerListener) {
        akcr.b(view, "view");
        akcr.b(dragGestureRecognizerListener, "listener");
        super(view);
        this.g = dragGestureRecognizerListener;
        this.f = new GestureDetector(view.getContext(), new DragGestureRecognizer$gestureDetector$1(this));
        this.f.setIsLongpressEnabled(false);
    }

    private final void a() {
        VelocityTracker velocityTracker = this.e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.e = null;
    }

    public final DragGestureRecognizerListener getListener() {
        return this.g;
    }

    public void onDestroy() {
        super.onDestroy();
        a();
    }

    /* Access modifiers changed, original: protected */
    public void onProcess() {
        this.g.onRecognized(this, getState(), getX(), getY(), (int) this.a, (int) this.b, this.c, this.d);
    }

    public void onReset() {
        super.onReset();
        this.a = MapboxConstants.MINIMUM_ZOOM;
        this.b = MapboxConstants.MINIMUM_ZOOM;
        this.c = MapboxConstants.MINIMUM_ZOOM;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        a();
    }

    /* Access modifiers changed, original: protected */
    public void onUpdate(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        Object obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
        this.f.onTouchEvent(obtain);
        if (isActive()) {
            akcr.a(obtain, "convertedEvent");
            int actionMasked = obtain.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                setState(ComposerGestureRecognizerState.ENDED);
            }
            if (this.e == null) {
                this.e = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker == null) {
                akcr.a();
            }
            velocityTracker.addMovement(obtain);
            velocityTracker.computeCurrentVelocity(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
            this.c = velocityTracker.getXVelocity();
            this.d = velocityTracker.getYVelocity();
            if (getState() == ComposerGestureRecognizerState.ENDED) {
                a();
            }
        }
        obtain.recycle();
    }

    public final void recognize(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        if (getState() == ComposerGestureRecognizerState.POSSIBLE) {
            setState(ComposerGestureRecognizerState.BEGAN);
        }
    }

    public boolean shouldRecognize(float f, float f2) {
        return true;
    }
}
