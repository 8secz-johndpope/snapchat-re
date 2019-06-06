package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeun.class)
/* renamed from: aeum */
public class aeum extends aesm implements aezk {
    @SerializedName("ping_id")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeum)) {
            aeum aeum = (aeum) obj;
            return super.equals(aeum) && Objects.equal(this.a, aeum.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
