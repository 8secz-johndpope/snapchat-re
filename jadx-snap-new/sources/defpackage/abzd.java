package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: abzd */
public final class abzd {
    @SerializedName(alternate = {"a"}, value = "webAttachmentDataList")
    public final List<abzf> a;

    /* renamed from: abzd$a */
    public static class a {
        private List<abzf> a;

        public final a a(List<abzf> list) {
            this.a = (List) Preconditions.checkNotNull(list);
            return this;
        }

        public final abzd a() {
            return new abzd(this.a, (byte) 0);
        }
    }

    private abzd(List<abzf> list) {
        this.a = list;
    }

    /* synthetic */ abzd(List list, byte b) {
        this(list);
    }

    public final List<abzf> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return new akmc().a(this.a, ((abzd) obj).a).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("webattachmentdata", this.a).toString();
    }
}
