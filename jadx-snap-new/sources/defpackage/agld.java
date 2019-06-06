package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agle.class)
/* renamed from: agld */
public class agld extends agkx implements aezk {
    @SerializedName("value")
    public Float a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agld)) {
            agld agld = (agld) obj;
            return super.equals(agld) && Objects.equal(this.a, agld.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Float f = this.a;
        return hashCode + (f == null ? 0 : f.hashCode());
    }
}
