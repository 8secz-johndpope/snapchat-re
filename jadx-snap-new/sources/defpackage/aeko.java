package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aekp.class)
/* renamed from: aeko */
public class aeko extends aezl implements aezk {
    @SerializedName("smart_filters")
    public Boolean a;
    @SerializedName("visual_filters")
    public Boolean b;
    @SerializedName("front_facing_flash")
    public Boolean c;
    @SerializedName("replay_snaps")
    public Boolean d;
    @SerializedName("travel_mode")
    public Boolean e;
    @SerializedName("pay_replay_snaps")
    public Boolean f;
    @SerializedName("lens_store_available")
    public Boolean g;
    @SerializedName("barcode_enabled")
    public Boolean h;
    @SerializedName("qrcode_enabled")
    public Boolean i;
    @SerializedName("looksery_face_trackingv2_enabled")
    public Boolean j;
    @SerializedName("looksery_face_trackingv2_initialization_enabled")
    public Boolean k;
    @SerializedName("is_prefetch_for_store_lenses_enabled")
    public Boolean l;
    @SerializedName("is_lenses_tooltip_enabled")
    public Boolean m;
    @SerializedName("is_birthday_party_enabled")
    public Boolean n;
    @SerializedName("gallery_enabled")
    public Boolean o;
    @SerializedName("gallery_invited")
    public Boolean p;
    @SerializedName("is_advertiser")
    public Boolean q;
    @SerializedName("is_snap_ads_portal_contributor")
    public Boolean r;
    @SerializedName("show_travel_mode_at_top_in_settings")
    public Boolean s;
    @SerializedName("gallery_is_blocked")
    public Boolean t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeko)) {
            aeko aeko = (aeko) obj;
            return Objects.equal(this.a, aeko.a) && Objects.equal(this.b, aeko.b) && Objects.equal(this.c, aeko.c) && Objects.equal(this.d, aeko.d) && Objects.equal(this.e, aeko.e) && Objects.equal(this.f, aeko.f) && Objects.equal(this.g, aeko.g) && Objects.equal(this.h, aeko.h) && Objects.equal(this.i, aeko.i) && Objects.equal(this.j, aeko.j) && Objects.equal(this.k, aeko.k) && Objects.equal(this.l, aeko.l) && Objects.equal(this.m, aeko.m) && Objects.equal(this.n, aeko.n) && Objects.equal(this.o, aeko.o) && Objects.equal(this.p, aeko.p) && Objects.equal(this.q, aeko.q) && Objects.equal(this.r, aeko.r) && Objects.equal(this.s, aeko.s) && Objects.equal(this.t, aeko.t);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        Boolean bool2 = this.b;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.c;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.d;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.e;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.f;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.g;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.h;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.i;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.j;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.k;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.l;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.m;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.n;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.o;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.p;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.q;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.r;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.s;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.t;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }
}
