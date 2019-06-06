package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aefw.class)
/* renamed from: aefv */
public class aefv extends aezl implements aezk {
    @SerializedName("last_known_snap_seqs")
    public Map<String, Long> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aefv)) {
            return false;
        }
        return Objects.equal(this.a, ((aefv) obj).a);
    }

    public int hashCode() {
        Map map = this.a;
        return (map == null ? 0 : map.hashCode()) + 527;
    }
}
