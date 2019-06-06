package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aefm.class)
/* renamed from: aefi */
public class aefi extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("participants")
    public List<String> b;
    @SerializedName("last_snap")
    public aenb c;
    @SerializedName("last_chat_actions")
    public aepi d;
    @SerializedName("conversation_interaction_event")
    public aeic e;
    @SerializedName("last_cash_transaction")
    public aefg f;
    @SerializedName("last_interaction_ts")
    public Long g;
    @SerializedName("pending_chats_for")
    public List<String> h;
    @SerializedName("pending_received_snaps")
    public List<aenb> i;
    @SerializedName("conversation_messages")
    public aeft j;
    @SerializedName("iter_token")
    public String k;
    @SerializedName("favorite_stickers")
    public List<aekk> l;
    @SerializedName("conversation_state")
    public aeii m;
    @SerializedName("conversation_message_updates")
    public aefr n;
    @SerializedName("is_delta_fetch")
    public Boolean o;
    @SerializedName("notification_status")
    public Boolean p;
    @SerializedName("conversation_snap_updates")
    public aefx q;
    @SerializedName("username_to_user_id")
    public Map<String, String> r;
    @SerializedName("last_clear_timestamp")
    public Long s;
    @SerializedName("is_snap_delta_fetch")
    public Boolean t;
    @SerializedName("message_retention_in_minutes")
    public Long u;
    @SerializedName("chat_release_data_map")
    public Map<String, List<aegp>> v;
    @SerializedName("is_cognac_notification_muted")
    public Boolean w;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aefi)) {
            aefi aefi = (aefi) obj;
            return Objects.equal(this.a, aefi.a) && Objects.equal(this.b, aefi.b) && Objects.equal(this.c, aefi.c) && Objects.equal(this.d, aefi.d) && Objects.equal(this.e, aefi.e) && Objects.equal(this.f, aefi.f) && Objects.equal(this.g, aefi.g) && Objects.equal(this.h, aefi.h) && Objects.equal(this.i, aefi.i) && Objects.equal(this.j, aefi.j) && Objects.equal(this.k, aefi.k) && Objects.equal(this.l, aefi.l) && Objects.equal(this.m, aefi.m) && Objects.equal(this.n, aefi.n) && Objects.equal(this.o, aefi.o) && Objects.equal(this.p, aefi.p) && Objects.equal(this.q, aefi.q) && Objects.equal(this.r, aefi.r) && Objects.equal(this.s, aefi.s) && Objects.equal(this.t, aefi.t) && Objects.equal(this.u, aefi.u) && Objects.equal(this.v, aefi.v) && Objects.equal(this.w, aefi.w);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aenb aenb = this.c;
        hashCode = (hashCode + (aenb == null ? 0 : aenb.hashCode())) * 31;
        aepi aepi = this.d;
        hashCode = (hashCode + (aepi == null ? 0 : aepi.hashCode())) * 31;
        aeic aeic = this.e;
        hashCode = (hashCode + (aeic == null ? 0 : aeic.hashCode())) * 31;
        aefg aefg = this.f;
        hashCode = (hashCode + (aefg == null ? 0 : aefg.hashCode())) * 31;
        Long l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aeft aeft = this.j;
        hashCode = (hashCode + (aeft == null ? 0 : aeft.hashCode())) * 31;
        String str2 = this.k;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.l;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aeii aeii = this.m;
        hashCode = (hashCode + (aeii == null ? 0 : aeii.hashCode())) * 31;
        aefr aefr = this.n;
        hashCode = (hashCode + (aefr == null ? 0 : aefr.hashCode())) * 31;
        Boolean bool = this.o;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aefx aefx = this.q;
        hashCode = (hashCode + (aefx == null ? 0 : aefx.hashCode())) * 31;
        Map map = this.r;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        l = this.s;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        bool = this.t;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        l = this.u;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        map = this.v;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.w;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
