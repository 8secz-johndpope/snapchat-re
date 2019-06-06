package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aelg.class)
/* renamed from: aelf */
public class aelf extends aezl implements aezk {
    @SerializedName("friendmoji_symbols")
    public List<String> A;
    @SerializedName("friendmojis")
    public List<aemr> B;
    @SerializedName("snap_streak_count")
    public Integer C;
    @SerializedName("snap_streak_expiration")
    public Long D;
    @SerializedName("bitmoji_avatar_id")
    public String E;
    @SerializedName("potential_high_quality_score")
    @Deprecated
    public Integer F;
    @SerializedName("pending_chats_count")
    @Deprecated
    public Integer G;
    @SerializedName("bitmoji_selfie_id")
    public String H;
    @SerializedName("can_be_shared_by_friends")
    @Deprecated
    public Boolean I;
    @SerializedName("fidelius_info")
    public ahql J;
    @SerializedName("bitmoji_snapcode_selfie_id")
    public String K;
    @SerializedName("study_settings")
    public Map<String, String> L;
    @SerializedName("is_popular")
    public Boolean M;
    @SerializedName("is_story_muted")
    public Boolean N;
    @SerializedName("is_incoming_friend_request_viewed")
    public Boolean O;
    @SerializedName("display_username")
    public String P;
    @SerializedName("snap_pro_id")
    public String Q;
    @SerializedName("is_cognac_notification_muted")
    public Boolean R;
    @SerializedName("name")
    public String a;
    @SerializedName("user_id")
    public String b;
    @SerializedName("type")
    public Integer c;
    @SerializedName("display")
    public String d;
    @SerializedName("birthday")
    public String e;
    @SerializedName("ts")
    public Long f;
    @SerializedName("reverse_ts")
    public Long g;
    @SerializedName("direction")
    public String h;
    @SerializedName("story_privacy")
    public String i;
    @SerializedName("can_see_custom_stories")
    public Boolean j;
    @SerializedName("pending_snaps_count")
    @Deprecated
    public Integer k;
    @SerializedName("expiration")
    @Deprecated
    public Long l;
    @SerializedName("is_shared_story")
    @Deprecated
    public Boolean m;
    @SerializedName("has_custom_description")
    @Deprecated
    public Boolean n;
    @SerializedName("shared_story_id")
    @Deprecated
    public String o;
    @SerializedName("local_story")
    @Deprecated
    public Boolean p;
    @SerializedName("ignored_link")
    public Boolean q;
    @SerializedName("hidden_link")
    public Boolean r;
    @SerializedName("add_source")
    public String s;
    @SerializedName("add_source_type")
    public String t;
    @SerializedName("friendmoji_string")
    public String u;
    @SerializedName("needs_love")
    @Deprecated
    public Boolean v;
    @SerializedName("auto_added")
    @Deprecated
    public Boolean w;
    @SerializedName("new_link")
    @Deprecated
    public Boolean x;
    @SerializedName("dont_decay_thumbnail")
    @Deprecated
    public Boolean y;
    @SerializedName("venue")
    @Deprecated
    public String z;

    /* renamed from: aelf$a */
    public enum a {
        UNKNOWN(-1),
        FRIEND(0),
        PENDING(1),
        BLOCKED(2),
        DELETED(3),
        INVITE_PLACEHOLDER(4),
        LOCKED_PLACEHOLDER(5),
        FOLLOWING(6),
        UNRECOGNIZED_VALUE(-9999);
        
        private final int intValue;

        private a(int i) {
            this.intValue = i;
        }

        public static a a(Integer num) {
            if (num == null) {
                return UNRECOGNIZED_VALUE;
            }
            a[] values = a.values();
            for (int i = 0; i < values.length; i++) {
                if (values[i].intValue == num.intValue()) {
                    return values[i];
                }
            }
            return UNRECOGNIZED_VALUE;
        }

        public final int a() {
            return this.intValue;
        }
    }

    public aelf() {
        Long valueOf = Long.valueOf(0);
        this.f = valueOf;
        this.g = valueOf;
        this.l = valueOf;
    }

    public final a a() {
        return a.a(this.c);
    }

    public final afby b() {
        return afby.a(this.i);
    }

    public final aecr c() {
        return aecr.a(this.t);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aelf)) {
            aelf aelf = (aelf) obj;
            return Objects.equal(this.a, aelf.a) && Objects.equal(this.b, aelf.b) && Objects.equal(this.c, aelf.c) && Objects.equal(this.d, aelf.d) && Objects.equal(this.e, aelf.e) && Objects.equal(this.f, aelf.f) && Objects.equal(this.g, aelf.g) && Objects.equal(this.h, aelf.h) && Objects.equal(this.i, aelf.i) && Objects.equal(this.j, aelf.j) && Objects.equal(this.k, aelf.k) && Objects.equal(this.l, aelf.l) && Objects.equal(this.m, aelf.m) && Objects.equal(this.n, aelf.n) && Objects.equal(this.o, aelf.o) && Objects.equal(this.p, aelf.p) && Objects.equal(this.q, aelf.q) && Objects.equal(this.r, aelf.r) && Objects.equal(this.s, aelf.s) && Objects.equal(this.t, aelf.t) && Objects.equal(this.u, aelf.u) && Objects.equal(this.v, aelf.v) && Objects.equal(this.w, aelf.w) && Objects.equal(this.x, aelf.x) && Objects.equal(this.y, aelf.y) && Objects.equal(this.z, aelf.z) && Objects.equal(this.A, aelf.A) && Objects.equal(this.B, aelf.B) && Objects.equal(this.C, aelf.C) && Objects.equal(this.D, aelf.D) && Objects.equal(this.E, aelf.E) && Objects.equal(this.F, aelf.F) && Objects.equal(this.G, aelf.G) && Objects.equal(this.H, aelf.H) && Objects.equal(this.I, aelf.I) && Objects.equal(this.J, aelf.J) && Objects.equal(this.K, aelf.K) && Objects.equal(this.L, aelf.L) && Objects.equal(this.M, aelf.M) && Objects.equal(this.N, aelf.N) && Objects.equal(this.O, aelf.O) && Objects.equal(this.P, aelf.P) && Objects.equal(this.Q, aelf.Q) && Objects.equal(this.R, aelf.R);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.k;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        l = this.l;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.o;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.s;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.t;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.u;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.v;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.w;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.x;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.z;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.A;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.B;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        num = this.C;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        l = this.D;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.E;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        num = this.F;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.G;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.H;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.I;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ahql ahql = this.J;
        hashCode = (hashCode + (ahql == null ? 0 : ahql.hashCode())) * 31;
        str2 = this.K;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.L;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.M;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.N;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.O;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.P;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.Q;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.R;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
