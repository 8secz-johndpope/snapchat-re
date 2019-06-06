package com.looksery.sdk.touch;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class PanGestureDetector {
    private static final int DEFAULT_SCALED_TOUCH_SLOP = 21;
    private float mDownFocusX;
    private float mDownFocusY;
    private boolean mInTapRegion;
    private float mLastFocusX;
    private float mLastFocusY;
    private final OnPanGestureListener mListener;
    private final int mTouchSlopSquare;

    public interface OnPanGestureListener {
        boolean onPan(MotionEvent motionEvent, float f, float f2, float f3, float f4);

        boolean onPanBegin(MotionEvent motionEvent, float f, float f2, float f3, float f4);

        boolean onPanEnd(MotionEvent motionEvent, float f, float f2, float f3, float f4);
    }

    public PanGestureDetector(Context context, OnPanGestureListener onPanGestureListener) {
        this.mListener = onPanGestureListener;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : 21;
        this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        Object obj = actionMasked == 6 ? 1 : null;
        int actionIndex = obj != null ? motionEvent.getActionIndex() : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = MapboxConstants.MINIMUM_ZOOM;
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        for (int i = 0; i < pointerCount; i++) {
            if (actionIndex != i) {
                f += motionEvent.getX(i);
                f2 += motionEvent.getY(i);
            }
        }
        if (obj != null) {
            pointerCount--;
        }
        float f3 = (float) pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (actionMasked == 0) {
            this.mLastFocusX = f4;
            this.mDownFocusX = f4;
            this.mLastFocusY = f5;
            this.mDownFocusY = f5;
            this.mInTapRegion = true;
            return false;
        } else if (actionMasked == 1) {
            return this.mListener.onPanEnd(motionEvent, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f4, f5);
        } else {
            boolean onPanBegin;
            if (actionMasked == 2) {
                float f6 = this.mDownFocusX;
                float f7 = f6 - f4;
                float f8 = this.mDownFocusY;
                f3 = f8 - f5;
                float f9 = this.mLastFocusX - f4;
                f = this.mLastFocusY - f5;
                if (this.mInTapRegion) {
                    actionMasked = (int) (f4 - f6);
                    int i2 = (int) (f5 - f8);
                    if ((actionMasked * actionMasked) + (i2 * i2) <= this.mTouchSlopSquare) {
                        return false;
                    }
                    onPanBegin = this.mListener.onPanBegin(motionEvent, f7, f3, f4, f5);
                    this.mLastFocusX = f4;
                    this.mLastFocusY = f5;
                } else if (Math.abs(f9) < 1.0f && Math.abs(f) < 1.0f) {
                    return false;
                } else {
                    boolean onPan = this.mListener.onPan(motionEvent, f7, f3, f4, f5);
                    this.mLastFocusX = f4;
                    this.mLastFocusY = f5;
                    return onPan;
                }
            } else if (actionMasked == 3) {
                onPanBegin = this.mListener.onPanEnd(motionEvent, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f4, f5);
            } else if (actionMasked != 5 && actionMasked != 6) {
                return false;
            } else {
                this.mLastFocusX = f4;
                this.mDownFocusX = f4;
                this.mLastFocusY = f5;
                this.mDownFocusY = f5;
                return false;
            }
            this.mInTapRegion = false;
            return onPanBegin;
        }
    }
}
