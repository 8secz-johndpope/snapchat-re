package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepy.class)
/* renamed from: aepx */
public class aepx extends aezl implements aezk {
    @SerializedName("lens_id")
    public String a;
    @SerializedName("lens_option_id")
    public String b;
    @SerializedName("lens_source")
    public String c;
    @SerializedName("lens_index_pos")
    public Long d;
    @SerializedName("lens_index_count")
    public Long e;
    @SerializedName("lens_bundle_url")
    public String f;
    @SerializedName("lens_device_score")
    public Long g;
    @SerializedName("lens_info")
    public String h;
    @SerializedName("face_count_back_camera")
    public Long i;
    @SerializedName("face_count_front_camera")
    public Long j;
    @SerializedName("is_geo")
    public Boolean k;
    @SerializedName("is_snappable")
    public Boolean l;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepx)) {
            aepx aepx = (aepx) obj;
            return Objects.equal(this.a, aepx.a) && Objects.equal(this.b, aepx.b) && Objects.equal(this.c, aepx.c) && Objects.equal(this.d, aepx.d) && Objects.equal(this.e, aepx.e) && Objects.equal(this.f, aepx.f) && Objects.equal(this.g, aepx.g) && Objects.equal(this.h, aepx.h) && Objects.equal(this.i, aepx.i) && Objects.equal(this.j, aepx.j) && Objects.equal(this.k, aepx.k) && Objects.equal(this.l, aepx.l);
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
        Long l = this.d;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        l = this.i;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.j;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.l;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
