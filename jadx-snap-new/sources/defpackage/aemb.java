package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aemc.class)
/* renamed from: aemb */
public class aemb extends aezl implements aezk {
    @SerializedName("debug_messages")
    public List<String> a;
    @SerializedName("debug_feed_items")
    public List<aelp> b;
    @SerializedName("debug_info_html")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemb)) {
            aemb aemb = (aemb) obj;
            return Objects.equal(this.a, aemb.a) && Objects.equal(this.b, aemb.b) && Objects.equal(this.c, aemb.c);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
