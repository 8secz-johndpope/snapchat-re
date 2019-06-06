package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: acad */
public final class acad {
    @SerializedName(alternate = {"a"}, value = "visualFilterType")
    public final acae a;

    public acad(acae acae) {
        this.a = acae;
    }

    public final acae a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((acad) obj).a).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("type", this.a).toString();
    }
}
