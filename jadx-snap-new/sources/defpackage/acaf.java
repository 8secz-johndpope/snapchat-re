package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: acaf */
public final class acaf {
    @SerializedName(alternate = {"a"}, value = "celsius")
    public final String a;
    @SerializedName(alternate = {"b"}, value = "fahrenheit")
    public final String b;
    @SerializedName(alternate = {"c"}, value = "hourly_forecasts")
    public final List<aeoj> c;
    @SerializedName(alternate = {"d"}, value = "daily_forecasts")
    public final List<aejb> d;
    @SerializedName(alternate = {"e"}, value = "location_name")
    public final String e;
    @SerializedName(alternate = {"f"}, value = "view_type")
    public final afgk f;

    /* renamed from: acaf$a */
    public static class a {
        final String a;
        final String b;
        final List<aeoj> c;
        final List<aejb> d;
        final String e;
        final afgk f;

        public a(String str, String str2, List<aeoj> list, List<aejb> list2, String str3, afgk afgk) {
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = list2;
            this.e = str3;
            this.f = afgk;
        }

        public final acaf a() {
            return new acaf(this);
        }
    }

    public acaf(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final List<aeoj> c() {
        return this.c;
    }

    public final List<aejb> d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acaf acaf = (acaf) obj;
        return new akmc().a(this.a, acaf.a).a(this.b, acaf.b).a(this.c, acaf.c).a(this.d, acaf.d).a(this.e, acaf.e).a;
    }

    public final afgk f() {
        return this.f;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a(this.c).a(this.d).a(this.e).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("celsius", this.a).add("fahrenheit", this.b).addValue(this.c).addValue(this.d).add("locationName", this.e).toString();
    }
}
