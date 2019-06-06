package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahan.class)
/* renamed from: aham */
public class aham extends aezl implements aezk {
    @SerializedName("is_email_verified")
    public Boolean a = Boolean.FALSE;
    @SerializedName("email_pending_verification")
    public String b;
    @SerializedName("require_phone_password_confirmed")
    public Boolean c = Boolean.FALSE;
    @SerializedName("red_gear_duration_millis")
    public Long d = Long.valueOf(0);
    @SerializedName("suggested_friend_sync_version")
    public Long e;
    @SerializedName("suggested_friend_fetch_threshold_hours")
    public Integer f = Integer.valueOf(168);
    @SerializedName("is_add_nearby_enabled")
    public Boolean g = Boolean.TRUE;
    @SerializedName("is_high_accuracy_required_for_nearby")
    public Boolean h = Boolean.FALSE;
    @SerializedName("trophy_case")
    public ahew i;
    @SerializedName("last_checked_trophies_timestamp")
    public Long j;
    @SerializedName("user_segments_response")
    public ahfl k;
    @SerializedName("force_addressbook_full_sync")
    public Boolean l = Boolean.FALSE;
    @SerializedName("display_name_pop_up_count")
    public Integer m = Integer.valueOf(0);
    @SerializedName("is_snapchat_contact_permission_ios_v2_enabled")
    public Boolean n = Boolean.FALSE;
    @SerializedName("max_suggestions_in_quick_add")
    public Integer o;
    @SerializedName("max_suggestions_in_search_result")
    public Integer p;
    @SerializedName("is_user_searchability_prompt_enabled")
    public Boolean q;
    @SerializedName("max_suggestions_in_full_page")
    public Integer r;
    @SerializedName("was_snapchat_contact_permission_never_granted")
    public Boolean s;
    @SerializedName("should_show_quick_add_unit")
    public Boolean t;
    @SerializedName("is_contact_sync_enabled")
    public Boolean u;

    public aham() {
        Integer valueOf = Integer.valueOf(30);
        this.o = valueOf;
        this.p = valueOf;
        this.q = Boolean.FALSE;
        this.r = valueOf;
        this.s = Boolean.FALSE;
        this.t = Boolean.TRUE;
        this.u = Boolean.TRUE;
    }

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("is_email_verified is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("require_phone_password_confirmed is required to be initialized.");
        } else if (this.d == null) {
            throw new IllegalStateException("red_gear_duration_millis is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aham)) {
            aham aham = (aham) obj;
            return Objects.equal(this.a, aham.a) && Objects.equal(this.b, aham.b) && Objects.equal(this.c, aham.c) && Objects.equal(this.d, aham.d) && Objects.equal(this.e, aham.e) && Objects.equal(this.f, aham.f) && Objects.equal(this.g, aham.g) && Objects.equal(this.h, aham.h) && Objects.equal(this.i, aham.i) && Objects.equal(this.j, aham.j) && Objects.equal(this.k, aham.k) && Objects.equal(this.l, aham.l) && Objects.equal(this.m, aham.m) && Objects.equal(this.n, aham.n) && Objects.equal(this.o, aham.o) && Objects.equal(this.p, aham.p) && Objects.equal(this.q, aham.q) && Objects.equal(this.r, aham.r) && Objects.equal(this.s, aham.s) && Objects.equal(this.t, aham.t) && Objects.equal(this.u, aham.u);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.c;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool2 = this.g;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.h;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ahew ahew = this.i;
        hashCode = (hashCode + (ahew == null ? 0 : ahew.hashCode())) * 31;
        l = this.j;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        ahfl ahfl = this.k;
        hashCode = (hashCode + (ahfl == null ? 0 : ahfl.hashCode())) * 31;
        bool2 = this.l;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        num = this.m;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool2 = this.n;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        num = this.o;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.p;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool2 = this.q;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        num = this.r;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool2 = this.s;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.t;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.u;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }
}
