package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agev.class)
/* renamed from: ageu */
public class ageu extends aezl implements aezk {
    @SerializedName("recent_order")
    public List<agew> a;
    @SerializedName("auto_advance_order")
    public List<agew> b;
    @SerializedName("quality_programming_order")
    public List<agew> c;
    @SerializedName("story_scores")
    public List<agey> d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ageu)) {
            ageu ageu = (ageu) obj;
            return Objects.equal(this.a, ageu.a) && Objects.equal(this.b, ageu.b) && Objects.equal(this.c, ageu.c) && Objects.equal(this.d, ageu.d);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.c;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
