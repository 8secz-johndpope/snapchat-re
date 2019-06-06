package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aglc.class)
/* renamed from: aglb */
public class aglb extends aezl implements aezk {
    @SerializedName("stringConfigs")
    public Map<String, aglh> a;
    @SerializedName("floatConfigs")
    public Map<String, agld> b;
    @SerializedName("longConfigs")
    public Map<String, aglf> c;
    @SerializedName("booleanConfigs")
    public Map<String, agkv> d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aglb)) {
            aglb aglb = (aglb) obj;
            return Objects.equal(this.a, aglb.a) && Objects.equal(this.b, aglb.b) && Objects.equal(this.c, aglb.c) && Objects.equal(this.d, aglb.d);
        }
    }

    public int hashCode() {
        Map map = this.a;
        int i = 0;
        int hashCode = ((map == null ? 0 : map.hashCode()) + 527) * 31;
        Map map2 = this.b;
        hashCode = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        map2 = this.c;
        hashCode = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        map2 = this.d;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }
}
