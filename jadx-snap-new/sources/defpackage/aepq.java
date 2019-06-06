package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepr.class)
/* renamed from: aepq */
public class aepq extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("name")
    public String b;
    @SerializedName("activator")
    public String c;
    @SerializedName("config")
    public String d;
    @SerializedName("config_checksum")
    public String e;
    @SerializedName("additional_carousel_categories")
    public List<String> f;
    @SerializedName("additional_carousel_lenses_limit")
    @Deprecated
    public Integer g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepq)) {
            aepq aepq = (aepq) obj;
            return Objects.equal(this.a, aepq.a) && Objects.equal(this.b, aepq.b) && Objects.equal(this.c, aepq.c) && Objects.equal(this.d, aepq.d) && Objects.equal(this.e, aepq.e) && Objects.equal(this.f, aepq.f) && Objects.equal(this.g, aepq.g);
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
        List list = this.f;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.g;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
