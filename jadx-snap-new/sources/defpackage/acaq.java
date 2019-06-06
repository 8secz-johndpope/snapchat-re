package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;

/* renamed from: acaq */
public final class acaq implements acap {
    @SerializedName(alternate = {"a"}, value = "rotationInClockwiseRadians")
    public final float a;
    @SerializedName(alternate = {"b"}, value = "scale")
    public final float b;
    @SerializedName(alternate = {"c"}, value = "xPositionNormalized")
    public final float c;
    @SerializedName(alternate = {"d"}, value = "yPositionNormalized")
    public final float d;

    public acaq(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        return this.a;
    }

    public final /* synthetic */ acap a(acap acap, float f) {
        Preconditions.checkState(acap instanceof acaq);
        acaq acaq = (acaq) acap;
        float f2 = 1.0f - f;
        return new acaq((this.a * f2) + (acaq.a * f), (this.b * f2) + (acaq.b * f), (this.c * f2) + (acaq.c * f), (f2 * this.d) + (f * acaq.d));
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acaq acaq = (acaq) obj;
        return new akmc().a(this.a, acaq.a).a(this.b, acaq.b).a(this.c, acaq.c).a(this.d, acaq.d).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("rotationInClockwiseRadians", this.a).add("scale", this.b).add("xPositionNormalized", this.c).add("yPositionNormalized", this.d).toString();
    }
}
