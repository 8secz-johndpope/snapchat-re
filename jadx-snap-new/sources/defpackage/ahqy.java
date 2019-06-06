package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahqz.class)
/* renamed from: ahqy */
public class ahqy extends aezl implements aezk {
    @SerializedName("out_beta")
    public String a;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("out_beta is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahqy)) {
            return false;
        }
        return Objects.equal(this.a, ((ahqy) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }
}
