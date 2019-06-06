package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahbh.class)
/* renamed from: ahbg */
public class ahbg extends aezl implements aezk {
    @SerializedName("mischief_name")
    public String a;
    @SerializedName("participants")
    public List<ahbl> b;
    @SerializedName("ex_participants")
    public List<ahbe> c;
    @SerializedName("version")
    public Long d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahbg)) {
            ahbg ahbg = (ahbg) obj;
            return Objects.equal(this.a, ahbg.a) && Objects.equal(this.b, ahbg.b) && Objects.equal(this.c, ahbg.c) && Objects.equal(this.d, ahbg.d);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
