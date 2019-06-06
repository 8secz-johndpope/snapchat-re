package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

final class MapKeyListener {
    private TrackballLongPressTimeOut currentTrackballLongPressTimeOut;
    private final TrackingSettings trackingSettings;
    private final Transform transform;
    private final UiSettings uiSettings;
    private final MapView view;

    class TrackballLongPressTimeOut implements Runnable {
        private boolean cancelled = false;

        TrackballLongPressTimeOut() {
        }

        public void cancel() {
            this.cancelled = true;
        }

        public void run() {
            if (MapKeyListener.this.view.getNativeMapView() != null && !MapKeyListener.this.view.getNativeMapView().destroyed && !this.cancelled) {
                MapKeyListener.this.transform.zoom(false, new PointF(MapKeyListener.this.uiSettings.getWidth() / 2.0f, MapKeyListener.this.uiSettings.getHeight() / 2.0f));
                MapKeyListener.this.currentTrackballLongPressTimeOut = null;
            }
        }
    }

    MapKeyListener(Transform transform, TrackingSettings trackingSettings, UiSettings uiSettings, MapView mapView) {
        this.transform = transform;
        this.trackingSettings = trackingSettings;
        this.uiSettings = uiSettings;
        this.view = mapView;
    }

    /* Access modifiers changed, original: final */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = i;
        double d = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i2 != 66) {
            switch (i2) {
                case 19:
                    if (!this.trackingSettings.isScrollGestureCurrentlyEnabled()) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    this.transform.moveBy(0.0d, d, 0);
                    return true;
                case 20:
                    if (!this.trackingSettings.isScrollGestureCurrentlyEnabled()) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    this.transform.moveBy(0.0d, -d, 0);
                    return true;
                case 21:
                    if (!this.trackingSettings.isScrollGestureCurrentlyEnabled()) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    this.transform.moveBy(d, 0.0d, 0);
                    return true;
                case 22:
                    if (!this.trackingSettings.isScrollGestureCurrentlyEnabled()) {
                        return false;
                    }
                    this.transform.cancelTransitions();
                    this.transform.moveBy(-d, 0.0d, 0);
                    return true;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        keyEvent.startTracking();
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if ((i != 23 && i != 66) || !this.uiSettings.isZoomGesturesEnabled()) {
            return false;
        }
        this.transform.zoom(false, new PointF(this.uiSettings.getWidth() / 2.0f, this.uiSettings.getHeight() / 2.0f));
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent.isCanceled()) {
            return false;
        }
        if ((i != 23 && i != 66) || !this.uiSettings.isZoomGesturesEnabled()) {
            return false;
        }
        this.transform.zoom(true, new PointF(this.uiSettings.getWidth() / 2.0f, this.uiSettings.getHeight() / 2.0f));
        return true;
    }

    /* Access modifiers changed, original: final */
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        TrackballLongPressTimeOut trackballLongPressTimeOut;
        if (actionMasked == 0) {
            trackballLongPressTimeOut = this.currentTrackballLongPressTimeOut;
            if (trackballLongPressTimeOut != null) {
                trackballLongPressTimeOut.cancel();
                this.currentTrackballLongPressTimeOut = null;
            }
            this.currentTrackballLongPressTimeOut = new TrackballLongPressTimeOut();
            this.view.postDelayed(this.currentTrackballLongPressTimeOut, (long) ViewConfiguration.getLongPressTimeout());
            return true;
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return false;
                }
                trackballLongPressTimeOut = this.currentTrackballLongPressTimeOut;
                if (trackballLongPressTimeOut != null) {
                    trackballLongPressTimeOut.cancel();
                    this.currentTrackballLongPressTimeOut = null;
                }
                return true;
            } else if (!this.trackingSettings.isScrollGestureCurrentlyEnabled()) {
                return false;
            } else {
                this.transform.cancelTransitions();
                Transform transform = this.transform;
                double x = (double) motionEvent.getX();
                Double.isNaN(x);
                x *= -10.0d;
                double y = (double) motionEvent.getY();
                Double.isNaN(y);
                transform.moveBy(x, y * -10.0d, 0);
                return true;
            }
        } else if (!this.uiSettings.isZoomGesturesEnabled()) {
            return false;
        } else {
            if (this.currentTrackballLongPressTimeOut != null) {
                this.transform.zoom(true, new PointF(this.uiSettings.getWidth() / 2.0f, this.uiSettings.getHeight() / 2.0f));
            }
            return true;
        }
    }
}
