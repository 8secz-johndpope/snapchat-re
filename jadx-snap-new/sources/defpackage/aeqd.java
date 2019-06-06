package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeqe.class)
/* renamed from: aeqd */
public class aeqd extends aezl implements aezk {
    @SerializedName("start_color")
    public Integer a;
    @SerializedName("end_color")
    public Integer b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeqd)) {
            aeqd aeqd = (aeqd) obj;
            return Objects.equal(this.a, aeqd.a) && Objects.equal(this.b, aeqd.b);
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
