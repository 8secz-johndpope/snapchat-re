package defpackage;

import com.google.common.base.MoreObjects;
import com.google.gson.annotations.SerializedName;

/* renamed from: abzf */
public final class abzf {
    @SerializedName(alternate = {"a"}, value = "webAttachmentUrl")
    public String a;

    public abzf(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((abzf) obj).a).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("url", this.a).toString();
    }
}
