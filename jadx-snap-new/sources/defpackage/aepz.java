package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeqa.class)
/* renamed from: aepz */
public class aepz extends aezl implements aezk {
    @SerializedName("ad_serve_request_id")
    public String a;
    @SerializedName("raw_ad_data")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepz)) {
            aepz aepz = (aepz) obj;
            return Objects.equal(this.a, aepz.a) && Objects.equal(this.b, aepz.b);
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
