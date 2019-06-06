package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aefo.class)
/* renamed from: aefn */
public class aefn extends aezl implements aezk {
    @SerializedName("last_known_msg_seqs")
    public Map<String, Long> a;
    @SerializedName("last_known_update_seqs")
    public Map<String, Long> b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aefn)) {
            aefn aefn = (aefn) obj;
            return Objects.equal(this.a, aefn.a) && Objects.equal(this.b, aefn.b);
        }
    }

    public int hashCode() {
        Map map = this.a;
        int i = 0;
        int hashCode = ((map == null ? 0 : map.hashCode()) + 527) * 31;
        Map map2 = this.b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }
}
