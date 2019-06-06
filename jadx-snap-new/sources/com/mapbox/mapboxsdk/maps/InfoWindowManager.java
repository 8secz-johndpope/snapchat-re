package com.mapbox.mapboxsdk.maps;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.annotations.InfoWindow;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.maps.MapboxMap.InfoWindowAdapter;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowClickListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowCloseListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnInfoWindowLongClickListener;
import java.util.ArrayList;
import java.util.List;

class InfoWindowManager {
    private boolean allowConcurrentMultipleInfoWindows;
    private InfoWindowAdapter infoWindowAdapter;
    private List<InfoWindow> infoWindows = new ArrayList();
    private OnInfoWindowClickListener onInfoWindowClickListener;
    private OnInfoWindowCloseListener onInfoWindowCloseListener;
    private OnInfoWindowLongClickListener onInfoWindowLongClickListener;

    InfoWindowManager() {
    }

    public void add(InfoWindow infoWindow) {
        this.infoWindows.add(infoWindow);
    }

    /* Access modifiers changed, original: 0000 */
    public InfoWindowAdapter getInfoWindowAdapter() {
        return this.infoWindowAdapter;
    }

    /* Access modifiers changed, original: 0000 */
    public OnInfoWindowClickListener getOnInfoWindowClickListener() {
        return this.onInfoWindowClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public OnInfoWindowCloseListener getOnInfoWindowCloseListener() {
        return this.onInfoWindowCloseListener;
    }

    /* Access modifiers changed, original: 0000 */
    public OnInfoWindowLongClickListener getOnInfoWindowLongClickListener() {
        return this.onInfoWindowLongClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isAllowConcurrentMultipleOpenInfoWindows() {
        return this.allowConcurrentMultipleInfoWindows;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isInfoWindowValidForMarker(Marker marker) {
        return (marker == null || (TextUtils.isEmpty(marker.getTitle()) && TextUtils.isEmpty(marker.getSnippet()))) ? false : true;
    }

    /* Access modifiers changed, original: 0000 */
    public void setAllowConcurrentMultipleOpenInfoWindows(boolean z) {
        this.allowConcurrentMultipleInfoWindows = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        this.infoWindowAdapter = infoWindowAdapter;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        this.onInfoWindowClickListener = onInfoWindowClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnInfoWindowCloseListener(OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.onInfoWindowCloseListener = onInfoWindowCloseListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnInfoWindowLongClickListener(OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.onInfoWindowLongClickListener = onInfoWindowLongClickListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void update() {
        if (!this.infoWindows.isEmpty()) {
            for (InfoWindow update : this.infoWindows) {
                update.update();
            }
        }
    }
}
