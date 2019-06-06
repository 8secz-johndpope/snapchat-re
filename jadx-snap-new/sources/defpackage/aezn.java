package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aezo.class)
/* renamed from: aezn */
public class aezn extends aezl implements aezk {
    @SerializedName("style")
    public aezr a;
    @SerializedName("default_values")
    public aezp b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aezn)) {
            aezn aezn = (aezn) obj;
            return Objects.equal(this.a, aezn.a) && Objects.equal(this.b, aezn.b);
        }
    }

    public int hashCode() {
        aezr aezr = this.a;
        int i = 0;
        int hashCode = ((aezr == null ? 0 : aezr.hashCode()) + 527) * 31;
        aezp aezp = this.b;
        if (aezp != null) {
            i = aezp.hashCode();
        }
        return hashCode + i;
    }
}
