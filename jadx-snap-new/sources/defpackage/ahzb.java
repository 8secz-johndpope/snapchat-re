package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahzc.class)
/* renamed from: ahzb */
public class ahzb extends aezl implements aezk {
    @SerializedName("deeplink_properties")
    public Map<String, String> a;
    @SerializedName("relative_time_components")
    public List<aibu> b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahzb)) {
            ahzb ahzb = (ahzb) obj;
            return Objects.equal(this.a, ahzb.a) && Objects.equal(this.b, ahzb.b);
        }
    }

    public int hashCode() {
        Map map = this.a;
        int i = 0;
        int hashCode = ((map == null ? 0 : map.hashCode()) + 527) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
