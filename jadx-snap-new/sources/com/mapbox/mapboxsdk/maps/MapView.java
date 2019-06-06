package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ZoomButtonsController.OnZoomListener;
import com.mapbox.mapboxsdk.MapboxNatives;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.TelemetryAccessor;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFlingListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnFpsChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMapLongClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnRegisterTouchListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnScrollListener;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.maps.widgets.MyLocationView;
import com.mapbox.mapboxsdk.maps.widgets.MyLocationViewSettings;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MapView extends FrameLayout {
    public static final int DID_FAIL_LOADING_MAP = 7;
    public static final int DID_FINISH_LOADING_MAP = 6;
    public static final int DID_FINISH_LOADING_STYLE = 14;
    public static final int DID_FINISH_RENDERING_FRAME = 9;
    public static final int DID_FINISH_RENDERING_FRAME_FULLY_RENDERED = 10;
    public static final int DID_FINISH_RENDERING_MAP = 12;
    public static final int DID_FINISH_RENDERING_MAP_FULLY_RENDERED = 13;
    public static final int REGION_DID_CHANGE = 3;
    public static final int REGION_DID_CHANGE_ANIMATED = 4;
    public static final int REGION_IS_CHANGING = 2;
    public static final int REGION_WILL_CHANGE = 0;
    public static final int REGION_WILL_CHANGE_ANIMATED = 1;
    public static final int SOURCE_DID_CHANGE = 15;
    public static final int WILL_START_LOADING_MAP = 5;
    public static final int WILL_START_RENDERING_FRAME = 8;
    public static final int WILL_START_RENDERING_MAP = 11;
    public static MapBoxMapFactory sMapboxMapFactory = new MapBoxMapFactory() {
        public final MapboxMap create(MapView mapView, NativeMapView nativeMapView, Transform transform, UiSettings uiSettings, TrackingSettings trackingSettings, MyLocationViewSettings myLocationViewSettings, Projection projection, RegisterTouchListener registerTouchListener, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher) {
            return new MapboxMap(nativeMapView, transform, uiSettings, trackingSettings, myLocationViewSettings, projection, registerTouchListener, annotationManager, cameraChangeDispatcher);
        }
    };
    public static NativeMapViewFactory sNativeMapViewFactory = new NativeMapViewFactory() {
        public final NativeMapView create(MapView mapView) {
            return new NativeMapView(mapView);
        }
    };
    private static SystemInfo sSystemInfo;
    private boolean destroyed;
    private boolean hasSurface;
    private Handler mEventHandler;
    private HandlerThread mEventHandlerThread;
    private GestureListener mGestureListener;
    private MapCallback mapCallback;
    protected MapGestureDetector mapGestureDetector;
    protected MapKeyListener mapKeyListener;
    protected MapZoomButtonController mapZoomButtonController;
    private MapboxMap mapboxMap;
    private NativeMapView nativeMapView;
    private boolean textureMode;

    public interface GestureListener {
        void onDoubleSingleTapZoom();

        void onPanEnded();

        void onPinchZoomEnded();

        void onSingleFingerZoomEnded();

        void onSingleTap();

        void onTwoFingerZoom();
    }

    public interface MapBoxMapFactory {
        MapboxMap create(MapView mapView, NativeMapView nativeMapView, Transform transform, UiSettings uiSettings, TrackingSettings trackingSettings, MyLocationViewSettings myLocationViewSettings, Projection projection, RegisterTouchListener registerTouchListener, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MapChange {
    }

    public class MapZoomControllerListener implements OnZoomListener {
        private final MapGestureDetector mapGestureDetector;
        private final Transform transform;
        private final UiSettings uiSettings;

        MapZoomControllerListener(MapGestureDetector mapGestureDetector, UiSettings uiSettings, Transform transform) {
            this.mapGestureDetector = mapGestureDetector;
            this.uiSettings = uiSettings;
            this.transform = transform;
        }

        private void onZoom(boolean z, PointF pointF) {
            if (pointF == null) {
                pointF = new PointF((float) (MapView.this.getMeasuredWidth() / 2), (float) (MapView.this.getMeasuredHeight() / 2));
            }
            this.transform.zoom(z, pointF);
        }

        public void onVisibilityChanged(boolean z) {
        }

        public void onZoom(boolean z) {
            if (this.uiSettings.isZoomGesturesEnabled()) {
                onZoom(z, this.mapGestureDetector.getFocalPoint());
            }
        }
    }

    public interface NativeMapViewFactory {
        NativeMapView create(MapView mapView);
    }

    public interface OnMapChangedListener {
        void onMapChanged(int i);
    }

    public class SurfaceCallback implements Callback {
        private Surface surface;

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (!MapView.this.destroyed) {
                MapView.this.nativeMapView.resizeFramebuffer(i2, i3);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            try {
                NativeMapView access$000 = MapView.this.nativeMapView;
                Surface surface = surfaceHolder.getSurface();
                this.surface = surface;
                access$000.createSurface(surface);
                MapView.this.hasSurface = true;
            } catch (Error e) {
                if (MapView.this.onSurfaceAvailableError(e, surfaceHolder)) {
                    throw e;
                }
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            MapView.this.hasSurface = false;
            if (MapView.this.nativeMapView != null) {
                MapView.this.nativeMapView.destroySurface();
            }
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
        }
    }

    public class SurfaceTextureListener implements android.view.TextureView.SurfaceTextureListener {
        private Surface surface;

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            try {
                if (MapView.this.nativeMapView != null) {
                    NativeMapView access$000 = MapView.this.nativeMapView;
                    Surface surface = new Surface(surfaceTexture);
                    this.surface = surface;
                    access$000.createSurface(surface);
                    MapView.this.nativeMapView.resizeFramebuffer(i, i2);
                    MapView.this.hasSurface = true;
                }
            } catch (Error e) {
                if (MapView.this.onSurfaceTextureAvailableError(e, surfaceTexture, i, i2)) {
                    throw e;
                }
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            MapView.this.hasSurface = false;
            if (MapView.this.nativeMapView != null) {
                MapView.this.nativeMapView.destroySurface();
            }
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
                this.surface = null;
            }
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (!MapView.this.destroyed) {
                MapView.this.nativeMapView.resizeFramebuffer(i, i2);
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (!MapView.this.destroyed) {
                MapView.this.mapboxMap.onUpdateRegionChange();
            }
        }
    }

    public class CameraZoomInvalidator implements CameraZoomInvalidator {
        private void setZoom(double d, PointF pointF, Transform transform) {
            if (pointF != null) {
                transform.setZoom(d, pointF);
            } else {
                transform.setZoom(d, new PointF((float) (MapView.this.getMeasuredWidth() / 2), (float) (MapView.this.getMeasuredHeight() / 2)));
            }
        }

        public void zoomTo(double d) {
            Transform transform = MapView.this.mapboxMap.getTransform();
            if (transform.getCameraPosition().zoom < d) {
                setZoom(d, MapView.this.mapGestureDetector.getFocalPoint(), transform);
            }
        }
    }

    class FocalPointInvalidator implements FocalPointChangeListener {
        private final FocalPointChangeListener[] focalPointChangeListeners;

        FocalPointInvalidator() {
            this.focalPointChangeListeners = null;
        }

        FocalPointInvalidator(FocalPointChangeListener... focalPointChangeListenerArr) {
            this.focalPointChangeListeners = focalPointChangeListenerArr;
        }

        public void onFocalPointChanged(PointF pointF) {
            MapView.this.mapGestureDetector.setFocalPoint(pointF);
            FocalPointChangeListener[] focalPointChangeListenerArr = this.focalPointChangeListeners;
            if (focalPointChangeListenerArr != null) {
                for (FocalPointChangeListener onFocalPointChanged : focalPointChangeListenerArr) {
                    onFocalPointChanged.onFocalPointChanged(pointF);
                }
            }
        }
    }

    public static class MapCallback implements OnMapChangedListener {
        private boolean initialLoad = true;
        private final MapView mapView;
        private final MapboxMap mapboxMap;
        private final List<OnMapReadyCallback> onMapReadyCallbackList = new ArrayList();

        MapCallback(MapView mapView, MapboxMap mapboxMap) {
            this.mapboxMap = mapboxMap;
            this.mapView = mapView;
        }

        private void onMapReady() {
            if (this.onMapReadyCallbackList.size() > 0) {
                Iterator it = this.onMapReadyCallbackList.iterator();
                while (it.hasNext()) {
                    ((OnMapReadyCallback) it.next()).onMapReady(this.mapboxMap);
                    it.remove();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void addOnMapReadyCallback(OnMapReadyCallback onMapReadyCallback) {
            this.onMapReadyCallbackList.add(onMapReadyCallback);
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isInitialLoad() {
            return this.initialLoad;
        }

        public void onMapChanged(int i) {
            if (i == 14 && this.initialLoad) {
                this.initialLoad = false;
                this.mapView.post(new Runnable() {
                    public void run() {
                        MapCallback.this.mapboxMap.onPreMapReady();
                        MapCallback.this.onMapReady();
                        MapCallback.this.mapboxMap.onPostMapReady();
                    }
                });
            } else if (i == 9 || i == 10) {
                this.mapboxMap.onUpdateFullyRendered();
            } else {
                if (i == 2 || i == 3 || i == 6) {
                    this.mapboxMap.onUpdateRegionChange();
                }
            }
        }
    }

    public class RegisterTouchListener implements OnRegisterTouchListener {
        public void onRegisterFlingListener(OnFlingListener onFlingListener) {
            MapView.this.mapGestureDetector.setOnFlingListener(onFlingListener);
        }

        public void onRegisterMapClickListener(OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.setOnMapClickListener(onMapClickListener);
        }

        public void onRegisterMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.setOnMapLongClickListener(onMapLongClickListener);
        }

        public void onRegisterScrollListener(OnScrollListener onScrollListener) {
            MapView.this.mapGestureDetector.setOnScrollListener(onScrollListener);
        }
    }

    public MapView(Context context) {
        super(context);
        initialise(context, MapboxMapOptions.createFromAttributes(context, null, useSimpleMode()));
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialise(context, MapboxMapOptions.createFromAttributes(context, attributeSet, useSimpleMode()));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialise(context, MapboxMapOptions.createFromAttributes(context, attributeSet, useSimpleMode()));
    }

    public MapView(Context context, MapboxMapOptions mapboxMapOptions) {
        super(context);
        if (mapboxMapOptions == null) {
            mapboxMapOptions = MapboxMapOptions.createFromAttributes(context, null, useSimpleMode());
        }
        initialise(context, mapboxMapOptions);
    }

    public static synchronized SystemInfo getSystemInfo(Context context) {
        SystemInfo systemInfo;
        synchronized (MapView.class) {
            systemInfo = sSystemInfo;
            if (systemInfo == null) {
                systemInfo = MapboxNatives.getSystemInfo(context);
                sSystemInfo = systemInfo;
            }
        }
        return systemInfo;
    }

    public void addOnMapChangedListener(OnMapChangedListener onMapChangedListener) {
        if (onMapChangedListener != null) {
            this.nativeMapView.addOnMapChangedListener(onMapChangedListener);
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        if (this.mapCallback.isInitialLoad() || onMapReadyCallback == null) {
            if (onMapReadyCallback != null) {
                this.mapCallback.addOnMapReadyCallback(onMapReadyCallback);
            }
            return;
        }
        onMapReadyCallback.onMapReady(this.mapboxMap);
    }

    public MapboxMap getMapboxMap() {
        return this.mapboxMap;
    }

    public final int getMarkerViewContainerId() {
        return R.id.markerViewContainer;
    }

    public NativeMapView getNativeMapView() {
        return this.nativeMapView;
    }

    public final int getSurfaceViewId() {
        return R.id.surfaceView;
    }

    /* Access modifiers changed, original: protected */
    public void inflateSimpleView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.mapbox_mapview_internal_simple, this);
    }

    /* Access modifiers changed, original: protected */
    public void initialise(Context context, MapboxMapOptions mapboxMapOptions) {
        Context context2 = context;
        MapboxMapOptions mapboxMapOptions2 = mapboxMapOptions;
        if (!isInEditMode()) {
            Context context3;
            modifyOptions(mapboxMapOptions2);
            this.textureMode = mapboxMapOptions.getTextureMode();
            if (mapboxMapOptions.isSimpleMode()) {
                inflateSimpleView(context);
            } else {
                LayoutInflater.from(context).inflate(R.layout.mapbox_mapview_internal, this);
            }
            CompassView compassView = (CompassView) findViewById(R.id.compassView);
            MyLocationView myLocationView = (MyLocationView) findViewById(R.id.userLocationView);
            ImageView imageView = (ImageView) findViewById(R.id.attributionView);
            this.nativeMapView = sNativeMapViewFactory.create(this);
            FocalPointChangeListener focalPointInvalidator = compassView != null ? new FocalPointInvalidator(compassView) : new FocalPointInvalidator();
            RegisterTouchListener registerTouchListener = new RegisterTouchListener();
            CameraZoomInvalidator cameraZoomInvalidator = new CameraZoomInvalidator();
            CameraChangeDispatcher cameraChangeDispatcher = new CameraChangeDispatcher();
            Projection projection = new Projection(this.nativeMapView);
            UiSettings uiSettings = r0;
            Projection projection2 = projection;
            CompassView compassView2 = compassView;
            CompassView compassView3 = compassView;
            CameraChangeDispatcher cameraChangeDispatcher2 = cameraChangeDispatcher;
            CameraZoomInvalidator cameraZoomInvalidator2 = cameraZoomInvalidator;
            RegisterTouchListener registerTouchListener2 = registerTouchListener;
            UiSettings uiSettings2 = new UiSettings(projection, focalPointInvalidator, compassView2, imageView, findViewById(R.id.logoView), this);
            TrackingSettings trackingSettings = myLocationView != null ? new TrackingSettings(myLocationView, uiSettings, focalPointInvalidator, cameraZoomInvalidator2) : new MockTrackingSettings(uiSettings);
            MyLocationViewSettings myLocationViewSettings = new MyLocationViewSettings(myLocationView, projection2, focalPointInvalidator);
            AnnotationManager annotationManager = new AnnotationManager(this.nativeMapView, this, new MarkerViewManager((ViewGroup) findViewById(R.id.markerViewContainer)));
            Transform transform = new Transform(this.nativeMapView, annotationManager.getMarkerViewManager(), trackingSettings, cameraChangeDispatcher2);
            Transform transform2 = transform;
            AnnotationManager annotationManager2 = annotationManager;
            TrackingSettings trackingSettings2 = trackingSettings;
            ImageView imageView2 = imageView;
            this.mapboxMap = sMapboxMapFactory.create(this, this.nativeMapView, transform, uiSettings, trackingSettings, myLocationViewSettings, projection2, registerTouchListener2, annotationManager2, cameraChangeDispatcher2);
            this.mapGestureDetector = new MapGestureDetector(transform2, projection2, uiSettings, trackingSettings2, annotationManager2, cameraChangeDispatcher2, this);
            Transform transform3 = transform2;
            this.mapKeyListener = new MapKeyListener(transform3, trackingSettings2, uiSettings, this);
            if (!useSimpleMode()) {
                this.mapZoomButtonController = new MapZoomButtonController(this, uiSettings, new MapZoomControllerListener(this.mapGestureDetector, uiSettings, transform3));
            }
            if (compassView3 != null) {
                compassView3.setMapboxMap(this.mapboxMap);
            }
            if (myLocationView != null) {
                myLocationView.setMapboxMap(this.mapboxMap);
            }
            ImageView imageView3 = imageView2;
            if (imageView3 != null) {
                context3 = context;
                imageView3.setOnClickListener(new AttributionDialogManager(context3, this.mapboxMap));
            } else {
                context3 = context;
            }
            setClickable(true);
            setLongClickable(true);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestDisallowInterceptTouchEvent(true);
            setWillNotDraw(false);
            this.nativeMapView.setReachability(ConnectivityReceiver.instance(context).isConnected(context3));
            this.mapboxMap.initialise(context3, mapboxMapOptions);
        }
    }

    /* Access modifiers changed, original: protected */
    public void initialiseDrawingSurface(boolean z) {
        this.nativeMapView.initializeDisplay();
        this.nativeMapView.initializeContext();
        if (z) {
            TextureView textureView = new TextureView(getContext());
            textureView.setSurfaceTextureListener(new SurfaceTextureListener());
            modifyTextureView(textureView);
            addView(textureView, 0);
            return;
        }
        SurfaceView surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        surfaceView.getHolder().addCallback(new SurfaceCallback());
        surfaceView.setVisibility(0);
        modifySurfaceView(surfaceView);
    }

    /* Access modifiers changed, original: protected */
    public void modifyOptions(MapboxMapOptions mapboxMapOptions) {
    }

    /* Access modifiers changed, original: protected */
    public void modifySurfaceView(SurfaceView surfaceView) {
    }

    /* Access modifiers changed, original: protected */
    public void modifyTextureView(TextureView textureView) {
    }

    public void onCreate(Bundle bundle) {
        synchronized (this) {
            if (this.mEventHandlerThread == null) {
                this.mEventHandlerThread = new HandlerThread("MapBox Event Thread", 10);
                this.mEventHandlerThread.start();
                this.mEventHandler = new Handler(this.mEventHandlerThread.getLooper());
            }
        }
        if (bundle == null) {
            postOnEventThread(new Runnable() {
                public void run() {
                    TelemetryAccessor.pushEvent(MapboxEventWrapper.buildMapLoadEvent());
                }
            });
        } else if (bundle.getBoolean(MapboxConstants.STATE_HAS_SAVED_STATE)) {
            this.mapboxMap.onRestoreInstanceState(bundle);
        }
        initialiseDrawingSurface(this.textureMode);
        MapCallback mapCallback = new MapCallback(this, this.mapboxMap);
        this.mapCallback = mapCallback;
        addOnMapChangedListener(mapCallback);
    }

    public void onDestroy() {
        this.destroyed = true;
        synchronized (this) {
            if (this.mEventHandlerThread != null) {
                if (VERSION.SDK_INT >= 18) {
                    this.mEventHandlerThread.quitSafely();
                } else {
                    this.mEventHandlerThread.quit();
                }
            }
            this.mEventHandlerThread = null;
            this.mEventHandler = null;
        }
        NativeMapView nativeMapView = this.nativeMapView;
        if (nativeMapView != null) {
            nativeMapView.terminateContext();
            this.nativeMapView.terminateDisplay();
            this.nativeMapView.destroySurface();
            this.nativeMapView.destroy();
            this.nativeMapView = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MapZoomButtonController mapZoomButtonController = this.mapZoomButtonController;
        if (mapZoomButtonController != null) {
            mapZoomButtonController.setVisible(false);
        }
    }

    public void onDoubleSingleTapZoom() {
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener != null) {
            gestureListener.onDoubleSingleTapZoom();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && !this.destroyed && this.hasSurface) {
            this.nativeMapView.render();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFpsChanged(final double d) {
        final OnFpsChangedListener onFpsChangedListener = this.mapboxMap.getOnFpsChangedListener();
        if (onFpsChangedListener != null) {
            post(new Runnable() {
                public void run() {
                    onFpsChangedListener.onFpsChanged(d);
                }
            });
        }
    }

    /* Access modifiers changed, original: protected */
    public void onInvalidate() {
        postInvalidate();
    }

    public void onLowMemory() {
        this.nativeMapView.onLowMemory();
    }

    public void onPanEnded() {
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener != null) {
            gestureListener.onPanEnded();
        }
    }

    public void onPause() {
    }

    public void onPinchZoomEnded() {
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener != null) {
            gestureListener.onPinchZoomEnded();
        }
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_HAS_SAVED_STATE, true);
        this.mapboxMap.onSaveInstanceState(bundle);
    }

    public void onSingleFingerZoomEnded() {
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener != null) {
            gestureListener.onSingleFingerZoomEnded();
        }
    }

    public void onSingleTap() {
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener != null) {
            gestureListener.onSingleTap();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(this.destroyed || isInEditMode())) {
            this.nativeMapView.resizeView(i, i2);
        }
    }

    public void onStart() {
        this.mapboxMap.onStart();
        ConnectivityReceiver.instance(getContext()).activate();
    }

    public void onStop() {
        this.mapboxMap.onStop();
        ConnectivityReceiver.instance(getContext()).deactivate();
    }

    /* Access modifiers changed, original: protected */
    public boolean onSurfaceAvailableError(Error error, SurfaceHolder surfaceHolder) {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean onSurfaceTextureAvailableError(Error error, SurfaceTexture surfaceTexture, int i, int i2) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            MapZoomButtonController mapZoomButtonController = this.mapZoomButtonController;
            if (mapZoomButtonController != null) {
                mapZoomButtonController.setVisible(true);
            }
        }
        return this.mapGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void onTwoFingerTapZoom() {
        GestureListener gestureListener = this.mGestureListener;
        if (gestureListener != null) {
            gestureListener.onTwoFingerZoom();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onVisibilityChanged(View view, int i) {
        if (!isInEditMode()) {
            MapZoomButtonController mapZoomButtonController = this.mapZoomButtonController;
            if (mapZoomButtonController != null) {
                mapZoomButtonController.setVisible(i == 0);
            }
        }
    }

    public synchronized void postOnEventThread(Runnable runnable) {
        if (this.mEventHandler != null) {
            this.mEventHandler.post(runnable);
        }
    }

    public void removeOnMapChangedListener(OnMapChangedListener onMapChangedListener) {
        if (onMapChangedListener != null) {
            this.nativeMapView.removeOnMapChangedListener(onMapChangedListener);
        }
    }

    public void setGestureListener(GestureListener gestureListener) {
        this.mGestureListener = gestureListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setMapboxMap(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
    }

    public void setStyleUrl(String str) {
        if (!this.destroyed) {
            this.nativeMapView.setStyleUrl(str);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean useSimpleMode() {
        return false;
    }
}
