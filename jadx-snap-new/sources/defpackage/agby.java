package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agbz.class)
/* renamed from: agby */
public class agby extends aedh implements aezk {
    @SerializedName("encrypted_story_view_records")
    public List<aeld> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agby)) {
            agby agby = (agby) obj;
            return super.equals(agby) && Objects.equal(this.a, agby.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        return hashCode + (list == null ? 0 : list.hashCode());
    }
}
