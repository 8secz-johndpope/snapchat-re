package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afep.class)
/* renamed from: afeo */
public class afeo extends aedh implements aezk {
    @SerializedName("seen_tooltips")
    public List<String> a;
    @SerializedName("client_properties")
    public Map<String, String> b;
    @SerializedName("client_properties_v2")
    public List<aehh> c;
    @SerializedName("last_checked_trophies_timestamp")
    public Long d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afeo)) {
            afeo afeo = (afeo) obj;
            return super.equals(afeo) && Objects.equal(this.a, afeo.a) && Objects.equal(this.b, afeo.b) && Objects.equal(this.c, afeo.c) && Objects.equal(this.d, afeo.d);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        int i = 0;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
