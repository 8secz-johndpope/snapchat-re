package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahyf.class)
/* renamed from: ahye */
public class ahye extends aezl implements aezk {
    @SerializedName("url")
    public String a;
    @SerializedName("is_looping")
    public Boolean b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahye)) {
            ahye ahye = (ahye) obj;
            return Objects.equal(this.a, ahye.a) && Objects.equal(this.b, ahye.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
