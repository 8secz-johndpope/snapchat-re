package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agkw.class)
/* renamed from: agkv */
public class agkv extends agkx implements aezk {
    @SerializedName("value")
    public Boolean a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agkv)) {
            agkv agkv = (agkv) obj;
            return super.equals(agkv) && Objects.equal(this.a, agkv.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Boolean bool = this.a;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }
}
