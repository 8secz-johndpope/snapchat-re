package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeho.class)
/* renamed from: aehn */
public class aehn extends aesm implements aezk {
    @SerializedName("username")
    public String a;
    @SerializedName("platform")
    public String b;
    @SerializedName("version")
    public String c;
    @SerializedName("app_version")
    public String d;
    @SerializedName("auth")
    public aexp e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aehn)) {
            aehn aehn = (aehn) obj;
            return super.equals(aehn) && Objects.equal(this.a, aehn.a) && Objects.equal(this.b, aehn.b) && Objects.equal(this.c, aehn.c) && Objects.equal(this.d, aehn.d) && Objects.equal(this.e, aehn.e);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aexp aexp = this.e;
        if (aexp != null) {
            i = aexp.hashCode();
        }
        return hashCode + i;
    }
}
