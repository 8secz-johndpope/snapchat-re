package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afft.class)
/* renamed from: affs */
public class affs extends aezl implements aezk {
    @SerializedName("user_owned_unlockables")
    public List<aenr> a;
    @SerializedName("personal_filters")
    public List<aenr> b;
    @SerializedName("user_unlocked_filters")
    public List<aenr> c;
    @SerializedName("lens_list_signature")
    public String d;
    @SerializedName("user_unlocked_sticker_packs")
    public List<aenr> e;
    @SerializedName("user_pinned_lenses")
    public List<aenr> f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof affs)) {
            affs affs = (affs) obj;
            return Objects.equal(this.a, affs.a) && Objects.equal(this.b, affs.b) && Objects.equal(this.c, affs.c) && Objects.equal(this.d, affs.d) && Objects.equal(this.e, affs.e) && Objects.equal(this.f, affs.f);
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
        String str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list2 = this.e;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.f;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
