package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahex.class)
/* renamed from: ahew */
public class ahew extends aezl implements aezk {
    @SerializedName("response")
    public List<aheu> a;
    @SerializedName("score")
    public Integer b;
    @SerializedName("sent_snaps")
    public Integer c;
    @SerializedName("received_snaps")
    public Integer d;
    @SerializedName("metric_counters")
    public Map<String, Integer> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahew)) {
            ahew ahew = (ahew) obj;
            return Objects.equal(this.a, ahew.a) && Objects.equal(this.b, ahew.b) && Objects.equal(this.c, ahew.c) && Objects.equal(this.d, ahew.d) && Objects.equal(this.e, ahew.e);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        Integer num = this.b;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.c;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.d;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
