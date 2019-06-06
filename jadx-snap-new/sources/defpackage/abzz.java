package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: abzz */
public final class abzz {
    @SerializedName(alternate = {"a"}, value = "speed")
    public final float a;

    /* renamed from: abzz$a */
    public static class a {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final abzz a() {
            return new abzz(this);
        }
    }

    public abzz(a aVar) {
        this.a = aVar.a;
    }

    public final float a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((abzz) obj).a).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("speed", this.a).toString();
    }
}
