package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeil.class)
/* renamed from: aeik */
public class aeik extends aezl implements aezk {
    @SerializedName("username")
    public String a;
    @SerializedName("releases")
    public Map<String, Long> b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeik)) {
            aeik aeik = (aeik) obj;
            return Objects.equal(this.a, aeik.a) && Objects.equal(this.b, aeik.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Map map = this.b;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
