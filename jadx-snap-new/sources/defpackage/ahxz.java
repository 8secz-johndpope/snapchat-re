package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahya.class)
/* renamed from: ahxz */
public class ahxz extends aezl implements aezk {
    @SerializedName("sky")
    public aehv a;
    @SerializedName("portrait")
    public aevo b;
    @SerializedName("should_still_display_without_segmentation_match")
    public Boolean c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahxz)) {
            ahxz ahxz = (ahxz) obj;
            return Objects.equal(this.a, ahxz.a) && Objects.equal(this.b, ahxz.b) && Objects.equal(this.c, ahxz.c);
        }
    }

    public int hashCode() {
        aehv aehv = this.a;
        int i = 0;
        int hashCode = ((aehv == null ? 0 : aehv.hashCode()) + 527) * 31;
        aevo aevo = this.b;
        hashCode = (hashCode + (aevo == null ? 0 : aevo.hashCode())) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
