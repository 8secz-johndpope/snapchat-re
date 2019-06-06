package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aewn.class)
/* renamed from: aewm */
public class aewm extends aedh implements aezk {
    @SerializedName("time_zone")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aewm)) {
            aewm aewm = (aewm) obj;
            return super.equals(aewm) && Objects.equal(this.a, aewm.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
