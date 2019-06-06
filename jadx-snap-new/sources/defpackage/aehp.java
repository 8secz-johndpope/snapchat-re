package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aehq.class)
/* renamed from: aehp */
public class aehp extends aesm implements aezk {
    @SerializedName("success")
    public Boolean a;
    @SerializedName("failure_reason")
    public String b;
    @SerializedName("alternative_server")
    public aexh c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aehp)) {
            aehp aehp = (aehp) obj;
            return super.equals(aehp) && Objects.equal(this.a, aehp.a) && Objects.equal(this.b, aehp.b) && Objects.equal(this.c, aehp.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aexh aexh = this.c;
        if (aexh != null) {
            i = aexh.hashCode();
        }
        return hashCode + i;
    }
}
