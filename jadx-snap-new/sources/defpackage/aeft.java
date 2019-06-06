package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aefu.class)
/* renamed from: aeft */
public class aeft extends aezl implements aezk {
    @SerializedName("messaging_auth")
    public aexp a;
    @SerializedName("messages")
    public List<aegn> b;
    @SerializedName("message_iter_token")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeft)) {
            aeft aeft = (aeft) obj;
            return Objects.equal(this.a, aeft.a) && Objects.equal(this.b, aeft.b) && Objects.equal(this.c, aeft.c);
        }
    }

    public int hashCode() {
        aexp aexp = this.a;
        int i = 0;
        int hashCode = ((aexp == null ? 0 : aexp.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
