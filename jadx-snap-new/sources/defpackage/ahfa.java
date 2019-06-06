package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahfb.class)
/* renamed from: ahfa */
public class ahfa extends aedh implements aezk {
    @SerializedName("action")
    public String a;
    @SerializedName("pre_auth_token")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahfa)) {
            ahfa ahfa = (ahfa) obj;
            return super.equals(ahfa) && Objects.equal(this.a, ahfa.a) && Objects.equal(this.b, ahfa.b);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
