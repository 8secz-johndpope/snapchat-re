package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aegc.class)
/* renamed from: aegb */
public class aegb extends aezl implements aezk {
    @SerializedName("server_info")
    public aexj a;
    @SerializedName("messaging_gateway_info")
    public aesz b;
    @SerializedName("updates_response")
    public afeq c;
    @SerializedName("friends_response")
    public aemz d;
    @SerializedName("feed_response_info")
    public aeks e;
    @SerializedName("mischief_response")
    public List<ahaz> f;
    @SerializedName("conversations_response")
    public List<aefi> g;
    @SerializedName("conversations_response_info")
    public aeio h;
    @SerializedName("feed_delta_sync_token")
    public aekq i;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aegb)) {
            aegb aegb = (aegb) obj;
            return Objects.equal(this.a, aegb.a) && Objects.equal(this.b, aegb.b) && Objects.equal(this.c, aegb.c) && Objects.equal(this.d, aegb.d) && Objects.equal(this.e, aegb.e) && Objects.equal(this.f, aegb.f) && Objects.equal(this.g, aegb.g) && Objects.equal(this.h, aegb.h) && Objects.equal(this.i, aegb.i);
        }
    }

    public int hashCode() {
        aexj aexj = this.a;
        int i = 0;
        int hashCode = ((aexj == null ? 0 : aexj.hashCode()) + 527) * 31;
        aesz aesz = this.b;
        hashCode = (hashCode + (aesz == null ? 0 : aesz.hashCode())) * 31;
        afeq afeq = this.c;
        hashCode = (hashCode + (afeq == null ? 0 : afeq.hashCode())) * 31;
        aemz aemz = this.d;
        hashCode = (hashCode + (aemz == null ? 0 : aemz.hashCode())) * 31;
        aeks aeks = this.e;
        hashCode = (hashCode + (aeks == null ? 0 : aeks.hashCode())) * 31;
        List list = this.f;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.g;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aeio aeio = this.h;
        hashCode = (hashCode + (aeio == null ? 0 : aeio.hashCode())) * 31;
        aekq aekq = this.i;
        if (aekq != null) {
            i = aekq.hashCode();
        }
        return hashCode + i;
    }
}
