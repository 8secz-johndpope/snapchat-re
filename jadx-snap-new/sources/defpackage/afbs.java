package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afbt.class)
/* renamed from: afbs */
public class afbs extends aeug implements aezk {
    @SerializedName("story_notes")
    public List<afbu> h;
    @SerializedName("friend_story_notes")
    public List<afbu> i;
    @SerializedName("other_story_notes")
    public List<afbu> j;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbs)) {
            afbs afbs = (afbs) obj;
            return super.equals(afbs) && Objects.equal(this.h, afbs.h) && Objects.equal(this.i, afbs.i) && Objects.equal(this.j, afbs.j);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        List list = this.h;
        int i = 0;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.j;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
