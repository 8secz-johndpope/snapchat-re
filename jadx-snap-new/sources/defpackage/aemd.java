package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeme.class)
/* renamed from: aemd */
public class aemd extends aezl implements aezk {
    @SerializedName("signals")
    public List<aedb> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aemd)) {
            return false;
        }
        return Objects.equal(this.a, ((aemd) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        return (list == null ? 0 : list.hashCode()) + 527;
    }
}
