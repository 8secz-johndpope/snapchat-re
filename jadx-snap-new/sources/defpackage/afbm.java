package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afbn.class)
/* renamed from: afbm */
public class afbm extends aezl implements aezk {
    @SerializedName("user_id")
    public String a;
    @SerializedName("username")
    public String b;
    @SerializedName("display_name")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbm)) {
            afbm afbm = (afbm) obj;
            return Objects.equal(this.a, afbm.a) && Objects.equal(this.b, afbm.b) && Objects.equal(this.c, afbm.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
