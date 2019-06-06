package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahfy.class)
/* renamed from: ahfx */
public class ahfx extends aedh implements aezk {
    @SerializedName("pre_auth_token")
    public String a;
    @SerializedName("username_or_email")
    public String b;
    @SerializedName("phone_number")
    public String c;
    @SerializedName("country_code")
    public String d;
    @SerializedName("action")
    public String e;
    @SerializedName("method")
    public String f;
    @SerializedName("code")
    public String g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahfx)) {
            ahfx ahfx = (ahfx) obj;
            return super.equals(ahfx) && Objects.equal(this.a, ahfx.a) && Objects.equal(this.b, ahfx.b) && Objects.equal(this.c, ahfx.c) && Objects.equal(this.d, ahfx.d) && Objects.equal(this.e, ahfx.e) && Objects.equal(this.f, ahfx.f) && Objects.equal(this.g, ahfx.g);
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
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
