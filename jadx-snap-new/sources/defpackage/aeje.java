package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aejf.class)
/* renamed from: aeje */
public class aeje extends aedh implements aezk {
    @SerializedName("story_id")
    public String a;
    @SerializedName("group_id")
    public String b;
    @SerializedName("archiveOnly")
    public Boolean c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeje)) {
            aeje aeje = (aeje) obj;
            return super.equals(aeje) && Objects.equal(this.a, aeje.a) && Objects.equal(this.b, aeje.b) && Objects.equal(this.c, aeje.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
