package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeco.class)
/* renamed from: aecn */
public class aecn extends aezl implements aezk {
    @SerializedName("ad_sources")
    public List<aecl> a;
    @SerializedName("use_v2")
    public Boolean b;
    @SerializedName("shut_off_rules")
    public List<aecj> c;
    @SerializedName("use_app_install_v2")
    public Boolean d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aecn)) {
            aecn aecn = (aecn) obj;
            return Objects.equal(this.a, aecn.a) && Objects.equal(this.b, aecn.b) && Objects.equal(this.c, aecn.c) && Objects.equal(this.d, aecn.d);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.c;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
