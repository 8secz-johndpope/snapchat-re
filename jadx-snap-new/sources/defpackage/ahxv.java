package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahxw.class)
/* renamed from: ahxv */
public class ahxv extends aezl implements aezk {
    @SerializedName("helpvideos_listing_last_updated")
    public Long a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahxv)) {
            return false;
        }
        return Objects.equal(this.a, ((ahxv) obj).a);
    }

    public int hashCode() {
        Long l = this.a;
        return (l == null ? 0 : l.hashCode()) + 527;
    }
}
