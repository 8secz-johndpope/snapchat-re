package com.mapbox.mapboxsdk.camera;

import android.graphics.Point;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.UiSettings;
import defpackage.cgi;
import defpackage.cgj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CameraUpdateFactory {

    static final class CameraBoundsUpdate implements CameraUpdate {
        private cgj bounds;
        private int[] padding;

        CameraBoundsUpdate(cgj cgj, int i, int i2, int i3, int i4) {
            this(cgj, new int[]{i, i2, i3, i4});
        }

        CameraBoundsUpdate(cgj cgj, int[] iArr) {
            this.bounds = cgj;
            this.padding = iArr;
        }

        public final cgj getBounds() {
            return this.bounds;
        }

        public final CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            return mapboxMap.getCameraForLatLngBounds(this.bounds, this.padding);
        }

        public final int[] getPadding() {
            return this.padding;
        }
    }

    static final class CameraMoveUpdate implements CameraUpdate {
        private float x;
        private float y;

        CameraMoveUpdate(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public final CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            UiSettings uiSettings = mapboxMap.getUiSettings();
            cgi fromScreenLocation = mapboxMap.getProjection().fromScreenLocation((uiSettings.getWidth() / 2.0f) + this.x, (uiSettings.getHeight() / 2.0f) + this.y);
            CameraPosition cameraPosition = mapboxMap.getCameraPosition();
            Builder builder = new Builder();
            if (fromScreenLocation == null) {
                fromScreenLocation = cameraPosition.target;
            }
            return builder.target(fromScreenLocation).zoom(cameraPosition.zoom).tilt(cameraPosition.tilt).bearing(cameraPosition.bearing).build();
        }
    }

    static final class CameraPositionUpdate implements CameraUpdate {
        private final double bearing;
        private final cgi target;
        private final double tilt;
        private final double zoom;

        public CameraPositionUpdate(double d, cgi cgi, double d2, double d3) {
            this.bearing = d;
            this.target = cgi;
            this.tilt = d2;
            this.zoom = d3;
        }

        public final double getBearing() {
            return this.bearing;
        }

        public final CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            return (this.target == null ? new Builder(this).target(mapboxMap.getCameraPosition().target) : new Builder(this)).build();
        }

        public final cgi getTarget() {
            return this.target;
        }

        public final double getTilt() {
            return this.tilt;
        }

        public final double getZoom() {
            return this.zoom;
        }
    }

    static final class ZoomUpdate implements CameraUpdate {
        static final int ZOOM_BY = 2;
        static final int ZOOM_IN = 0;
        static final int ZOOM_OUT = 1;
        static final int ZOOM_TO = 3;
        static final int ZOOM_TO_POINT = 4;
        private final int type;
        private float x;
        private float y;
        private final double zoom;

        @Retention(RetentionPolicy.SOURCE)
        @interface Type {
        }

        ZoomUpdate(double d, float f, float f2) {
            this.type = 4;
            this.zoom = d;
            this.x = f;
            this.y = f2;
        }

        ZoomUpdate(int i) {
            this.type = i;
            this.zoom = 0.0d;
        }

        ZoomUpdate(int i, double d) {
            this.type = i;
            this.zoom = d;
        }

        public final CameraPosition getCameraPosition(MapboxMap mapboxMap) {
            CameraPosition cameraPosition = mapboxMap.getCameraPosition();
            return (getType() != 4 ? new Builder(cameraPosition).zoom(transformZoom(cameraPosition.zoom)) : new Builder(cameraPosition).zoom(transformZoom(cameraPosition.zoom)).target(mapboxMap.getProjection().fromScreenLocation(getX(), getY()))).build();
        }

        public final int getType() {
            return this.type;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final double getZoom() {
            return this.zoom;
        }

        /* Access modifiers changed, original: final */
        public final double transformZoom(double d) {
            int type = getType();
            if (type == 0) {
                return d + 1.0d;
            }
            if (type != 1) {
                if (type != 2) {
                    if (type == 3) {
                        return getZoom();
                    }
                    if (type != 4) {
                        return d;
                    }
                }
                return d + getZoom();
            }
            d -= 1.0d;
            return d < 0.0d ? 0.0d : d;
        }
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        return new CameraPositionUpdate(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom);
    }

    public static CameraUpdate newLatLng(cgi cgi) {
        return new CameraPositionUpdate(-1.0d, cgi, -1.0d, -1.0d);
    }

    public static CameraUpdate newLatLngBounds(cgj cgj, int i) {
        return newLatLngBounds(cgj, i, i, i, i);
    }

    public static CameraUpdate newLatLngBounds(cgj cgj, int i, int i2, int i3, int i4) {
        return new CameraBoundsUpdate(cgj, i, i2, i3, i4);
    }

    public static CameraUpdate newLatLngZoom(cgi cgi, double d) {
        return new CameraPositionUpdate(-1.0d, cgi, -1.0d, d);
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        return new CameraMoveUpdate(f, f2);
    }

    public static CameraUpdate zoomBy(double d) {
        return new ZoomUpdate(2, d);
    }

    public static CameraUpdate zoomBy(double d, Point point) {
        return new ZoomUpdate(d, (float) point.x, (float) point.y);
    }

    public static CameraUpdate zoomIn() {
        return new ZoomUpdate(0);
    }

    public static CameraUpdate zoomOut() {
        return new ZoomUpdate(1);
    }

    public static CameraUpdate zoomTo(double d) {
        return new ZoomUpdate(3, d);
    }
}
