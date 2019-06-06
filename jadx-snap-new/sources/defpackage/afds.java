package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afdt.class)
/* renamed from: afds */
public class afds extends aezl implements aezk {
    @SerializedName("ad_serve_request_id")
    public String a;
    @SerializedName("raw_ad_data")
    public String b;
    @SerializedName("skip_track")
    public Boolean c;
    @SerializedName("encrypted_sponsored_unlockable_targeting_info_data")
    public String d;
    @SerializedName("ad_track_url")
    public String e;
    @SerializedName("ranking_id")
    public String f;
    @SerializedName("ranking_data")
    public String g;
    @SerializedName("encrypted_user_track_data")
    public String h;
    @SerializedName("json_track_url")
    public String i;
    @SerializedName("proto_track_url")
    public String j;
    @SerializedName("batch_track_url")
    public String k;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afds)) {
            afds afds = (afds) obj;
            return Objects.equal(this.a, afds.a) && Objects.equal(this.b, afds.b) && Objects.equal(this.c, afds.c) && Objects.equal(this.d, afds.d) && Objects.equal(this.e, afds.e) && Objects.equal(this.f, afds.f) && Objects.equal(this.g, afds.g) && Objects.equal(this.h, afds.h) && Objects.equal(this.i, afds.i) && Objects.equal(this.j, afds.j) && Objects.equal(this.k, afds.k);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.k;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
