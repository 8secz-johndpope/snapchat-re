package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aenc.class)
/* renamed from: aenb */
public class aenb extends aeyc implements aezk {
    @SerializedName("fi_recipient_out_delta_check")
    @Deprecated
    public String A;
    @SerializedName("fi_send_timestamp")
    @Deprecated
    public Long B;
    @SerializedName("fidelius_info")
    public Map<String, ahqf> C;
    @SerializedName("fi_recipient_out_gamma")
    @Deprecated
    public String D;
    @SerializedName("fi_snap_key")
    public String E;
    @SerializedName("fi_snap_iv")
    public String F;
    @SerializedName("fi_prev_sender_gamma")
    @Deprecated
    public String G;
    @SerializedName("fi_prev_sender_gamma_count")
    @Deprecated
    public Integer H;
    @SerializedName("fi_sender_out_beta")
    public String I;
    @SerializedName("fi_snap_release_ts")
    public Long J;
    @SerializedName("screen_capture_shot_count")
    public Integer K;
    @SerializedName("screen_capture_recording_count")
    public Integer L;
    @SerializedName("fi_retried")
    public Boolean M;
    @SerializedName("direct_download_url")
    public aesg N;
    @SerializedName("sn")
    public String a;
    @SerializedName("t")
    public Integer b;
    @SerializedName("timer")
    public Double c;
    @SerializedName("cap_text")
    @Deprecated
    public String d;
    @SerializedName("cap_pos")
    @Deprecated
    public Double e;
    @SerializedName("cap_ori")
    @Deprecated
    public Long f;
    @SerializedName("broadcast")
    public Integer g;
    @SerializedName("broadcast_media_url")
    public String h;
    @SerializedName("broadcast_url")
    public String i;
    @SerializedName("broadcast_action_text")
    public String j;
    @SerializedName("broadcast_secondary_text")
    public String k;
    @SerializedName("broadcast_hide_timer")
    public Boolean l;
    @SerializedName("filter_id")
    public String m;
    @SerializedName("rp")
    public String n;
    @SerializedName("c_id")
    public String o;
    @SerializedName("replayed")
    public Boolean p;
    @SerializedName("pending")
    public Boolean q;
    @SerializedName("c")
    public Integer r;
    @SerializedName("es_id")
    public String s;
    @SerializedName("eg_data")
    public String t;
    @SerializedName("uv_tags")
    public List<String> u;
    @SerializedName("fi_needs_retry")
    public Boolean v;
    @SerializedName("fi_version")
    public Integer w;
    @SerializedName("fi_sender_out_alpha")
    @Deprecated
    public String x;
    @SerializedName("fi_recipient_out_alpha")
    @Deprecated
    public String y;
    @SerializedName("fi_recipient_out_delta")
    @Deprecated
    public String z;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aenb)) {
            aenb aenb = (aenb) obj;
            return super.equals(aenb) && Objects.equal(this.a, aenb.a) && Objects.equal(this.b, aenb.b) && Objects.equal(this.c, aenb.c) && Objects.equal(this.d, aenb.d) && Objects.equal(this.e, aenb.e) && Objects.equal(this.f, aenb.f) && Objects.equal(this.g, aenb.g) && Objects.equal(this.h, aenb.h) && Objects.equal(this.i, aenb.i) && Objects.equal(this.j, aenb.j) && Objects.equal(this.k, aenb.k) && Objects.equal(this.l, aenb.l) && Objects.equal(this.m, aenb.m) && Objects.equal(this.n, aenb.n) && Objects.equal(this.o, aenb.o) && Objects.equal(this.p, aenb.p) && Objects.equal(this.q, aenb.q) && Objects.equal(this.r, aenb.r) && Objects.equal(this.s, aenb.s) && Objects.equal(this.t, aenb.t) && Objects.equal(this.u, aenb.u) && Objects.equal(this.v, aenb.v) && Objects.equal(this.w, aenb.w) && Objects.equal(this.x, aenb.x) && Objects.equal(this.y, aenb.y) && Objects.equal(this.z, aenb.z) && Objects.equal(this.A, aenb.A) && Objects.equal(this.B, aenb.B) && Objects.equal(this.C, aenb.C) && Objects.equal(this.D, aenb.D) && Objects.equal(this.E, aenb.E) && Objects.equal(this.F, aenb.F) && Objects.equal(this.G, aenb.G) && Objects.equal(this.H, aenb.H) && Objects.equal(this.I, aenb.I) && Objects.equal(this.J, aenb.J) && Objects.equal(this.K, aenb.K) && Objects.equal(this.L, aenb.L) && Objects.equal(this.M, aenb.M) && Objects.equal(this.N, aenb.N);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.b;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        d = this.e;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        num = this.g;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.i;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.k;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.m;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.n;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.r;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.s;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.u;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.w;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.x;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.y;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.z;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.A;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.B;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.C;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str = this.D;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.E;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.F;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.G;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.H;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.I;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.J;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        num = this.K;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.L;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.M;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aesg aesg = this.N;
        if (aesg != null) {
            i = aesg.hashCode();
        }
        return hashCode + i;
    }
}
