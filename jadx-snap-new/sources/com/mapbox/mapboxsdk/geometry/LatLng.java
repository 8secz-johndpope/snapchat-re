package com.mapbox.mapboxsdk.geometry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.mapbox.services.android.telemetry.utils.MathUtils;
import defpackage.cgi;

public class LatLng implements cgi, ILatLng {
    public static final Creator<LatLng> CREATOR = new Creator<LatLng>() {
        public final LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        public final LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    };
    private double altitude;
    private double latitude;
    private double longitude;

    public LatLng() {
        this.altitude = 0.0d;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }

    public LatLng(double d, double d2) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
    }

    public LatLng(double d, double d2, double d3) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
        setAltitude(d3);
    }

    public LatLng(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    protected LatLng(Parcel parcel) {
        this.altitude = 0.0d;
        setLatitude(parcel.readDouble());
        setLongitude(parcel.readDouble());
        setAltitude(parcel.readDouble());
    }

    public LatLng(LatLng latLng) {
        this.altitude = 0.0d;
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
        this.altitude = latLng.altitude;
    }

    public int describeContents() {
        return 0;
    }

    public double distanceTo(cgi cgi) {
        if (this.latitude == cgi.getLatitude() && this.longitude == cgi.getLongitude()) {
            return 0.0d;
        }
        double toRadians = Math.toRadians(this.latitude);
        double toRadians2 = Math.toRadians(this.longitude);
        double toRadians3 = Math.toRadians(cgi.getLatitude());
        double toRadians4 = Math.toRadians(cgi.getLongitude());
        double cos = Math.cos(toRadians);
        double cos2 = Math.cos(toRadians3);
        return Math.acos(((((Math.cos(toRadians2) * cos) * cos2) * Math.cos(toRadians4)) + (((cos * Math.sin(toRadians2)) * cos2) * Math.sin(toRadians4))) + (Math.sin(toRadians) * Math.sin(toRadians3))) * 6378137.0d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatLng latLng = (LatLng) obj;
            return Double.compare(latLng.altitude, this.altitude) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0;
        }
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.altitude);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public void setLatitude(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Math.abs(d) <= 90.0d) {
            this.latitude = d;
        } else {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
    }

    public void setLongitude(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (Double.isInfinite(d)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        } else {
            this.longitude = d;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LatLng [latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(", altitude=");
        stringBuilder.append(this.altitude);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public LatLng wrap() {
        this.longitude = MathUtils.wrap(this.longitude, -180.0d, 180.0d);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
    }
}
