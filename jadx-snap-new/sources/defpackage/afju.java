package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afjv.class)
/* renamed from: afju */
public class afju extends aezl implements aezk {
    @SerializedName("filter_opportunity_request_id")
    public String a;
    @SerializedName("lens_opportunity_request_id")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afju)) {
            afju afju = (afju) obj;
            return Objects.equal(this.a, afju.a) && Objects.equal(this.b, afju.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
