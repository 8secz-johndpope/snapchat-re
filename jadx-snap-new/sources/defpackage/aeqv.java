package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeqw.class)
/* renamed from: aeqv */
public class aeqv extends aezl implements aezk {
    @SerializedName("active_lenses")
    public List<aenr> a;
    @SerializedName("precached_lenses")
    public List<aenr> b;
    @SerializedName("cache_ttl_millis")
    public Long c;
    @SerializedName("lens_list_signature")
    public String d;
    @SerializedName("preselected_lens_id")
    public String e;
    @SerializedName("active_rear_lenses")
    public List<aenr> f;
    @SerializedName("median_index_depth")
    public Long g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeqv)) {
            aeqv aeqv = (aeqv) obj;
            return Objects.equal(this.a, aeqv.a) && Objects.equal(this.b, aeqv.b) && Objects.equal(this.c, aeqv.c) && Objects.equal(this.d, aeqv.d) && Objects.equal(this.e, aeqv.e) && Objects.equal(this.f, aeqv.f) && Objects.equal(this.g, aeqv.g);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list2 = this.f;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
