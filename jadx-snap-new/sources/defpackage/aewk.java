package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aewl.class)
/* renamed from: aewk */
public class aewk extends aezl implements aezk {
    @SerializedName("saved")
    public Boolean a;
    @SerializedName("version")
    public Integer b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aewk)) {
            aewk aewk = (aewk) obj;
            return Objects.equal(this.a, aewk.a) && Objects.equal(this.b, aewk.b);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
