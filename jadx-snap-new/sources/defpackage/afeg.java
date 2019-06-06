package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afeh.class)
/* renamed from: afeg */
public class afeg extends aedh implements aezk {
    @SerializedName("settings")
    public aeko a;
    @SerializedName("updated_settings_v2")
    public List<aekm> b;
    @SerializedName("device_id")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afeg)) {
            afeg afeg = (afeg) obj;
            return super.equals(afeg) && Objects.equal(this.a, afeg.a) && Objects.equal(this.b, afeg.b) && Objects.equal(this.c, afeg.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        aeko aeko = this.a;
        int i = 0;
        hashCode = (hashCode + (aeko == null ? 0 : aeko.hashCode())) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
