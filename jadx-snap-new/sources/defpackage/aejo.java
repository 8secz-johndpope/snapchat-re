package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aejp.class)
/* renamed from: aejo */
public class aejo extends aezl implements aezk {
    @SerializedName("get_channels")
    public String a;
    @SerializedName("get_edition")
    public String b;
    @SerializedName("video_catalog")
    public String c;
    @SerializedName("ad_video_catalog")
    public String d;
    @SerializedName("validation_endpoint")
    public String e;
    @SerializedName("resource_parameter_name")
    public String f;
    @SerializedName("resource_parameter_value")
    public String g;
    @SerializedName("compatibility")
    public String h;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aejo)) {
            aejo aejo = (aejo) obj;
            return Objects.equal(this.a, aejo.a) && Objects.equal(this.b, aejo.b) && Objects.equal(this.c, aejo.c) && Objects.equal(this.d, aejo.d) && Objects.equal(this.e, aejo.e) && Objects.equal(this.f, aejo.f) && Objects.equal(this.g, aejo.g) && Objects.equal(this.h, aejo.h);
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
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
