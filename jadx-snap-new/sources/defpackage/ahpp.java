package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahpq.class)
/* renamed from: ahpp */
public class ahpp extends aezl implements aezk {
    @SerializedName("snap_ids")
    public List<Long> a;
    @SerializedName("friend_keys")
    public ahql b;
    @SerializedName("clear_snap_ids")
    public List<Long> c;
    @SerializedName("reset")
    public Boolean d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahpp)) {
            ahpp ahpp = (ahpp) obj;
            return Objects.equal(this.a, ahpp.a) && Objects.equal(this.b, ahpp.b) && Objects.equal(this.c, ahpp.c) && Objects.equal(this.d, ahpp.d);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        ahql ahql = this.b;
        hashCode = (hashCode + (ahql == null ? 0 : ahql.hashCode())) * 31;
        List list2 = this.c;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
