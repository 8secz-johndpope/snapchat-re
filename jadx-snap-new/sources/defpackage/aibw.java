package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aibx.class)
/* renamed from: aibw */
public class aibw extends aezl implements aezk {
    @SerializedName("message")
    public String a;
    @SerializedName("cool_down_period_minutes")
    public Integer b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aibw)) {
            aibw aibw = (aibw) obj;
            return Objects.equal(this.a, aibw.a) && Objects.equal(this.b, aibw.b);
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
