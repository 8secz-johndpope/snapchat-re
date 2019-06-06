package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afhg.class)
/* renamed from: afhf */
public class afhf extends aezl implements aezk {
    @SerializedName("ad_products")
    public List<afhd> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof afhf)) {
            return false;
        }
        return Objects.equal(this.a, ((afhf) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        return (list == null ? 0 : list.hashCode()) + 527;
    }
}
