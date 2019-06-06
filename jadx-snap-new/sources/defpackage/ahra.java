package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahrb.class)
/* renamed from: ahra */
public class ahra extends aezl implements aezk {
    @SerializedName("updates")
    public Map<String, ahpp> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahra)) {
            return false;
        }
        return Objects.equal(this.a, ((ahra) obj).a);
    }

    public int hashCode() {
        Map map = this.a;
        return (map == null ? 0 : map.hashCode()) + 527;
    }
}
