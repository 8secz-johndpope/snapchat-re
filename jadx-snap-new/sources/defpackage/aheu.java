package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahev.class)
/* renamed from: aheu */
public class aheu extends aezl implements aezk {
    @SerializedName("label")
    @Deprecated
    public String a;
    @SerializedName("unicode")
    public String b;
    @SerializedName("stages")
    public List<ahey> c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aheu)) {
            aheu aheu = (aheu) obj;
            return Objects.equal(this.a, aheu.a) && Objects.equal(this.b, aheu.b) && Objects.equal(this.c, aheu.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
