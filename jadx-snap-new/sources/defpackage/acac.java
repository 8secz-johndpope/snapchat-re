package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: acac */
public final class acac implements Parcelable {
    public static final Creator<acac> CREATOR = new 1();
    @SerializedName(alternate = {"a"}, value = "name")
    public final String a;
    @SerializedName(alternate = {"b"}, value = "subtitle")
    public final String b;
    @SerializedName(alternate = {"c"}, value = "locality")
    public final String c;
    @SerializedName(alternate = {"d"}, value = "filter_id")
    public final String d;
    @SerializedName(alternate = {"f"}, value = "is_extra")
    public final Boolean e;
    @SerializedName(alternate = {"g"}, value = "venue_name")
    public final String f;
    @SerializedName(alternate = {"h"}, value = "venue_id")
    private final String g;
    @SerializedName(alternate = {"e"}, value = "matching_geofilter_id")
    private final String h;

    /* renamed from: acac$1 */
    static class 1 implements Creator<acac> {
        1() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new acac(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new acac[i];
        }
    }

    public acac(affu affu) {
        this.c = affu.c;
        this.a = affu.b;
        this.b = affu.e;
        this.d = affu.d;
        this.g = affu.a;
        this.h = affu.g;
        this.e = affu.h;
        this.f = affu.i;
    }

    private acac(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.e = (Boolean) parcel.readValue(getClass().getClassLoader());
        this.f = parcel.readString();
    }

    /* synthetic */ acac(Parcel parcel, byte b) {
        this(parcel);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return TextUtils.isEmpty(this.g) ? this.d : this.g;
    }

    public final String d() {
        return this.f;
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
        acac acac = (acac) obj;
        return new akmc().a(this.d, acac.d).a(this.g, acac.g).a;
    }

    public final int hashCode() {
        return new akmd().a(this.d).a(this.g).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("filterId", this.d).add("venueId", this.g).add("name", this.a).add("locality", this.c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeValue(this.e);
        parcel.writeString(this.f);
    }
}
