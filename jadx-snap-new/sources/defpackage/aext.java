package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aexu.class)
/* renamed from: aext */
public class aext extends aerr implements aezk {
    @SerializedName("email")
    public String A;
    @SerializedName("age")
    public String B;
    @SerializedName("birthday")
    public String F;
    @SerializedName("study_settings")
    public String G;
    @SerializedName("first_name")
    public String H;
    @SerializedName("last_name")
    public String I;
    @SerializedName("time_zone")
    public String J;
    @SerializedName("signup_event")
    public String K;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aext)) {
            aext aext = (aext) obj;
            return super.equals(aext) && Objects.equal(this.A, aext.A) && Objects.equal(this.B, aext.B) && Objects.equal(this.F, aext.F) && Objects.equal(this.G, aext.G) && Objects.equal(this.H, aext.H) && Objects.equal(this.I, aext.I) && Objects.equal(this.J, aext.J) && Objects.equal(this.K, aext.K);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.A;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.B;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.F;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.G;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.H;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.I;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.J;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.K;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
