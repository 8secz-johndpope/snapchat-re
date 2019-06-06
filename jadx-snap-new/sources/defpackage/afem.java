package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afen.class)
/* renamed from: afem */
public class afem extends aedh implements aezk {
    @SerializedName("friend_stories")
    public List<afcl> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afem)) {
            afem afem = (afem) obj;
            return super.equals(afem) && Objects.equal(this.a, afem.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        return hashCode + (list == null ? 0 : list.hashCode());
    }
}
