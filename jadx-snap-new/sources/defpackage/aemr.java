package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aems.class)
/* renamed from: aemr */
public class aemr extends aezl implements aezk {
    @SerializedName("category_name")
    public String a;
    @SerializedName("expiration_time")
    public Long b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemr)) {
            aemr aemr = (aemr) obj;
            return Objects.equal(this.a, aemr.a) && Objects.equal(this.b, aemr.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
