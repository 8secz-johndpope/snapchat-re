package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.Surface;
import com.mapbox.mapboxsdk.MapboxNatives;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.SnapshotReadyCallback;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.style.layers.Filter.Statement;
import com.mapbox.mapboxsdk.style.layers.Layer;
import com.mapbox.mapboxsdk.style.light.Light;
import com.mapbox.mapboxsdk.style.sources.Source;
import com.mapbox.mapboxsdk.utils.BitmapUtils;
import com.mapbox.services.commons.geojson.Feature;
import com.snap.core.db.record.FriendWhoAddedMeModel;
import defpackage.alsj;
import defpackage.cgi;
import defpackage.cgj;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NativeMapView {
    protected boolean destroyed = false;
    private final FileSource fileSource;
    protected MapView mapView;
    protected long nativePtr = 0;
    private CopyOnWriteArrayList<OnMapChangedListener> onMapChangedListenerHolders;
    private OnMapChangedListener[] onMapChangedListeners;
    protected final float pixelRatio;
    private SnapshotReadyCallback snapshotReadyCallback;

    static {
        MapboxNatives.load();
    }

    public NativeMapView(MapView mapView) {
        Context context = mapView.getContext();
        SystemInfo systemInfo = MapView.getSystemInfo(context);
        this.fileSource = FileSource.getInstance(systemInfo.fileSourceCachePath, context);
        this.pixelRatio = systemInfo.pixelRatio;
        this.onMapChangedListenerHolders = new CopyOnWriteArrayList();
        this.mapView = mapView;
        nativeInitialize(this, this.fileSource, this.pixelRatio, systemInfo.programCacheDir, systemInfo.availableProcessors, systemInfo.totalMemory);
    }

    private boolean isDestroyedOn(String str) {
        if (this.destroyed && !TextUtils.isEmpty(str)) {
            alsj.d(String.format(MapboxConstants.MAPBOX_LOCALE, "You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", new Object[]{str}), new Object[0]);
        }
        return this.destroyed;
    }

    private native void nativeAddAnnotationIcon(String str, int i, int i2, float f, byte[] bArr);

    private native void nativeAddImage(String str, int i, int i2, float f, byte[] bArr);

    private native void nativeAddLayer(long j, String str);

    private native void nativeAddLayerAbove(long j, String str);

    private native void nativeAddLayerAt(long j, int i);

    private native long[] nativeAddMarkers(Marker[] markerArr);

    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    private native void nativeAddSource(long j);

    private native void nativeCancelTransitions();

    private native void nativeCreateSurface(Object obj);

    private native void nativeCycleDebugOptions();

    private native void nativeDestroy();

    private native void nativeDestroySurface();

    private native void nativeEaseTo(double d, double d2, double d3, long j, double d4, double d5, boolean z);

    private native void nativeFlyTo(double d, double d2, double d3, long j, double d4, double d5);

    private native double nativeGetBearing();

    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds);

    private native CameraPosition nativeGetCameraPosition();

    private native boolean nativeGetDebug();

    private native LatLng nativeGetLatLng();

    private native Layer nativeGetLayer(String str);

    private native Layer[] nativeGetLayers();

    private native Light nativeGetLight();

    private native double nativeGetMaxZoom();

    private native double nativeGetMetersPerPixelAtLatitude(double d, double d2);

    private native double nativeGetMinZoom();

    private native double nativeGetPitch();

    private native Source nativeGetSource(String str);

    private native Source[] nativeGetSources();

    private native String nativeGetStyleJson();

    private native String nativeGetStyleUrl();

    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    private native long nativeGetTransitionDelay();

    private native long nativeGetTransitionDuration();

    private native double nativeGetZoom();

    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, float f, String str, int i, long j);

    private native void nativeInitializeContext();

    private native void nativeInitializeDisplay();

    private native boolean nativeIsFullyLoaded();

    private native void nativeJumpTo(double d, double d2, double d3, double d4, double d5);

    private native LatLng nativeLatLngForPixel(float f, float f2);

    private native void nativeLatLngForPixelWith(float f, float f2, LatLng latLng);

    private native LatLng nativeLatLngForProjectedMeters(double d, double d2);

    private native void nativeMoveBy(double d, double d2, long j);

    private native void nativeOnLowMemory();

    private native void nativePixelForHeatmapBatch(int i, Object obj, float f);

    private native PointF nativePixelForLatLng(double d, double d2);

    private native void nativePixelForLatLngBatch(int i, float[] fArr, float[] fArr2, float f);

    private native ProjectedMeters nativeProjectedMetersForLatLng(double d, double d2);

    private native long[] nativeQueryPointAnnotations(RectF rectF);

    private native Feature[] nativeQueryRenderedFeaturesForBox(float f, float f2, float f3, float f4, String[] strArr, Object[] objArr);

    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f, float f2, String[] strArr, Object[] objArr);

    private native void nativeRemoveAnnotations(long[] jArr);

    private native void nativeRemoveClass(long j, String str);

    private native void nativeRemoveImage(String str);

    private native void nativeRemoveLayer(long j);

    private native Layer nativeRemoveLayerAt(int i);

    private native Layer nativeRemoveLayerById(String str);

    private native void nativeRemoveSource(long j);

    private native Source nativeRemoveSourceById(String str);

    private native void nativeRender();

    private native void nativeResetNorth();

    private native void nativeResetPosition();

    private native void nativeResetZoom();

    private native void nativeResizeFramebuffer(int i, int i2);

    private native void nativeResizeView(int i, int i2);

    private native void nativeRotateBy(double d, double d2, double d3, double d4, long j);

    private native void nativeSetBearing(double d, long j);

    private native void nativeSetBearingXY(double d, double d2, double d3, long j);

    private native void nativeSetContentPadding(double d, double d2, double d3, double d4);

    private native void nativeSetDebug(boolean z);

    private native void nativeSetEnableFps(boolean z);

    private native void nativeSetGestureInProgress(boolean z);

    private native void nativeSetLatLng(double d, double d2, long j);

    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    private native void nativeSetMaxZoom(double d);

    private native void nativeSetMinZoom(double d);

    private native void nativeSetPitch(double d, long j);

    private native void nativeSetReachability(boolean z);

    private native void nativeSetStyleJson(String str);

    private native void nativeSetStyleUrl(String str);

    private native void nativeSetTransitionDelay(long j);

    private native void nativeSetTransitionDuration(long j);

    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d, long j);

    private native void nativeSetZoom(double d, double d2, double d3, long j);

    private native void nativeTakeSnapshot();

    private native void nativeTerminateContext();

    private native void nativeTerminateDisplay();

    private native void nativeUpdate();

    private native void nativeUpdateMarker(long j, double d, double d2, String str);

    private native void nativeUpdatePolygon(long j, Polygon polygon);

    private native void nativeUpdatePolyline(long j, Polyline polyline);

    public void addAnnotationIcon(String str, int i, int i2, float f, byte[] bArr) {
        if (!isDestroyedOn("addAnnotationIcon")) {
            nativeAddAnnotationIcon(str, i, i2, f, bArr);
        }
    }

    public void addImage(String str, Bitmap bitmap) {
        if (!isDestroyedOn("addImage")) {
            if (bitmap.getConfig() != Config.ARGB_8888) {
                bitmap = bitmap.copy(Config.ARGB_8888, false);
            }
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocate);
            nativeAddImage(str, bitmap.getWidth(), bitmap.getHeight(), (bitmap.getDensity() == 0 ? MapboxConstants.MINIMUM_ZOOM : (float) bitmap.getDensity()) / 160.0f, allocate.array());
        }
    }

    public void addLayer(Layer layer) {
        if (!isDestroyedOn("addLayer")) {
            nativeAddLayer(layer.getNativePtr(), null);
        }
    }

    public void addLayerAbove(Layer layer, String str) {
        if (!isDestroyedOn("addLayerAbove")) {
            nativeAddLayerAbove(layer.getNativePtr(), str);
        }
    }

    public void addLayerAt(Layer layer, int i) {
        if (!isDestroyedOn("addLayerAt")) {
            nativeAddLayerAt(layer.getNativePtr(), i);
        }
    }

    public void addLayerBelow(Layer layer, String str) {
        if (!isDestroyedOn("addLayerBelow")) {
            nativeAddLayer(layer.getNativePtr(), str);
        }
    }

    public long addMarker(Marker marker) {
        if (isDestroyedOn("addMarker")) {
            return 0;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    public long[] addMarkers(List<Marker> list) {
        return isDestroyedOn("addMarkers") ? new long[0] : nativeAddMarkers((Marker[]) list.toArray(new Marker[list.size()]));
    }

    /* Access modifiers changed, original: 0000 */
    public void addOnMapChangedListener(OnMapChangedListener onMapChangedListener) {
        this.onMapChangedListenerHolders.add(onMapChangedListener);
        this.onMapChangedListeners = (OnMapChangedListener[]) this.onMapChangedListenerHolders.toArray(new OnMapChangedListener[0]);
    }

    public long addPolygon(Polygon polygon) {
        if (isDestroyedOn("addPolygon")) {
            return 0;
        }
        return nativeAddPolygons(new Polygon[]{polygon})[0];
    }

    public long[] addPolygons(List<Polygon> list) {
        return isDestroyedOn("addPolygons") ? new long[0] : nativeAddPolygons((Polygon[]) list.toArray(new Polygon[list.size()]));
    }

    public long addPolyline(Polyline polyline) {
        if (isDestroyedOn("addPolyline")) {
            return 0;
        }
        return nativeAddPolylines(new Polyline[]{polyline})[0];
    }

    public long[] addPolylines(List<Polyline> list) {
        return isDestroyedOn("addPolylines") ? new long[0] : nativeAddPolylines((Polyline[]) list.toArray(new Polyline[list.size()]));
    }

    /* Access modifiers changed, original: 0000 */
    public void addSnapshotCallback(SnapshotReadyCallback snapshotReadyCallback) {
        this.snapshotReadyCallback = snapshotReadyCallback;
        scheduleTakeSnapshot();
        render();
    }

    public void addSource(Source source) {
        if (!isDestroyedOn(FriendWhoAddedMeModel.ADDSOURCE)) {
            nativeAddSource(source.getNativePtr());
        }
    }

    public void cancelTransitions() {
        if (!isDestroyedOn("cancelTransitions")) {
            nativeCancelTransitions();
        }
    }

    public void createSurface(Surface surface) {
        if (!isDestroyedOn("createSurface")) {
            nativeCreateSurface(surface);
        }
    }

    public void cycleDebugOptions() {
        if (!isDestroyedOn("cycleDebugOptions")) {
            nativeCycleDebugOptions();
        }
    }

    public void destroy() {
        nativeDestroy();
        this.mapView = null;
        this.destroyed = true;
    }

    public void destroySurface() {
        if (!isDestroyedOn("destroySurface")) {
            nativeDestroySurface();
        }
    }

    public void easeTo(double d, cgi cgi, long j, double d2, double d3, boolean z) {
        if (!isDestroyedOn("easeTo")) {
            nativeEaseTo(d, cgi.getLatitude(), cgi.getLongitude(), j, d2, d3, z);
        }
    }

    public void flyTo(double d, cgi cgi, long j, double d2, double d3) {
        if (!isDestroyedOn("flyTo")) {
            nativeFlyTo(d, cgi.getLatitude(), cgi.getLongitude(), j, d2, d3);
        }
    }

    public double getBearing() {
        return isDestroyedOn("getBearing") ? 0.0d : nativeGetBearing();
    }

    public CameraPosition getCameraForLatLngBounds(cgj cgj) {
        return isDestroyedOn("getCameraForLatLngBounds") ? null : nativeGetCameraForLatLngBounds(LatLngBounds.from(cgj));
    }

    public CameraPosition getCameraPosition() {
        return isDestroyedOn("getCameraValues") ? new Builder().build() : nativeGetCameraPosition();
    }

    public boolean getDebug() {
        return isDestroyedOn("getDebug") ? false : nativeGetDebug();
    }

    /* Access modifiers changed, original: 0000 */
    public int getHeight() {
        return isDestroyedOn("") ? 0 : this.mapView.getHeight();
    }

    public cgi getLatLng() {
        return isDestroyedOn("") ? new LatLng() : nativeGetLatLng().wrap();
    }

    public Layer getLayer(String str) {
        return isDestroyedOn("getLayer") ? null : nativeGetLayer(str);
    }

    public List<Layer> getLayers() {
        return isDestroyedOn("getLayers") ? null : Arrays.asList(nativeGetLayers());
    }

    public Light getLight() {
        return isDestroyedOn("getLight") ? null : nativeGetLight();
    }

    public double getMaxZoom() {
        return isDestroyedOn("getMaxZoom") ? 0.0d : nativeGetMaxZoom();
    }

    public double getMetersPerPixelAtLatitude(double d) {
        return isDestroyedOn("getMetersPerPixelAtLatitude") ? 0.0d : nativeGetMetersPerPixelAtLatitude(d, getZoom());
    }

    public double getMinZoom() {
        return isDestroyedOn("getMinZoom") ? 0.0d : nativeGetMinZoom();
    }

    public double getPitch() {
        return isDestroyedOn("getPitch") ? 0.0d : nativeGetPitch();
    }

    public void getPixelForLatLngBatch(int i, ByteBuffer byteBuffer, float f) {
        nativePixelForHeatmapBatch(i, byteBuffer, f);
    }

    public void getPixelForLatLngBatch(int i, float[] fArr, float[] fArr2, float f) {
        nativePixelForLatLngBatch(i, fArr, fArr2, f);
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public Source getSource(String str) {
        return isDestroyedOn("getSource") ? null : nativeGetSource(str);
    }

    public List<Source> getSources() {
        return isDestroyedOn("getSources") ? null : Arrays.asList(nativeGetSources());
    }

    public String getStyleJson() {
        return isDestroyedOn("getStyleJson") ? null : nativeGetStyleJson();
    }

    public String getStyleUrl() {
        return isDestroyedOn("getStyleUrl") ? null : nativeGetStyleUrl();
    }

    public double getTopOffsetPixelsForAnnotationSymbol(String str) {
        return isDestroyedOn("getTopOffsetPixelsForAnnotationSymbol") ? 0.0d : nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    public long getTransitionDelay() {
        return nativeGetTransitionDelay();
    }

    public long getTransitionDuration() {
        return nativeGetTransitionDuration();
    }

    /* Access modifiers changed, original: 0000 */
    public int getWidth() {
        return isDestroyedOn("") ? 0 : this.mapView.getWidth();
    }

    public double getZoom() {
        return isDestroyedOn("getZoom") ? 0.0d : nativeGetZoom();
    }

    public void initializeContext() {
        if (!isDestroyedOn("initializeContext")) {
            nativeInitializeContext();
        }
    }

    public void initializeDisplay() {
        if (!isDestroyedOn("initializeDisplay")) {
            nativeInitializeDisplay();
        }
    }

    public boolean isFullyLoaded() {
        return isDestroyedOn("isFullyLoaded") ? false : nativeIsFullyLoaded();
    }

    public void jumpTo(double d, cgi cgi, double d2, double d3) {
        if (!isDestroyedOn("jumpTo")) {
            nativeJumpTo(d, cgi.getLatitude(), cgi.getLongitude(), d2, d3);
        }
    }

    public cgi latLngForPixel(float f, float f2) {
        if (isDestroyedOn("latLngForPixel")) {
            return new LatLng();
        }
        float f3 = this.pixelRatio;
        return nativeLatLngForPixel(f / f3, f2 / f3).wrap();
    }

    public void latLngForPixelWith(float f, float f2, LatLng latLng) {
        if (!isDestroyedOn("latLngForPixel")) {
            float f3 = this.pixelRatio;
            nativeLatLngForPixelWith(f / f3, f2 / f3, latLng);
            latLng.wrap();
        }
    }

    public LatLng latLngForProjectedMeters(ProjectedMeters projectedMeters) {
        return isDestroyedOn("latLngForProjectedMeters") ? new LatLng() : nativeLatLngForProjectedMeters(projectedMeters.getNorthing(), projectedMeters.getEasting()).wrap();
    }

    public void moveBy(double d, double d2) {
        if (!isDestroyedOn("moveBy")) {
            moveBy(d, d2, 0);
        }
    }

    public void moveBy(double d, double d2, long j) {
        if (!isDestroyedOn("moveBy")) {
            float f = this.pixelRatio;
            double d3 = (double) f;
            Double.isNaN(d3);
            d3 = d / d3;
            double d4 = (double) f;
            Double.isNaN(d4);
            nativeMoveBy(d3, d2 / d4, j);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFpsChanged(double d) {
        if (!isDestroyedOn("OnFpsChanged")) {
            this.mapView.onFpsChanged(d);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onInvalidate() {
        MapView mapView = this.mapView;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    public void onLowMemory() {
        if (!isDestroyedOn("onLowMemory")) {
            nativeOnLowMemory();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMapChanged(int i) {
        OnMapChangedListener[] onMapChangedListenerArr = this.onMapChangedListeners;
        if (onMapChangedListenerArr != null) {
            for (OnMapChangedListener onMapChanged : onMapChangedListenerArr) {
                try {
                    onMapChanged.onMapChanged(i);
                } catch (RuntimeException e) {
                    alsj.d("Exception (%s) in MapView.OnMapChangedListener: %s", e.getClass(), e.getMessage());
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onSnapshotReady(Bitmap bitmap) {
        if (!isDestroyedOn("OnSnapshotReady")) {
            Bitmap createBitmapFromView = BitmapUtils.createBitmapFromView(this.mapView);
            SnapshotReadyCallback snapshotReadyCallback = this.snapshotReadyCallback;
            if (!(snapshotReadyCallback == null || bitmap == null || createBitmapFromView == null)) {
                snapshotReadyCallback.onSnapshotReady(BitmapUtils.mergeBitmap(bitmap, createBitmapFromView));
            }
        }
    }

    public PointF pixelForLatLng(float f, float f2) {
        return nativePixelForLatLng((double) f, (double) f2);
    }

    public PointF pixelForLatLng(cgi cgi) {
        if (isDestroyedOn("pixelForLatLng")) {
            return new PointF();
        }
        PointF nativePixelForLatLng = nativePixelForLatLng(cgi.getLatitude(), cgi.getLongitude());
        nativePixelForLatLng.set(nativePixelForLatLng.x * this.pixelRatio, nativePixelForLatLng.y * this.pixelRatio);
        return nativePixelForLatLng;
    }

    public ProjectedMeters projectedMetersForLatLng(cgi cgi) {
        return isDestroyedOn("projectedMetersForLatLng") ? null : nativeProjectedMetersForLatLng(cgi.getLatitude(), cgi.getLongitude());
    }

    public long[] queryPointAnnotations(RectF rectF) {
        return isDestroyedOn("queryPointAnnotations") ? new long[0] : nativeQueryPointAnnotations(rectF);
    }

    public List<Feature> queryRenderedFeatures(PointF pointF, String[] strArr, Statement statement) {
        if (isDestroyedOn("queryRenderedFeatures")) {
            return new ArrayList();
        }
        Feature[] nativeQueryRenderedFeaturesForPoint = nativeQueryRenderedFeaturesForPoint(pointF.x / this.pixelRatio, pointF.y / this.pixelRatio, strArr, statement != null ? statement.toArray() : null);
        return nativeQueryRenderedFeaturesForPoint != null ? Arrays.asList(nativeQueryRenderedFeaturesForPoint) : new ArrayList();
    }

    public List<Feature> queryRenderedFeatures(RectF rectF, String[] strArr, Statement statement) {
        if (isDestroyedOn("queryRenderedFeatures")) {
            return new ArrayList();
        }
        Feature[] nativeQueryRenderedFeaturesForBox = nativeQueryRenderedFeaturesForBox(rectF.left / this.pixelRatio, rectF.top / this.pixelRatio, rectF.right / this.pixelRatio, rectF.bottom / this.pixelRatio, strArr, statement != null ? statement.toArray() : null);
        return nativeQueryRenderedFeaturesForBox != null ? Arrays.asList(nativeQueryRenderedFeaturesForBox) : new ArrayList();
    }

    public void removeAnnotation(long j) {
        if (!isDestroyedOn("removeAnnotation")) {
            removeAnnotations(new long[]{j});
        }
    }

    public void removeAnnotations(long[] jArr) {
        if (!isDestroyedOn("removeAnnotations")) {
            nativeRemoveAnnotations(jArr);
        }
    }

    public void removeImage(String str) {
        if (!isDestroyedOn("removeImage")) {
            nativeRemoveImage(str);
        }
    }

    public Layer removeLayer(Layer layer) {
        if (isDestroyedOn("removeLayer")) {
            return null;
        }
        nativeRemoveLayer(layer.getNativePtr());
        return layer;
    }

    public Layer removeLayer(String str) {
        return isDestroyedOn("removeLayer") ? null : nativeRemoveLayerById(str);
    }

    public Layer removeLayerAt(int i) {
        return isDestroyedOn("removeLayerAt") ? null : nativeRemoveLayerAt(i);
    }

    /* Access modifiers changed, original: 0000 */
    public void removeOnMapChangedListener(OnMapChangedListener onMapChangedListener) {
        this.onMapChangedListenerHolders.remove(onMapChangedListener);
        this.onMapChangedListeners = (OnMapChangedListener[]) this.onMapChangedListenerHolders.toArray(new OnMapChangedListener[0]);
    }

    public Source removeSource(Source source) {
        if (isDestroyedOn("removeSource")) {
            return null;
        }
        nativeRemoveSource(source.getNativePtr());
        return source;
    }

    public Source removeSource(String str) {
        return isDestroyedOn("removeSource") ? null : nativeRemoveSourceById(str);
    }

    public void render() {
        if (!isDestroyedOn("render")) {
            nativeRender();
        }
    }

    public void resetNorth() {
        if (!isDestroyedOn("resetNorth")) {
            nativeResetNorth();
        }
    }

    public void resetPosition() {
        if (!isDestroyedOn("resetPosition")) {
            nativeResetPosition();
        }
    }

    public void resetZoom() {
        if (!isDestroyedOn("resetZoom")) {
            nativeResetZoom();
        }
    }

    public void resizeFramebuffer(int i, int i2) {
        if (!isDestroyedOn("resizeFramebuffer")) {
            if (i < 0) {
                throw new IllegalArgumentException("fbWidth cannot be negative.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("fbHeight cannot be negative.");
            } else if (i > 65535) {
                throw new IllegalArgumentException("fbWidth cannot be greater than 65535.");
            } else if (i2 <= 65535) {
                nativeResizeFramebuffer(i, i2);
            } else {
                throw new IllegalArgumentException("fbHeight cannot be greater than 65535.");
            }
        }
    }

    public void resizeView(int i, int i2) {
        if (!isDestroyedOn("resizeView")) {
            float f = (float) i;
            float f2 = this.pixelRatio;
            i = (int) (f / f2);
            i2 = (int) (((float) i2) / f2);
            if (i < 0) {
                throw new IllegalArgumentException("width cannot be negative.");
            } else if (i2 >= 0) {
                if (i > 65535) {
                    alsj.d("Device returned an out of range width size, capping value at 65535 instead of ".concat(String.valueOf(i)), new Object[0]);
                    i = 65535;
                }
                if (i2 > 65535) {
                    alsj.d("Device returned an out of range height size, capping value at 65535 instead of ".concat(String.valueOf(i2)), new Object[0]);
                    i2 = 65535;
                }
                nativeResizeView(i, i2);
            } else {
                throw new IllegalArgumentException("height cannot be negative.");
            }
        }
    }

    public void rotateBy(double d, double d2, double d3, double d4) {
        if (!isDestroyedOn("rotateBy")) {
            rotateBy(d, d2, d3, d4, 0);
        }
    }

    public void rotateBy(double d, double d2, double d3, double d4, long j) {
        if (!isDestroyedOn("rotateBy")) {
            float f = this.pixelRatio;
            double d5 = (double) f;
            Double.isNaN(d5);
            d5 = d / d5;
            double d6 = (double) f;
            Double.isNaN(d6);
            nativeRotateBy(d5, d2 / d6, d3, d4, j);
        }
    }

    public void scheduleTakeSnapshot() {
        if (!isDestroyedOn("scheduleTakeSnapshot")) {
            nativeTakeSnapshot();
        }
    }

    public void setApiBaseUrl(String str) {
        if (!isDestroyedOn("setApiBaseUrl")) {
            this.fileSource.setApiBaseUrl(str);
        }
    }

    public void setBearing(double d) {
        if (!isDestroyedOn("setBearing")) {
            setBearing(d, 0);
        }
    }

    public void setBearing(double d, double d2, double d3) {
        if (!isDestroyedOn("setBearing")) {
            setBearing(d, d2, d3, 0);
        }
    }

    public void setBearing(double d, double d2, double d3, long j) {
        if (!isDestroyedOn("setBearing")) {
            float f = this.pixelRatio;
            double d4 = (double) f;
            Double.isNaN(d4);
            double d5 = d2 / d4;
            double d6 = (double) f;
            Double.isNaN(d6);
            nativeSetBearingXY(d, d5, d3 / d6, j);
        }
    }

    public void setBearing(double d, long j) {
        if (!isDestroyedOn("setBearing")) {
            nativeSetBearing(d, j);
        }
    }

    public void setContentPadding(int[] iArr) {
        if (!isDestroyedOn("setContentPadding")) {
            float f = (float) iArr[1];
            float f2 = this.pixelRatio;
            nativeSetContentPadding((double) (f / f2), (double) (((float) iArr[0]) / f2), (double) (((float) iArr[3]) / f2), (double) (((float) iArr[2]) / f2));
        }
    }

    public void setDebug(boolean z) {
        if (!isDestroyedOn("setDebug")) {
            nativeSetDebug(z);
        }
    }

    public void setEnableFps(boolean z) {
        if (!isDestroyedOn("setEnableFps")) {
            nativeSetEnableFps(z);
        }
    }

    public void setGestureInProgress(boolean z) {
        if (!isDestroyedOn("setGestureInProgress")) {
            nativeSetGestureInProgress(z);
        }
    }

    public void setLatLng(cgi cgi) {
        if (!isDestroyedOn("setLatLng")) {
            setLatLng(cgi, 0);
        }
    }

    public void setLatLng(cgi cgi, long j) {
        if (!isDestroyedOn("setLatLng")) {
            nativeSetLatLng(cgi.getLatitude(), cgi.getLongitude(), j);
        }
    }

    public void setLatLngBounds(cgj cgj) {
        if (!isDestroyedOn("setLatLngBounds")) {
            nativeSetLatLngBounds(LatLngBounds.from(cgj));
        }
    }

    public void setMaxZoom(double d) {
        if (!isDestroyedOn("setMaxZoom")) {
            nativeSetMaxZoom(d);
        }
    }

    public void setMinZoom(double d) {
        if (!isDestroyedOn("setMinZoom")) {
            nativeSetMinZoom(d);
        }
    }

    public void setPitch(double d, long j) {
        if (!isDestroyedOn("setPitch")) {
            nativeSetPitch(d, j);
        }
    }

    public void setReachability(boolean z) {
        if (!isDestroyedOn("setReachability")) {
            nativeSetReachability(z);
        }
    }

    public void setStyleJson(String str) {
        if (!isDestroyedOn("setStyleJson")) {
            nativeSetStyleJson(str);
        }
    }

    public void setStyleUrl(String str) {
        if (!isDestroyedOn("setStyleUrl")) {
            nativeSetStyleUrl(str);
        }
    }

    public void setTransitionDelay(long j) {
        nativeSetTransitionDelay(j);
    }

    public void setTransitionDuration(long j) {
        nativeSetTransitionDuration(j);
    }

    public void setZoom(double d, PointF pointF, long j) {
        if (!isDestroyedOn("setZoom")) {
            nativeSetZoom(d, (double) (pointF.x / this.pixelRatio), (double) (pointF.y / this.pixelRatio), j);
        }
    }

    public void terminateContext() {
        if (!isDestroyedOn("terminateContext")) {
            nativeTerminateContext();
        }
    }

    public void terminateDisplay() {
        if (!isDestroyedOn("terminateDisplay")) {
            nativeTerminateDisplay();
        }
    }

    public void update() {
        if (!isDestroyedOn("update")) {
            nativeUpdate();
        }
    }

    public void updateMarker(Marker marker) {
        if (!isDestroyedOn("updateMarker")) {
            LatLng position = marker.getPosition();
            nativeUpdateMarker(marker.getId(), position.getLatitude(), position.getLongitude(), marker.getIcon().getId());
        }
    }

    public void updatePolygon(Polygon polygon) {
        if (!isDestroyedOn("updatePolygon")) {
            nativeUpdatePolygon(polygon.getId(), polygon);
        }
    }

    public void updatePolyline(Polyline polyline) {
        if (!isDestroyedOn("updatePolyline")) {
            nativeUpdatePolyline(polyline.getId(), polyline);
        }
    }
}
