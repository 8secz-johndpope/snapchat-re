package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aice.class)
/* renamed from: aicd */
public class aicd extends aezl implements aezk {
    @SerializedName("trigger_contexts")
    public List<String> a;
    @SerializedName("friend_contexts")
    public List<String> b;
    @SerializedName("camera_contexts")
    public List<String> c;
    @SerializedName("media_type_contexts")
    public List<String> d;
    @SerializedName("actionmoji_contexts")
    public List<Long> e;
    @SerializedName("visual_contexts")
    public List<String> f;
    @SerializedName("lens_applicable_contexts")
    public List<String> g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aicd)) {
            aicd aicd = (aicd) obj;
            return Objects.equal(this.a, aicd.a) && Objects.equal(this.b, aicd.b) && Objects.equal(this.c, aicd.c) && Objects.equal(this.d, aicd.d) && Objects.equal(this.e, aicd.e) && Objects.equal(this.f, aicd.f) && Objects.equal(this.g, aicd.g);
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
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.e;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.f;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.g;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
