package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aemo.class)
/* renamed from: aemn */
public class aemn extends aezl implements aezk {
    @SerializedName("story")
    public afbi a;
    @SerializedName("viewed")
    public Boolean b;
    @SerializedName("flushable_story_id")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemn)) {
            aemn aemn = (aemn) obj;
            return Objects.equal(this.a, aemn.a) && Objects.equal(this.b, aemn.b) && Objects.equal(this.c, aemn.c);
        }
    }

    public int hashCode() {
        afbi afbi = this.a;
        int i = 0;
        int hashCode = ((afbi == null ? 0 : afbi.hashCode()) + 527) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
