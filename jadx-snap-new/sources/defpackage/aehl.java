package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aehm.class)
/* renamed from: aehl */
public class aehl extends afbs implements aezk {
    @SerializedName("collaborator")
    public afbm a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aehl)) {
            aehl aehl = (aehl) obj;
            return super.equals(aehl) && Objects.equal(this.a, aehl.a);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        afbm afbm = this.a;
        return hashCode + (afbm == null ? 0 : afbm.hashCode());
    }
}
