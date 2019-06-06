package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aehu.class)
/* renamed from: aeht */
public class aeht extends aezl implements aezk {
    @SerializedName("skies")
    public List<aehv> a;
    @SerializedName("portraits")
    public List<aevo> b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeht)) {
            aeht aeht = (aeht) obj;
            return Objects.equal(this.a, aeht.a) && Objects.equal(this.b, aeht.b);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
