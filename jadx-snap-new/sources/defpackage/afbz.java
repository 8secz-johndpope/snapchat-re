package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afca.class)
/* renamed from: afbz */
public class afbz extends aezl implements aezk {
    @SerializedName("story_id")
    public String a;
    @SerializedName("media_type")
    public String b;
    @SerializedName("is_user_tagged")
    public Boolean c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbz)) {
            afbz afbz = (afbz) obj;
            return Objects.equal(this.a, afbz.a) && Objects.equal(this.b, afbz.b) && Objects.equal(this.c, afbz.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
