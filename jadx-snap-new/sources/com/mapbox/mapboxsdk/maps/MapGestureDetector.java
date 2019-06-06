package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.PointF;
import android.location.Location;
import android.os.Build.VERSION;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewConfiguration;
import com.mapbox.mapboxsdk.TelemetryAccessor;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFlingListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScrollListener;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.mapbox.services.android.telemetry.utils.MathUtils;
import com.mapbox.services.android.telemetry.utils.TelemetryUtils;
import defpackage.cgi;
import defpackage.jo;
import defpackage.ug;
import defpackage.ug.b;
import defpackage.uh;
import defpackage.uh.a;
import defpackage.ui;

public class MapGestureDetector {
    private static final float INVALID_SCALE = 100000.0f;
    public static final float LOG_2 = ((float) Math.log(2.0d));
    private final AnnotationManager annotationManager;
    private final CameraChangeDispatcher cameraChangeDispatcher;
    private boolean dragStarted = false;
    private PointF focalPoint;
    private jo gestureDetector;
    private boolean mWasPinchZoom;
    private boolean mWasSingleFingerZoom;
    private final MapView mapView;
    private OnFlingListener onFlingListener;
    private OnMapClickListener onMapClickListener;
    private OnMapLongClickListener onMapLongClickListener;
    private OnScrollListener onScrollListener;
    private final Projection projection;
    private boolean quickZoom = false;
    private boolean recentScaleGestureOccurred = false;
    private ug rotateGestureDetector;
    private ScaleGestureDetector scaleGestureDetector;
    private boolean scaleGestureOccurred = false;
    private boolean scrollInProgress = false;
    private uh shoveGestureDetector;
    private final TrackingSettings trackingSettings;
    private final Transform transform;
    private boolean twoTap = false;
    private final UiSettings uiSettings;
    private boolean zoomStarted = false;

    class GestureListener extends SimpleOnGestureListener {
        private GestureListener() {
        }

        /* synthetic */ GestureListener(MapGestureDetector mapGestureDetector, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (!MapGestureDetector.this.uiSettings.isZoomGesturesEnabled() || !MapGestureDetector.this.uiSettings.isDoubleTapGesturesEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (MapGestureDetector.this.quickZoom) {
                        MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
                        MapGestureDetector.this.quickZoom = false;
                    } else {
                        Transform access$800;
                        PointF access$700;
                        MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                        if (MapGestureDetector.this.focalPoint != null) {
                            access$800 = MapGestureDetector.this.transform;
                            access$700 = MapGestureDetector.this.focalPoint;
                        } else {
                            access$800 = MapGestureDetector.this.transform;
                            access$700 = new PointF(motionEvent.getX(), motionEvent.getY());
                        }
                        access$800.zoom(true, access$700);
                        MapGestureDetector.this.mapView.onDoubleSingleTapZoom();
                    }
                }
            }
            MapGestureDetector.this.pushEvent(motionEvent.getX(), motionEvent.getY(), MapboxEvent.GESTURE_DOUBLETAP, MapGestureDetector.this.transform.getZoom(), true);
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            if (MapGestureDetector.this.annotationManager.isNativeMapDestroyed() || !MapGestureDetector.this.trackingSettings.isScrollGestureCurrentlyEnabled() || MapGestureDetector.this.recentScaleGestureOccurred) {
                return false;
            }
            float pixelRatio = MapGestureDetector.this.uiSettings.getPixelRatio();
            double hypot = Math.hypot((double) (f3 / pixelRatio), (double) (f4 / pixelRatio));
            if (hypot < 300.0d) {
                return false;
            }
            MapGestureDetector.this.trackingSettings.resetTrackingModesIfRequired(true, false, false);
            MapGestureDetector.this.transform.cancelTransitions();
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            double tilt = MapGestureDetector.this.transform.getTilt();
            double d = 0.0d;
            if (tilt != 0.0d) {
                d = tilt / 10.0d;
            }
            d += 1.5d;
            tilt = (double) f3;
            Double.isNaN(tilt);
            tilt /= d;
            double d2 = (double) pixelRatio;
            Double.isNaN(d2);
            double d3 = tilt / d2;
            double d4 = (double) f4;
            Double.isNaN(d4);
            d4 /= d;
            Double.isNaN(d2);
            double d5 = d4 / d2;
            long j = (long) (((hypot / 7.0d) / d) + 150.0d);
            MapGestureDetector.this.transform.setGestureInProgress(true);
            MapGestureDetector.this.transform.moveBy(d3, d5, j);
            MapGestureDetector.this.transform.setGestureInProgress(false);
            if (MapGestureDetector.this.onFlingListener != null) {
                MapGestureDetector.this.onFlingListener.onFling();
            }
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (!(MapGestureDetector.this.annotationManager.isNativeMapDestroyed() || MapGestureDetector.this.onMapLongClickListener == null || MapGestureDetector.this.quickZoom)) {
                MapGestureDetector.this.onMapLongClickListener.onMapLongClick((LatLng) MapGestureDetector.this.projection.fromScreenLocation(motionEvent.getX(), motionEvent.getY()));
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (MapGestureDetector.this.annotationManager.isNativeMapDestroyed() || !MapGestureDetector.this.trackingSettings.isScrollGestureCurrentlyEnabled() || MapGestureDetector.this.dragStarted || MapGestureDetector.this.scaleGestureOccurred) {
                return false;
            }
            if (!MapGestureDetector.this.scrollInProgress) {
                MapGestureDetector.this.scrollInProgress = true;
                MapGestureDetector.this.transform.cancelTransitions();
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                MapGestureDetector.this.pushEvent(motionEvent.getX(), motionEvent.getY(), MapboxEvent.GESTURE_PAN_START, MapGestureDetector.this.transform.getZoom(), true);
            }
            MapGestureDetector.this.trackingSettings.resetTrackingModesIfRequired(true, false, false);
            MapGestureDetector.this.transform.moveBy((double) (-f), (double) (-f2), 0);
            if (MapGestureDetector.this.onScrollListener != null) {
                MapGestureDetector.this.onScrollListener.onScroll();
            }
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (MapGestureDetector.this.annotationManager.isNativeMapDestroyed()) {
                return false;
            }
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            if (!MapGestureDetector.this.annotationManager.onTap(pointF)) {
                if (MapGestureDetector.this.uiSettings.isDeselectMarkersOnTap()) {
                    MapGestureDetector.this.annotationManager.deselectMarkers();
                }
                if (MapGestureDetector.this.onMapClickListener != null) {
                    MapGestureDetector.this.onMapClickListener.onMapClick((LatLng) MapGestureDetector.this.projection.fromScreenLocation(pointF.x, pointF.y));
                }
            }
            MapGestureDetector.this.pushEvent(motionEvent.getX(), motionEvent.getY(), MapboxEvent.GESTURE_SINGLETAP, MapGestureDetector.this.transform.getZoom(), true);
            MapGestureDetector.this.mapView.onSingleTap();
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (MapGestureDetector.this.annotationManager.isNativeMapDestroyed()) {
                return false;
            }
            MapGestureDetector.this.transform.cancelTransitions();
            return true;
        }
    }

    class ScaleGestureListener extends SimpleOnScaleGestureListener {
        static final int NUM_LAST_SCALE_FACTORS = 3;
        long beginTime;
        float lastFocusX;
        float lastFocusY;
        int lastScaleFactorIndex;
        double[] lastScaleFactors;
        float scaleFactor;

        private ScaleGestureListener() {
            this.beginTime = 0;
            this.scaleFactor = 1.0f;
            this.lastScaleFactorIndex = 0;
            this.lastScaleFactors = new double[3];
            this.lastFocusX = -1.0f;
            this.lastFocusY = -1.0f;
        }

        /* synthetic */ ScaleGestureListener(MapGestureDetector mapGestureDetector, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!MapGestureDetector.this.uiSettings.isZoomGesturesEnabled()) {
                return super.onScale(scaleGestureDetector);
            }
            this.scaleFactor *= scaleGestureDetector.getScaleFactor();
            float f = this.scaleFactor;
            if (f > 1.05f || f < 0.95f) {
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                MapGestureDetector.this.zoomStarted = true;
            }
            long eventTime = scaleGestureDetector.getEventTime() - this.beginTime;
            if ((!MapGestureDetector.this.zoomStarted && eventTime <= ((long) ViewConfiguration.getTapTimeout())) || !MapGestureDetector.this.zoomStarted || MapGestureDetector.this.dragStarted) {
                return false;
            }
            if (!(MapGestureDetector.this.quickZoom || MapGestureDetector.this.twoTap)) {
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            }
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.quickZoom = mapGestureDetector.twoTap ^ 1;
            MapGestureDetector.this.trackingSettings.resetTrackingModesIfRequired(MapGestureDetector.this.quickZoom ^ 1, false, false);
            Transform access$800;
            double log;
            double d;
            if (MapGestureDetector.this.focalPoint != null) {
                access$800 = MapGestureDetector.this.transform;
                log = Math.log((double) scaleGestureDetector.getScaleFactor());
                d = (double) MapGestureDetector.LOG_2;
                Double.isNaN(d);
                access$800.zoomBy(log / d, MapGestureDetector.this.focalPoint.x, MapGestureDetector.this.focalPoint.y);
                MapGestureDetector.this.mWasPinchZoom = true;
            } else if (MapGestureDetector.this.quickZoom) {
                MapGestureDetector.this.cameraChangeDispatcher.onCameraMove();
                float clamp = MathUtils.clamp(scaleGestureDetector.getScaleFactor(), 0.65f, 1.35f);
                f = clamp > 1.0f ? 1.0f - (clamp - 1.0f) : 1.0f + (1.0f - clamp);
                Transform access$8002 = MapGestureDetector.this.transform;
                double log2 = Math.log((double) f);
                log = (double) MapGestureDetector.LOG_2;
                Double.isNaN(log);
                access$8002.zoomBy(log2 / log, MapGestureDetector.this.uiSettings.getWidth() / 2.0f, MapGestureDetector.this.uiSettings.getHeight() / 2.0f);
                MapGestureDetector.this.mWasSingleFingerZoom = true;
            } else {
                access$800 = MapGestureDetector.this.transform;
                log = Math.log((double) scaleGestureDetector.getScaleFactor());
                d = (double) MapGestureDetector.LOG_2;
                Double.isNaN(d);
                access$800.zoomBy(log / d, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                MapGestureDetector.this.mWasPinchZoom = true;
                double[] dArr = this.lastScaleFactors;
                int i = this.lastScaleFactorIndex;
                this.lastScaleFactorIndex = i + 1;
                i %= 3;
                log = (double) scaleGestureDetector.getScaleFactor();
                Double.isNaN(log);
                dArr[i] = log - 1.0d;
                this.lastFocusX = scaleGestureDetector.getFocusX();
                this.lastFocusY = scaleGestureDetector.getFocusY();
            }
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            int i = 0;
            if (!MapGestureDetector.this.uiSettings.isZoomGesturesEnabled()) {
                return false;
            }
            while (i < 3) {
                this.lastScaleFactors[i] = 100000.0d;
                i++;
            }
            this.lastFocusX = -1.0f;
            this.lastFocusY = -1.0f;
            MapGestureDetector.this.scaleGestureOccurred = true;
            MapGestureDetector.this.recentScaleGestureOccurred = true;
            this.beginTime = scaleGestureDetector.getEventTime();
            MapGestureDetector.this.pushEvent(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), MapboxEvent.GESTURE_PITCH_START, MapGestureDetector.this.transform.getZoom(), true);
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (this.lastFocusX > MapboxConstants.MINIMUM_ZOOM && this.lastFocusY > MapboxConstants.MINIMUM_ZOOM) {
                double d = 0.0d;
                for (int i = 0; i < 3; i++) {
                    double[] dArr = this.lastScaleFactors;
                    if (dArr[i] <= 99999.0d) {
                        d += dArr[i];
                    }
                }
                d /= 3.0d;
                d = Math.min(Math.max(0.4d, (d * (d > 0.0d ? 16.0d : 8.0d)) + 1.0d), 4.0d);
                if (Math.abs(d - 1.0d) / d > 0.1d) {
                    MapGestureDetector.this.transform.cancelTransitions();
                    Transform access$800 = MapGestureDetector.this.transform;
                    double log = Math.log(d);
                    d = (double) MapGestureDetector.LOG_2;
                    Double.isNaN(d);
                    access$800.zoomBy(log / d, this.lastFocusX, this.lastFocusY, 500);
                    MapGestureDetector.this.transform.ignoreUntil(System.currentTimeMillis() + 100);
                }
            }
            MapGestureDetector.this.scaleGestureOccurred = false;
            this.beginTime = 0;
            this.scaleFactor = 1.0f;
            MapGestureDetector.this.zoomStarted = false;
            MapGestureDetector.this.cameraChangeDispatcher.onCameraIdle();
        }
    }

    class ShoveGestureListener implements a {
        long beginTime;
        boolean started;
        float totalDelta;

        private ShoveGestureListener() {
            this.beginTime = 0;
            this.totalDelta = MapboxConstants.MINIMUM_ZOOM;
            this.started = false;
        }

        /* synthetic */ ShoveGestureListener(MapGestureDetector mapGestureDetector, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean onShove(uh uhVar) {
            if (!MapGestureDetector.this.uiSettings.isTiltGesturesEnabled()) {
                return false;
            }
            this.totalDelta += uhVar.c();
            if (!MapGestureDetector.this.zoomStarted) {
                float f = this.totalDelta;
                if (f > 10.0f || f < -10.0f) {
                    this.started = true;
                }
            }
            long eventTime = uhVar.d.getEventTime() - this.beginTime;
            if ((!this.started && eventTime <= ((long) ViewConfiguration.getTapTimeout())) || !this.started) {
                return false;
            }
            double tilt = MapGestureDetector.this.transform.getTilt();
            double c = (double) uhVar.c();
            Double.isNaN(c);
            MapGestureDetector.this.transform.setTilt(Double.valueOf(Math.max(0.0d, Math.min(60.0d, tilt - (c * 0.1d)))));
            MapGestureDetector.this.dragStarted = true;
            return true;
        }

        public boolean onShoveBegin(uh uhVar) {
            if (!MapGestureDetector.this.uiSettings.isTiltGesturesEnabled()) {
                return false;
            }
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            this.beginTime = uhVar.d.getEventTime();
            MapGestureDetector.this.pushEvent(uhVar.l.x, uhVar.l.y, MapboxEvent.GESTURE_PITCH_START, MapGestureDetector.this.transform.getZoom(), true);
            return true;
        }

        public void onShoveEnd(uh uhVar) {
            this.beginTime = 0;
            this.totalDelta = MapboxConstants.MINIMUM_ZOOM;
            this.started = false;
            MapGestureDetector.this.dragStarted = false;
        }
    }

    class RotateGestureListener extends b {
        long beginTime;
        boolean started;
        float totalAngle;

        private RotateGestureListener() {
            this.beginTime = 0;
            this.totalAngle = MapboxConstants.MINIMUM_ZOOM;
            this.started = false;
        }

        /* synthetic */ RotateGestureListener(MapGestureDetector mapGestureDetector, AnonymousClass1 anonymousClass1) {
            this();
        }

        public boolean onRotate(ug ugVar) {
            if (MapGestureDetector.this.annotationManager.isNativeMapDestroyed() || !MapGestureDetector.this.trackingSettings.isRotateGestureCurrentlyEnabled() || MapGestureDetector.this.dragStarted) {
                return false;
            }
            this.totalAngle += ugVar.c();
            float f = this.totalAngle;
            if (f > 20.0f || f < -20.0f) {
                this.started = true;
            }
            long eventTime = ugVar.d.getEventTime() - this.beginTime;
            if ((!this.started && eventTime <= ((long) ViewConfiguration.getTapTimeout())) || !this.started) {
                return false;
            }
            MapGestureDetector.this.trackingSettings.resetTrackingModesIfRequired(true, true, false);
            double rawBearing = MapGestureDetector.this.transform.getRawBearing();
            double c = (double) ugVar.c();
            Double.isNaN(c);
            rawBearing += c;
            if (MapGestureDetector.this.focalPoint != null) {
                MapGestureDetector.this.transform.setBearing(rawBearing, MapGestureDetector.this.focalPoint.x, MapGestureDetector.this.focalPoint.y);
            } else {
                MapGestureDetector.this.transform.setBearing(rawBearing, ugVar.l.x, ugVar.l.y);
            }
            return true;
        }

        public boolean onRotateBegin(ug ugVar) {
            if (!MapGestureDetector.this.trackingSettings.isRotateGestureCurrentlyEnabled()) {
                return false;
            }
            MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
            this.beginTime = ugVar.d.getEventTime();
            MapGestureDetector.this.pushEvent(ugVar.l.x, ugVar.l.y, MapboxEvent.GESTURE_ROTATION_START, MapGestureDetector.this.transform.getZoom(), true);
            return true;
        }

        public void onRotateEnd(ug ugVar) {
            this.beginTime = 0;
            this.totalAngle = MapboxConstants.MINIMUM_ZOOM;
            this.started = false;
        }
    }

    MapGestureDetector(Transform transform, Projection projection, UiSettings uiSettings, TrackingSettings trackingSettings, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher, MapView mapView) {
        this.annotationManager = annotationManager;
        this.transform = transform;
        this.projection = projection;
        this.uiSettings = uiSettings;
        this.trackingSettings = trackingSettings;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
        this.mapView = mapView;
    }

    private void pushEvent(float f, float f2, String str, double d, boolean z) {
        if (!this.mapView.getMapboxMap().isDestroyed()) {
            final cgi fromScreenLocation = this.projection.fromScreenLocation(f, f2);
            final boolean z2 = z;
            final String str2 = str;
            final double d2 = d;
            this.mapView.postOnEventThread(new Runnable() {
                public void run() {
                    Location buildLocation = TelemetryUtils.buildLocation(fromScreenLocation.getLongitude(), fromScreenLocation.getLatitude());
                    TelemetryAccessor.pushEvent(z2 ? MapboxEvent.buildMapClickEvent(buildLocation, str2, d2) : MapboxEvent.buildMapDragEndEvent(buildLocation, d2));
                }
            });
        }
    }

    /* Access modifiers changed, original: 0000 */
    public PointF getFocalPoint() {
        return this.focalPoint;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getButtonState() != 0 && motionEvent.getButtonState() != 1) {
            return false;
        }
        if (this.gestureDetector == null || this.scaleGestureDetector == null || this.rotateGestureDetector == null || this.shoveGestureDetector == null) {
            Context context = this.mapView.getContext();
            if (context == null) {
                return false;
            }
            this.gestureDetector = new jo(context, new GestureListener(this, null));
            this.gestureDetector.a.a();
            this.scaleGestureDetector = new ScaleGestureDetector(context, new ScaleGestureListener(this, null));
            ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
            if (VERSION.SDK_INT >= 19) {
                scaleGestureDetector.setQuickScaleEnabled(true);
            }
            this.rotateGestureDetector = new ug(context, new RotateGestureListener(this, null));
            this.shoveGestureDetector = new uh(context, new ShoveGestureListener(this, null));
        }
        this.rotateGestureDetector.a(motionEvent);
        this.scaleGestureDetector.onTouchEvent(motionEvent);
        this.shoveGestureDetector.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                Object obj = motionEvent.getEventTime() - motionEvent.getDownTime() <= ((long) ViewConfiguration.getTapTimeout()) ? 1 : null;
                Object obj2 = (this.rotateGestureDetector.b() || this.scaleGestureDetector.isInProgress() || this.shoveGestureDetector.b()) ? 1 : null;
                if (this.twoTap && obj != null && obj2 == null) {
                    PointF pointF = this.focalPoint;
                    if (pointF != null) {
                        this.transform.zoom(false, pointF);
                    } else {
                        this.transform.zoom(false, ui.d(motionEvent));
                    }
                    this.twoTap = false;
                    this.mapView.onTwoFingerTapZoom();
                    return true;
                }
                if (this.scrollInProgress) {
                    pushEvent(motionEvent.getX(), motionEvent.getY(), MapboxEvent.GESTURE_PAN_START, this.transform.getZoom(), false);
                    this.scrollInProgress = false;
                    this.cameraChangeDispatcher.onCameraIdle();
                    this.mapView.onPanEnded();
                }
                if (this.mWasPinchZoom) {
                    this.mWasPinchZoom = false;
                    this.mapView.onPinchZoomEnded();
                }
                if (this.mWasSingleFingerZoom) {
                    this.mWasSingleFingerZoom = false;
                    this.mapView.onSingleFingerZoomEnded();
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    if (motionEvent.getPointerCount() == 2 && this.uiSettings.isZoomGesturesEnabled()) {
                        z = true;
                    }
                    this.twoTap = z;
                    if (this.twoTap) {
                        pushEvent(motionEvent.getX(), motionEvent.getY(), MapboxEvent.GESTURE_TWO_FINGER_SINGLETAP, this.transform.getZoom(), true);
                    }
                }
            }
            this.twoTap = false;
            this.transform.setGestureInProgress(false);
        } else {
            this.recentScaleGestureOccurred = false;
            this.transform.setGestureInProgress(true);
        }
        return this.gestureDetector.a(motionEvent);
    }

    /* Access modifiers changed, original: 0000 */
    public void setFocalPoint(PointF pointF) {
        if (pointF == null && this.uiSettings.getFocalPoint() != null) {
            pointF = this.uiSettings.getFocalPoint();
        }
        this.focalPoint = pointF;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnFlingListener(OnFlingListener onFlingListener) {
        this.onFlingListener = onFlingListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onMapClickListener = onMapClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListener = onMapLongClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }
}
