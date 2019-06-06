package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aetn.class)
/* renamed from: aetm */
public class aetm extends aezl implements aezk {
    @SerializedName("username")
    public String a;
    @SerializedName("user_id")
    public String b;
    @SerializedName("display_name")
    public String c;
    @SerializedName("stories")
    public List<afbs> d;
    @SerializedName("collab_stories")
    public List<aehl> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aetm)) {
            aetm aetm = (aetm) obj;
            return Objects.equal(this.a, aetm.a) && Objects.equal(this.b, aetm.b) && Objects.equal(this.c, aetm.c) && Objects.equal(this.d, aetm.d) && Objects.equal(this.e, aetm.e);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
