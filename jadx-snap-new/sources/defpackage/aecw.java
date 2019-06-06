package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aecx.class)
/* renamed from: aecw */
public class aecw extends aedh implements aezk {
    @SerializedName("feed_delta_sync_token")
    public aekq A;
    @SerializedName("only_sync_empty_groups")
    public Boolean B;
    @SerializedName("checksums_dict")
    public String a;
    @SerializedName("checksum_missing_reason")
    public String b;
    @SerializedName("height")
    public Integer c;
    @SerializedName("width")
    public Integer d;
    @SerializedName("max_video_height")
    public Integer e;
    @SerializedName("max_video_width")
    public Integer f;
    @SerializedName("features_map")
    public String g;
    @SerializedName("screen_width_in")
    public Float h;
    @SerializedName("screen_height_in")
    public Float i;
    @SerializedName("screen_width_px")
    public Integer j;
    @SerializedName("screen_height_px")
    public Integer k;
    @SerializedName("pull_to_refresh")
    public Boolean l;
    @SerializedName("friends_request")
    public aemx m;
    @SerializedName("group_delta_requests")
    public List<ahak> n;
    @SerializedName("exclude_user")
    public Boolean o;
    @SerializedName("exclude_friends")
    public Boolean p;
    @SerializedName("exclude_conversations")
    public Boolean q;
    @SerializedName("exclude_stories")
    public Boolean r;
    @SerializedName("messages_tier")
    public String s;
    @SerializedName("use_new_story_viewer_list")
    public Boolean t = Boolean.FALSE;
    @SerializedName("is_cold_start")
    public Boolean u;
    @SerializedName("feature_settings_token")
    public Long v;
    @SerializedName("conversation_delta_query_map")
    public Map<String, aefn> w;
    @SerializedName("conversation_snap_delta_query_map")
    public Map<String, aefv> x;
    @SerializedName("include_client_settings")
    public Boolean y;
    @SerializedName("device_id")
    public String z;

    /* renamed from: aecw$a */
    public enum a {
        ALL(r2),
        SENT_TODAY(r3),
        NOT_RELEASED(r4),
        UNRECOGNIZED_VALUE(r5);
        
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

    public final agax a() {
        return agax.a(this.b);
    }

    public final a b() {
        return a.a(this.s);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aecw)) {
            aecw aecw = (aecw) obj;
            return super.equals(aecw) && Objects.equal(this.a, aecw.a) && Objects.equal(this.b, aecw.b) && Objects.equal(this.c, aecw.c) && Objects.equal(this.d, aecw.d) && Objects.equal(this.e, aecw.e) && Objects.equal(this.f, aecw.f) && Objects.equal(this.g, aecw.g) && Objects.equal(this.h, aecw.h) && Objects.equal(this.i, aecw.i) && Objects.equal(this.j, aecw.j) && Objects.equal(this.k, aecw.k) && Objects.equal(this.l, aecw.l) && Objects.equal(this.m, aecw.m) && Objects.equal(this.n, aecw.n) && Objects.equal(this.o, aecw.o) && Objects.equal(this.p, aecw.p) && Objects.equal(this.q, aecw.q) && Objects.equal(this.r, aecw.r) && Objects.equal(this.s, aecw.s) && Objects.equal(this.t, aecw.t) && Objects.equal(this.u, aecw.u) && Objects.equal(this.v, aecw.v) && Objects.equal(this.w, aecw.w) && Objects.equal(this.x, aecw.x) && Objects.equal(this.y, aecw.y) && Objects.equal(this.z, aecw.z) && Objects.equal(this.A, aecw.A) && Objects.equal(this.B, aecw.B);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.d;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.e;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.h;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.i;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        num = this.j;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.k;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aemx aemx = this.m;
        hashCode = (hashCode + (aemx == null ? 0 : aemx.hashCode())) * 31;
        List list = this.n;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.s;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.t;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.v;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.w;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.x;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.z;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aekq aekq = this.A;
        hashCode = (hashCode + (aekq == null ? 0 : aekq.hashCode())) * 31;
        bool = this.B;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
