package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aibf.class)
/* renamed from: aibe */
public class aibe extends aezl implements aezk {
    @SerializedName("is_ranked")
    public Boolean a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aibe)) {
            return false;
        }
        return Objects.equal(this.a, ((aibe) obj).a);
    }

    public int hashCode() {
        Boolean bool = this.a;
        return (bool == null ? 0 : bool.hashCode()) + 527;
    }
}
