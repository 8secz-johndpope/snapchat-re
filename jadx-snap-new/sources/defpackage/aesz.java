package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeta.class)
/* renamed from: aesz */
public class aesz extends aezl implements aezk {
    @SerializedName("gateway_auth_token")
    public aexp a;
    @SerializedName("gateway_server")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesz)) {
            aesz aesz = (aesz) obj;
            return Objects.equal(this.a, aesz.a) && Objects.equal(this.b, aesz.b);
        }
    }

    public int hashCode() {
        aexp aexp = this.a;
        int i = 0;
        int hashCode = ((aexp == null ? 0 : aexp.hashCode()) + 527) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
