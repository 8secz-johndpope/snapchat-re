package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager.OnMarkerViewAddedListener;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.maps.widgets.MyLocationViewSettings;
import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.mapbox.services.android.telemetry.location.LocationEngine;
import com.mapbox.services.commons.geojson.Feature;
import defpackage.alsj;
import defpackage.cgj;
import defpackage.jf.b;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class MapboxMap {
    private final AnnotationManager annotationManager;
    private final CameraChangeDispatcher cameraChangeDispatcher;
    private Context context;
    private final MyLocationViewSettings myLocationViewSettings;
    private final NativeMapView nativeMapView;
    private OnFpsChangedListener onFpsChangedListener;
    private final OnRegisterTouchListener onRegisterTouchListener;
    private final Projection projection;
    private final TrackingSettings trackingSettings;
    private final Transform transform;
    private final UiSettings uiSettings;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoWindow(Marker marker);
    }

    public static abstract class MarkerViewAdapter<U extends MarkerView> {
        private Context context;
        private final Class<U> persistentClass = ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
        private final b<View> viewReusePool = new b(10000);

        public MarkerViewAdapter(Context context) {
            this.context = context;
        }

        public Context getContext() {
            return this.context;
        }

        public Class<U> getMarkerClass() {
            return this.persistentClass;
        }

        public abstract View getView(U u, View view, ViewGroup viewGroup);

        public b<View> getViewReusePool() {
            return this.viewReusePool;
        }

        public void onDeselect(U u, View view) {
        }

        public boolean onSelect(U u, View view, boolean z) {
            return true;
        }

        public boolean prepareViewForReuse(MarkerView markerView, View view) {
            return true;
        }

        public void releaseView(View view) {
            view.setVisibility(8);
            this.viewReusePool.a(view);
        }
    }

    @Deprecated
    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 3;
        public static final int REASON_API_GESTURE = 1;
        public static final int REASON_DEVELOPER_ANIMATION = 2;

        void onCameraMoveStarted(int i);
    }

    public interface OnFlingListener {
        void onFling();
    }

    public interface OnFpsChangedListener {
        void onFpsChanged(double d);
    }

    public interface OnInfoWindowClickListener {
        boolean onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerViewClickListener {
        boolean onMarkerClick(Marker marker, View view, MarkerViewAdapter markerViewAdapter);
    }

    public interface OnMyBearingTrackingModeChangeListener {
        void onMyBearingTrackingModeChange(int i);
    }

    public interface OnMyLocationChangeListener {
        void onMyLocationChange(Location location);
    }

    public interface OnMyLocationTrackingModeChangeListener {
        void onMyLocationTrackingModeChange(int i);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    public interface OnRegisterTouchListener {
        void onRegisterFlingListener(OnFlingListener onFlingListener);

        void onRegisterMapClickListener(OnMapClickListener onMapClickListener);

        void onRegisterMapLongClickListener(OnMapLongClickListener onMapLongClickListener);

        void onRegisterScrollListener(OnScrollListener onScrollListener);
    }

    public interface OnScrollListener {
        void onScroll();
    }

    public interface OnStyleLoadedListener {
        void onStyleLoaded(String str);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    public MapboxMap(NativeMapView nativeMapView, Transform transform, UiSettings uiSettings, TrackingSettings trackingSettings, MyLocationViewSettings myLocationViewSettings, Projection projection, OnRegisterTouchListener onRegisterTouchListener, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher) {
        this.nativeMapView = nativeMapView;
        this.uiSettings = uiSettings;
        this.trackingSettings = trackingSettings;
        this.projection = projection;
        this.myLocationViewSettings = myLocationViewSettings;
        this.annotationManager = annotationManager.bind(this);
        this.transform = transform;
        this.onRegisterTouchListener = onRegisterTouchListener;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
    }

    private void setApiBaseUrl(MapboxMapOptions mapboxMapOptions) {
        String apiBaseUrl = mapboxMapOptions.getApiBaseUrl();
        if (!TextUtils.isEmpty(apiBaseUrl)) {
            this.nativeMapView.setApiBaseUrl(apiBaseUrl);
        }
    }

    private void setPadding(int[] iArr) {
        this.projection.setContentPadding(iArr, this.myLocationViewSettings.getPadding());
        this.uiSettings.invalidate();
    }

    private void setStyleUrl(MapboxMapOptions mapboxMapOptions) {
        String style = mapboxMapOptions.getStyle();
        if (!TextUtils.isEmpty(style)) {
            setStyleUrl(style, null);
        }
    }

    public void addImage(String str, Bitmap bitmap) {
        this.nativeMapView.addImage(str, bitmap);
    }

    public void addLayer(Layer layer) {
        this.nativeMapView.addLayer(layer);
    }

    public void addLayerAbove(Layer layer, String str) {
        this.nativeMapView.addLayerAbove(layer, str);
    }

    public void addLayerAt(Layer layer, int i) {
        this.nativeMapView.addLayerAt(layer, i);
    }

    public void addLayerBelow(Layer layer, String str) {
        this.nativeMapView.addLayerBelow(layer, str);
    }

    public Marker addMarker(BaseMarkerOptions baseMarkerOptions) {
        return this.annotationManager.addMarker(baseMarkerOptions, this);
    }

    public Marker addMarker(MarkerOptions markerOptions) {
        return this.annotationManager.addMarker(markerOptions, this);
    }

    public MarkerView addMarker(BaseMarkerViewOptions baseMarkerViewOptions) {
        return this.annotationManager.addMarker(baseMarkerViewOptions, this, null);
    }

    public MarkerView addMarker(BaseMarkerViewOptions baseMarkerViewOptions, OnMarkerViewAddedListener onMarkerViewAddedListener) {
        return this.annotationManager.addMarker(baseMarkerViewOptions, this, onMarkerViewAddedListener);
    }

    public List<MarkerView> addMarkerViews(List<? extends BaseMarkerViewOptions> list) {
        return this.annotationManager.addMarkerViews(list, this);
    }

    public List<Marker> addMarkers(List<? extends BaseMarkerOptions> list) {
        return this.annotationManager.addMarkers(list, this);
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        return this.annotationManager.addPolygon(polygonOptions, this);
    }

    public List<Polygon> addPolygons(List<PolygonOptions> list) {
        return this.annotationManager.addPolygons(list, this);
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) {
        return this.annotationManager.addPolyline(polylineOptions, this);
    }

    public List<Polyline> addPolylines(List<PolylineOptions> list) {
        return this.annotationManager.addPolylines(list, this);
    }

    public void addSource(Source source) {
        this.nativeMapView.addSource(source);
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        animateCamera(cameraUpdate, MapboxConstants.ANIMATION_DURATION, null);
    }

    public void animateCamera(CameraUpdate cameraUpdate, int i) {
        animateCamera(cameraUpdate, i, null);
    }

    public void animateCamera(final CameraUpdate cameraUpdate, final int i, final CancelableCallback cancelableCallback) {
        MapView mapView = this.nativeMapView.mapView;
        if (mapView != null) {
            mapView.post(new Runnable() {
                public void run() {
                    if (!MapboxMap.this.nativeMapView.destroyed) {
                        MapboxMap.this.transform.animateCamera(MapboxMap.this, cameraUpdate, i, cancelableCallback);
                    }
                }
            });
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, CancelableCallback cancelableCallback) {
        animateCamera(cameraUpdate, MapboxConstants.ANIMATION_DURATION, cancelableCallback);
    }

    public void cancelTransitions() {
        this.transform.cancelTransitions();
    }

    public void clear() {
        this.annotationManager.removeAnnotations();
    }

    public void cycleDebugOptions() {
        this.nativeMapView.cycleDebugOptions();
    }

    public void deselectMarker(Marker marker) {
        this.annotationManager.deselectMarker(marker);
    }

    public void deselectMarkers() {
        this.annotationManager.deselectMarkers();
    }

    public void easeCamera(CameraUpdate cameraUpdate) {
        easeCamera(cameraUpdate, MapboxConstants.ANIMATION_DURATION);
    }

    public void easeCamera(CameraUpdate cameraUpdate, int i) {
        easeCamera(cameraUpdate, i, null);
    }

    public void easeCamera(CameraUpdate cameraUpdate, int i, CancelableCallback cancelableCallback) {
        easeCamera(cameraUpdate, i, true, cancelableCallback);
    }

    public void easeCamera(CameraUpdate cameraUpdate, int i, boolean z) {
        easeCamera(cameraUpdate, i, z, null);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback) {
        easeCamera(cameraUpdate, i, z, cancelableCallback, false);
    }

    public final void easeCamera(CameraUpdate cameraUpdate, int i, boolean z, CancelableCallback cancelableCallback, boolean z2) {
        MapView mapView = this.nativeMapView.mapView;
        if (mapView != null) {
            final CameraUpdate cameraUpdate2 = cameraUpdate;
            final int i2 = i;
            final boolean z3 = z;
            final CancelableCallback cancelableCallback2 = cancelableCallback;
            final boolean z4 = z2;
            mapView.post(new Runnable() {
                public void run() {
                    if (!MapboxMap.this.nativeMapView.destroyed) {
                        MapboxMap.this.transform.easeCamera(MapboxMap.this, cameraUpdate2, i2, z3, cancelableCallback2, z4);
                    }
                }
            });
        }
    }

    public Annotation getAnnotation(long j) {
        return this.annotationManager.getAnnotation(j);
    }

    public List<Annotation> getAnnotations() {
        return this.annotationManager.getAnnotations();
    }

    public CameraPosition getCameraForLatLngBounds(cgj cgj, int[] iArr) {
        int[] padding = getPadding();
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = padding[i] + iArr[i];
        }
        this.projection.setContentPadding(iArr, this.myLocationViewSettings.getPadding());
        CameraPosition cameraForLatLngBounds = this.nativeMapView.getCameraForLatLngBounds(cgj);
        setPadding(padding);
        return cameraForLatLngBounds;
    }

    public CameraPosition getCameraPosition() {
        return this.transform.getCameraPosition();
    }

    public Context getContext() {
        return this.context;
    }

    public float getHeight() {
        return (float) this.nativeMapView.getHeight();
    }

    public InfoWindowAdapter getInfoWindowAdapter() {
        return this.annotationManager.getInfoWindowManager().getInfoWindowAdapter();
    }

    public Layer getLayer(String str) {
        return this.nativeMapView.getLayer(str);
    }

    public <T extends Layer> T getLayerAs(String str) {
        try {
            str = this.nativeMapView.getLayer(str);
            return str;
        } catch (ClassCastException e) {
            alsj.d(String.format("Layer: %s is a different type: %s", new Object[]{str, e}), new Object[0]);
            return null;
        }
    }

    public List<Layer> getLayers() {
        return this.nativeMapView.getLayers();
    }

    public Light getLight() {
        return this.nativeMapView.getLight();
    }

    public MarkerViewManager getMarkerViewManager() {
        return this.annotationManager.getMarkerViewManager();
    }

    public List<MarkerView> getMarkerViewsInRect(RectF rectF) {
        return this.annotationManager.getMarkerViewsInRect(rectF);
    }

    public List<Marker> getMarkers() {
        return this.annotationManager.getMarkers();
    }

    public double getMaxZoomLevel() {
        return this.transform.getMaxZoom();
    }

    public double getMinZoomLevel() {
        return this.transform.getMinZoom();
    }

    public Location getMyLocation() {
        return this.trackingSettings.getMyLocation();
    }

    public MyLocationViewSettings getMyLocationViewSettings() {
        return this.myLocationViewSettings;
    }

    /* Access modifiers changed, original: 0000 */
    public OnFpsChangedListener getOnFpsChangedListener() {
        return this.onFpsChangedListener;
    }

    public OnInfoWindowClickListener getOnInfoWindowClickListener() {
        return this.annotationManager.getInfoWindowManager().getOnInfoWindowClickListener();
    }

    public OnInfoWindowCloseListener getOnInfoWindowCloseListener() {
        return this.annotationManager.getInfoWindowManager().getOnInfoWindowCloseListener();
    }

    public OnInfoWindowLongClickListener getOnInfoWindowLongClickListener() {
        return this.annotationManager.getInfoWindowManager().getOnInfoWindowLongClickListener();
    }

    public int[] getPadding() {
        return this.projection.getContentPadding();
    }

    public List<Polygon> getPolygons() {
        return this.annotationManager.getPolygons();
    }

    public List<Polyline> getPolylines() {
        return this.annotationManager.getPolylines();
    }

    public Projection getProjection() {
        return this.projection;
    }

    public List<Marker> getSelectedMarkers() {
        return this.annotationManager.getSelectedMarkers();
    }

    public Source getSource(String str) {
        return this.nativeMapView.getSource(str);
    }

    public <T extends Source> T getSourceAs(String str) {
        try {
            str = this.nativeMapView.getSource(str);
            return str;
        } catch (ClassCastException e) {
            alsj.d(String.format("Source: %s is a different type: %s", new Object[]{str, e}), new Object[0]);
            return null;
        }
    }

    public List<Source> getSources() {
        return this.nativeMapView.getSources();
    }

    public String getStyleUrl() {
        return this.nativeMapView.getStyleUrl();
    }

    public TrackingSettings getTrackingSettings() {
        return this.trackingSettings;
    }

    /* Access modifiers changed, original: 0000 */
    public Transform getTransform() {
        return this.transform;
    }

    public long getTransitionDelay() {
        return this.nativeMapView.getTransitionDelay();
    }

    public long getTransitionDuration() {
        return this.nativeMapView.getTransitionDuration();
    }

    public UiSettings getUiSettings() {
        return this.uiSettings;
    }

    public float getWidth() {
        return (float) this.nativeMapView.getWidth();
    }

    public void initialise(Context context, MapboxMapOptions mapboxMapOptions) {
        this.context = context;
        this.transform.initialise(this, mapboxMapOptions);
        this.uiSettings.initialise(context, mapboxMapOptions);
        this.myLocationViewSettings.initialise(mapboxMapOptions);
        this.trackingSettings.initialise(mapboxMapOptions);
        setDebugActive(mapboxMapOptions.getDebugActive());
        setApiBaseUrl(mapboxMapOptions);
        setStyleUrl(mapboxMapOptions);
    }

    /* Access modifiers changed, original: 0000 */
    public void invalidateCameraPosition() {
        CameraPosition invalidateCameraPosition = this.transform.invalidateCameraPosition();
        if (invalidateCameraPosition != null) {
            this.transform.updateCameraPosition(invalidateCameraPosition);
        }
    }

    public boolean isAllowConcurrentMultipleOpenInfoWindows() {
        return this.annotationManager.getInfoWindowManager().isAllowConcurrentMultipleOpenInfoWindows();
    }

    public boolean isDebugActive() {
        return this.nativeMapView.getDebug();
    }

    public boolean isDestroyed() {
        return this.nativeMapView.destroyed;
    }

    public boolean isMyLocationEnabled() {
        return this.trackingSettings.isMyLocationEnabled();
    }

    public void moveCamera(CameraUpdate cameraUpdate) {
        moveCamera(cameraUpdate, null);
    }

    public void moveCamera(final CameraUpdate cameraUpdate, final CancelableCallback cancelableCallback) {
        MapView mapView = this.nativeMapView.mapView;
        if (mapView != null) {
            mapView.post(new Runnable() {
                public void run() {
                    if (!MapboxMap.this.nativeMapView.destroyed) {
                        MapboxMap.this.transform.moveCamera(MapboxMap.this, cameraUpdate, cancelableCallback);
                        MapboxMap.this.invalidateCameraPosition();
                    }
                }
            });
        }
    }

    /* Access modifiers changed, original: protected */
    public void onInvalidCameraPositionRequested(Error error, CameraPosition cameraPosition, CameraUpdate cameraUpdate) {
    }

    /* Access modifiers changed, original: 0000 */
    public void onPostMapReady() {
        invalidateCameraPosition();
    }

    /* Access modifiers changed, original: 0000 */
    public void onPreMapReady() {
        this.annotationManager.reloadMarkers();
        this.annotationManager.adjustTopOffsetPixels(this);
    }

    /* Access modifiers changed, original: 0000 */
    public void onRestoreInstanceState(Bundle bundle) {
        CameraPosition cameraPosition = (CameraPosition) bundle.getParcelable(MapboxConstants.STATE_CAMERA_POSITION);
        this.uiSettings.onRestoreInstanceState(bundle);
        this.trackingSettings.onRestoreInstanceState(bundle);
        if (cameraPosition != null) {
            easeCamera(CameraUpdateFactory.newCameraPosition(new Builder(cameraPosition).build()), 0, false, null, this.trackingSettings.isLocationTrackingDisabled() ^ 1);
        }
        this.nativeMapView.setDebug(bundle.getBoolean(MapboxConstants.STATE_DEBUG_ACTIVE));
        String str = MapboxConstants.STATE_STYLE_URL;
        if (!TextUtils.isEmpty(bundle.getString(str))) {
            this.nativeMapView.setStyleUrl(bundle.getString(str));
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable(MapboxConstants.STATE_CAMERA_POSITION, this.transform.getCameraPosition());
        bundle.putBoolean(MapboxConstants.STATE_DEBUG_ACTIVE, this.nativeMapView.getDebug());
        bundle.putString(MapboxConstants.STATE_STYLE_URL, this.nativeMapView.getStyleUrl());
        this.trackingSettings.onSaveInstanceState(bundle);
        this.uiSettings.onSaveInstanceState(bundle);
    }

    /* Access modifiers changed, original: 0000 */
    public void onStart() {
        this.nativeMapView.update();
        this.trackingSettings.onStart();
        if (TextUtils.isEmpty(this.nativeMapView.getStyleUrl())) {
            this.nativeMapView.setStyleUrl(Style.MAPBOX_STREETS);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onStop() {
        this.trackingSettings.onStop();
    }

    /* Access modifiers changed, original: 0000 */
    public void onUpdateFullyRendered() {
        CameraPosition invalidateCameraPosition = this.transform.invalidateCameraPosition();
        if (invalidateCameraPosition != null) {
            this.uiSettings.update(invalidateCameraPosition);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void onUpdateRegionChange() {
        this.trackingSettings.update();
        this.annotationManager.update();
    }

    public List<Feature> queryRenderedFeatures(PointF pointF, Statement statement, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(pointF, strArr, statement);
    }

    public List<Feature> queryRenderedFeatures(PointF pointF, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(pointF, strArr, null);
    }

    public List<Feature> queryRenderedFeatures(RectF rectF, Statement statement, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(rectF, strArr, statement);
    }

    public List<Feature> queryRenderedFeatures(RectF rectF, String... strArr) {
        return this.nativeMapView.queryRenderedFeatures(rectF, strArr, null);
    }

    public void removeAnnotation(long j) {
        this.annotationManager.removeAnnotation(j);
    }

    public void removeAnnotation(Annotation annotation) {
        this.annotationManager.removeAnnotation(annotation);
    }

    public void removeAnnotations() {
        this.annotationManager.removeAnnotations();
    }

    public void removeAnnotations(List<? extends Annotation> list) {
        this.annotationManager.removeAnnotations(list);
    }

    public void removeImage(String str) {
        this.nativeMapView.removeImage(str);
    }

    public Layer removeLayer(Layer layer) {
        return this.nativeMapView.removeLayer(layer);
    }

    public Layer removeLayer(String str) {
        return this.nativeMapView.removeLayer(str);
    }

    public Layer removeLayerAt(int i) {
        return this.nativeMapView.removeLayerAt(i);
    }

    public void removeMarker(Marker marker) {
        this.annotationManager.removeAnnotation((Annotation) marker);
    }

    public void removePolygon(Polygon polygon) {
        this.annotationManager.removeAnnotation((Annotation) polygon);
    }

    public void removePolyline(Polyline polyline) {
        this.annotationManager.removeAnnotation((Annotation) polyline);
    }

    public Source removeSource(Source source) {
        return this.nativeMapView.removeSource(source);
    }

    public Source removeSource(String str) {
        return this.nativeMapView.removeSource(str);
    }

    public void resetNorth() {
        this.transform.resetNorth();
    }

    public void selectMarker(Marker marker) {
        if (marker == null) {
            alsj.c("marker was null, so just returning", new Object[0]);
            return;
        }
        this.annotationManager.selectMarker(marker);
    }

    public void setAllowConcurrentMultipleOpenInfoWindows(boolean z) {
        this.annotationManager.getInfoWindowManager().setAllowConcurrentMultipleOpenInfoWindows(z);
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), null);
    }

    public void setDebugActive(boolean z) {
        this.nativeMapView.setDebug(z);
    }

    public void setFocalBearing(double d, float f, float f2, long j) {
        this.transform.setBearing(d, f, f2, j);
    }

    public void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        this.annotationManager.getInfoWindowManager().setInfoWindowAdapter(infoWindowAdapter);
    }

    public void setLatLngBoundsForCameraTarget(cgj cgj) {
        this.nativeMapView.setLatLngBounds(cgj);
    }

    public void setLocationSource(LocationEngine locationEngine) {
        this.trackingSettings.setLocationSource(locationEngine);
    }

    public void setMaxZoomPreference(double d) {
        this.transform.setMaxZoom(d);
    }

    public void setMinZoomPreference(double d) {
        this.transform.setMinZoom(d);
    }

    public void setMyLocationEnabled(boolean z) {
        this.trackingSettings.setMyLocationEnabled(z);
    }

    @Deprecated
    public void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        this.transform.setOnCameraChangeListener(onCameraChangeListener);
    }

    public void setOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        this.cameraChangeDispatcher.setOnCameraIdleListener(onCameraIdleListener);
    }

    public void setOnCameraMoveCancelListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.cameraChangeDispatcher.setOnCameraMoveCanceledListener(onCameraMoveCanceledListener);
    }

    public void setOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        this.cameraChangeDispatcher.setOnCameraMoveListener(onCameraMoveListener);
    }

    public void setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.cameraChangeDispatcher.setOnCameraMoveStartedListener(onCameraMoveStartedListener);
    }

    public void setOnFlingListener(OnFlingListener onFlingListener) {
        this.onRegisterTouchListener.onRegisterFlingListener(onFlingListener);
    }

    public void setOnFpsChangedListener(OnFpsChangedListener onFpsChangedListener) {
        this.onFpsChangedListener = onFpsChangedListener;
    }

    public void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        this.annotationManager.getInfoWindowManager().setOnInfoWindowClickListener(onInfoWindowClickListener);
    }

    public void setOnInfoWindowCloseListener(OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.annotationManager.getInfoWindowManager().setOnInfoWindowCloseListener(onInfoWindowCloseListener);
    }

    public void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.annotationManager.getInfoWindowManager().setOnInfoWindowLongClickListener(onInfoWindowLongClickListener);
    }

    public void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.onRegisterTouchListener.onRegisterMapClickListener(onMapClickListener);
    }

    public void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.onRegisterTouchListener.onRegisterMapLongClickListener(onMapLongClickListener);
    }

    public void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        this.annotationManager.setOnMarkerClickListener(onMarkerClickListener);
    }

    public void setOnMyBearingTrackingModeChangeListener(OnMyBearingTrackingModeChangeListener onMyBearingTrackingModeChangeListener) {
        this.trackingSettings.setOnMyBearingTrackingModeChangeListener(onMyBearingTrackingModeChangeListener);
    }

    public void setOnMyLocationChangeListener(OnMyLocationChangeListener onMyLocationChangeListener) {
        this.trackingSettings.setOnMyLocationChangeListener(onMyLocationChangeListener);
    }

    public void setOnMyLocationTrackingModeChangeListener(OnMyLocationTrackingModeChangeListener onMyLocationTrackingModeChangeListener) {
        this.trackingSettings.setOnMyLocationTrackingModeChangeListener(onMyLocationTrackingModeChangeListener);
    }

    public void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        this.annotationManager.setOnPolygonClickListener(onPolygonClickListener);
    }

    public void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        this.annotationManager.setOnPolylineClickListener(onPolylineClickListener);
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.onRegisterTouchListener.onRegisterScrollListener(onScrollListener);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        setPadding(new int[]{i, i2, i3, i4});
    }

    public void setStyle(String str) {
        setStyleUrl(str);
    }

    public void setStyle(String str, OnStyleLoadedListener onStyleLoadedListener) {
        setStyleUrl(str, onStyleLoadedListener);
    }

    public void setStyleUrl(String str) {
        setStyleUrl(str, null);
    }

    public void setStyleUrl(final String str, final OnStyleLoadedListener onStyleLoadedListener) {
        if (onStyleLoadedListener != null) {
            this.nativeMapView.addOnMapChangedListener(new OnMapChangedListener() {
                public void onMapChanged(int i) {
                    if (i == 14) {
                        onStyleLoadedListener.onStyleLoaded(str);
                        MapboxMap.this.nativeMapView.removeOnMapChangedListener(this);
                    }
                }
            });
        }
        this.nativeMapView.setStyleUrl(str);
    }

    public void setTransitionDelay(long j) {
        this.nativeMapView.setTransitionDelay(j);
    }

    public void setTransitionDuration(long j) {
        this.nativeMapView.setTransitionDuration(j);
    }

    public void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        this.nativeMapView.addSnapshotCallback(snapshotReadyCallback);
    }

    public void updateMarker(Marker marker) {
        this.annotationManager.updateMarker(marker);
    }

    public void updatePolygon(Polygon polygon) {
        this.annotationManager.updatePolygon(polygon);
    }

    public void updatePolyline(Polyline polyline) {
        this.annotationManager.updatePolyline(polyline);
    }
}
