package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahsu.class)
/* renamed from: ahst */
public class ahst extends aezl implements aezk {
    @SerializedName("capricorn_number")
    public Integer a;
    @SerializedName("capricorn_endpoints")
    public List<String> b;
    @SerializedName("in_app_report_message_id")
    public String c;
    @SerializedName("in_app_report_message")
    public String d;
    @SerializedName("capricorn_string")
    public String e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahst)) {
            ahst ahst = (ahst) obj;
            return Objects.equal(this.a, ahst.a) && Objects.equal(this.b, ahst.b) && Objects.equal(this.c, ahst.c) && Objects.equal(this.d, ahst.d) && Objects.equal(this.e, ahst.e);
        }
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
