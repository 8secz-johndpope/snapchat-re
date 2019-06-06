package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afmm.class)
/* renamed from: afml */
public class afml extends aezl implements aezk {
    @SerializedName("ad_insertion_config")
    public afmj a;
    @SerializedName("ad_request_config")
    public afmn b;
    @SerializedName("ad_unit_id")
    public String c;
    @SerializedName("targeting_parameters")
    public Map<String, String> d;
    @SerializedName("ad_cannot_follow_snap_ids")
    public List<String> e;
    @SerializedName("enable_full_view")
    public Boolean f;

    public void a() {
        if (this.c == null) {
            throw new IllegalStateException("ad_unit_id is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afml)) {
            afml afml = (afml) obj;
            return Objects.equal(this.a, afml.a) && Objects.equal(this.b, afml.b) && Objects.equal(this.c, afml.c) && Objects.equal(this.d, afml.d) && Objects.equal(this.e, afml.e) && Objects.equal(this.f, afml.f);
        }
    }

    public int hashCode() {
        afmj afmj = this.a;
        int i = 0;
        int hashCode = ((afmj == null ? 0 : afmj.hashCode()) + 527) * 31;
        afmn afmn = this.b;
        hashCode = (hashCode + (afmn == null ? 0 : afmn.hashCode())) * 31;
        String str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.d;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.e;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
