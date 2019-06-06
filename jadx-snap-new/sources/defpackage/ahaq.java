package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahar.class)
/* renamed from: ahaq */
public class ahaq extends aedh implements aezk {
    @SerializedName("invited_recipients")
    public List<aeoq> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahaq)) {
            ahaq ahaq = (ahaq) obj;
            return super.equals(ahaq) && Objects.equal(this.a, ahaq.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.a;
        return hashCode + (list == null ? 0 : list.hashCode());
    }
}
