package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agdb.class)
/* renamed from: agda */
public class agda extends aezl implements aezk {
    @SerializedName("mob_story_id")
    public String a;
    @SerializedName("display_name")
    public String b;
    @SerializedName("stories")
    public List<afbs> c;
    @SerializedName("mischief_id")
    public String d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agda)) {
            agda agda = (agda) obj;
            return Objects.equal(this.a, agda.a) && Objects.equal(this.b, agda.b) && Objects.equal(this.c, agda.c) && Objects.equal(this.d, agda.d);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
