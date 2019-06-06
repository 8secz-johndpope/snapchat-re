package com.mapbox.mapboxsdk.annotations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions implements Parcelable {
    public static final Creator<PolylineOptions> CREATOR = new Creator<PolylineOptions>() {
        public final PolylineOptions createFromParcel(Parcel parcel) {
            return new PolylineOptions(parcel, null);
        }

        public final PolylineOptions[] newArray(int i) {
            return new PolylineOptions[i];
        }
    };
    private Polyline polyline;

    public PolylineOptions() {
        this.polyline = new Polyline();
    }

    private PolylineOptions(Parcel parcel) {
        this.polyline = new Polyline();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        addAll(arrayList);
        alpha(parcel.readFloat());
        color(parcel.readInt());
        width(parcel.readFloat());
    }

    /* synthetic */ PolylineOptions(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public final PolylineOptions add(LatLng latLng) {
        this.polyline.addPoint(latLng);
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        for (LatLng add : latLngArr) {
            add(add);
        }
        return this;
    }

    public final PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            add(add);
        }
        return this;
    }

    public final PolylineOptions alpha(float f) {
        this.polyline.setAlpha(f);
        return this;
    }

    public final PolylineOptions color(int i) {
        this.polyline.setColor(i);
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PolylineOptions polylineOptions = (PolylineOptions) obj;
            return (Float.compare(polylineOptions.getAlpha(), getAlpha()) == 0 && getColor() == polylineOptions.getColor() && Float.compare(polylineOptions.getWidth(), getWidth()) == 0) ? getPoints() == null ? polylineOptions.getPoints() != null : !getPoints().equals(polylineOptions.getPoints()) : false;
        }
    }

    public final float getAlpha() {
        return this.polyline.getAlpha();
    }

    public final int getColor() {
        return this.polyline.getColor();
    }

    public final List<LatLng> getPoints() {
        return this.polyline.getPoints();
    }

    public final Polyline getPolyline() {
        return this.polyline;
    }

    public final float getWidth() {
        return this.polyline.getWidth();
    }

    public final int hashCode() {
        int i = 0;
        int floatToIntBits = ((((((getAlpha() != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(getAlpha()) : 0) + 31) * 31) + getColor()) * 31) + (getWidth() != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(getWidth()) : 0)) * 31;
        if (getPoints() != null) {
            i = getPoints().hashCode();
        }
        return floatToIntBits + i;
    }

    public final PolylineOptions width(float f) {
        this.polyline.setWidth(f);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getPoints());
        parcel.writeFloat(getAlpha());
        parcel.writeInt(getColor());
        parcel.writeFloat(getWidth());
    }
}
