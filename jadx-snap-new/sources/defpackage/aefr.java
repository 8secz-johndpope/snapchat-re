package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aefs.class)
/* renamed from: aefr */
public class aefr extends aezl implements aezk {
    @SerializedName("message_updates")
    @Deprecated
    public List<aeie> a;
    @SerializedName("state_messages")
    public List<aesx> b;
    @SerializedName("preservation_messages")
    public List<aesv> c;
    @SerializedName("has_more")
    public Boolean d;
    @SerializedName("erase_messages")
    public List<aesr> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aefr)) {
            aefr aefr = (aefr) obj;
            return Objects.equal(this.a, aefr.a) && Objects.equal(this.b, aefr.b) && Objects.equal(this.c, aefr.c) && Objects.equal(this.d, aefr.d) && Objects.equal(this.e, aefr.e);
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
        Boolean bool = this.d;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list2 = this.e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
