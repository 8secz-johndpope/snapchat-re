package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aews.class)
/* renamed from: aewr */
public class aewr extends aezl implements aezk {
    @SerializedName("snap_id")
    public String a;
    @SerializedName("media_type")
    public String b;
    @SerializedName("dynamic_story_id")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aewr)) {
            aewr aewr = (aewr) obj;
            return Objects.equal(this.a, aewr.a) && Objects.equal(this.b, aewr.b) && Objects.equal(this.c, aewr.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
