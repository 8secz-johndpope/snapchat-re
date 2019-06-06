package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aerd.class)
/* renamed from: aerc */
public class aerc extends aezl implements aezk {
    @SerializedName("server_info")
    public aexj a;
    @SerializedName("location")
    public aerm b;
    @SerializedName("created_friend")
    public List<aelf> c;
    @SerializedName("created_friend_stories")
    public List<aeml> d;
    @SerializedName("has_new_stories")
    public Boolean e;
    @SerializedName("skip_use_cases")
    public aeya f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aerc)) {
            aerc aerc = (aerc) obj;
            return Objects.equal(this.a, aerc.a) && Objects.equal(this.b, aerc.b) && Objects.equal(this.c, aerc.c) && Objects.equal(this.d, aerc.d) && Objects.equal(this.e, aerc.e) && Objects.equal(this.f, aerc.f);
        }
    }

    public int hashCode() {
        aexj aexj = this.a;
        int i = 0;
        int hashCode = ((aexj == null ? 0 : aexj.hashCode()) + 527) * 31;
        aerm aerm = this.b;
        hashCode = (hashCode + (aerm == null ? 0 : aerm.hashCode())) * 31;
        List list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aeya aeya = this.f;
        if (aeya != null) {
            i = aeya.hashCode();
        }
        return hashCode + i;
    }
}
