package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aelq.class)
/* renamed from: aelp */
public class aelp extends aezl implements aezk {
    @SerializedName("feed_item")
    public aell a;
    @SerializedName("signals")
    @Deprecated
    public Map<String, aedb> b;
    @SerializedName("server_side_signals")
    public List<aedb> c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aelp)) {
            aelp aelp = (aelp) obj;
            return Objects.equal(this.a, aelp.a) && Objects.equal(this.b, aelp.b) && Objects.equal(this.c, aelp.c);
        }
    }

    public int hashCode() {
        aell aell = this.a;
        int i = 0;
        int hashCode = ((aell == null ? 0 : aell.hashCode()) + 527) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
