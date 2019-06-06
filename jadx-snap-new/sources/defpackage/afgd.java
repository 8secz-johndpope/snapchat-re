package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afge.class)
/* renamed from: afgd */
public class afgd extends aezl implements aezk {
    @SerializedName("mac")
    public String a;
    @SerializedName("token")
    public String b;
    @SerializedName("scopeId")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afgd)) {
            afgd afgd = (afgd) obj;
            return Objects.equal(this.a, afgd.a) && Objects.equal(this.b, afgd.b) && Objects.equal(this.c, afgd.c);
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
