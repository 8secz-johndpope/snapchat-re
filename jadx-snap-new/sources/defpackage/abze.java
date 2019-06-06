package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;

/* renamed from: abze */
public class abze {
    @SerializedName(alternate = {"a"}, value = "snapAttachmentData")
    public final abzd a;

    public abze(abzd abzd) {
        this.a = (abzd) Preconditions.checkNotNull(abzd);
    }

    public final abzd a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((abze) obj).a).a;
    }

    public int hashCode() {
        return new akmd().a(this.a).a;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("snapattachmentdata", this.a).toString();
    }
}
