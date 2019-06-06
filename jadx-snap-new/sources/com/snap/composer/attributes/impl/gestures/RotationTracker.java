package com.snap.composer.attributes.impl.gestures;

import android.view.MotionEvent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.akcr;

public final class RotationTracker {
    private Integer a;
    private Integer b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    public final float getRotation() {
        return this.g;
    }

    public final void onTouchEvent(MotionEvent motionEvent) {
        akcr.b(motionEvent, "event");
        this.g = MapboxConstants.MINIMUM_ZOOM;
        int actionMasked = motionEvent.getActionMasked();
        Integer num;
        int pointerId;
        if (actionMasked == 0) {
            this.a = Integer.valueOf(motionEvent.getPointerId(motionEvent.getActionIndex()));
        } else if (actionMasked == 1) {
            this.a = null;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.a = null;
                this.b = null;
            } else if (actionMasked == 5) {
                num = this.a;
                if (num != null) {
                    num.intValue();
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.b = Integer.valueOf(pointerId);
                    actionMasked = motionEvent.findPointerIndex(num.intValue());
                    pointerId = motionEvent.findPointerIndex(pointerId);
                    if (actionMasked >= 0 && pointerId >= 0) {
                        this.c = motionEvent.getX(actionMasked);
                        this.d = motionEvent.getY(actionMasked);
                        this.e = motionEvent.getX(pointerId);
                        this.f = motionEvent.getY(pointerId);
                    }
                }
            } else if (actionMasked == 6) {
                this.b = null;
            }
        } else {
            num = this.a;
            if (num != null) {
                actionMasked = num.intValue();
                Integer num2 = this.b;
                if (num2 != null) {
                    pointerId = num2.intValue();
                    actionMasked = motionEvent.findPointerIndex(actionMasked);
                    pointerId = motionEvent.findPointerIndex(pointerId);
                    if (actionMasked >= 0 && pointerId >= 0) {
                        float x = motionEvent.getX(actionMasked);
                        float y = motionEvent.getY(actionMasked);
                        float x2 = motionEvent.getX(pointerId);
                        float y2 = motionEvent.getY(pointerId);
                        float f = this.c;
                        this.g = ((float) Math.atan2((double) (y - y2), (double) (x - x2))) - ((float) Math.atan2((double) (this.d - this.f), (double) (f - this.e)));
                    }
                }
            }
        }
    }
}
