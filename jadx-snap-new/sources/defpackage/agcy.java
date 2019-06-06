package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agcz.class)
/* renamed from: agcy */
public class agcy extends aedh implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("is_block")
    public Boolean b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agcy)) {
            agcy agcy = (agcy) obj;
            return super.equals(agcy) && Objects.equal(this.a, agcy.a) && Objects.equal(this.b, agcy.b);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
