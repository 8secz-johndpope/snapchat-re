package defpackage;

import com.google.common.base.Preconditions;
import com.google.gson.annotations.SerializedName;

/* renamed from: acaa */
public final class acaa {
    @SerializedName(alternate = {"a"}, value = "motion_filter_type")
    public final abzx a;

    public acaa(abzx abzx) {
        this.a = (abzx) Preconditions.checkNotNull(abzx);
    }

    public final abzx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acaa)) {
            return false;
        }
        return new akmc().a(this.a, ((acaa) obj).a).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }
}
