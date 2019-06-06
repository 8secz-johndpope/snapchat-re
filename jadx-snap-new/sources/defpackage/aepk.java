package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepl.class)
/* renamed from: aepk */
public class aepk extends aezl implements aezk {
    @SerializedName("is_read_action")
    public Boolean a;
    @SerializedName("last_action_timestamp")
    public Long b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepk)) {
            aepk aepk = (aepk) obj;
            return Objects.equal(this.a, aepk.a) && Objects.equal(this.b, aepk.b);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
