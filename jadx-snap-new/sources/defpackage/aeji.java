package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aejj.class)
/* renamed from: aeji */
public class aeji extends aedh implements aezk {
    @SerializedName("dtoken1i")
    public String a;
    @SerializedName("dsig")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeji)) {
            aeji aeji = (aeji) obj;
            return super.equals(aeji) && Objects.equal(this.a, aeji.a) && Objects.equal(this.b, aeji.b);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
