package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agfi.class)
/* renamed from: agfh */
public class agfh extends aezl implements aezk {
    @SerializedName("wifi_count")
    public Integer a;
    @SerializedName("wwan_count")
    public Integer b;

    public agfh() {
        Integer valueOf = Integer.valueOf(0);
        this.a = valueOf;
        this.b = valueOf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agfh)) {
            agfh agfh = (agfh) obj;
            return Objects.equal(this.a, agfh.a) && Objects.equal(this.b, agfh.b);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }
}
