package defpackage;

import com.brightcove.player.media.VideoFields;
import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: acat */
public final class acat {
    @SerializedName(alternate = {"a"}, value = "start")
    public final int a;
    @SerializedName(alternate = {"b"}, value = "length")
    public final int b;

    public acat(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acat acat = (acat) obj;
        return new akmc().a(this.a, acat.a).a(this.b, acat.b).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("start", this.a).add(VideoFields.DURATION, this.b).toString();
    }
}
