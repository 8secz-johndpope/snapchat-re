package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agxn.class)
/* renamed from: agxm */
public class agxm extends aedh implements aezk {
    @SerializedName("email")
    public String a;
    @SerializedName("prompted")
    public Boolean b = Boolean.FALSE;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agxm)) {
            agxm agxm = (agxm) obj;
            return super.equals(agxm) && Objects.equal(this.a, agxm.a) && Objects.equal(this.b, agxm.b);
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
