package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahdw.class)
/* renamed from: ahdv */
public class ahdv extends aedh implements aezk {
    @SerializedName("captcha_id")
    public String a;
    @SerializedName("captcha_solution")
    public String b;
    @SerializedName("deep_link_request")
    public agyi c;
    @SerializedName("attestation")
    public String d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahdv)) {
            ahdv ahdv = (ahdv) obj;
            return super.equals(ahdv) && Objects.equal(this.a, ahdv.a) && Objects.equal(this.b, ahdv.b) && Objects.equal(this.c, ahdv.c) && Objects.equal(this.d, ahdv.d);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        agyi agyi = this.c;
        hashCode = (hashCode + (agyi == null ? 0 : agyi.hashCode())) * 31;
        str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
