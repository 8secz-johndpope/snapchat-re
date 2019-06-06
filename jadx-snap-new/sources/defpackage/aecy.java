package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aecz.class)
/* renamed from: aecy */
public class aecy extends aezl implements aezk {
    @SerializedName("server_info")
    public aexj a;
    @SerializedName("messaging_gateway_info")
    public aesz b;
    @SerializedName("updates_response")
    public afeq c;
    @SerializedName("friends_response")
    public aemz d;
    @SerializedName("stories_response")
    public afbe e;
    @SerializedName("feed_response_info")
    public aeks f;
    @SerializedName("mischief_response")
    public List<ahaz> g;
    @SerializedName("conversations_response")
    public List<aefi> h;
    @SerializedName("conversations_response_info")
    public aeio i;
    @SerializedName("discover")
    public aejo j;
    @SerializedName("identity_check_response")
    public aham k;
    @SerializedName("sponsored")
    public aezn l;
    @SerializedName("support_tools_response")
    public ahxv m;
    @SerializedName("sec_info")
    public ahst n;
    @SerializedName("background_fetch_secret_key")
    public String o;
    @SerializedName("feed_delta_sync_token")
    public aekq p;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aecy)) {
            aecy aecy = (aecy) obj;
            return Objects.equal(this.a, aecy.a) && Objects.equal(this.b, aecy.b) && Objects.equal(this.c, aecy.c) && Objects.equal(this.d, aecy.d) && Objects.equal(this.e, aecy.e) && Objects.equal(this.f, aecy.f) && Objects.equal(this.g, aecy.g) && Objects.equal(this.h, aecy.h) && Objects.equal(this.i, aecy.i) && Objects.equal(this.j, aecy.j) && Objects.equal(this.k, aecy.k) && Objects.equal(this.l, aecy.l) && Objects.equal(this.m, aecy.m) && Objects.equal(this.n, aecy.n) && Objects.equal(this.o, aecy.o) && Objects.equal(this.p, aecy.p);
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
        afbe afbe = this.e;
        hashCode = (hashCode + (afbe == null ? 0 : afbe.hashCode())) * 31;
        aeks aeks = this.f;
        hashCode = (hashCode + (aeks == null ? 0 : aeks.hashCode())) * 31;
        List list = this.g;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aeio aeio = this.i;
        hashCode = (hashCode + (aeio == null ? 0 : aeio.hashCode())) * 31;
        aejo aejo = this.j;
        hashCode = (hashCode + (aejo == null ? 0 : aejo.hashCode())) * 31;
        aham aham = this.k;
        hashCode = (hashCode + (aham == null ? 0 : aham.hashCode())) * 31;
        aezn aezn = this.l;
        hashCode = (hashCode + (aezn == null ? 0 : aezn.hashCode())) * 31;
        ahxv ahxv = this.m;
        hashCode = (hashCode + (ahxv == null ? 0 : ahxv.hashCode())) * 31;
        ahst ahst = this.n;
        hashCode = (hashCode + (ahst == null ? 0 : ahst.hashCode())) * 31;
        String str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aekq aekq = this.p;
        if (aekq != null) {
            i = aekq.hashCode();
        }
        return hashCode + i;
    }
}
