package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.Geofence;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aens.class)
/* renamed from: aenr */
public class aenr extends aezl implements aezk {
    @SerializedName("gplay_iap_id")
    public String A;
    @SerializedName("targeting_type")
    public String B;
    @SerializedName("below_drawing_layer")
    public Boolean C;
    @SerializedName("enc_geo_data")
    public String D;
    @SerializedName("geofilter_prompt")
    public aenp E;
    @SerializedName("schedule")
    public afdx F;
    @SerializedName("unlock_duration_message")
    public String G;
    @SerializedName("filter_score")
    public Double H;
    @SerializedName("should_subsample_image")
    public Boolean I;
    @SerializedName("lens_categories_data")
    public List<aepq> J;
    @SerializedName("server_timestamp")
    public Long K;
    @SerializedName("guarantee_delivery")
    public Boolean L;
    @SerializedName("exclusion_tags")
    public List<String> M;
    @SerializedName("excluded_by_tags")
    public List<String> N;
    @SerializedName("lens_carousel_index")
    public Integer O;
    @SerializedName("lens_placement_info")
    public aepz P;
    @SerializedName("is_frame_filter")
    public Boolean Q;
    @SerializedName("unlockable_track_info")
    public afds R;
    @SerializedName("unlockable_category")
    public String S;
    @SerializedName("unlockable_context")
    public aicd T;
    @SerializedName("unlockable_attributes")
    public List<String> U;
    @SerializedName("eligible_for_notification")
    public Boolean V;
    @SerializedName("dynamic_context_properties")
    public ahzb W;
    @SerializedName("sticker_pack_data")
    public afag X;
    @SerializedName("auto_stacking")
    public ahyg Y;
    @SerializedName("is_animated")
    public Boolean Z;
    @SerializedName("filter_id")
    public String a;
    @SerializedName("sync_sensitivity")
    public String aa;
    @SerializedName("populated_unlockable_context_types")
    public List<String> ab;
    @SerializedName("sponsored_slug_style")
    public aezr ac;
    @SerializedName("is_menu_filter")
    public Boolean ad;
    @SerializedName("meta_tags")
    public List<String> ae;
    @SerializedName("has_context_card")
    public Boolean af;
    @SerializedName("carousel_group")
    public ahyr ag;
    @SerializedName("ar_segmentation")
    public ahxz ah;
    @SerializedName("attachment")
    public ahyc ai;
    @SerializedName("debug_info")
    public ahyz aj;
    @SerializedName("scannable_data")
    public aibc ak;
    @SerializedName("tooltip")
    public aibw al;
    @SerializedName("context_hint")
    public String am;
    @SerializedName("audio")
    public ahye an;
    @SerializedName("post_capture_lens_data")
    public aiao ao;
    @SerializedName("caption_style")
    public ahyl ap;
    @SerializedName("filter_id_long")
    public Long aq;
    @SerializedName("checksum")
    public byte[] ar;
    @SerializedName("expires_countdown")
    public Long b;
    @SerializedName("image")
    public String c;
    @SerializedName("url_params")
    public Map<String, String> d;
    @SerializedName("image_cropped_to_visible")
    public String e;
    @SerializedName("extra_image_metadata")
    public aenj f;
    @SerializedName("geofence")
    public Geofence g;
    @SerializedName("unlockable_content_type")
    public String h;
    @SerializedName("unlockable_content_id")
    public String i;
    @SerializedName("priority")
    public Integer j;
    @SerializedName("position")
    public List<String> k;
    @SerializedName("dynamic_content")
    public List<aenn> l;
    @SerializedName("is_dynamic_geofilter")
    public Boolean m;
    @SerializedName("client_cache_expiration_date_time")
    @Deprecated
    public akrm n;
    @SerializedName("client_cache_ttl_minutes")
    public Long o;
    @SerializedName("is_sponsored")
    public Boolean p;
    @SerializedName("sponsored_slug")
    public aezp q;
    @SerializedName("sponsored_slug_position")
    public String r;
    @SerializedName("sponsored_slug_img_link")
    public String s;
    @SerializedName("dynamic_content_setting")
    public aeju t;
    @SerializedName("is_lens")
    public Boolean u;
    @SerializedName("lens_data")
    public aept v;
    @SerializedName("lens_categories")
    public List<String> w;
    @SerializedName("section")
    public String x;
    @SerializedName("is_featured")
    public Boolean y;
    @SerializedName("appstore_iap_id")
    public String z;

    /* renamed from: aenr$a */
    public enum a {
        FRONT(r2),
        BACK(r3),
        UNRECOGNIZED_VALUE(r4);
        
        private final String value;

        private a(String str) {
            this.value = str;
        }

        public static a a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return a.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    /* renamed from: aenr$b */
    public enum b {
        TOP_LEFT("top_left"),
        TOP_CENTER("top_center"),
        TOP_RIGHT("top_right"),
        MIDDLE_LEFT("middle_left"),
        MIDDLE_CENTER("middle_center"),
        MIDDLE_RIGHT("middle_right"),
        BOTTOM_LEFT("bottom_left"),
        BOTTOM_CENTER("bottom_center"),
        BOTTOM_RIGHT("bottom_right"),
        UNRECOGNIZED_VALUE(r11);
        
        private final String value;

        private b(String str) {
            this.value = str;
        }

        public static b a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return b.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    /* renamed from: aenr$c */
    public enum c {
        HIGH(r2),
        LOW(r3),
        UNRECOGNIZED_VALUE(r4);
        
        private final String value;

        private c(String str) {
            this.value = str;
        }

        public static c a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return c.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    public final afdr a() {
        return afdr.a(this.h);
    }

    public final b b() {
        return b.a(this.r);
    }

    public final a c() {
        return a.a(this.x);
    }

    public final afdh d() {
        return afdh.a(this.B);
    }

    public final aica e() {
        return aica.a(this.S);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aenr)) {
            aenr aenr = (aenr) obj;
            return Objects.equal(this.a, aenr.a) && Objects.equal(this.b, aenr.b) && Objects.equal(this.c, aenr.c) && Objects.equal(this.d, aenr.d) && Objects.equal(this.e, aenr.e) && Objects.equal(this.f, aenr.f) && Objects.equal(this.g, aenr.g) && Objects.equal(this.h, aenr.h) && Objects.equal(this.i, aenr.i) && Objects.equal(this.j, aenr.j) && Objects.equal(this.k, aenr.k) && Objects.equal(this.l, aenr.l) && Objects.equal(this.m, aenr.m) && Objects.equal(this.n, aenr.n) && Objects.equal(this.o, aenr.o) && Objects.equal(this.p, aenr.p) && Objects.equal(this.q, aenr.q) && Objects.equal(this.r, aenr.r) && Objects.equal(this.s, aenr.s) && Objects.equal(this.t, aenr.t) && Objects.equal(this.u, aenr.u) && Objects.equal(this.v, aenr.v) && Objects.equal(this.w, aenr.w) && Objects.equal(this.x, aenr.x) && Objects.equal(this.y, aenr.y) && Objects.equal(this.z, aenr.z) && Objects.equal(this.A, aenr.A) && Objects.equal(this.B, aenr.B) && Objects.equal(this.C, aenr.C) && Objects.equal(this.D, aenr.D) && Objects.equal(this.E, aenr.E) && Objects.equal(this.F, aenr.F) && Objects.equal(this.G, aenr.G) && Objects.equal(this.H, aenr.H) && Objects.equal(this.I, aenr.I) && Objects.equal(this.J, aenr.J) && Objects.equal(this.K, aenr.K) && Objects.equal(this.L, aenr.L) && Objects.equal(this.M, aenr.M) && Objects.equal(this.N, aenr.N) && Objects.equal(this.O, aenr.O) && Objects.equal(this.P, aenr.P) && Objects.equal(this.Q, aenr.Q) && Objects.equal(this.R, aenr.R) && Objects.equal(this.S, aenr.S) && Objects.equal(this.T, aenr.T) && Objects.equal(this.U, aenr.U) && Objects.equal(this.V, aenr.V) && Objects.equal(this.W, aenr.W) && Objects.equal(this.X, aenr.X) && Objects.equal(this.Y, aenr.Y) && Objects.equal(this.Z, aenr.Z) && Objects.equal(this.aa, aenr.aa) && Objects.equal(this.ab, aenr.ab) && Objects.equal(this.ac, aenr.ac) && Objects.equal(this.ad, aenr.ad) && Objects.equal(this.ae, aenr.ae) && Objects.equal(this.af, aenr.af) && Objects.equal(this.ag, aenr.ag) && Objects.equal(this.ah, aenr.ah) && Objects.equal(this.ai, aenr.ai) && Objects.equal(this.aj, aenr.aj) && Objects.equal(this.ak, aenr.ak) && Objects.equal(this.al, aenr.al) && Objects.equal(this.am, aenr.am) && Objects.equal(this.an, aenr.an) && Objects.equal(this.ao, aenr.ao) && Objects.equal(this.ap, aenr.ap) && Objects.equal(this.aq, aenr.aq) && Objects.equal(this.ar, aenr.ar);
        }
    }

    public final c f() {
        return c.a(this.aa);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.d;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aenj aenj = this.f;
        hashCode = (hashCode + (aenj == null ? 0 : aenj.hashCode())) * 31;
        Geofence geofence = this.g;
        hashCode = (hashCode + (geofence == null ? 0 : geofence.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.j;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.k;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.l;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        akrm akrm = this.n;
        hashCode = (hashCode + (akrm == null ? 0 : akrm.hashCode())) * 31;
        l = this.o;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aezp aezp = this.q;
        hashCode = (hashCode + (aezp == null ? 0 : aezp.hashCode())) * 31;
        str2 = this.r;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.s;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aeju aeju = this.t;
        hashCode = (hashCode + (aeju == null ? 0 : aeju.hashCode())) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aept aept = this.v;
        hashCode = (hashCode + (aept == null ? 0 : aept.hashCode())) * 31;
        list = this.w;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.x;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.z;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.A;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.B;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.C;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.D;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aenp aenp = this.E;
        hashCode = (hashCode + (aenp == null ? 0 : aenp.hashCode())) * 31;
        afdx afdx = this.F;
        hashCode = (hashCode + (afdx == null ? 0 : afdx.hashCode())) * 31;
        str2 = this.G;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.H;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        bool = this.I;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.J;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        l = this.K;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.L;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.M;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.N;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        num = this.O;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aepz aepz = this.P;
        hashCode = (hashCode + (aepz == null ? 0 : aepz.hashCode())) * 31;
        bool = this.Q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        afds afds = this.R;
        hashCode = (hashCode + (afds == null ? 0 : afds.hashCode())) * 31;
        str2 = this.S;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aicd aicd = this.T;
        hashCode = (hashCode + (aicd == null ? 0 : aicd.hashCode())) * 31;
        list = this.U;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.V;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ahzb ahzb = this.W;
        hashCode = (hashCode + (ahzb == null ? 0 : ahzb.hashCode())) * 31;
        afag afag = this.X;
        hashCode = (hashCode + (afag == null ? 0 : afag.hashCode())) * 31;
        ahyg ahyg = this.Y;
        hashCode = (hashCode + (ahyg == null ? 0 : ahyg.hashCode())) * 31;
        bool = this.Z;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.aa;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.ab;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aezr aezr = this.ac;
        hashCode = (hashCode + (aezr == null ? 0 : aezr.hashCode())) * 31;
        bool = this.ad;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.ae;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.af;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ahyr ahyr = this.ag;
        hashCode = (hashCode + (ahyr == null ? 0 : ahyr.hashCode())) * 31;
        ahxz ahxz = this.ah;
        hashCode = (hashCode + (ahxz == null ? 0 : ahxz.hashCode())) * 31;
        ahyc ahyc = this.ai;
        hashCode = (hashCode + (ahyc == null ? 0 : ahyc.hashCode())) * 31;
        ahyz ahyz = this.aj;
        hashCode = (hashCode + (ahyz == null ? 0 : ahyz.hashCode())) * 31;
        aibc aibc = this.ak;
        hashCode = (hashCode + (aibc == null ? 0 : aibc.hashCode())) * 31;
        aibw aibw = this.al;
        hashCode = (hashCode + (aibw == null ? 0 : aibw.hashCode())) * 31;
        str2 = this.am;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ahye ahye = this.an;
        hashCode = (hashCode + (ahye == null ? 0 : ahye.hashCode())) * 31;
        aiao aiao = this.ao;
        hashCode = (hashCode + (aiao == null ? 0 : aiao.hashCode())) * 31;
        ahyl ahyl = this.ap;
        hashCode = (hashCode + (ahyl == null ? 0 : ahyl.hashCode())) * 31;
        l = this.aq;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        byte[] bArr = this.ar;
        if (bArr != null) {
            i = bArr.hashCode();
        }
        return hashCode + i;
    }
}
