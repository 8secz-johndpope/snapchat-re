package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepu.class)
/* renamed from: aept */
public class aept extends aezl implements aezk {
    @SerializedName("is_left_carousel")
    public Boolean A;
    @SerializedName("client_cache_ttl")
    public Long B;
    @SerializedName("lens_creator_selfie_id")
    public String C;
    @SerializedName("lens_resources")
    public List<aeqb> D;
    @SerializedName("snap_pro_profile_id")
    public String E;
    @SerializedName("is_creator_deactivated")
    public Boolean F;
    @SerializedName("code")
    public String a;
    @SerializedName("config_path")
    public String b;
    @SerializedName("icon_link")
    public String c;
    @SerializedName("lens_link")
    public String d;
    @SerializedName("hint_id")
    public String e;
    @SerializedName("hint_translations")
    public Map<String, String> f;
    @SerializedName("signature")
    public String g;
    @SerializedName("demo_start_date")
    public akrm h;
    @SerializedName("bitmoji_comic_id")
    public String i;
    @SerializedName("asset_manifest")
    public List<aepo> j;
    @SerializedName("hide_until_assets_downloaded")
    public Boolean k;
    @SerializedName("is_third_party")
    public Boolean l;
    @SerializedName("is_studio_preview")
    public Boolean m;
    @SerializedName("lens_creator_username")
    public String n;
    @SerializedName("lens_attribution_name")
    public String o;
    @SerializedName("activation_camera")
    public String p;
    @SerializedName("is_disabled_for_video_chat")
    public Boolean q;
    @SerializedName("unlock_companion_back_reference_id")
    public String r;
    @SerializedName("name")
    public String s;
    @SerializedName("filter_image_link")
    public String t;
    @SerializedName("lens_descriptors")
    public List<String> u;
    @SerializedName("snappable_reply_type")
    public String v;
    @SerializedName("lens_creator_user_id")
    public String w;
    @SerializedName("lens_creator_avatar_id")
    public String x;
    @SerializedName("snappable_tagline_key")
    public String y;
    @SerializedName("snappable_play_button_gradient")
    public aeqd z;

    /* renamed from: aept$a */
    public enum a {
        FRONT(r2),
        REAR(r3),
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

    /* renamed from: aept$b */
    public enum b {
        SRT_INTERSTITIAL(r2),
        SRT_CONTEXT(r3),
        UNRECOGNIZED_VALUE(r4);
        
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

    public final a a() {
        return a.a(this.p);
    }

    public final b b() {
        return b.a(this.v);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aept)) {
            aept aept = (aept) obj;
            return Objects.equal(this.a, aept.a) && Objects.equal(this.b, aept.b) && Objects.equal(this.c, aept.c) && Objects.equal(this.d, aept.d) && Objects.equal(this.e, aept.e) && Objects.equal(this.f, aept.f) && Objects.equal(this.g, aept.g) && Objects.equal(this.h, aept.h) && Objects.equal(this.i, aept.i) && Objects.equal(this.j, aept.j) && Objects.equal(this.k, aept.k) && Objects.equal(this.l, aept.l) && Objects.equal(this.m, aept.m) && Objects.equal(this.n, aept.n) && Objects.equal(this.o, aept.o) && Objects.equal(this.p, aept.p) && Objects.equal(this.q, aept.q) && Objects.equal(this.r, aept.r) && Objects.equal(this.s, aept.s) && Objects.equal(this.t, aept.t) && Objects.equal(this.u, aept.u) && Objects.equal(this.v, aept.v) && Objects.equal(this.w, aept.w) && Objects.equal(this.x, aept.x) && Objects.equal(this.y, aept.y) && Objects.equal(this.z, aept.z) && Objects.equal(this.A, aept.A) && Objects.equal(this.B, aept.B) && Objects.equal(this.C, aept.C) && Objects.equal(this.D, aept.D) && Objects.equal(this.E, aept.E) && Objects.equal(this.F, aept.F);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        akrm akrm = this.h;
        hashCode = (hashCode + (akrm == null ? 0 : akrm.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.j;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.n;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.o;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.p;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.r;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.s;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.t;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.u;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.v;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.w;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.x;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.y;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aeqd aeqd = this.z;
        hashCode = (hashCode + (aeqd == null ? 0 : aeqd.hashCode())) * 31;
        bool = this.A;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.B;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.C;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.D;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.E;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.F;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
