package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeij.class)
/* renamed from: aeii */
public class aeii extends aezl implements aezk {
    @SerializedName("user_sequences")
    public Map<String, Long> a;
    @SerializedName("update_sequences")
    public Map<String, Long> b;
    @SerializedName("snap_sequences")
    public Map<String, Long> c;
    @SerializedName("user_chat_releases_v2")
    public List<aeik> d;
    @SerializedName("user_snap_releases_v2")
    public List<aeim> e;
    @SerializedName("user_chat_releases")
    public Map<String, Map<String, Long>> f;
    @SerializedName("user_snap_releases")
    public Map<String, Map<String, Long>> g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeii)) {
            aeii aeii = (aeii) obj;
            return Objects.equal(this.a, aeii.a) && Objects.equal(this.b, aeii.b) && Objects.equal(this.c, aeii.c) && Objects.equal(this.d, aeii.d) && Objects.equal(this.e, aeii.e) && Objects.equal(this.f, aeii.f) && Objects.equal(this.g, aeii.g);
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
        List list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.e;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        map2 = this.f;
        hashCode = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        map2 = this.g;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }
}
