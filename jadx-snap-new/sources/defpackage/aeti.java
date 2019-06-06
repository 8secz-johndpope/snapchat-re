package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aetj.class)
/* renamed from: aeti */
public class aeti extends aezl implements aezk {
    @SerializedName("group_id")
    public String a;
    @SerializedName("display_name")
    public String b;
    @SerializedName("stories")
    public List<aeug> c;
    @SerializedName("has_custom_description")
    public Boolean d;
    @SerializedName("search_lookup_data")
    public List<afbg> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeti)) {
            aeti aeti = (aeti) obj;
            return Objects.equal(this.a, aeti.a) && Objects.equal(this.b, aeti.b) && Objects.equal(this.c, aeti.c) && Objects.equal(this.d, aeti.d) && Objects.equal(this.e, aeti.e);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
