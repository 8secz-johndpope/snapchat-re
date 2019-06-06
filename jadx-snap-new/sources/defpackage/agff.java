package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agfg.class)
/* renamed from: agff */
public class agff extends aezl implements aezk {
    @SerializedName("main_counts")
    public agfh a;
    @SerializedName("low_power_counts")
    public agfh b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agff)) {
            agff agff = (agff) obj;
            return Objects.equal(this.a, agff.a) && Objects.equal(this.b, agff.b);
        }
    }

    public int hashCode() {
        agfh agfh = this.a;
        int i = 0;
        int hashCode = ((agfh == null ? 0 : agfh.hashCode()) + 527) * 31;
        agfh agfh2 = this.b;
        if (agfh2 != null) {
            i = agfh2.hashCode();
        }
        return hashCode + i;
    }
}
