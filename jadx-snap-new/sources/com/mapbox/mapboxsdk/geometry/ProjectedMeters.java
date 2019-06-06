package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ProjectedMeters implements Parcelable, IProjectedMeters {
    public static final Creator<ProjectedMeters> CREATOR = new Creator<ProjectedMeters>() {
        public final ProjectedMeters createFromParcel(Parcel parcel) {
            return new ProjectedMeters(parcel, null);
        }

        public final ProjectedMeters[] newArray(int i) {
            return new ProjectedMeters[i];
        }
    };
    private double easting;
    private double northing;

    public ProjectedMeters(double d, double d2) {
        this.northing = d;
        this.easting = d2;
    }

    private ProjectedMeters(Parcel parcel) {
        this.northing = parcel.readDouble();
        this.easting = parcel.readDouble();
    }

    public ProjectedMeters(ProjectedMeters projectedMeters) {
        this.northing = projectedMeters.northing;
        this.easting = projectedMeters.easting;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProjectedMeters projectedMeters = (ProjectedMeters) obj;
            return Double.compare(projectedMeters.easting, this.easting) == 0 && Double.compare(projectedMeters.northing, this.northing) == 0;
        }
    }

    public double getEasting() {
        return this.easting;
    }

    public double getNorthing() {
        return this.northing;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.easting);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.northing);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProjectedMeters [northing=");
        stringBuilder.append(this.northing);
        stringBuilder.append(", easting=");
        stringBuilder.append(this.easting);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.northing);
        parcel.writeDouble(this.easting);
    }
}
