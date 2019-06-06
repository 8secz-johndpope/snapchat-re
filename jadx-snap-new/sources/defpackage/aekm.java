package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aekn.class)
/* renamed from: aekm */
public class aekm extends aezl implements aezk {
    @SerializedName("setting_name")
    public String a;
    @SerializedName("setting_value")
    public String b;
    @SerializedName("latest_version")
    public Long c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aekm)) {
            aekm aekm = (aekm) obj;
            return Objects.equal(this.a, aekm.a) && Objects.equal(this.b, aekm.b) && Objects.equal(this.c, aekm.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
