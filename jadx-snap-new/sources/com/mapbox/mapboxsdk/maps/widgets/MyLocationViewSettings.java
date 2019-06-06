package com.mapbox.mapboxsdk.maps.widgets;

import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.maps.FocalPointChangeListener;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;
import com.mapbox.mapboxsdk.maps.Projection;

public class MyLocationViewSettings {
    private int accuracyAlpha;
    private int accuracyTintColor;
    private Drawable backgroundDrawable;
    private int[] backgroundOffset = new int[4];
    private int backgroundTintColor;
    private boolean enabled;
    private FocalPointChangeListener focalPointChangeListener;
    private Drawable foregroundBearingDrawable;
    private Drawable foregroundDrawable;
    private int foregroundTintColor;
    private MyLocationView myLocationView;
    private int[] padding = new int[4];
    private Projection projection;

    public MyLocationViewSettings(MyLocationView myLocationView, Projection projection, FocalPointChangeListener focalPointChangeListener) {
        this.myLocationView = myLocationView;
        this.projection = projection;
        this.focalPointChangeListener = focalPointChangeListener;
    }

    private void invalidateFocalPointForTracking(MyLocationView myLocationView) {
        if (myLocationView.getMyLocationTrackingMode() != 0) {
            this.focalPointChangeListener.onFocalPointChanged(myLocationView.getCenter());
        } else {
            this.focalPointChangeListener.onFocalPointChanged(null);
        }
    }

    public int getAccuracyAlpha() {
        return this.accuracyAlpha;
    }

    public int getAccuracyTintColor() {
        return this.accuracyTintColor;
    }

    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public int[] getBackgroundOffset() {
        return this.backgroundOffset;
    }

    public int getBackgroundTintColor() {
        return this.backgroundTintColor;
    }

    public Drawable getForegroundBearingDrawable() {
        return this.foregroundBearingDrawable;
    }

    public Drawable getForegroundDrawable() {
        return this.foregroundDrawable;
    }

    public int getForegroundTintColor() {
        return this.foregroundTintColor;
    }

    public int[] getPadding() {
        return this.padding;
    }

    public void initialise(MapboxMapOptions mapboxMapOptions) {
        CameraPosition camera = mapboxMapOptions.getCamera();
        if (!(camera == null || camera.equals(CameraPosition.DEFAULT))) {
            setTilt(camera.tilt);
        }
        if (this.myLocationView != null) {
            setForegroundDrawable(mapboxMapOptions.getMyLocationForegroundDrawable(), mapboxMapOptions.getMyLocationForegroundBearingDrawable());
            setForegroundTintColor(mapboxMapOptions.getMyLocationForegroundTintColor());
            setBackgroundDrawable(mapboxMapOptions.getMyLocationBackgroundDrawable(), mapboxMapOptions.getMyLocationBackgroundPadding());
            setBackgroundTintColor(mapboxMapOptions.getMyLocationBackgroundTintColor());
            setAccuracyAlpha(mapboxMapOptions.getMyLocationAccuracyAlpha());
            setAccuracyTintColor(mapboxMapOptions.getMyLocationAccuracyTintColor());
        }
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAccuracyAlpha(int i) {
        this.accuracyAlpha = i;
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setAccuracyAlpha(i);
        }
    }

    public void setAccuracyTintColor(int i) {
        this.accuracyTintColor = i;
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setAccuracyTint(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable, int[] iArr) {
        this.backgroundDrawable = drawable;
        this.backgroundOffset = iArr;
        if (iArr == null || iArr.length != 4) {
            this.myLocationView.setShadowDrawable(drawable);
        } else {
            this.myLocationView.setShadowDrawable(drawable, iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.myLocationView.setShadowDrawableTint(this.backgroundTintColor);
    }

    public void setBackgroundTintColor(int i) {
        this.backgroundTintColor = i;
        this.myLocationView.setShadowDrawableTint(i);
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
        this.myLocationView.setEnabled(z);
    }

    public void setForegroundDrawable(Drawable drawable, Drawable drawable2) {
        this.foregroundDrawable = drawable;
        this.foregroundBearingDrawable = drawable2;
        this.myLocationView.setForegroundDrawables(drawable, drawable2);
        this.myLocationView.setForegroundDrawableTint(this.foregroundTintColor);
    }

    public void setForegroundTintColor(int i) {
        this.foregroundTintColor = i;
        this.myLocationView.setForegroundDrawableTint(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.padding = new int[]{i, i2, i3, i4};
        this.myLocationView.setContentPadding(this.padding);
        this.projection.invalidateContentPadding(this.padding);
        invalidateFocalPointForTracking(this.myLocationView);
    }

    public void setTilt(double d) {
        MyLocationView myLocationView = this.myLocationView;
        if (myLocationView != null) {
            myLocationView.setTilt(d);
        }
    }
}
