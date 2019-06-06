package com.mapbox.mapboxsdk.annotations;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;

public class MarkerView extends Marker {
    private float alpha = 1.0f;
    private float anchorU;
    private float anchorV;
    private boolean flat;
    private float height;
    private float infoWindowAnchorU;
    private float infoWindowAnchorV;
    private Icon markerViewIcon;
    private MarkerViewManager markerViewManager;
    private float offsetX = -1.0f;
    private float offsetY = -1.0f;
    private float rotation;
    private boolean selected;
    private float tiltValue;
    private boolean visible = true;
    private float width;

    MarkerView() {
    }

    public MarkerView(BaseMarkerViewOptions baseMarkerViewOptions) {
        super(baseMarkerViewOptions);
        this.alpha = baseMarkerViewOptions.getAlpha();
        this.anchorU = baseMarkerViewOptions.getAnchorU();
        this.anchorV = baseMarkerViewOptions.getAnchorV();
        this.infoWindowAnchorU = baseMarkerViewOptions.getInfoWindowAnchorU();
        this.infoWindowAnchorV = baseMarkerViewOptions.getInfoWindowAnchorV();
        this.flat = baseMarkerViewOptions.isFlat();
        this.rotation = baseMarkerViewOptions.getRotation();
        this.selected = baseMarkerViewOptions.selected;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    /* Access modifiers changed, original: 0000 */
    public float getHeight() {
        return this.height;
    }

    public Icon getIcon() {
        if (this.markerViewIcon == null) {
            setIcon(IconFactory.getInstance(Mapbox.getApplicationContext()).defaultMarkerView());
        }
        return this.markerViewIcon;
    }

    public float getInfoWindowAnchorU() {
        return this.infoWindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.infoWindowAnchorV;
    }

    /* Access modifiers changed, original: 0000 */
    public float getOffsetX() {
        return this.offsetX;
    }

    /* Access modifiers changed, original: 0000 */
    public float getOffsetY() {
        return this.offsetY;
    }

    public float getRotation() {
        return this.rotation;
    }

    /* Access modifiers changed, original: 0000 */
    public float getTilt() {
        return this.tiltValue;
    }

    /* Access modifiers changed, original: 0000 */
    public float getWidth() {
        return this.width;
    }

    /* Access modifiers changed, original: 0000 */
    public void invalidate() {
        this.height = MapboxConstants.MINIMUM_ZOOM;
        this.width = MapboxConstants.MINIMUM_ZOOM;
        this.offsetY = -1.0f;
        this.offsetX = -1.0f;
        this.markerViewManager.invalidateViewMarkersInVisibleRegion();
    }

    public boolean isFlat() {
        return this.flat;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setAlpha(float f) {
        this.alpha = f;
        MarkerViewManager markerViewManager = this.markerViewManager;
        if (markerViewManager != null) {
            markerViewManager.animateAlpha(this, f);
        }
    }

    public void setAnchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        setOffset(-1.0f, -1.0f);
    }

    public void setFlat(boolean z) {
        this.flat = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void setHeight(float f) {
        this.height = f;
    }

    public void setIcon(Icon icon) {
        String str = IconFactory.ICON_MARKERVIEW_ID;
        if (icon != null) {
            this.markerViewIcon = IconFactory.recreate(str, icon.getBitmap());
        }
        icon = IconFactory.recreate(str, IconFactory.ICON_MARKERVIEW_BITMAP);
        MarkerViewManager markerViewManager = this.markerViewManager;
        if (markerViewManager != null) {
            markerViewManager.updateIcon(this);
        }
        super.setIcon(icon);
    }

    public void setInfoWindowAnchor(float f, float f2) {
        this.infoWindowAnchorU = f;
        this.infoWindowAnchorV = f2;
    }

    public void setMapboxMap(MapboxMap mapboxMap) {
        super.setMapboxMap(mapboxMap);
        if (mapboxMap != null) {
            if (isFlat()) {
                this.tiltValue = (float) mapboxMap.getCameraPosition().tilt;
            }
            this.markerViewManager = mapboxMap.getMarkerViewManager();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setOffset(float f, float f2) {
        this.offsetX = f;
        this.offsetY = f2;
    }

    public void setPosition(LatLng latLng) {
        super.setPosition(latLng);
        MarkerViewManager markerViewManager = this.markerViewManager;
        if (markerViewManager != null) {
            markerViewManager.setWaitingForRenderInvoke(true);
            this.markerViewManager.update();
        }
    }

    public void setRotation(float f) {
        this.rotation = f;
        MarkerViewManager markerViewManager = this.markerViewManager;
        if (markerViewManager != null) {
            markerViewManager.setRotation(this, f);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setSelected(boolean z) {
        this.selected = z;
    }

    /* Access modifiers changed, original: 0000 */
    public void setTilt(float f) {
        this.tiltValue = f;
    }

    public void setVisible(boolean z) {
        this.visible = z;
        MarkerViewManager markerViewManager = this.markerViewManager;
        if (markerViewManager != null) {
            markerViewManager.animateVisible(this, z);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setWidth(float f) {
        this.width = f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MarkerView [position[");
        stringBuilder.append(getPosition());
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
