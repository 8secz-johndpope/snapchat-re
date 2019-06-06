package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LatLngSpan implements Parcelable {
    public static final Creator<LatLngSpan> CREATOR = new Creator<LatLngSpan>() {
        public final LatLngSpan createFromParcel(Parcel parcel) {
            return new LatLngSpan(parcel, null);
        }

        public final LatLngSpan[] newArray(int i) {
            return new LatLngSpan[i];
        }
    };
    private double mLatitudeSpan;
    private double mLongitudeSpan;

    public LatLngSpan(double d, double d2) {
        this.mLatitudeSpan = d;
        this.mLongitudeSpan = d2;
    }

    private LatLngSpan(Parcel parcel) {
        this.mLatitudeSpan = parcel.readDouble();
        this.mLongitudeSpan = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngSpan) {
            LatLngSpan latLngSpan = (LatLngSpan) obj;
            return this.mLongitudeSpan == latLngSpan.getLongitudeSpan() && this.mLatitudeSpan == latLngSpan.getLatitudeSpan();
        }
    }

    public double getLatitudeSpan() {
        return this.mLatitudeSpan;
    }

    public double getLongitudeSpan() {
        return this.mLongitudeSpan;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatitudeSpan);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mLongitudeSpan);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void setLatitudeSpan(double d) {
        this.mLatitudeSpan = d;
    }

    public void setLongitudeSpan(double d) {
        this.mLongitudeSpan = d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitudeSpan);
        parcel.writeDouble(this.mLongitudeSpan);
    }
}
