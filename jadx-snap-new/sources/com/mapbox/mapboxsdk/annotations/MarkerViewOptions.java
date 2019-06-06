package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.exceptions.InvalidMarkerPositionException;
import com.mapbox.mapboxsdk.geometry.LatLng;

public class MarkerViewOptions extends BaseMarkerViewOptions<MarkerView, MarkerViewOptions> {
    public static final Creator<MarkerViewOptions> CREATOR = new Creator<MarkerViewOptions>() {
        public final MarkerViewOptions createFromParcel(Parcel parcel) {
            return new MarkerViewOptions(parcel);
        }

        public final MarkerViewOptions[] newArray(int i) {
            return new MarkerViewOptions[i];
        }
    };
    private MarkerView marker = new MarkerView();

    protected MarkerViewOptions(Parcel parcel) {
        position((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        snippet(parcel.readString());
        title(parcel.readString());
        boolean z = true;
        flat(parcel.readByte() != (byte) 0);
        anchor(parcel.readFloat(), parcel.readFloat());
        infoWindowAnchor(parcel.readFloat(), parcel.readFloat());
        rotation(parcel.readFloat());
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        visible(z);
        alpha(parcel.readFloat());
        if (parcel.readByte() != (byte) 0) {
            icon(new Icon(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader())));
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MarkerViewOptions markerViewOptions = (MarkerViewOptions) obj;
            MarkerView markerView = this.marker;
            if (markerView != null) {
                return markerView.equals(markerViewOptions.marker);
            }
            if (markerViewOptions.marker == null) {
                return true;
            }
        }
        return false;
    }

    public MarkerView getMarker() {
        if (this.position != null) {
            this.marker.setPosition(this.position);
            this.marker.setSnippet(this.snippet);
            this.marker.setTitle(this.title);
            this.marker.setIcon(this.icon);
            this.marker.setFlat(this.flat);
            this.marker.setAnchor(this.anchorU, this.anchorV);
            this.marker.setInfoWindowAnchor(this.infoWindowAnchorU, this.infoWindowAnchorV);
            this.marker.setRotation(this.rotation);
            this.marker.setVisible(this.visible);
            this.marker.setAlpha(this.alpha);
            return this.marker;
        }
        throw new InvalidMarkerPositionException();
    }

    public MarkerViewOptions getThis() {
        return this;
    }

    public int hashCode() {
        MarkerView markerView = this.marker;
        return markerView != null ? markerView.hashCode() : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getPosition(), i);
        parcel.writeString(getSnippet());
        parcel.writeString(getTitle());
        parcel.writeByte((byte) isFlat());
        parcel.writeFloat(getAnchorU());
        parcel.writeFloat(getAnchorV());
        parcel.writeFloat(getInfoWindowAnchorU());
        parcel.writeFloat(getInfoWindowAnchorV());
        parcel.writeFloat(getRotation());
        parcel.writeByte((byte) isVisible());
        parcel.writeFloat(this.alpha);
        Icon icon = getIcon();
        parcel.writeByte((byte) (icon != null ? 1 : 0));
        if (icon != null) {
            parcel.writeString(getIcon().getId());
            parcel.writeParcelable(getIcon().getBitmap(), i);
        }
    }
}
