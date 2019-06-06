package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesp.class)
/* renamed from: aeso */
public class aeso extends aezl implements aezk {
    @SerializedName("media")
    public aerv a;
    @SerializedName("medias")
    public List<aerv> b;
    @SerializedName("sticker")
    public afaa c;
    @SerializedName("snapchatter")
    public aeyz d;
    @SerializedName("type")
    public String e;
    @SerializedName("type_version")
    public Integer f = Integer.valueOf(1);
    @SerializedName("text")
    public String g;
    @SerializedName("attributes")
    public List<afdk> h;
    @SerializedName("media_card_attributes")
    public List<aerx> i;
    @SerializedName("story_title")
    public String j;
    @SerializedName("story_share")
    public afbz k;
    @SerializedName("obfuscation")
    public Integer l;
    @SerializedName("snap_metadata")
    public aeyn m;
    @SerializedName("khaleesi_share")
    public aepe n;
    @SerializedName("nyc_share")
    public aety o;
    @SerializedName("search_share_story_snap")
    public aewr p;
    @SerializedName("search_share_story")
    public aewp q;
    @SerializedName("media_save")
    public aesc r;
    @SerializedName("reply_medias")
    public List<aerv> s;
    @SerializedName("message_pallet")
    public List<aest> t;
    @SerializedName("send_start_timestamp")
    public Long u;
    @SerializedName("is_screen_recording")
    public Boolean v;
    @SerializedName("message_parcel")
    public aest w;
    @SerializedName("screen_capture_source")
    public String x;

    public final aesq a() {
        return aesq.a(this.e);
    }

    public final aewo b() {
        return aewo.a(this.x);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeso)) {
            aeso aeso = (aeso) obj;
            return Objects.equal(this.a, aeso.a) && Objects.equal(this.b, aeso.b) && Objects.equal(this.c, aeso.c) && Objects.equal(this.d, aeso.d) && Objects.equal(this.e, aeso.e) && Objects.equal(this.f, aeso.f) && Objects.equal(this.g, aeso.g) && Objects.equal(this.h, aeso.h) && Objects.equal(this.i, aeso.i) && Objects.equal(this.j, aeso.j) && Objects.equal(this.k, aeso.k) && Objects.equal(this.l, aeso.l) && Objects.equal(this.m, aeso.m) && Objects.equal(this.n, aeso.n) && Objects.equal(this.o, aeso.o) && Objects.equal(this.p, aeso.p) && Objects.equal(this.q, aeso.q) && Objects.equal(this.r, aeso.r) && Objects.equal(this.s, aeso.s) && Objects.equal(this.t, aeso.t) && Objects.equal(this.u, aeso.u) && Objects.equal(this.v, aeso.v) && Objects.equal(this.w, aeso.w) && Objects.equal(this.x, aeso.x);
        }
    }

    public int hashCode() {
        aerv aerv = this.a;
        int i = 0;
        int hashCode = ((aerv == null ? 0 : aerv.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        afaa afaa = this.c;
        hashCode = (hashCode + (afaa == null ? 0 : afaa.hashCode())) * 31;
        aeyz aeyz = this.d;
        hashCode = (hashCode + (aeyz == null ? 0 : aeyz.hashCode())) * 31;
        String str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        afbz afbz = this.k;
        hashCode = (hashCode + (afbz == null ? 0 : afbz.hashCode())) * 31;
        num = this.l;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aeyn aeyn = this.m;
        hashCode = (hashCode + (aeyn == null ? 0 : aeyn.hashCode())) * 31;
        aepe aepe = this.n;
        hashCode = (hashCode + (aepe == null ? 0 : aepe.hashCode())) * 31;
        aety aety = this.o;
        hashCode = (hashCode + (aety == null ? 0 : aety.hashCode())) * 31;
        aewr aewr = this.p;
        hashCode = (hashCode + (aewr == null ? 0 : aewr.hashCode())) * 31;
        aewp aewp = this.q;
        hashCode = (hashCode + (aewp == null ? 0 : aewp.hashCode())) * 31;
        aesc aesc = this.r;
        hashCode = (hashCode + (aesc == null ? 0 : aesc.hashCode())) * 31;
        list = this.s;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.t;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.u;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.v;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aest aest = this.w;
        hashCode = (hashCode + (aest == null ? 0 : aest.hashCode())) * 31;
        str = this.x;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return maskSensitiveValue(super.toString(), String.valueOf(this.g), 3);
    }
}
