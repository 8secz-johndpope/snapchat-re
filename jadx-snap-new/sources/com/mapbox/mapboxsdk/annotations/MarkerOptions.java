package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.exceptions.InvalidMarkerPositionException;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class MarkerOptions extends BaseMarkerOptions<Marker, MarkerOptions> implements Parcelable {
    public static final Creator<MarkerOptions> CREATOR = new Creator<MarkerOptions>() {
        public final MarkerOptions createFromParcel(Parcel parcel) {
            return new MarkerOptions(parcel);
        }

        public final MarkerOptions[] newArray(int i) {
            return new MarkerOptions[i];
        }
    };

    protected MarkerOptions(Parcel parcel) {
        position((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        snippet(parcel.readString());
        title(parcel.readString());
        if (parcel.readByte() != (byte) 0) {
            icon(new Icon(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader())));
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MarkerOptions markerOptions = (MarkerOptions) obj;
            return (getPosition() == null ? markerOptions.getPosition() == null : getPosition().equals(markerOptions.getPosition())) ? (getSnippet() == null ? markerOptions.getSnippet() == null : getSnippet().equals(markerOptions.getSnippet())) ? (getIcon() == null ? markerOptions.getIcon() == null : getIcon().equals(markerOptions.getIcon())) ? getTitle() == null ? markerOptions.getTitle() != null : !getTitle().equals(markerOptions.getTitle()) : false : false : false;
        }
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Marker getMarker() {
        if (this.position != null) {
            return new Marker(this.position, this.icon, this.title, this.snippet);
        }
        throw new InvalidMarkerPositionException();
    }

    public final LatLng getPosition() {
        return this.position;
    }

    public final String getSnippet() {
        return this.snippet;
    }

    public final MarkerOptions getThis() {
        return this;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((getPosition() != null ? getPosition().hashCode() : 0) + 31) * 31) + (getSnippet() != null ? getSnippet().hashCode() : 0)) * 31) + (getIcon() != null ? getIcon().hashCode() : 0)) * 31;
        if (getTitle() != null) {
            i = getTitle().hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPosition(), i);
        parcel.writeString(getSnippet());
        parcel.writeString(getTitle());
        Icon icon = getIcon();
        parcel.writeByte((byte) (icon != null ? 1 : 0));
        if (icon != null) {
            parcel.writeString(getIcon().getId());
            parcel.writeParcelable(getIcon().getBitmap(), i);
        }
    }
}
