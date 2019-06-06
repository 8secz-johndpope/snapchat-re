package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afbj.class)
/* renamed from: afbi */
public class afbi extends aezl implements aezk {
    @SerializedName("is_sponsored")
    public Boolean A;
    @SerializedName("sponsored_slug")
    public aezp B;
    @SerializedName("submission_id")
    public String C;
    @SerializedName("enc_geo_data")
    public String D;
    @SerializedName("unlockables_vendor_tags")
    public List<String> E;
    @SerializedName("attribution")
    public agai F;
    @SerializedName("is_official_story")
    public Boolean G;
    @SerializedName("snap_attachment_url")
    public String H;
    @SerializedName("is_public")
    public Boolean I;
    @SerializedName("is_infinite_duration")
    public Boolean J;
    @SerializedName("venue_id")
    public String K;
    @SerializedName("brand_friendliness")
    public Integer L;
    @SerializedName("audio_stitch")
    public aedd M;
    @SerializedName("media_d2s_url")
    public String N;
    @SerializedName("rule_file_parameters")
    public List<afcr> O;
    @SerializedName("filter_geofilter_id")
    public String P;
    @SerializedName("filter_lens_id")
    public String Q;
    @SerializedName("context_hint")
    public String R;
    @SerializedName("animated_snap_type")
    public String S;
    @SerializedName("large_thumbnail_url")
    public String T;
    @SerializedName("lens_metadata")
    public String U;
    @SerializedName("unlockables_snap_info")
    public String V;
    @SerializedName("snap_connect_attributes")
    public ahwm W;
    @SerializedName("repost_attribution")
    public aeyh X;
    @SerializedName("comment")
    public String Y;
    @SerializedName("content_object")
    public String Z;
    @SerializedName("id")
    public String a;
    @SerializedName("capture_session_id")
    public String aa;
    @SerializedName("legacy_zipped_co")
    public String ab;
    @SerializedName("media_co")
    public String ac;
    @SerializedName("overlay_co")
    public String ad;
    @SerializedName("thumbnail_co")
    public String ae;
    @SerializedName("username")
    public String b;
    @SerializedName("mature_content")
    public Boolean c;
    @SerializedName("client_id")
    public String d;
    @SerializedName("timestamp")
    public Long e;
    @SerializedName("framing")
    public afbq f;
    @SerializedName("media_id")
    public String g;
    @SerializedName("media_key")
    public String h;
    @SerializedName("media_url")
    public String i;
    @SerializedName("media_iv")
    public String j;
    @SerializedName("thumbnail_iv")
    public String k;
    @SerializedName("thumbnail_url")
    public String l;
    @SerializedName("media_type")
    public Integer m;
    @SerializedName("time")
    public Double n;
    @SerializedName("time_left")
    public Long o;
    @SerializedName("caption_text_display")
    public String p;
    @SerializedName("caption")
    public aeen q;
    @SerializedName("zipped")
    public Boolean r;
    @SerializedName("filter_id")
    public String s;
    @SerializedName("unlockables")
    public List<afdv> t;
    @SerializedName("story_filter_id")
    public String u;
    @SerializedName("sponsored_story_metadata")
    public aezt v;
    @SerializedName("is_shared")
    public Boolean w;
    @SerializedName("ad_placement_metadata")
    public aech x;
    @SerializedName("needs_auth")
    public Boolean y;
    @SerializedName("ad_can_follow")
    public Boolean z;

    public final aeda a() {
        return aeda.a(this.S);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbi)) {
            afbi afbi = (afbi) obj;
            return Objects.equal(this.a, afbi.a) && Objects.equal(this.b, afbi.b) && Objects.equal(this.c, afbi.c) && Objects.equal(this.d, afbi.d) && Objects.equal(this.e, afbi.e) && Objects.equal(this.f, afbi.f) && Objects.equal(this.g, afbi.g) && Objects.equal(this.h, afbi.h) && Objects.equal(this.i, afbi.i) && Objects.equal(this.j, afbi.j) && Objects.equal(this.k, afbi.k) && Objects.equal(this.l, afbi.l) && Objects.equal(this.m, afbi.m) && Objects.equal(this.n, afbi.n) && Objects.equal(this.o, afbi.o) && Objects.equal(this.p, afbi.p) && Objects.equal(this.q, afbi.q) && Objects.equal(this.r, afbi.r) && Objects.equal(this.s, afbi.s) && Objects.equal(this.t, afbi.t) && Objects.equal(this.u, afbi.u) && Objects.equal(this.v, afbi.v) && Objects.equal(this.w, afbi.w) && Objects.equal(this.x, afbi.x) && Objects.equal(this.y, afbi.y) && Objects.equal(this.z, afbi.z) && Objects.equal(this.A, afbi.A) && Objects.equal(this.B, afbi.B) && Objects.equal(this.C, afbi.C) && Objects.equal(this.D, afbi.D) && Objects.equal(this.E, afbi.E) && Objects.equal(this.F, afbi.F) && Objects.equal(this.G, afbi.G) && Objects.equal(this.H, afbi.H) && Objects.equal(this.I, afbi.I) && Objects.equal(this.J, afbi.J) && Objects.equal(this.K, afbi.K) && Objects.equal(this.L, afbi.L) && Objects.equal(this.M, afbi.M) && Objects.equal(this.N, afbi.N) && Objects.equal(this.O, afbi.O) && Objects.equal(this.P, afbi.P) && Objects.equal(this.Q, afbi.Q) && Objects.equal(this.R, afbi.R) && Objects.equal(this.S, afbi.S) && Objects.equal(this.T, afbi.T) && Objects.equal(this.U, afbi.U) && Objects.equal(this.V, afbi.V) && Objects.equal(this.W, afbi.W) && Objects.equal(this.X, afbi.X) && Objects.equal(this.Y, afbi.Y) && Objects.equal(this.Z, afbi.Z) && Objects.equal(this.aa, afbi.aa) && Objects.equal(this.ab, afbi.ab) && Objects.equal(this.ac, afbi.ac) && Objects.equal(this.ad, afbi.ad) && Objects.equal(this.ae, afbi.ae);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        afbq afbq = this.f;
        hashCode = (hashCode + (afbq == null ? 0 : afbq.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.k;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.m;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.n;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        l = this.o;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.p;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aeen aeen = this.q;
        hashCode = (hashCode + (aeen == null ? 0 : aeen.hashCode())) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.s;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.t;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.u;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aezt aezt = this.v;
        hashCode = (hashCode + (aezt == null ? 0 : aezt.hashCode())) * 31;
        bool = this.w;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aech aech = this.x;
        hashCode = (hashCode + (aech == null ? 0 : aech.hashCode())) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.z;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.A;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aezp aezp = this.B;
        hashCode = (hashCode + (aezp == null ? 0 : aezp.hashCode())) * 31;
        str2 = this.C;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.D;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.E;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        agai agai = this.F;
        hashCode = (hashCode + (agai == null ? 0 : agai.hashCode())) * 31;
        bool = this.G;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.H;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.I;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.J;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.K;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        num = this.L;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aedd aedd = this.M;
        hashCode = (hashCode + (aedd == null ? 0 : aedd.hashCode())) * 31;
        str2 = this.N;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.O;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.P;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.Q;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.R;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.S;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.T;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.U;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.V;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ahwm ahwm = this.W;
        hashCode = (hashCode + (ahwm == null ? 0 : ahwm.hashCode())) * 31;
        aeyh aeyh = this.X;
        hashCode = (hashCode + (aeyh == null ? 0 : aeyh.hashCode())) * 31;
        str2 = this.Y;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.Z;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.aa;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.ab;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.ac;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.ad;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.ae;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
