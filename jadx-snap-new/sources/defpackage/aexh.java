package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aexi.class)
/* renamed from: aexh */
public class aexh extends aezl implements aezk {
    @SerializedName("hostname")
    public String a;
    @SerializedName("port")
    public Integer b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aexh)) {
            aexh aexh = (aexh) obj;
            return Objects.equal(this.a, aexh.a) && Objects.equal(this.b, aexh.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
