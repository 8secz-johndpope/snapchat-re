package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahbb.class)
/* renamed from: ahaz */
public class ahaz extends aezl implements aezk {
    @SerializedName("blocked_participant_exceptions")
    public Map<String, Long> A;
    @SerializedName("page_latest_sequence_numbers")
    public Map<String, Long> B;
    @SerializedName("participant_last_content")
    public Map<String, aepm> C;
    @SerializedName("mischief_mob_id")
    public String D;
    @SerializedName("is_story_muted")
    public Boolean E;
    @SerializedName("creator_id")
    public String F;
    @SerializedName("mischief_creation_source")
    public String G;
    @SerializedName("seen_chat_sequence_numbers")
    public Map<String, Map<String, Long>> H;
    @SerializedName("message_erase_messages")
    public List<aesr> I;
    @SerializedName("mention_notification_status")
    public Boolean J;
    @SerializedName("is_cognac_notification_muted")
    public Boolean K;
    @SerializedName("mischief_id")
    public String a;
    @SerializedName("mischief_metadata")
    public ahbg b;
    @SerializedName("mischief_name")
    public String c;
    @SerializedName("participants")
    public List<ahbl> d;
    @SerializedName("ex_participants")
    public List<ahbe> e;
    @SerializedName("create_mischief_timestamp")
    public Long f;
    @SerializedName("last_interaction_timestamp")
    public Long g;
    @SerializedName("last_cleared_timestamp")
    public Long h;
    @SerializedName("latest_sequence_numbers")
    public Map<String, Long> i;
    @SerializedName("last_mischief_chat_action")
    public aepk j;
    @SerializedName("sticker_favorites")
    public List<aekk> k;
    @SerializedName("iter_token")
    public String l;
    @SerializedName("content_type")
    public String m;
    @SerializedName("content")
    public List<aeie> n;
    @SerializedName("content_order")
    public List<String> o;
    @SerializedName("chat_messages")
    public List<aegj> p;
    @SerializedName("release_messages")
    public List<aegz> q;
    @SerializedName("update_messages")
    public List<aetd> r;
    @SerializedName("notification_status")
    public Boolean s;
    @SerializedName("video_chat_params")
    public afgd t;
    @SerializedName("earlier_content_exists")
    public Boolean u;
    @SerializedName("earliest_sequence_numbers")
    public Map<String, Long> v;
    @SerializedName("message_state_messages")
    public List<aesx> w;
    @SerializedName("snap_state_messages")
    public List<aehb> x;
    @SerializedName("later_content_exists")
    public Boolean y;
    @SerializedName("last_mischief_content")
    public aepm z;

    public final ahbc a() {
        return ahbc.a(this.m);
    }

    public final ahbd b() {
        return ahbd.a(this.G);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahaz)) {
            ahaz ahaz = (ahaz) obj;
            return Objects.equal(this.a, ahaz.a) && Objects.equal(this.b, ahaz.b) && Objects.equal(this.c, ahaz.c) && Objects.equal(this.d, ahaz.d) && Objects.equal(this.e, ahaz.e) && Objects.equal(this.f, ahaz.f) && Objects.equal(this.g, ahaz.g) && Objects.equal(this.h, ahaz.h) && Objects.equal(this.i, ahaz.i) && Objects.equal(this.j, ahaz.j) && Objects.equal(this.k, ahaz.k) && Objects.equal(this.l, ahaz.l) && Objects.equal(this.m, ahaz.m) && Objects.equal(this.n, ahaz.n) && Objects.equal(this.o, ahaz.o) && Objects.equal(this.p, ahaz.p) && Objects.equal(this.q, ahaz.q) && Objects.equal(this.r, ahaz.r) && Objects.equal(this.s, ahaz.s) && Objects.equal(this.t, ahaz.t) && Objects.equal(this.u, ahaz.u) && Objects.equal(this.v, ahaz.v) && Objects.equal(this.w, ahaz.w) && Objects.equal(this.x, ahaz.x) && Objects.equal(this.y, ahaz.y) && Objects.equal(this.z, ahaz.z) && Objects.equal(this.A, ahaz.A) && Objects.equal(this.B, ahaz.B) && Objects.equal(this.C, ahaz.C) && Objects.equal(this.D, ahaz.D) && Objects.equal(this.E, ahaz.E) && Objects.equal(this.F, ahaz.F) && Objects.equal(this.G, ahaz.G) && Objects.equal(this.H, ahaz.H) && Objects.equal(this.I, ahaz.I) && Objects.equal(this.J, ahaz.J) && Objects.equal(this.K, ahaz.K);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        ahbg ahbg = this.b;
        hashCode = (hashCode + (ahbg == null ? 0 : ahbg.hashCode())) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.e;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.h;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.i;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        aepk aepk = this.j;
        hashCode = (hashCode + (aepk == null ? 0 : aepk.hashCode())) * 31;
        list = this.k;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.m;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.n;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.o;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.p;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.q;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.r;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.s;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        afgd afgd = this.t;
        hashCode = (hashCode + (afgd == null ? 0 : afgd.hashCode())) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        map = this.v;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        list = this.w;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.x;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.y;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aepm aepm = this.z;
        hashCode = (hashCode + (aepm == null ? 0 : aepm.hashCode())) * 31;
        map = this.A;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.B;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.C;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str2 = this.D;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.E;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.F;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.G;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        map = this.H;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        list = this.I;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.J;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.K;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
