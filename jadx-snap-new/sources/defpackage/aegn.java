package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aego.class)
/* renamed from: aegn */
public class aegn extends aezl implements aezk {
    @SerializedName("snap")
    public aenb a;
    @SerializedName("chat_message")
    public aegj b;
    @SerializedName("cash_transaction")
    public aefg c;
    @SerializedName("iter_token")
    public String d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aegn)) {
            aegn aegn = (aegn) obj;
            return Objects.equal(this.a, aegn.a) && Objects.equal(this.b, aegn.b) && Objects.equal(this.c, aegn.c) && Objects.equal(this.d, aegn.d);
        }
    }

    public int hashCode() {
        aenb aenb = this.a;
        int i = 0;
        int hashCode = ((aenb == null ? 0 : aenb.hashCode()) + 527) * 31;
        aegj aegj = this.b;
        hashCode = (hashCode + (aegj == null ? 0 : aegj.hashCode())) * 31;
        aefg aefg = this.c;
        hashCode = (hashCode + (aefg == null ? 0 : aefg.hashCode())) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
