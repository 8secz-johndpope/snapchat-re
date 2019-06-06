package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agez.class)
/* renamed from: agey */
public class agey extends aezl implements aezk {
    @SerializedName("item")
    public agew a;
    @SerializedName("score")
    public Float b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agey)) {
            agey agey = (agey) obj;
            return Objects.equal(this.a, agey.a) && Objects.equal(this.b, agey.b);
        }
    }

    public int hashCode() {
        agew agew = this.a;
        int i = 0;
        int hashCode = ((agew == null ? 0 : agew.hashCode()) + 527) * 31;
        Float f = this.b;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }
}
