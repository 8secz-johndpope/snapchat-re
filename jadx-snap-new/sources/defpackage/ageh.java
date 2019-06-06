package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agei.class)
/* renamed from: ageh */
public class ageh extends aezl implements aezk {
    @SerializedName("user_id")
    public String a;
    @SerializedName("abilities")
    public List<agds> b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ageh)) {
            ageh ageh = (ageh) obj;
            return Objects.equal(this.a, ageh.a) && Objects.equal(this.b, ageh.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
