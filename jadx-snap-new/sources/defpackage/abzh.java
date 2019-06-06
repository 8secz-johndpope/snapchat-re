package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: abzh */
public final class abzh {
    @SerializedName(alternate = {"a"}, value = "color")
    public final int a;
    @SerializedName(alternate = {"b"}, value = "range")
    public final acat b;

    /* renamed from: abzh$a */
    public static class a {
        public int a;
        public acat b;
        public int c;
        public int d;

        public final a a(Integer num) {
            this.a = num.intValue();
            return this;
        }

        public final abzh a() {
            this.b = new acat(this.c, this.d);
            return new abzh(this);
        }
    }

    public abzh(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abzh abzh = (abzh) obj;
        return new akmc().a(this.a, abzh.a).a(this.b, abzh.b).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("color", this.a).add("range", this.b).toString();
    }
}
