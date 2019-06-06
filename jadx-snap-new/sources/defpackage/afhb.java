package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afhc.class)
/* renamed from: afhb */
public class afhb extends aezl implements aezk {
    @SerializedName("is_audience_match_opt_out")
    public Boolean a;
    @SerializedName("is_external_activity_match_opt_out")
    public Boolean b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afhb)) {
            afhb afhb = (afhb) obj;
            return Objects.equal(this.a, afhb.a) && Objects.equal(this.b, afhb.b);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        Boolean bool2 = this.b;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }
}
