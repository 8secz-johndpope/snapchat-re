package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahqs.class)
/* renamed from: ahqr */
public class ahqr extends aezl implements aezk {
    @SerializedName("snap_ids")
    public List<Long> a;
    @SerializedName("init_retry_snaps")
    public List<ahqt> b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahqr)) {
            ahqr ahqr = (ahqr) obj;
            return Objects.equal(this.a, ahqr.a) && Objects.equal(this.b, ahqr.b);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
