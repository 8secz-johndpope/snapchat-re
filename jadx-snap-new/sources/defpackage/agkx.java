package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agky.class)
/* renamed from: agkx */
public class agkx extends aezl implements aezk {
    @SerializedName("name")
    public String b;
    @SerializedName("reloadAppOnChange")
    public Boolean c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agkx)) {
            agkx agkx = (agkx) obj;
            return Objects.equal(this.b, agkx.b) && Objects.equal(this.c, agkx.c);
        }
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
