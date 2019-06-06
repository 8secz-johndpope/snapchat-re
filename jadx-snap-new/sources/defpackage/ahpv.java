package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahpw.class)
/* renamed from: ahpv */
public class ahpv extends aezl implements aezk {
    @SerializedName("snap_ids")
    public List<Long> a;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("snap_ids is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahpv)) {
            return false;
        }
        return Objects.equal(this.a, ((ahpv) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        return (list == null ? 0 : list.hashCode()) + 527;
    }
}
