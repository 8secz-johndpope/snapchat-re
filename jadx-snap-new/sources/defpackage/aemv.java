package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aemw.class)
/* renamed from: aemv */
public class aemv extends aedh implements aezk {
    @SerializedName("friends_request")
    public aemx a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemv)) {
            aemv aemv = (aemv) obj;
            return super.equals(aemv) && Objects.equal(this.a, aemv.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        aemx aemx = this.a;
        return hashCode + (aemx == null ? 0 : aemx.hashCode());
    }
}
