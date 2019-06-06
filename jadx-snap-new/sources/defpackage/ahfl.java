package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahfm.class)
/* renamed from: ahfl */
public class ahfl extends aezl implements aezk {
    @SerializedName("user_segments")
    public List<String> a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof ahfl)) {
            return false;
        }
        return Objects.equal(this.a, ((ahfl) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        return (list == null ? 0 : list.hashCode()) + 527;
    }
}
