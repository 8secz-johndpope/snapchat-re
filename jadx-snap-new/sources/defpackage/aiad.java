package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aiae.class)
/* renamed from: aiad */
public class aiad extends aedh implements aezk {
    @SerializedName("purpose")
    public String a;
    @SerializedName("time_zone")
    public String b;
    @SerializedName("screen_width_in")
    public Float c;
    @SerializedName("screen_height_in")
    public Float d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aiad)) {
            aiad aiad = (aiad) obj;
            return super.equals(aiad) && Objects.equal(this.a, aiad.a) && Objects.equal(this.b, aiad.b) && Objects.equal(this.c, aiad.c) && Objects.equal(this.d, aiad.d);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.c;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.d;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }
}
