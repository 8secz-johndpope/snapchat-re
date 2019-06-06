package com.mapbox.mapboxsdk.annotations;

import android.os.Parcelable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;

public abstract class BaseMarkerViewOptions<U extends MarkerView, T extends BaseMarkerViewOptions<U, T>> implements Parcelable {
    protected float alpha = 1.0f;
    protected float anchorU = 0.5f;
    protected float anchorV = 1.0f;
    protected boolean flat;
    protected Icon icon;
    protected float infoWindowAnchorU = 0.5f;
    protected float infoWindowAnchorV = MapboxConstants.MINIMUM_ZOOM;
    protected LatLng position;
    protected float rotation;
    protected boolean selected;
    protected String snippet;
    protected String title;
    protected boolean visible = true;

    public T alpha(float f) {
        this.alpha = f;
        return getThis();
    }

    public T anchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        return getThis();
    }

    public T flat(boolean z) {
        this.flat = z;
        return getThis();
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

    public Icon getIcon() {
        return this.icon;
    }

    public float getInfoWindowAnchorU() {
        return this.infoWindowAnchorU;
    }

    public float getInfoWindowAnchorV() {
        return this.infoWindowAnchorV;
    }

    public abstract U getMarker();

    public LatLng getPosition() {
        return this.position;
    }

    public float getRotation() {
        return this.rotation;
    }

    public String getSnippet() {
        return this.snippet;
    }

    public abstract T getThis();

    public String getTitle() {
        return this.title;
    }

    public T icon(Icon icon) {
        this.icon = icon;
        return getThis();
    }

    public T infoWindowAnchor(float f, float f2) {
        this.infoWindowAnchorU = f;
        this.infoWindowAnchorV = f2;
        return getThis();
    }

    public boolean isFlat() {
        return this.flat;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public T position(LatLng latLng) {
        this.position = latLng;
        return getThis();
    }

    public T rotation(float f) {
        while (true) {
            this.rotation = f;
            f = this.rotation;
            if (f <= 360.0f) {
                break;
            }
            f -= 360.0f;
        }
        while (true) {
            f = this.rotation;
            if (f >= MapboxConstants.MINIMUM_ZOOM) {
                return getThis();
            }
            this.rotation = f + 360.0f;
        }
    }

    public T snippet(String str) {
        this.snippet = str;
        return getThis();
    }

    public T title(String str) {
        this.title = str;
        return getThis();
    }

    public T visible(boolean z) {
        this.visible = z;
        return getThis();
    }
}
