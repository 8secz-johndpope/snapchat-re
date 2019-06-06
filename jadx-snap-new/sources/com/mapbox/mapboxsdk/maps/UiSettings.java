package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.utils.ColorUtils;
import defpackage.hh;
import java.io.ByteArrayOutputStream;

public final class UiSettings {
    private final int[] attributionsMargins = new int[4];
    private final ImageView attributionsView;
    private final int[] compassMargins = new int[4];
    private final CompassView compassView;
    private boolean deselectMarkersOnTap = true;
    private boolean doubleTapGestureChangeAllowed = true;
    private boolean doubleTapGesturesEnabled = true;
    private final FocalPointChangeListener focalPointChangeListener;
    private final int[] logoMargins = new int[4];
    private final View logoView;
    private float pixelRatio;
    private final Projection projection;
    private boolean rotateGestureChangeAllowed = true;
    private boolean rotateGesturesEnabled = true;
    private boolean scrollGestureChangeAllowed = true;
    private boolean scrollGesturesEnabled = true;
    private boolean tiltGestureChangeAllowed = true;
    private boolean tiltGesturesEnabled = true;
    private PointF userProvidedFocalPoint;
    private boolean zoomControlsEnabled;
    private boolean zoomGestureChangeAllowed = true;
    private boolean zoomGesturesEnabled = true;

    UiSettings(Projection projection, FocalPointChangeListener focalPointChangeListener, CompassView compassView, ImageView imageView, View view, MapView mapView) {
        this.projection = projection;
        this.focalPointChangeListener = focalPointChangeListener;
        this.compassView = compassView;
        this.attributionsView = imageView;
        this.logoView = view;
        if (mapView.getResources() != null) {
            this.pixelRatio = mapView.getResources().getDisplayMetrics().density;
        }
    }

    private byte[] convert(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private Drawable decode(byte[] bArr) {
        return new BitmapDrawable(this.compassView.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    private void initialiseAttribution(Context context, MapboxMapOptions mapboxMapOptions) {
        if (this.attributionsView != null) {
            setAttributionEnabled(mapboxMapOptions.getAttributionEnabled());
            setAttributionGravity(mapboxMapOptions.getAttributionGravity());
            setAttributionMargins(context, mapboxMapOptions.getAttributionMargins());
            int attributionTintColor = mapboxMapOptions.getAttributionTintColor();
            if (attributionTintColor == -1) {
                attributionTintColor = ColorUtils.getPrimaryColor(context);
            }
            setAttributionTintColor(attributionTintColor);
        }
    }

    private void initialiseCompass(MapboxMapOptions mapboxMapOptions, Resources resources) {
        if (this.compassView != null) {
            setCompassEnabled(mapboxMapOptions.getCompassEnabled());
            setCompassGravity(mapboxMapOptions.getCompassGravity());
            int[] compassMargins = mapboxMapOptions.getCompassMargins();
            if (compassMargins != null) {
                setCompassMargins(compassMargins[0], compassMargins[1], compassMargins[2], compassMargins[3]);
            } else {
                int dimension = (int) resources.getDimension(R.dimen.mapbox_four_dp);
                setCompassMargins(dimension, dimension, dimension, dimension);
            }
            setCompassFadeFacingNorth(mapboxMapOptions.getCompassFadeFacingNorth());
            if (mapboxMapOptions.getCompassImage() == null) {
                mapboxMapOptions.compassImage(hh.a(resources, R.drawable.mapbox_compass_icon, null));
            }
            setCompassImage(mapboxMapOptions.getCompassImage());
        }
    }

    private void initialiseGestures(MapboxMapOptions mapboxMapOptions) {
        setZoomGesturesEnabled(mapboxMapOptions.getZoomGesturesEnabled());
        setZoomGestureChangeAllowed(mapboxMapOptions.getZoomGesturesEnabled());
        setScrollGesturesEnabled(mapboxMapOptions.getScrollGesturesEnabled());
        setScrollGestureChangeAllowed(mapboxMapOptions.getScrollGesturesEnabled());
        setRotateGesturesEnabled(mapboxMapOptions.getRotateGesturesEnabled());
        setRotateGestureChangeAllowed(mapboxMapOptions.getRotateGesturesEnabled());
        setTiltGesturesEnabled(mapboxMapOptions.getTiltGesturesEnabled());
        setTiltGestureChangeAllowed(mapboxMapOptions.getTiltGesturesEnabled());
        setZoomControlsEnabled(mapboxMapOptions.getZoomControlsEnabled());
        setDoubleTapGesturesEnabled(mapboxMapOptions.getDoubleTapGesturesEnabled());
        setDoubleTapGestureChangeAllowed(mapboxMapOptions.getDoubleTapGesturesEnabled());
    }

    private void initialiseLogo(MapboxMapOptions mapboxMapOptions, Resources resources) {
        if (this.logoView != null) {
            setLogoEnabled(mapboxMapOptions.getLogoEnabled());
            setLogoGravity(mapboxMapOptions.getLogoGravity());
            setLogoMargins(resources, mapboxMapOptions.getLogoMargins());
        }
    }

    private void restoreAttribution(Bundle bundle) {
        setAttributionEnabled(bundle.getBoolean(MapboxConstants.STATE_ATTRIBUTION_ENABLED));
        setAttributionGravity(bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_GRAVITY));
        setAttributionMargins(bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_LEFT), bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_TOP), bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_RIGHT), bundle.getInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_BOTTOM));
    }

    private void restoreCompass(Bundle bundle) {
        setCompassEnabled(bundle.getBoolean(MapboxConstants.STATE_COMPASS_ENABLED));
        setCompassGravity(bundle.getInt(MapboxConstants.STATE_COMPASS_GRAVITY));
        setCompassMargins(bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_LEFT), bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_TOP), bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_RIGHT), bundle.getInt(MapboxConstants.STATE_COMPASS_MARGIN_BOTTOM));
        setCompassFadeFacingNorth(bundle.getBoolean(MapboxConstants.STATE_COMPASS_FADE_WHEN_FACING_NORTH));
        setCompassImage(decode(bundle.getByteArray(MapboxConstants.STATE_COMPASS_IMAGE_BITMAP)));
    }

    private void restoreGestures(Bundle bundle) {
        setZoomGesturesEnabled(bundle.getBoolean(MapboxConstants.STATE_ZOOM_ENABLED));
        setZoomGestureChangeAllowed(bundle.getBoolean(MapboxConstants.STATE_ZOOM_ENABLED_CHANGE));
        setScrollGesturesEnabled(bundle.getBoolean(MapboxConstants.STATE_SCROLL_ENABLED));
        setScrollGestureChangeAllowed(bundle.getBoolean(MapboxConstants.STATE_SCROLL_ENABLED_CHANGE));
        setRotateGesturesEnabled(bundle.getBoolean(MapboxConstants.STATE_ROTATE_ENABLED));
        setRotateGestureChangeAllowed(bundle.getBoolean(MapboxConstants.STATE_ROTATE_ENABLED_CHANGE));
        setTiltGesturesEnabled(bundle.getBoolean(MapboxConstants.STATE_TILT_ENABLED));
        setTiltGestureChangeAllowed(bundle.getBoolean(MapboxConstants.STATE_TILT_ENABLED_CHANGE));
        setDoubleTapGesturesEnabled(bundle.getBoolean(MapboxConstants.STATE_DOUBLE_TAP_ENABLED));
        setDoubleTapGestureChangeAllowed(bundle.getBoolean(MapboxConstants.STATE_DOUBLE_TAP_ENABLED_CHANGE));
    }

    private void restoreLogo(Bundle bundle) {
        setLogoEnabled(bundle.getBoolean(MapboxConstants.STATE_LOGO_ENABLED));
        setLogoGravity(bundle.getInt(MapboxConstants.STATE_LOGO_GRAVITY));
        setLogoMargins(bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_LEFT), bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_TOP), bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_RIGHT), bundle.getInt(MapboxConstants.STATE_LOGO_MARGIN_BOTTOM));
    }

    private void restoreZoomControl(Bundle bundle) {
        setZoomControlsEnabled(bundle.getBoolean(MapboxConstants.STATE_ZOOM_CONTROLS_ENABLED));
    }

    private void saveAttribution(Bundle bundle) {
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_GRAVITY, getAttributionGravity());
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_LEFT, getAttributionMarginLeft());
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_TOP, getAttributionMarginTop());
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_RIGHT, getAttributionMarginRight());
        bundle.putInt(MapboxConstants.STATE_ATTRIBUTION_MARGIN_BOTTOM, getAttributionMarginBottom());
        bundle.putBoolean(MapboxConstants.STATE_ATTRIBUTION_ENABLED, isAttributionEnabled());
    }

    private void saveCompass(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_COMPASS_ENABLED, isCompassEnabled());
        bundle.putInt(MapboxConstants.STATE_COMPASS_GRAVITY, getCompassGravity());
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_LEFT, getCompassMarginLeft());
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_TOP, getCompassMarginTop());
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_BOTTOM, getCompassMarginBottom());
        bundle.putInt(MapboxConstants.STATE_COMPASS_MARGIN_RIGHT, getCompassMarginRight());
        bundle.putBoolean(MapboxConstants.STATE_COMPASS_FADE_WHEN_FACING_NORTH, isCompassFadeWhenFacingNorth());
        bundle.putByteArray(MapboxConstants.STATE_COMPASS_IMAGE_BITMAP, getCompassImage() != null ? convert(MapboxMapOptions.getBitmapFromDrawable(getCompassImage())) : null);
    }

    private void saveGestures(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_ZOOM_ENABLED, isZoomGesturesEnabled());
        bundle.putBoolean(MapboxConstants.STATE_ZOOM_ENABLED_CHANGE, isZoomGestureChangeAllowed());
        bundle.putBoolean(MapboxConstants.STATE_SCROLL_ENABLED, isScrollGesturesEnabled());
        bundle.putBoolean(MapboxConstants.STATE_SCROLL_ENABLED_CHANGE, isScrollGestureChangeAllowed());
        bundle.putBoolean(MapboxConstants.STATE_ROTATE_ENABLED, isRotateGesturesEnabled());
        bundle.putBoolean(MapboxConstants.STATE_ROTATE_ENABLED_CHANGE, isRotateGestureChangeAllowed());
        bundle.putBoolean(MapboxConstants.STATE_TILT_ENABLED, isTiltGesturesEnabled());
        bundle.putBoolean(MapboxConstants.STATE_TILT_ENABLED_CHANGE, isTiltGestureChangeAllowed());
        bundle.putBoolean(MapboxConstants.STATE_DOUBLE_TAP_ENABLED, isDoubleTapGesturesEnabled());
        bundle.putBoolean(MapboxConstants.STATE_DOUBLE_TAP_ENABLED_CHANGE, isDoubleTapGestureChangeAllowed());
    }

    private void saveLogo(Bundle bundle) {
        bundle.putInt(MapboxConstants.STATE_LOGO_GRAVITY, getLogoGravity());
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_LEFT, getLogoMarginLeft());
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_TOP, getLogoMarginTop());
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_RIGHT, getLogoMarginRight());
        bundle.putInt(MapboxConstants.STATE_LOGO_MARGIN_BOTTOM, getLogoMarginBottom());
        bundle.putBoolean(MapboxConstants.STATE_LOGO_ENABLED, isLogoEnabled());
    }

    private void saveZoomControl(Bundle bundle) {
        bundle.putBoolean(MapboxConstants.STATE_ZOOM_CONTROLS_ENABLED, isZoomControlsEnabled());
    }

    private void setAttributionMargins(Context context, int[] iArr) {
        if (iArr != null) {
            setAttributionMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
            return;
        }
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(R.dimen.mapbox_four_dp);
        setAttributionMargins((int) resources.getDimension(R.dimen.mapbox_ninety_two_dp), dimension, dimension, dimension);
    }

    private void setLogoMargins(Resources resources, int[] iArr) {
        if (iArr != null) {
            setLogoMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
            return;
        }
        int dimension = (int) resources.getDimension(R.dimen.mapbox_four_dp);
        setLogoMargins(dimension, dimension, dimension, dimension);
    }

    private void setWidgetGravity(View view, int i) {
        if (view != null) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.gravity = i;
            view.setLayoutParams(layoutParams);
        }
    }

    private void setWidgetMargins(View view, int[] iArr, int i, int i2, int i3, int i4) {
        if (view != null) {
            iArr[0] = i;
            iArr[1] = i2;
            iArr[2] = i3;
            iArr[3] = i4;
            iArr = this.projection.getContentPadding();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(i + iArr[0], i2 + iArr[1], i3 + iArr[2], i4 + iArr[3]);
            view.setLayoutParams(layoutParams);
        }
    }

    public final int getAttributionGravity() {
        ImageView imageView = this.attributionsView;
        return imageView == null ? 0 : ((LayoutParams) imageView.getLayoutParams()).gravity;
    }

    public final int getAttributionMarginBottom() {
        return this.attributionsMargins[3];
    }

    public final int getAttributionMarginLeft() {
        return this.attributionsMargins[0];
    }

    public final int getAttributionMarginRight() {
        return this.attributionsMargins[2];
    }

    public final int getAttributionMarginTop() {
        return this.attributionsMargins[1];
    }

    public final int getCompassGravity() {
        CompassView compassView = this.compassView;
        return compassView == null ? 0 : ((LayoutParams) compassView.getLayoutParams()).gravity;
    }

    public final Drawable getCompassImage() {
        CompassView compassView = this.compassView;
        return compassView != null ? compassView.getCompassImage() : null;
    }

    public final int getCompassMarginBottom() {
        return this.compassMargins[3];
    }

    public final int getCompassMarginLeft() {
        return this.compassMargins[0];
    }

    public final int getCompassMarginRight() {
        return this.compassMargins[2];
    }

    public final int getCompassMarginTop() {
        return this.compassMargins[1];
    }

    public final PointF getFocalPoint() {
        return this.userProvidedFocalPoint;
    }

    public final float getHeight() {
        return this.projection.getHeight();
    }

    public final int getLogoGravity() {
        View view = this.logoView;
        return view == null ? 0 : ((LayoutParams) view.getLayoutParams()).gravity;
    }

    public final int getLogoMarginBottom() {
        return this.logoMargins[3];
    }

    public final int getLogoMarginLeft() {
        return this.logoMargins[0];
    }

    public final int getLogoMarginRight() {
        return this.logoMargins[2];
    }

    public final int getLogoMarginTop() {
        return this.logoMargins[1];
    }

    /* Access modifiers changed, original: final */
    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    public final float getWidth() {
        return this.projection.getWidth();
    }

    /* Access modifiers changed, original: final */
    public final void initialise(Context context, MapboxMapOptions mapboxMapOptions) {
        Resources resources = context.getResources();
        initialiseGestures(mapboxMapOptions);
        initialiseCompass(mapboxMapOptions, resources);
        initialiseLogo(mapboxMapOptions, resources);
        initialiseAttribution(context, mapboxMapOptions);
    }

    public final void invalidate() {
        setLogoMargins(getLogoMarginLeft(), getLogoMarginTop(), getLogoMarginRight(), getLogoMarginBottom());
        setCompassMargins(getCompassMarginLeft(), getCompassMarginTop(), getCompassMarginRight(), getCompassMarginBottom());
        setAttributionMargins(getAttributionMarginLeft(), getAttributionMarginTop(), getAttributionMarginRight(), getAttributionMarginBottom());
    }

    public final boolean isAttributionEnabled() {
        ImageView imageView = this.attributionsView;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public final boolean isCompassEnabled() {
        CompassView compassView = this.compassView;
        return compassView != null && compassView.isEnabled();
    }

    public final boolean isCompassFadeWhenFacingNorth() {
        CompassView compassView = this.compassView;
        return compassView != null && compassView.isFadeCompassViewFacingNorth();
    }

    public final boolean isDeselectMarkersOnTap() {
        return this.deselectMarkersOnTap;
    }

    /* Access modifiers changed, original: final */
    public final boolean isDoubleTapGestureChangeAllowed() {
        return this.doubleTapGestureChangeAllowed;
    }

    public final boolean isDoubleTapGesturesEnabled() {
        return this.doubleTapGesturesEnabled;
    }

    public final boolean isLogoEnabled() {
        View view = this.logoView;
        return view != null && view.getVisibility() == 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean isRotateGestureChangeAllowed() {
        return this.rotateGestureChangeAllowed;
    }

    public final boolean isRotateGesturesEnabled() {
        return this.rotateGesturesEnabled;
    }

    /* Access modifiers changed, original: final */
    public final boolean isScrollGestureChangeAllowed() {
        return this.scrollGestureChangeAllowed;
    }

    public final boolean isScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    /* Access modifiers changed, original: final */
    public final boolean isTiltGestureChangeAllowed() {
        return this.tiltGestureChangeAllowed;
    }

    public final boolean isTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public final boolean isZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    /* Access modifiers changed, original: final */
    public final boolean isZoomGestureChangeAllowed() {
        return this.zoomGestureChangeAllowed;
    }

    public final boolean isZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    /* Access modifiers changed, original: final */
    public final void onRestoreInstanceState(Bundle bundle) {
        restoreGestures(bundle);
        restoreCompass(bundle);
        restoreLogo(bundle);
        restoreAttribution(bundle);
        restoreZoomControl(bundle);
    }

    /* Access modifiers changed, original: final */
    public final void onSaveInstanceState(Bundle bundle) {
        saveGestures(bundle);
        saveCompass(bundle);
        saveLogo(bundle);
        saveAttribution(bundle);
        saveZoomControl(bundle);
    }

    public final void setAllGesturesEnabled(boolean z) {
        setScrollGesturesEnabled(z);
        setRotateGesturesEnabled(z);
        setTiltGesturesEnabled(z);
        setZoomGesturesEnabled(z);
        setDoubleTapGesturesEnabled(z);
    }

    public final void setAttributionEnabled(boolean z) {
        ImageView imageView = this.attributionsView;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void setAttributionGravity(int i) {
        ImageView imageView = this.attributionsView;
        if (imageView != null) {
            setWidgetGravity(imageView, i);
        }
    }

    public final void setAttributionMargins(int i, int i2, int i3, int i4) {
        setWidgetMargins(this.attributionsView, this.attributionsMargins, i, i2, i3, i4);
    }

    public final void setAttributionTintColor(int i) {
        if (this.attributionsView != null) {
            if (Color.alpha(i) == 0) {
                ImageView imageView = this.attributionsView;
                ColorUtils.setTintList(imageView, ContextCompat.getColor(imageView.getContext(), R.color.mapbox_blue));
                return;
            }
            ColorUtils.setTintList(this.attributionsView, i);
        }
    }

    public final void setCompassEnabled(boolean z) {
        CompassView compassView = this.compassView;
        if (compassView != null) {
            compassView.setEnabled(z);
        }
    }

    public final void setCompassFadeFacingNorth(boolean z) {
        CompassView compassView = this.compassView;
        if (compassView != null) {
            compassView.fadeCompassViewFacingNorth(z);
        }
    }

    public final void setCompassGravity(int i) {
        CompassView compassView = this.compassView;
        if (compassView != null) {
            setWidgetGravity(compassView, i);
        }
    }

    public final void setCompassImage(Drawable drawable) {
        CompassView compassView = this.compassView;
        if (compassView != null) {
            compassView.setCompassImage(drawable);
        }
    }

    public final void setCompassMargins(int i, int i2, int i3, int i4) {
        CompassView compassView = this.compassView;
        if (compassView != null) {
            setWidgetMargins(compassView, this.compassMargins, i, i2, i3, i4);
        }
    }

    public final void setDeselectMarkersOnTap(boolean z) {
        this.deselectMarkersOnTap = z;
    }

    /* Access modifiers changed, original: final */
    public final void setDoubleTapGestureChangeAllowed(boolean z) {
        this.doubleTapGestureChangeAllowed = z;
    }

    public final void setDoubleTapGesturesEnabled(boolean z) {
        if (this.doubleTapGestureChangeAllowed) {
            this.doubleTapGesturesEnabled = z;
        }
    }

    public final void setFocalPoint(PointF pointF) {
        this.userProvidedFocalPoint = pointF;
        this.focalPointChangeListener.onFocalPointChanged(pointF);
    }

    public final void setLogoEnabled(boolean z) {
        View view = this.logoView;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void setLogoGravity(int i) {
        View view = this.logoView;
        if (view != null) {
            setWidgetGravity(view, i);
        }
    }

    public final void setLogoMargins(int i, int i2, int i3, int i4) {
        View view = this.logoView;
        if (view != null) {
            setWidgetMargins(view, this.logoMargins, i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: final */
    public final void setRotateGestureChangeAllowed(boolean z) {
        this.rotateGestureChangeAllowed = z;
    }

    public final void setRotateGesturesEnabled(boolean z) {
        if (this.rotateGestureChangeAllowed) {
            this.rotateGesturesEnabled = z;
        }
    }

    /* Access modifiers changed, original: final */
    public final void setScrollGestureChangeAllowed(boolean z) {
        this.scrollGestureChangeAllowed = z;
    }

    public final void setScrollGesturesEnabled(boolean z) {
        if (this.scrollGestureChangeAllowed) {
            this.scrollGesturesEnabled = z;
        }
    }

    /* Access modifiers changed, original: final */
    public final void setTiltGestureChangeAllowed(boolean z) {
        this.tiltGestureChangeAllowed = z;
    }

    public final void setTiltGesturesEnabled(boolean z) {
        if (this.tiltGestureChangeAllowed) {
            this.tiltGesturesEnabled = z;
        }
    }

    public final void setZoomControlsEnabled(boolean z) {
        this.zoomControlsEnabled = z;
    }

    /* Access modifiers changed, original: final */
    public final void setZoomGestureChangeAllowed(boolean z) {
        this.zoomGestureChangeAllowed = z;
    }

    public final void setZoomGesturesEnabled(boolean z) {
        if (this.zoomGestureChangeAllowed) {
            this.zoomGesturesEnabled = z;
        }
    }

    /* Access modifiers changed, original: final */
    public final void update(CameraPosition cameraPosition) {
        if (isCompassEnabled()) {
            this.compassView.update(-cameraPosition.bearing);
        }
    }
}
