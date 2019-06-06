package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.cgi;
import defpackage.cgj;

public class VisibleRegion implements Parcelable {
    public static final Creator<VisibleRegion> CREATOR = new Creator<VisibleRegion>() {
        public final VisibleRegion createFromParcel(Parcel parcel) {
            return new VisibleRegion(parcel, null);
        }

        public final VisibleRegion[] newArray(int i) {
            return new VisibleRegion[i];
        }
    };
    public final cgi farLeft;
    public final cgi farRight;
    public final cgj latLngBounds;
    public final cgi nearLeft;
    public final cgi nearRight;

    private VisibleRegion(Parcel parcel) {
        this.farLeft = (cgi) parcel.readParcelable(cgi.class.getClassLoader());
        this.farRight = (cgi) parcel.readParcelable(cgi.class.getClassLoader());
        this.nearLeft = (cgi) parcel.readParcelable(cgi.class.getClassLoader());
        this.nearRight = (cgi) parcel.readParcelable(cgi.class.getClassLoader());
        this.latLngBounds = (cgj) parcel.readParcelable(cgj.class.getClassLoader());
    }

    /* synthetic */ VisibleRegion(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public VisibleRegion(cgi cgi, cgi cgi2, cgi cgi3, cgi cgi4, cgj cgj) {
        this.farLeft = cgi;
        this.farRight = cgi2;
        this.nearLeft = cgi3;
        this.nearRight = cgi4;
        this.latLngBounds = cgj;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public int hashCode() {
        return (((this.farLeft.hashCode() + 90) + ((this.farRight.hashCode() + 90) * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL)) + ((this.nearLeft.hashCode() + 180) * 1000000)) + ((this.nearRight.hashCode() + 180) * 1000000000);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[farLeft [");
        stringBuilder.append(this.farLeft);
        stringBuilder.append("], farRight [");
        stringBuilder.append(this.farRight);
        stringBuilder.append("], nearLeft [");
        stringBuilder.append(this.nearLeft);
        stringBuilder.append("], nearRight [");
        stringBuilder.append(this.nearRight);
        stringBuilder.append("], latLngBounds [");
        stringBuilder.append(this.latLngBounds);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.farLeft, i);
        parcel.writeParcelable(this.farRight, i);
        parcel.writeParcelable(this.nearLeft, i);
        parcel.writeParcelable(this.nearRight, i);
        parcel.writeParcelable(this.latLngBounds, i);
    }
}
