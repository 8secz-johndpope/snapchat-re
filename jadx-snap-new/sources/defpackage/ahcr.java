package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahcs.class)
/* renamed from: ahcr */
public class ahcr extends aedh implements aezk {
    @SerializedName("seen_contacts_list")
    public List<String> a;
    @SerializedName("added_contacts_list")
    public List<String> b;
    @SerializedName("seen_quick_add_list")
    public List<String> c;
    @SerializedName("added_quick_add_list")
    public List<String> d;
    @SerializedName("suggestion_token_map")
    public Map<String, String> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahcr)) {
            ahcr ahcr = (ahcr) obj;
            return super.equals(ahcr) && Objects.equal(this.a, ahcr.a) && Objects.equal(this.b, ahcr.b) && Objects.equal(this.c, ahcr.c) && Objects.equal(this.d, ahcr.d) && Objects.equal(this.e, ahcr.e);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        int i = 0;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
