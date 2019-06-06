package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agbb.class)
/* renamed from: agba */
public class agba extends aedh implements aezk {
    @SerializedName("previewed_username")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agba)) {
            agba agba = (agba) obj;
            return super.equals(agba) && Objects.equal(this.a, agba.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }
}
