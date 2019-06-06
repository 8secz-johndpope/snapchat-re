package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aggs.class)
/* renamed from: aggr */
public class aggr extends aezl implements aezk {
    @SerializedName("url_match_patterns")
    public List<String> a;
    @SerializedName("route_rules")
    public List<aggt> b;
    @SerializedName("route_info")
    public List<aggp> c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aggr)) {
            aggr aggr = (aggr) obj;
            return Objects.equal(this.a, aggr.a) && Objects.equal(this.b, aggr.b) && Objects.equal(this.c, aggr.c);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
