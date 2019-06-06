package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.agoa.a;

/* renamed from: abzv */
public final class abzv {
    @SerializedName(alternate = {"a"}, value = "type")
    public final int a;
    @SerializedName(alternate = {"b"}, value = "battery")
    public final abzr b;
    @SerializedName(alternate = {"c"}, value = "speed")
    public final abzz c;
    @SerializedName(alternate = {"d"}, value = "date_time_filter_type")
    public final a d;
    @SerializedName(alternate = {"e"}, value = "weather")
    public final acaf e;
    @SerializedName(alternate = {"f"}, value = "altitude")
    public final abzq f;

    /* renamed from: abzv$a */
    public static class a {
        public final int a;
        public abzr b;
        public abzz c;
        public defpackage.agoa.a d;
        public acaf e;
        public abzq f;

        public a(int i) {
            this.a = i;
        }

        public final a a(abzq abzq) {
            this.f = abzq;
            return this;
        }

        public final a a(abzr abzr) {
            this.b = abzr;
            return this;
        }

        public final a a(abzz abzz) {
            this.c = abzz;
            return this;
        }

        public final a a(acaf acaf) {
            this.e = acaf;
            return this;
        }

        public final a a(defpackage.agoa.a aVar) {
            this.d = aVar;
            return this;
        }

        public final abzv a() {
            return b();
        }

        public final abzv b() {
            if (this.a != -1) {
                return new abzv(this);
            }
            throw new IllegalStateException("type is not valid");
        }
    }

    public abzv(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public final acaf a() {
        return this.e;
    }

    public final int b() {
        return this.a;
    }

    public final abzz c() {
        return this.c;
    }

    public final abzr d() {
        return this.b;
    }

    public final a e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzv abzv = (abzv) obj;
        return new akmc().a(this.a, abzv.a).a(this.b, abzv.b).a(this.c, abzv.c).a(this.d, abzv.d).a(this.e, abzv.e).a(this.f, abzv.f).a;
    }

    public final abzq f() {
        return this.f;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a(this.e).a(this.f).a;
    }

    public final String toString() {
        String str = "battery";
        str = "speed";
        str = "datetime";
        str = "weather";
        return MoreObjects.toStringHelper((Object) this).add("type", this.a).add(str, this.b).add(str, this.c).add(str, this.d).add(str, this.e).add(MapboxEvent.KEY_ALTITUDE, this.f).toString();
    }
}
