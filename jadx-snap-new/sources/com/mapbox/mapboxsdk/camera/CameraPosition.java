package com.mapbox.mapboxsdk.camera;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.services.android.telemetry.utils.MathUtils;
import defpackage.cgi;

public final class CameraPosition implements Parcelable {
    public static final Creator<CameraPosition> CREATOR = new Creator<CameraPosition>() {
        public final CameraPosition createFromParcel(Parcel parcel) {
            double readDouble = parcel.readDouble();
            return new CameraPosition((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()), parcel.readDouble(), parcel.readDouble(), readDouble);
        }

        public final CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    public static final CameraPosition DEFAULT = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d);
    public final double bearing;
    public final cgi target;
    public final double tilt;
    public final double zoom;

    public static final class Builder {
        private double bearing = -1.0d;
        private cgi target = null;
        private double tilt = -1.0d;
        private double zoom = -1.0d;

        public Builder(TypedArray typedArray) {
            if (typedArray != null) {
                this.bearing = (double) typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_cameraBearing, MapboxConstants.MINIMUM_ZOOM);
                this.target = new LatLng((double) typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_cameraTargetLat, MapboxConstants.MINIMUM_ZOOM), (double) typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_cameraTargetLng, MapboxConstants.MINIMUM_ZOOM));
                this.tilt = (double) typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_cameraTilt, MapboxConstants.MINIMUM_ZOOM);
                this.zoom = (double) typedArray.getFloat(R.styleable.mapbox_MapView_mapbox_cameraZoom, MapboxConstants.MINIMUM_ZOOM);
            }
        }

        public Builder(CameraPosition cameraPosition) {
            if (cameraPosition != null) {
                this.bearing = cameraPosition.bearing;
                this.target = cameraPosition.target;
                this.tilt = cameraPosition.tilt;
                this.zoom = cameraPosition.zoom;
            }
        }

        public Builder(CameraPositionUpdate cameraPositionUpdate) {
            if (cameraPositionUpdate != null) {
                this.bearing = cameraPositionUpdate.getBearing();
                this.target = cameraPositionUpdate.getTarget();
                this.tilt = cameraPositionUpdate.getTilt();
                this.zoom = cameraPositionUpdate.getZoom();
            }
        }

        public Builder(ZoomUpdate zoomUpdate) {
            if (zoomUpdate != null) {
                this.zoom = zoomUpdate.getZoom();
            }
        }

        public final Builder bearing(double d) {
            while (d >= 360.0d) {
                d -= 360.0d;
            }
            while (d < 0.0d) {
                d += 360.0d;
            }
            this.bearing = d;
            return this;
        }

        public final CameraPosition build() {
            return new CameraPosition(this.target, this.zoom, this.tilt, this.bearing);
        }

        public final Builder target(cgi cgi) {
            this.target = cgi;
            return this;
        }

        public final Builder tilt(double d) {
            this.tilt = MathUtils.clamp(d, 0.0d, 60.0d);
            return this;
        }

        public final Builder zoom(double d) {
            this.zoom = d;
            return this;
        }
    }

    CameraPosition(cgi cgi, double d, double d2, double d3) {
        this.target = cgi;
        this.bearing = d3;
        this.tilt = d2;
        this.zoom = d;
    }

    CameraPosition(LatLng latLng, double d, double d2, double d3) {
        this.target = latLng;
        this.bearing = d3;
        this.tilt = d2;
        this.zoom = d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        cgi cgi = this.target;
        return (cgi == null || cgi.equals(cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing;
    }

    public final int hashCode() {
        cgi cgi = this.target;
        return (cgi != null ? cgi.hashCode() : 0) + 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Target: ");
        stringBuilder.append(this.target);
        stringBuilder.append(", Zoom:");
        stringBuilder.append(this.zoom);
        stringBuilder.append(", Bearing:");
        stringBuilder.append(this.bearing);
        stringBuilder.append(", Tilt:");
        stringBuilder.append(this.tilt);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
    }
}
