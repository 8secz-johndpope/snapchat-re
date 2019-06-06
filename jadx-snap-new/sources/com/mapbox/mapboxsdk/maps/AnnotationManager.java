package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.annotations.Annotation;
import com.mapbox.mapboxsdk.annotations.BaseMarkerOptions;
import com.mapbox.mapboxsdk.annotations.BaseMarkerViewOptions;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager;
import com.mapbox.mapboxsdk.annotations.MarkerViewManager.OnMarkerViewAddedListener;
import com.mapbox.mapboxsdk.annotations.Polygon;
import com.mapbox.mapboxsdk.annotations.PolygonOptions;
import com.mapbox.mapboxsdk.annotations.Polyline;
import com.mapbox.mapboxsdk.annotations.PolylineOptions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMarkerClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnPolygonClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnPolylineClickListener;
import com.mapbox.services.commons.geojson.Feature;
import defpackage.ja;
import java.util.ArrayList;
import java.util.List;

public class AnnotationManager {
    private static final String LAYER_ID_SHAPE_ANNOTATIONS = "com.mapbox.annotations.shape.";
    private static final long NO_ANNOTATION_ID = -1;
    private final ja<Annotation> annotations = new ja();
    private IconManager iconManager;
    private final InfoWindowManager infoWindowManager = new InfoWindowManager();
    private final MapView mapView;
    private MapboxMap mapboxMap;
    private final MarkerViewManager markerViewManager;
    private final NativeMapView nativeMapView;
    private OnMarkerClickListener onMarkerClickListener;
    private OnPolygonClickListener onPolygonClickListener;
    private OnPolylineClickListener onPolylineClickListener;
    private final List<Marker> selectedMarkers = new ArrayList();
    private final List<String> shapeAnnotationIds = new ArrayList();

    static class MarkerHit {
        private final List<Marker> markers;
        private final RectF tapRect;

        MarkerHit(RectF rectF, List<Marker> list) {
            this.tapRect = rectF;
            this.markers = list;
        }

        /* Access modifiers changed, original: 0000 */
        public float getTapPointX() {
            return this.tapRect.centerX();
        }

        /* Access modifiers changed, original: 0000 */
        public float getTapPointY() {
            return this.tapRect.centerY();
        }
    }

    static class MarkerHitResolver {
        private Bitmap bitmap;
        private long closestMarkerId = -1;
        private RectF highestSurfaceIntersection = new RectF();
        private RectF hitRectMarker = new RectF();
        private Rect hitRectView = new Rect();
        private PointF markerLocation;
        private final MarkerViewManager markerViewManager;
        private final Projection projection;
        private View view;

        MarkerHitResolver(MapboxMap mapboxMap) {
            this.markerViewManager = mapboxMap.getMarkerViewManager();
            this.projection = mapboxMap.getProjection();
        }

        private void hitTestMarker(MarkerHit markerHit, Marker marker, RectF rectF) {
            if (rectF.contains(markerHit.getTapPointX(), markerHit.getTapPointY())) {
                rectF.intersect(markerHit.tapRect);
                if (isRectangleHighestSurfaceIntersection(rectF)) {
                    this.highestSurfaceIntersection = new RectF(rectF);
                    this.closestMarkerId = marker.getId();
                }
            }
        }

        private boolean isRectangleHighestSurfaceIntersection(RectF rectF) {
            return rectF.width() * rectF.height() > this.highestSurfaceIntersection.width() * this.highestSurfaceIntersection.height();
        }

        private void resolveForMarker(MarkerHit markerHit, Marker marker) {
            this.markerLocation = this.projection.toScreenLocation(marker.getPosition());
            this.bitmap = marker.getIcon().getBitmap();
            this.hitRectMarker.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) this.bitmap.getWidth(), (float) this.bitmap.getHeight());
            this.hitRectMarker.offsetTo(this.markerLocation.x - ((float) (this.bitmap.getWidth() / 2)), this.markerLocation.y - ((float) (this.bitmap.getHeight() / 2)));
            hitTestMarker(markerHit, marker, this.hitRectMarker);
        }

        private void resolveForMarkerView(MarkerHit markerHit, MarkerView markerView) {
            this.view = this.markerViewManager.getView(markerView);
            View view = this.view;
            if (view != null) {
                view.getHitRect(this.hitRectView);
                this.hitRectMarker = new RectF(this.hitRectView);
                hitTestMarker(markerHit, markerView, this.hitRectMarker);
            }
        }

        private void resolveForMarkers(MarkerHit markerHit) {
            for (Marker marker : markerHit.markers) {
                if (marker instanceof MarkerView) {
                    resolveForMarkerView(markerHit, (MarkerView) marker);
                } else {
                    resolveForMarker(markerHit, marker);
                }
            }
        }

        public long execute(MarkerHit markerHit) {
            resolveForMarkers(markerHit);
            return this.closestMarkerId;
        }
    }

    static class ShapeAnnotationHit {
        private final String[] layerIds;
        private final RectF tapPoint;

        ShapeAnnotationHit(RectF rectF, String[] strArr) {
            this.tapPoint = rectF;
            this.layerIds = strArr;
        }
    }

    static class ShapeAnnotationHitResolver {
        private MapboxMap mapboxMap;

        ShapeAnnotationHitResolver(MapboxMap mapboxMap) {
            this.mapboxMap = mapboxMap;
        }

        private long getIdFromFeature(Feature feature) {
            try {
                return Long.valueOf(feature.getId()).longValue();
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public long execute(ShapeAnnotationHit shapeAnnotationHit) {
            List queryRenderedFeatures = this.mapboxMap.queryRenderedFeatures(shapeAnnotationHit.tapPoint, shapeAnnotationHit.layerIds);
            return !queryRenderedFeatures.isEmpty() ? getIdFromFeature((Feature) queryRenderedFeatures.get(0)) : -1;
        }
    }

    public AnnotationManager(NativeMapView nativeMapView, MapView mapView, MarkerViewManager markerViewManager) {
        this.nativeMapView = nativeMapView;
        this.mapView = mapView;
        this.markerViewManager = markerViewManager;
        if (nativeMapView != null) {
            nativeMapView.addOnMapChangedListener(markerViewManager);
        }
    }

    private void ensureIconLoaded(Marker marker) {
        if (!(marker instanceof MarkerView)) {
            getIconManager().ensureIconLoaded(marker, this.mapboxMap);
        }
    }

    private synchronized IconManager getIconManager() {
        if (this.iconManager == null) {
            this.iconManager = new IconManager(this.nativeMapView);
        }
        return this.iconManager;
    }

    private MarkerHit getMarkerHitFromTouchArea(PointF pointF) {
        double highestIconHeight = (double) getIconManager().getHighestIconHeight();
        Double.isNaN(highestIconHeight);
        int i = (int) (highestIconHeight * 1.5d);
        double highestIconWidth = (double) getIconManager().getHighestIconWidth();
        Double.isNaN(highestIconWidth);
        float f = (float) i;
        float f2 = (float) ((int) (highestIconWidth * 1.5d));
        RectF rectF = new RectF(pointF.x - f, pointF.y - f2, pointF.x + f, pointF.y + f2);
        return new MarkerHit(rectF, getMarkersInRect(rectF));
    }

    private ShapeAnnotationHit getShapeAnnotationHitFromTap(PointF pointF) {
        float dimension = Mapbox.getApplicationContext().getResources().getDimension(R.dimen.mapbox_eight_dp);
        RectF rectF = new RectF(pointF.x - dimension, pointF.y - dimension, pointF.x + dimension, pointF.y + dimension);
        List list = this.shapeAnnotationIds;
        return new ShapeAnnotationHit(rectF, (String[]) list.toArray(new String[list.size()]));
    }

    private void handleClickForShapeAnnotation(long j) {
        Annotation annotation = getAnnotation(j);
        if (annotation instanceof Polygon) {
            OnPolygonClickListener onPolygonClickListener = this.onPolygonClickListener;
            if (onPolygonClickListener != null) {
                onPolygonClickListener.onPolygonClick((Polygon) annotation);
                return;
            }
        }
        if (annotation instanceof Polyline) {
            OnPolylineClickListener onPolylineClickListener = this.onPolylineClickListener;
            if (onPolylineClickListener != null) {
                onPolylineClickListener.onPolylineClick((Polyline) annotation);
            }
        }
    }

    private boolean isAddedToMap(Annotation annotation) {
        return (annotation == null || annotation.getId() == -1 || this.annotations.e(annotation.getId()) < 0) ? false : true;
    }

    private boolean isClickHandledForMarker(long j) {
        Marker marker = (Marker) getAnnotation(j);
        if (!(marker instanceof MarkerView ? this.markerViewManager.onClickMarkerView((MarkerView) marker) : onClickMarker(marker))) {
            toggleMarkerSelectionState(marker);
        }
        return true;
    }

    private boolean onClickMarker(Marker marker) {
        OnMarkerClickListener onMarkerClickListener = this.onMarkerClickListener;
        return onMarkerClickListener != null && onMarkerClickListener.onMarkerClick(marker);
    }

    private Marker prepareMarker(BaseMarkerOptions baseMarkerOptions) {
        Marker marker = baseMarkerOptions.getMarker();
        marker.setTopOffsetPixels(getIconManager().getTopOffsetPixelsForIcon(getIconManager().loadIconForMarker(marker)));
        return marker;
    }

    private MarkerView prepareViewMarker(BaseMarkerViewOptions baseMarkerViewOptions) {
        MarkerView marker = baseMarkerViewOptions.getMarker();
        getIconManager().loadIconForMarkerView(marker);
        return marker;
    }

    private void toggleMarkerSelectionState(Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            deselectMarker(marker);
        } else {
            selectMarker(marker);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Marker addMarker(BaseMarkerOptions baseMarkerOptions, MapboxMap mapboxMap) {
        Object prepareMarker = prepareMarker(baseMarkerOptions);
        NativeMapView nativeMapView = this.nativeMapView;
        long addMarker = nativeMapView != null ? nativeMapView.addMarker(prepareMarker) : 0;
        prepareMarker.setMapboxMap(mapboxMap);
        prepareMarker.setId(addMarker);
        this.annotations.a(addMarker, prepareMarker);
        return prepareMarker;
    }

    /* Access modifiers changed, original: 0000 */
    public MarkerView addMarker(BaseMarkerViewOptions baseMarkerViewOptions, MapboxMap mapboxMap, OnMarkerViewAddedListener onMarkerViewAddedListener) {
        Object prepareViewMarker = prepareViewMarker(baseMarkerViewOptions);
        prepareViewMarker.setMapboxMap(mapboxMap);
        long addMarker = this.nativeMapView.addMarker(prepareViewMarker);
        prepareViewMarker.setId(addMarker);
        this.annotations.a(addMarker, prepareViewMarker);
        if (onMarkerViewAddedListener != null) {
            this.markerViewManager.addOnMarkerViewAddedListener(prepareViewMarker, onMarkerViewAddedListener);
        }
        this.markerViewManager.setEnabled(true);
        this.markerViewManager.setWaitingForRenderInvoke(true);
        return prepareViewMarker;
    }

    /* Access modifiers changed, original: 0000 */
    public List<MarkerView> addMarkerViews(List<? extends BaseMarkerViewOptions> list, MapboxMap mapboxMap) {
        ArrayList arrayList = new ArrayList();
        for (BaseMarkerViewOptions baseMarkerViewOptions : list) {
            if (list.indexOf(baseMarkerViewOptions) == list.size() - 1) {
                this.markerViewManager.setWaitingForRenderInvoke(true);
            }
            Object prepareViewMarker = prepareViewMarker(baseMarkerViewOptions);
            prepareViewMarker.setMapboxMap(mapboxMap);
            long addMarker = this.nativeMapView.addMarker(prepareViewMarker);
            prepareViewMarker.setId(addMarker);
            this.annotations.a(addMarker, prepareViewMarker);
            arrayList.add(prepareViewMarker);
        }
        this.markerViewManager.setEnabled(true);
        this.markerViewManager.update();
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Marker> addMarkers(List<? extends BaseMarkerOptions> list, MapboxMap mapboxMap) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(prepareMarker((BaseMarkerOptions) list.get(i2)));
            }
            if (arrayList.size() > 0) {
                NativeMapView nativeMapView = this.nativeMapView;
                long[] addMarkers = nativeMapView != null ? nativeMapView.addMarkers(arrayList) : new long[arrayList.size()];
                while (i < addMarkers.length) {
                    Object obj = (Marker) arrayList.get(i);
                    obj.setMapboxMap(mapboxMap);
                    long j = addMarkers[i];
                    obj.setId(j);
                    this.annotations.a(j, obj);
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public Polygon addPolygon(PolygonOptions polygonOptions, MapboxMap mapboxMap) {
        Object polygon = polygonOptions.getPolygon();
        if (!polygon.getPoints().isEmpty()) {
            NativeMapView nativeMapView = this.nativeMapView;
            long addPolygon = nativeMapView != null ? nativeMapView.addPolygon(polygon) : 0;
            polygon.setId(addPolygon);
            polygon.setMapboxMap(mapboxMap);
            this.shapeAnnotationIds.add(LAYER_ID_SHAPE_ANNOTATIONS.concat(String.valueOf(addPolygon)));
            this.annotations.a(addPolygon, polygon);
        }
        return polygon;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Polygon> addPolygons(List<PolygonOptions> list, MapboxMap mapboxMap) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            for (PolygonOptions polygon : list) {
                Polygon polygon2 = polygon.getPolygon();
                if (!polygon2.getPoints().isEmpty()) {
                    arrayList.add(polygon2);
                }
            }
            NativeMapView nativeMapView = this.nativeMapView;
            long[] addPolygons = nativeMapView != null ? nativeMapView.addPolygons(arrayList) : new long[arrayList.size()];
            for (size = 0; size < addPolygons.length; size++) {
                Object obj = (Polygon) arrayList.get(size);
                obj.setMapboxMap(mapboxMap);
                long j = addPolygons[size];
                obj.setId(j);
                this.shapeAnnotationIds.add(LAYER_ID_SHAPE_ANNOTATIONS.concat(String.valueOf(j)));
                this.annotations.a(j, obj);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public Polyline addPolyline(PolylineOptions polylineOptions, MapboxMap mapboxMap) {
        Object polyline = polylineOptions.getPolyline();
        if (!polyline.getPoints().isEmpty()) {
            NativeMapView nativeMapView = this.nativeMapView;
            long addPolyline = nativeMapView != null ? nativeMapView.addPolyline(polyline) : 0;
            polyline.setMapboxMap(mapboxMap);
            polyline.setId(addPolyline);
            this.shapeAnnotationIds.add(LAYER_ID_SHAPE_ANNOTATIONS.concat(String.valueOf(addPolyline)));
            this.annotations.a(addPolyline, polyline);
        }
        return polyline;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Polyline> addPolylines(List<PolylineOptions> list, MapboxMap mapboxMap) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        if (size > 0) {
            for (PolylineOptions polyline : list) {
                Polyline polyline2 = polyline.getPolyline();
                if (!polyline2.getPoints().isEmpty()) {
                    arrayList.add(polyline2);
                }
            }
            NativeMapView nativeMapView = this.nativeMapView;
            long[] addPolylines = nativeMapView != null ? nativeMapView.addPolylines(arrayList) : new long[arrayList.size()];
            for (size = 0; size < addPolylines.length; size++) {
                Object obj = (Polyline) arrayList.get(size);
                obj.setMapboxMap(mapboxMap);
                long j = addPolylines[size];
                obj.setId(j);
                this.shapeAnnotationIds.add(LAYER_ID_SHAPE_ANNOTATIONS.concat(String.valueOf(j)));
                this.annotations.a(j, obj);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public void adjustTopOffsetPixels(MapboxMap mapboxMap) {
        int a = this.annotations.a();
        for (int i = 0; i < a; i++) {
            Annotation annotation = (Annotation) this.annotations.b((long) i);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                marker.setTopOffsetPixels(getIconManager().getTopOffsetPixelsForIcon(marker.getIcon()));
            }
        }
        for (Marker marker2 : this.selectedMarkers) {
            if (marker2.isInfoWindowShown()) {
                marker2.hideInfoWindow();
                marker2.showInfoWindow(mapboxMap, this.mapView);
            }
        }
    }

    public AnnotationManager bind(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
        this.markerViewManager.bind(mapboxMap);
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public void deselectMarker(Marker marker) {
        if (this.selectedMarkers.contains(marker)) {
            if (marker.isInfoWindowShown()) {
                marker.hideInfoWindow();
            }
            if (marker instanceof MarkerView) {
                this.markerViewManager.deselect((MarkerView) marker, false);
            }
            this.selectedMarkers.remove(marker);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void deselectMarkers() {
        if (!this.selectedMarkers.isEmpty()) {
            for (Marker marker : this.selectedMarkers) {
                if (marker.isInfoWindowShown()) {
                    marker.hideInfoWindow();
                }
                if (marker instanceof MarkerView) {
                    this.markerViewManager.deselect((MarkerView) marker, false);
                }
            }
            this.selectedMarkers.clear();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Annotation getAnnotation(long j) {
        return (Annotation) this.annotations.b(j);
    }

    /* Access modifiers changed, original: 0000 */
    public List<Annotation> getAnnotations() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.a(); i++) {
            ja jaVar = this.annotations;
            arrayList.add(jaVar.a(jaVar.b(i)));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public InfoWindowManager getInfoWindowManager() {
        return this.infoWindowManager;
    }

    /* Access modifiers changed, original: 0000 */
    public MarkerViewManager getMarkerViewManager() {
        return this.markerViewManager;
    }

    /* Access modifiers changed, original: 0000 */
    public List<MarkerView> getMarkerViewsInRect(RectF rectF) {
        float pixelRatio = this.nativeMapView.getPixelRatio();
        long[] queryPointAnnotations = this.nativeMapView.queryPointAnnotations(new RectF(rectF.left / pixelRatio, rectF.top / pixelRatio, rectF.right / pixelRatio, rectF.bottom / pixelRatio));
        ArrayList arrayList = new ArrayList(queryPointAnnotations.length);
        for (long valueOf : queryPointAnnotations) {
            arrayList.add(Long.valueOf(valueOf));
        }
        ArrayList arrayList2 = new ArrayList(queryPointAnnotations.length);
        List annotations = getAnnotations();
        int size = annotations.size();
        for (int i = 0; i < size; i++) {
            Annotation annotation = (Annotation) annotations.get(i);
            if ((annotation instanceof MarkerView) && arrayList.contains(Long.valueOf(annotation.getId()))) {
                arrayList2.add((MarkerView) annotation);
            }
        }
        return new ArrayList(arrayList2);
    }

    /* Access modifiers changed, original: 0000 */
    public List<Marker> getMarkers() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.a(); i++) {
            ja jaVar = this.annotations;
            Annotation annotation = (Annotation) jaVar.a(jaVar.b(i));
            if (annotation instanceof Marker) {
                arrayList.add((Marker) annotation);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Marker> getMarkersInRect(RectF rectF) {
        float pixelRatio = this.nativeMapView.getPixelRatio();
        RectF rectF2 = new RectF(rectF.left / pixelRatio, rectF.top / pixelRatio, rectF.right / pixelRatio, rectF.bottom / pixelRatio);
        if (this.nativeMapView.destroyed) {
            return new ArrayList();
        }
        long[] queryPointAnnotations = this.nativeMapView.queryPointAnnotations(rectF2);
        ArrayList arrayList = new ArrayList(queryPointAnnotations.length);
        for (long valueOf : queryPointAnnotations) {
            arrayList.add(Long.valueOf(valueOf));
        }
        ArrayList arrayList2 = new ArrayList(queryPointAnnotations.length);
        List annotations = getAnnotations();
        int size = annotations.size();
        for (int i = 0; i < size; i++) {
            Annotation annotation = (Annotation) annotations.get(i);
            if ((annotation instanceof Marker) && arrayList.contains(Long.valueOf(annotation.getId()))) {
                arrayList2.add((Marker) annotation);
            }
        }
        return new ArrayList(arrayList2);
    }

    /* Access modifiers changed, original: 0000 */
    public List<Polygon> getPolygons() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.a(); i++) {
            ja jaVar = this.annotations;
            Annotation annotation = (Annotation) jaVar.a(jaVar.b(i));
            if (annotation instanceof Polygon) {
                arrayList.add((Polygon) annotation);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Polyline> getPolylines() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.a(); i++) {
            ja jaVar = this.annotations;
            Annotation annotation = (Annotation) jaVar.a(jaVar.b(i));
            if (annotation instanceof Polyline) {
                arrayList.add((Polyline) annotation);
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: 0000 */
    public List<Marker> getSelectedMarkers() {
        return this.selectedMarkers;
    }

    public boolean isNativeMapDestroyed() {
        return this.nativeMapView.destroyed;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean onTap(PointF pointF) {
        long execute;
        if (!this.shapeAnnotationIds.isEmpty()) {
            execute = new ShapeAnnotationHitResolver(this.mapboxMap).execute(getShapeAnnotationHitFromTap(pointF));
            if (execute != -1) {
                handleClickForShapeAnnotation(execute);
            }
        }
        execute = new MarkerHitResolver(this.mapboxMap).execute(getMarkerHitFromTouchArea(pointF));
        return execute != -1 && isClickHandledForMarker(execute);
    }

    /* Access modifiers changed, original: 0000 */
    public void reloadMarkers() {
        getIconManager().reloadIcons();
        int a = this.annotations.a();
        for (int i = 0; i < a; i++) {
            Annotation annotation = (Annotation) this.annotations.b((long) i);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                this.nativeMapView.removeAnnotation(annotation.getId());
                marker.setId(this.nativeMapView.addMarker(marker));
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void removeAnnotation(long j) {
        NativeMapView nativeMapView = this.nativeMapView;
        if (nativeMapView != null) {
            nativeMapView.removeAnnotation(j);
        }
        this.annotations.c(j);
    }

    /* Access modifiers changed, original: 0000 */
    public void removeAnnotation(Annotation annotation) {
        if (annotation instanceof Marker) {
            Marker marker = (Marker) annotation;
            marker.hideInfoWindow();
            if (this.selectedMarkers.contains(marker)) {
                this.selectedMarkers.remove(marker);
            }
            if (marker instanceof MarkerView) {
                this.markerViewManager.removeMarkerView((MarkerView) marker);
            }
        } else {
            this.shapeAnnotationIds.remove(Long.valueOf(annotation.getId()));
        }
        long id = annotation.getId();
        NativeMapView nativeMapView = this.nativeMapView;
        if (nativeMapView != null) {
            nativeMapView.removeAnnotation(id);
        }
        this.annotations.c(id);
    }

    /* Access modifiers changed, original: 0000 */
    public void removeAnnotations() {
        int a = this.annotations.a();
        long[] jArr = new long[a];
        this.selectedMarkers.clear();
        for (int i = 0; i < a; i++) {
            jArr[i] = this.annotations.b(i);
            Annotation annotation = (Annotation) this.annotations.b(jArr[i]);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                marker.hideInfoWindow();
                if (marker instanceof MarkerView) {
                    this.markerViewManager.removeMarkerView((MarkerView) marker);
                }
            } else {
                this.shapeAnnotationIds.remove(Long.valueOf(annotation.getId()));
            }
        }
        NativeMapView nativeMapView = this.nativeMapView;
        if (nativeMapView != null) {
            nativeMapView.removeAnnotations(jArr);
        }
        this.annotations.b();
    }

    /* Access modifiers changed, original: 0000 */
    public void removeAnnotations(List<? extends Annotation> list) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Annotation annotation = (Annotation) list.get(i2);
            if (annotation instanceof Marker) {
                Marker marker = (Marker) annotation;
                marker.hideInfoWindow();
                if (this.selectedMarkers.contains(marker)) {
                    this.selectedMarkers.remove(marker);
                }
                if (marker instanceof MarkerView) {
                    this.markerViewManager.removeMarkerView((MarkerView) marker);
                }
            } else {
                this.shapeAnnotationIds.remove(Long.valueOf(annotation.getId()));
            }
            jArr[i2] = ((Annotation) list.get(i2)).getId();
        }
        NativeMapView nativeMapView = this.nativeMapView;
        if (nativeMapView != null) {
            nativeMapView.removeAnnotations(jArr);
        }
        while (i < size) {
            this.annotations.c(jArr[i]);
            i++;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void selectMarker(Marker marker) {
        if (!this.selectedMarkers.contains(marker)) {
            if (!this.infoWindowManager.isAllowConcurrentMultipleOpenInfoWindows()) {
                deselectMarkers();
            }
            if (marker instanceof MarkerView) {
                MarkerView markerView = (MarkerView) marker;
                this.markerViewManager.select(markerView, false);
                this.markerViewManager.ensureInfoWindowOffset(markerView);
            }
            if (this.infoWindowManager.isInfoWindowValidForMarker(marker) || this.infoWindowManager.getInfoWindowAdapter() != null) {
                this.infoWindowManager.add(marker.showInfoWindow(this.mapboxMap, this.mapView));
            }
            this.selectedMarkers.add(marker);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        this.onMarkerClickListener = onMarkerClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        this.onPolygonClickListener = onPolygonClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        this.onPolylineClickListener = onPolylineClickListener;
    }

    public void update() {
        this.markerViewManager.update();
        this.infoWindowManager.update();
    }

    /* Access modifiers changed, original: 0000 */
    public void updateMarker(Marker marker) {
        if (isAddedToMap(marker)) {
            ensureIconLoaded(marker);
            this.nativeMapView.updateMarker(marker);
            ja jaVar = this.annotations;
            jaVar.a(jaVar.e(marker.getId()), (Object) marker);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updatePolygon(Polygon polygon) {
        if (isAddedToMap(polygon)) {
            this.nativeMapView.updatePolygon(polygon);
            ja jaVar = this.annotations;
            jaVar.a(jaVar.e(polygon.getId()), (Object) polygon);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void updatePolyline(Polyline polyline) {
        if (isAddedToMap(polyline)) {
            this.nativeMapView.updatePolyline(polyline);
            ja jaVar = this.annotations;
            jaVar.a(jaVar.e(polyline.getId()), (Object) polyline);
        }
    }
}
