package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahza.class)
/* renamed from: ahyz */
public class ahyz extends aezl implements aezk {
    @SerializedName("scheduled_lenses_info")
    public aibe a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahyz)) {
            return false;
        }
        return Objects.equal(this.a, ((ahyz) obj).a);
    }

    public int hashCode() {
        aibe aibe = this.a;
        return (aibe == null ? 0 : aibe.hashCode()) + 527;
    }
}
