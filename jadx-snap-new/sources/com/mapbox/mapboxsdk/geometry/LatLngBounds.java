package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.exceptions.InvalidLatLngBoundsException;
import defpackage.cgi;
import defpackage.cgj;
import defpackage.cgk;
import java.util.ArrayList;
import java.util.List;

public class LatLngBounds implements cgj {
    public static final Creator<LatLngBounds> CREATOR = new Creator<LatLngBounds>() {
        public final LatLngBounds createFromParcel(Parcel parcel) {
            return LatLngBounds.readFromParcel(parcel);
        }

        public final LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }
    };
    private double latitudeNorth;
    private double latitudeSouth;
    private double longitudeEast;
    private double longitudeWest;

    public static final class Builder implements cgk {
        private List<cgi> latLngList = new ArrayList();

        public final cgj build(List<? extends cgi> list) {
            return includes((List) list).build();
        }

        public final LatLngBounds build() {
            if (this.latLngList.size() >= 2) {
                return LatLngBounds.fromLatLngs(this.latLngList);
            }
            throw new InvalidLatLngBoundsException(this.latLngList.size());
        }

        public final Builder include(cgi cgi) {
            this.latLngList.add(cgi);
            return this;
        }

        public final Builder includes(List<? extends cgi> list) {
            this.latLngList.addAll(list);
            return this;
        }
    }

    public LatLngBounds(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
    }

    public LatLngBounds(cgj cgj) {
        this.latitudeNorth = cgj.getLatNorth();
        this.longitudeEast = cgj.getLonEast();
        this.latitudeSouth = cgj.getLatSouth();
        this.longitudeWest = cgj.getLonWest();
    }

    public static LatLngBounds from(double d, double d2, double d3, double d4) {
        return new LatLngBounds(d, d2, d3, d4);
    }

    public static LatLngBounds from(cgj cgj) {
        return cgj instanceof LatLngBounds ? (LatLngBounds) cgj : new LatLngBounds(cgj);
    }

    static LatLngBounds fromLatLngs(List<? extends cgi> list) {
        double d = 180.0d;
        double d2 = 90.0d;
        double d3 = -90.0d;
        double d4 = -180.0d;
        for (cgi cgi : list) {
            double latitude = cgi.getLatitude();
            double longitude = cgi.getLongitude();
            d2 = Math.min(d2, latitude);
            d = Math.min(d, longitude);
            d3 = Math.max(d3, latitude);
            d4 = Math.max(d4, longitude);
        }
        return new LatLngBounds(d3, d4, d2, d);
    }

    private static LatLngBounds readFromParcel(Parcel parcel) {
        return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    public static LatLngBounds world() {
        return new Builder().include(new LatLng(85.05112878d, 180.0d)).include(new LatLng(-85.05112878d, -180.0d)).build();
    }

    public boolean contains(cgi cgi) {
        double latitude = cgi.getLatitude();
        double longitude = cgi.getLongitude();
        return latitude <= this.latitudeNorth && latitude >= this.latitudeSouth && longitude <= this.longitudeEast && longitude >= this.longitudeWest;
    }

    public boolean contains(cgj cgj) {
        return contains(cgj.getNorthEast()) && contains(cgj.getSouthWest());
    }

    public boolean contains(ILatLng iLatLng) {
        double latitude = iLatLng.getLatitude();
        double longitude = iLatLng.getLongitude();
        return latitude <= this.latitudeNorth && latitude >= this.latitudeSouth && longitude <= this.longitudeEast && longitude >= this.longitudeWest;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.latitudeNorth == latLngBounds.getLatNorth() && this.latitudeSouth == latLngBounds.getLatSouth() && this.longitudeEast == latLngBounds.getLonEast() && this.longitudeWest == latLngBounds.getLonWest();
        }
    }

    public LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    public double getLatNorth() {
        return this.latitudeNorth;
    }

    public double getLatSouth() {
        return this.latitudeSouth;
    }

    public double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public double getLonEast() {
        return this.longitudeEast;
    }

    public double getLonWest() {
        return this.longitudeWest;
    }

    public double getLongitudeSpan() {
        return Math.abs(this.longitudeEast - this.longitudeWest);
    }

    public LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public LatLngSpan getSpan() {
        return new LatLngSpan(getLatitudeSpan(), getLongitudeSpan());
    }

    public int hashCode() {
        double d = (this.latitudeNorth + 90.0d) + ((this.latitudeSouth + 90.0d) * 1000.0d);
        double d2 = this.longitudeEast;
        return (int) ((d + ((d2 + 180.0d) * 1000000.0d)) + ((d2 + 180.0d) * 1.0E9d));
    }

    public LatLngBounds include(LatLng latLng) {
        return new Builder().include(getNorthEast()).include(getSouthWest()).include((cgi) latLng).build();
    }

    public LatLngBounds intersect(double d, double d2, double d3, double d4) {
        cgj latLngBounds = new LatLngBounds(d, d2, d3, d4);
        return intersect(latLngBounds);
    }

    public LatLngBounds intersect(cgj cgj) {
        double max = Math.max(getLonWest(), cgj.getLonWest());
        double min = Math.min(getLonEast(), cgj.getLonEast());
        if (min > max) {
            double max2 = Math.max(getLatSouth(), cgj.getLatSouth());
            double min2 = Math.min(getLatNorth(), cgj.getLatNorth());
            if (min2 > max2) {
                return new LatLngBounds(min2, min, max2, max);
            }
        }
        return null;
    }

    public boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    public void set(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
    }

    public LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("N:");
        stringBuilder.append(this.latitudeNorth);
        stringBuilder.append("; E:");
        stringBuilder.append(this.longitudeEast);
        stringBuilder.append("; S:");
        stringBuilder.append(this.latitudeSouth);
        stringBuilder.append("; W:");
        stringBuilder.append(this.longitudeWest);
        return stringBuilder.toString();
    }

    public LatLngBounds union(double d, double d2, double d3, double d4) {
        double d5 = this.latitudeNorth;
        double d6 = d5 < d ? d : d5;
        double d7 = this.longitudeEast;
        if (d7 < d2) {
            d7 = d2;
        }
        double d8 = this.latitudeSouth;
        if (d8 > d3) {
            d8 = d3;
        }
        double d9 = this.longitudeWest;
        if (d9 > d4) {
            d9 = d4;
        }
        return new LatLngBounds(d6, d7, d8, d9);
    }

    public LatLngBounds union(cgj cgj) {
        return union(cgj.getLatNorth(), cgj.getLonEast(), cgj.getLatSouth(), cgj.getLonWest());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }
}
