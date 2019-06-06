package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.Geofence;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afah.class)
/* renamed from: afag */
public class afag extends aezl implements aezk {
    @SerializedName("pack_id")
    public String a;
    @SerializedName("category_id")
    public String b;
    @SerializedName("icon_url")
    public String c;
    @SerializedName("icon_version")
    public Integer d;
    @SerializedName("url")
    public String e;
    @SerializedName("version")
    public Integer f;
    @SerializedName("active")
    public Boolean g;
    @SerializedName("type")
    public String h;
    @SerializedName("capabilities")
    public List<String> i;
    @SerializedName("target")
    public List<String> j;
    @SerializedName("super_category")
    public String k;
    @SerializedName("geofence")
    public Geofence l;
    @SerializedName("unlockable_preview_img_url")
    public String m;
    @SerializedName("title")
    public String n;
    @SerializedName("unlock_expiration_time_in_sec")
    public Long o;
    @SerializedName("contextual_pack_metadata")
    public afaj p;
    @SerializedName("unlockable_id")
    public String q;
    @SerializedName("is_expandable")
    public Boolean r;

    public final afax a() {
        return afax.a(this.h);
    }

    public final ahww b() {
        return ahww.a(this.k);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afag)) {
            afag afag = (afag) obj;
            return Objects.equal(this.a, afag.a) && Objects.equal(this.b, afag.b) && Objects.equal(this.c, afag.c) && Objects.equal(this.d, afag.d) && Objects.equal(this.e, afag.e) && Objects.equal(this.f, afag.f) && Objects.equal(this.g, afag.g) && Objects.equal(this.h, afag.h) && Objects.equal(this.i, afag.i) && Objects.equal(this.j, afag.j) && Objects.equal(this.k, afag.k) && Objects.equal(this.l, afag.l) && Objects.equal(this.m, afag.m) && Objects.equal(this.n, afag.n) && Objects.equal(this.o, afag.o) && Objects.equal(this.p, afag.p) && Objects.equal(this.q, afag.q) && Objects.equal(this.r, afag.r);
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
        Integer num = this.d;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.j;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.k;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Geofence geofence = this.l;
        hashCode = (hashCode + (geofence == null ? 0 : geofence.hashCode())) * 31;
        str2 = this.m;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.n;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.o;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        afaj afaj = this.p;
        hashCode = (hashCode + (afaj == null ? 0 : afaj.hashCode())) * 31;
        str2 = this.q;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.r;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
