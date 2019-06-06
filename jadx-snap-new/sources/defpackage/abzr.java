package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: abzr */
public final class abzr {
    @SerializedName(alternate = {"a"}, value = "level")
    public final abzs a;

    /* renamed from: abzr$a */
    public static class a {
        final abzs a;

        public a(abzs abzs) {
            this.a = abzs;
        }

        public final abzr a() {
            return new abzr(this);
        }
    }

    public abzr(a aVar) {
        this.a = aVar.a;
    }

    public final abzs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((abzr) obj).a).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("level", this.a).toString();
    }
}
