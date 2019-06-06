package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afck.class)
/* renamed from: afcj */
public class afcj extends aezl implements aezk {
    @SerializedName("unviewed")
    public afch a;
    @SerializedName("viewed")
    public afch b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afcj)) {
            afcj afcj = (afcj) obj;
            return Objects.equal(this.a, afcj.a) && Objects.equal(this.b, afcj.b);
        }
    }

    public int hashCode() {
        afch afch = this.a;
        int i = 0;
        int hashCode = ((afch == null ? 0 : afch.hashCode()) + 527) * 31;
        afch afch2 = this.b;
        if (afch2 != null) {
            i = afch2.hashCode();
        }
        return hashCode + i;
    }
}
