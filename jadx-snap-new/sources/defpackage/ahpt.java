package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahpu.class)
/* renamed from: ahpt */
public class ahpt extends aezl implements aezk {
    @SerializedName("ack_retries")
    public List<ahpr> a;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("ack_retries is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahpt)) {
            return false;
        }
        return Objects.equal(this.a, ((ahpt) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        return (list == null ? 0 : list.hashCode()) + 527;
    }
}
