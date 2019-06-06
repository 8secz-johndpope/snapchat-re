package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agcr.class)
/* renamed from: agcq */
public class agcq extends aedh implements aezk {
    @SerializedName("id")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agcq)) {
            agcq agcq = (agcq) obj;
            return super.equals(agcq) && Objects.equal(this.a, agcq.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
