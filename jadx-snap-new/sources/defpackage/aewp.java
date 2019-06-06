package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aewq.class)
/* renamed from: aewp */
public class aewp extends aezl implements aezk {
    @SerializedName("dynamic_story_id")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aewp)) {
            return false;
        }
        return Objects.equal(this.a, ((aewp) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }
}
