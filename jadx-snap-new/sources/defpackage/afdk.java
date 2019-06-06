package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afdl.class)
/* renamed from: afdk */
public class afdk extends aezl implements aezk {
    @SerializedName("start")
    public Integer a;
    @SerializedName("end")
    public Integer b;
    @SerializedName("attribute")
    public aegl c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afdk)) {
            afdk afdk = (afdk) obj;
            return Objects.equal(this.a, afdk.a) && Objects.equal(this.b, afdk.b) && Objects.equal(this.c, afdk.c);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        Integer num2 = this.b;
        hashCode = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        aegl aegl = this.c;
        if (aegl != null) {
            i = aegl.hashCode();
        }
        return hashCode + i;
    }
}
