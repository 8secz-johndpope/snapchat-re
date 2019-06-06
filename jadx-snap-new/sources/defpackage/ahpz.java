package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahqa.class)
/* renamed from: ahpz */
public class ahpz extends aedh implements aezk {
    @SerializedName("out_alpha")
    public String a;
    @SerializedName("hashed_out_alpha")
    public String b;
    @SerializedName("out_beta")
    public String c;
    @SerializedName("iwek")
    public String d;
    @SerializedName("fidelius_version")
    public Integer e;
    @SerializedName("fidelius_client_init")
    public ahpx f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahpz)) {
            ahpz ahpz = (ahpz) obj;
            return super.equals(ahpz) && Objects.equal(this.a, ahpz.a) && Objects.equal(this.b, ahpz.b) && Objects.equal(this.c, ahpz.c) && Objects.equal(this.d, ahpz.d) && Objects.equal(this.e, ahpz.e) && Objects.equal(this.f, ahpz.f);
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
        Integer num = this.e;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ahpx ahpx = this.f;
        if (ahpx != null) {
            i = ahpx.hashCode();
        }
        return hashCode + i;
    }
}
