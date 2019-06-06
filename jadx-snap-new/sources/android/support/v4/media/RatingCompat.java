package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new Creator<RatingCompat>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final int a;
    private final float b;

    RatingCompat(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Rating:style=");
        stringBuilder.append(this.a);
        stringBuilder.append(" rating=");
        float f = this.b;
        stringBuilder.append(f < MapboxConstants.MINIMUM_ZOOM ? "unrated" : String.valueOf(f));
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
