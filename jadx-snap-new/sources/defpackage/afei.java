package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afej.class)
/* renamed from: afei */
public class afei extends aedh implements aezk {
    @SerializedName("json")
    public Map<String, aeyv> a;
    @SerializedName("added_friends_timestamp")
    public Long b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afei)) {
            afei afei = (afei) obj;
            return super.equals(afei) && Objects.equal(this.a, afei.a) && Objects.equal(this.b, afei.b);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Map map = this.a;
        int i = 0;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
