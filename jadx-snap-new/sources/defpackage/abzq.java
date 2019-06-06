package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import defpackage.agng.a;
import defpackage.agng.b;

/* renamed from: abzq */
public final class abzq {
    @SerializedName(alternate = {"a"}, value = "altitude_meters")
    public final double a;
    @SerializedName(alternate = {"b"}, value = "units")
    public final b b;
    @SerializedName(alternate = {"c"}, value = "type")
    public final a c;

    /* renamed from: abzq$a */
    public static class a {
        final double a;
        final b b;
        final defpackage.agng.a c;

        public a(double d, b bVar, defpackage.agng.a aVar) {
            this.a = d;
            this.b = bVar;
            this.c = aVar;
        }

        public final abzq a() {
            return new abzq(this);
        }
    }

    public abzq(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    public final double a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzq abzq = (abzq) obj;
        return new akmc().a(this.a, abzq.a).a(this.b, abzq.b).a(this.c, abzq.c).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.a).a(this.b).a(this.c).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("altitudeMeters", this.a).add("units", this.b).add("type", this.c).toString();
    }
}
