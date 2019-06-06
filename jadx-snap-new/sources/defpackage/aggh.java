package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aggi.class)
/* renamed from: aggh */
public class aggh extends aezl implements aezk {
    @SerializedName("version")
    public Double a;
    @SerializedName("cachable_urls")
    public List<String> b;
    @SerializedName("cdn_routing_rules")
    public List<aggt> c;
    @SerializedName("cdn_infos")
    public List<aggp> d;
    @SerializedName("routing_definitions")
    public List<aggr> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aggh)) {
            aggh aggh = (aggh) obj;
            return Objects.equal(this.a, aggh.a) && Objects.equal(this.b, aggh.b) && Objects.equal(this.c, aggh.c) && Objects.equal(this.d, aggh.d) && Objects.equal(this.e, aggh.e);
        }
    }

    public int hashCode() {
        Double d = this.a;
        int i = 0;
        int hashCode = ((d == null ? 0 : d.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
