package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahys.class)
/* renamed from: ahyr */
public class ahyr extends aezl implements aezk {
    @SerializedName("group_name")
    public String a;
    @SerializedName("carousel_score")
    public Float b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahyr)) {
            ahyr ahyr = (ahyr) obj;
            return Objects.equal(this.a, ahyr.a) && Objects.equal(this.b, ahyr.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Float f = this.b;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode + i;
    }
}
