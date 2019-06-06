package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeip.class)
/* renamed from: aeio */
public class aeio extends aezl implements aezk {
    @SerializedName("is_delta")
    public Boolean a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aeio)) {
            return false;
        }
        return Objects.equal(this.a, ((aeio) obj).a);
    }

    public int hashCode() {
        Boolean bool = this.a;
        return (bool == null ? 0 : bool.hashCode()) + 527;
    }
}
