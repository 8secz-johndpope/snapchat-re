package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aewj.class)
/* renamed from: aewi */
public class aewi extends aezl implements aezk {
    @SerializedName("should_reset")
    public Boolean a = Boolean.FALSE;
    @SerializedName("timestamp")
    public Long b = Long.valueOf(0);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aewi)) {
            aewi aewi = (aewi) obj;
            return Objects.equal(this.a, aewi.a) && Objects.equal(this.b, aewi.b);
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
