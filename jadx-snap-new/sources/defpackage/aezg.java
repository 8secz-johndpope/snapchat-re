package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aezh.class)
/* renamed from: aezg */
public class aezg extends aedh implements aezk {
    @SerializedName("image")
    public String a;
    @SerializedName("user_id")
    public String b;
    @SerializedName("username_snapcode")
    public String c;
    @SerializedName("type")
    public String d;
    @SerializedName("bitmoji")
    public String e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aezg)) {
            aezg aezg = (aezg) obj;
            return super.equals(aezg) && Objects.equal(this.a, aezg.a) && Objects.equal(this.b, aezg.b) && Objects.equal(this.c, aezg.c) && Objects.equal(this.d, aezg.d) && Objects.equal(this.e, aezg.e);
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
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
