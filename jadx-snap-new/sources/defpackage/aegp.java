package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aegq.class)
/* renamed from: aegp */
public class aegp extends aezl implements aezk {
    @SerializedName("release_timestamp")
    public Long a;
    @SerializedName("release_sequence_number")
    public Long b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aegp)) {
            aegp aegp = (aegp) obj;
            return Objects.equal(this.a, aegp.a) && Objects.equal(this.b, aegp.b);
        }
    }

    public int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) + 527) * 31;
        Long l2 = this.b;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }
}
