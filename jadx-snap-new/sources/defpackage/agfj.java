package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agfk.class)
/* renamed from: agfj */
public class agfj extends aezl implements aezk {
    @SerializedName("username")
    public String a;
    @SerializedName("counts")
    public agff b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agfj)) {
            agfj agfj = (agfj) obj;
            return Objects.equal(this.a, agfj.a) && Objects.equal(this.b, agfj.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        agff agff = this.b;
        if (agff != null) {
            i = agff.hashCode();
        }
        return hashCode + i;
    }
}
