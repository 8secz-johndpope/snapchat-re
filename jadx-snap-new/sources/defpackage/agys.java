package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agyt.class)
/* renamed from: agys */
public class agys extends aedh implements aezk {
    @SerializedName("action")
    public String a;
    @SerializedName("install_referrer")
    public String b;
    @SerializedName("advertising_id")
    public String c;
    @SerializedName("advertising_id_type")
    public String d;
    @SerializedName("enabled_ad_tracking")
    public Boolean e;
    @SerializedName("apple_search_dictionary")
    public String f;
    @SerializedName("id_fetch_fail_type")
    public String g;
    @SerializedName("id_fetch_fail_reason")
    public String h;
    @SerializedName("channel_id")
    public String i;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agys)) {
            agys agys = (agys) obj;
            return super.equals(agys) && Objects.equal(this.a, agys.a) && Objects.equal(this.b, agys.b) && Objects.equal(this.c, agys.c) && Objects.equal(this.d, agys.d) && Objects.equal(this.e, agys.e) && Objects.equal(this.f, agys.f) && Objects.equal(this.g, agys.g) && Objects.equal(this.h, agys.h) && Objects.equal(this.i, agys.i);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
