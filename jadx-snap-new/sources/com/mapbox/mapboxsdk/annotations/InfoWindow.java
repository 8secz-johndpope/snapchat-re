package com.mapbox.mapboxsdk.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowCloseListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowLongClickListener;
import java.lang.ref.WeakReference;

public class InfoWindow {
    private WeakReference<Marker> boundMarker;
    private PointF coordinates;
    private boolean isVisible;
    private int layoutRes;
    private WeakReference<MapboxMap> mapboxMap;
    private float markerHeightOffset;
    private float markerWidthOffset;
    protected WeakReference<View> view;
    private float viewWidthOffset;

    InfoWindow(View view, MapboxMap mapboxMap) {
        initialize(view, mapboxMap);
    }

    InfoWindow(MapView mapView, int i, MapboxMap mapboxMap) {
        this.layoutRes = i;
        initialize(LayoutInflater.from(mapView.getContext()).inflate(i, mapView, false), mapboxMap);
    }

    private void closeInfoWindow() {
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        Marker marker = (Marker) this.boundMarker.get();
        if (!(marker == null || mapboxMap == null)) {
            mapboxMap.deselectMarker(marker);
        }
        close();
    }

    private void initialize(View view, MapboxMap mapboxMap) {
        this.mapboxMap = new WeakReference(mapboxMap);
        this.isVisible = false;
        this.view = new WeakReference(view);
        view.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MapboxMap mapboxMap = (MapboxMap) InfoWindow.this.mapboxMap.get();
                if (mapboxMap != null) {
                    OnInfoWindowClickListener onInfoWindowClickListener = mapboxMap.getOnInfoWindowClickListener();
                    boolean z = false;
                    if (onInfoWindowClickListener != null) {
                        z = onInfoWindowClickListener.onInfoWindowClick(InfoWindow.this.getBoundMarker());
                    }
                    if (!z) {
                        InfoWindow.this.closeInfoWindow();
                    }
                }
            }
        });
        view.setOnLongClickListener(new OnLongClickListener() {
            public boolean onLongClick(View view) {
                MapboxMap mapboxMap = (MapboxMap) InfoWindow.this.mapboxMap.get();
                if (mapboxMap != null) {
                    OnInfoWindowLongClickListener onInfoWindowLongClickListener = mapboxMap.getOnInfoWindowLongClickListener();
                    if (onInfoWindowLongClickListener != null) {
                        onInfoWindowLongClickListener.onInfoWindowLongClick(InfoWindow.this.getBoundMarker());
                    }
                }
                return true;
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void adaptDefaultMarker(Marker marker, MapboxMap mapboxMap, MapView mapView) {
        View view = (View) this.view.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.layoutRes, mapView, false);
            initialize(view, mapboxMap);
        }
        this.mapboxMap = new WeakReference(mapboxMap);
        String title = marker.getTitle();
        TextView textView = (TextView) view.findViewById(R.id.infowindow_title);
        if (TextUtils.isEmpty(title)) {
            textView.setVisibility(8);
        } else {
            textView.setText(title);
            textView.setVisibility(0);
        }
        String snippet = marker.getSnippet();
        TextView textView2 = (TextView) view.findViewById(R.id.infowindow_description);
        if (TextUtils.isEmpty(snippet)) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setText(snippet);
        textView2.setVisibility(0);
    }

    /* Access modifiers changed, original: 0000 */
    public InfoWindow close() {
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        if (this.isVisible && mapboxMap != null) {
            this.isVisible = false;
            View view = (View) this.view.get();
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            Marker boundMarker = getBoundMarker();
            OnInfoWindowCloseListener onInfoWindowCloseListener = mapboxMap.getOnInfoWindowCloseListener();
            if (onInfoWindowCloseListener != null) {
                onInfoWindowCloseListener.onInfoWindowClose(boundMarker);
            }
            setBoundMarker(null);
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public Marker getBoundMarker() {
        WeakReference weakReference = this.boundMarker;
        return weakReference == null ? null : (Marker) weakReference.get();
    }

    public View getView() {
        WeakReference weakReference = this.view;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isVisible() {
        return this.isVisible;
    }

    /* Access modifiers changed, original: 0000 */
    public InfoWindow open(MapView mapView, Marker marker, LatLng latLng, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        setBoundMarker(marker);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        View view = (View) this.view.get();
        if (!(view == null || mapboxMap == null)) {
            view.measure(0, 0);
            this.markerHeightOffset = (float) ((-view.getMeasuredHeight()) + i4);
            this.markerWidthOffset = (float) (-i3);
            this.coordinates = mapboxMap.getProjection().toScreenLocation(latLng);
            float f = (float) i3;
            float measuredWidth = (this.coordinates.x - ((float) (view.getMeasuredWidth() / 2))) + f;
            float measuredHeight = (this.coordinates.y - ((float) view.getMeasuredHeight())) + ((float) i4);
            if (view instanceof BubbleLayout) {
                Resources resources = mapView.getContext().getResources();
                float measuredWidth2 = ((float) view.getMeasuredWidth()) + measuredWidth;
                float right = (float) mapView.getRight();
                float left = (float) mapView.getLeft();
                float dimension = resources.getDimension(R.dimen.mapbox_infowindow_margin);
                float dimension2 = resources.getDimension(R.dimen.mapbox_infowindow_tipview_width) / 2.0f;
                float measuredWidth3 = ((float) (view.getMeasuredWidth() / 2)) - dimension2;
                if (this.coordinates.x >= MapboxConstants.MINIMUM_ZOOM && this.coordinates.x <= ((float) mapView.getWidth()) && this.coordinates.y >= MapboxConstants.MINIMUM_ZOOM && this.coordinates.y <= ((float) mapView.getHeight())) {
                    float f2;
                    float measuredWidth4;
                    Object obj;
                    Object obj2;
                    if (measuredWidth2 > right) {
                        measuredWidth2 -= right;
                        f2 = measuredWidth - measuredWidth2;
                        measuredWidth3 += measuredWidth2 + dimension2;
                        measuredWidth4 = ((float) view.getMeasuredWidth()) + f2;
                        obj = 1;
                    } else {
                        f2 = measuredWidth;
                        measuredWidth4 = measuredWidth2;
                        obj = null;
                    }
                    if (measuredWidth < left) {
                        measuredWidth = left - measuredWidth;
                        f2 += measuredWidth;
                        measuredWidth3 -= measuredWidth + dimension2;
                        measuredWidth = f2;
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    if (obj != null) {
                        right -= measuredWidth4;
                        if (right < dimension) {
                            measuredWidth = dimension - right;
                            f2 -= measuredWidth;
                            measuredWidth3 += measuredWidth - dimension2;
                            measuredWidth = f2;
                        }
                    }
                    if (obj2 != null) {
                        measuredWidth -= left;
                        if (measuredWidth < dimension) {
                            dimension -= measuredWidth;
                            f2 += dimension;
                            measuredWidth3 -= dimension - dimension2;
                        }
                    }
                    measuredWidth = f2;
                }
                ((BubbleLayout) view).setArrowPosition(measuredWidth3);
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            this.viewWidthOffset = (measuredWidth - this.coordinates.x) - f;
            close();
            mapView.addView(view, layoutParams);
            this.isVisible = true;
        }
        return this;
    }

    /* Access modifiers changed, original: 0000 */
    public InfoWindow setBoundMarker(Marker marker) {
        this.boundMarker = new WeakReference(marker);
        return this;
    }

    public void update() {
        MapboxMap mapboxMap = (MapboxMap) this.mapboxMap.get();
        Marker marker = (Marker) this.boundMarker.get();
        View view = (View) this.view.get();
        if (mapboxMap != null && marker != null && view != null) {
            this.coordinates = mapboxMap.getProjection().toScreenLocation(marker.getPosition());
            view.setX((view instanceof BubbleLayout ? this.coordinates.x + this.viewWidthOffset : this.coordinates.x - ((float) (view.getMeasuredWidth() / 2))) - this.markerWidthOffset);
            view.setY(this.coordinates.y + this.markerHeightOffset);
        }
    }
}
