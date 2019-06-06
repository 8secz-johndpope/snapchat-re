package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aglg.class)
/* renamed from: aglf */
public class aglf extends agkx implements aezk {
    @SerializedName("value")
    public Long a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aglf)) {
            aglf aglf = (aglf) obj;
            return super.equals(aglf) && Objects.equal(this.a, aglf.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Long l = this.a;
        return hashCode + (l == null ? 0 : l.hashCode());
    }
}
