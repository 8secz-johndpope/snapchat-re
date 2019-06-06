package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahqo.class)
/* renamed from: ahqn */
public class ahqn extends aedh implements aezk {
    @SerializedName("friends")
    public List<String> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahqn)) {
            ahqn ahqn = (ahqn) obj;
            return super.equals(ahqn) && Objects.equal(this.a, ahqn.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        return hashCode + (list == null ? 0 : list.hashCode());
    }
}
