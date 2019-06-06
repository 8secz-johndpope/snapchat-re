package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aike.class)
/* renamed from: aikd */
public class aikd extends aedh implements aezk {
    @SerializedName("filter_id")
    public String a;
    @SerializedName("time_zone")
    public String b;
    @SerializedName("unlock_mechanism")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aikd)) {
            aikd aikd = (aikd) obj;
            return super.equals(aikd) && Objects.equal(this.a, aikd.a) && Objects.equal(this.b, aikd.b) && Objects.equal(this.c, aikd.c);
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
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
