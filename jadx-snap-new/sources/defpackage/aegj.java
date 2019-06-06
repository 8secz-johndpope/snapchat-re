package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aegk.class)
/* renamed from: aegj */
public class aegj extends aeie implements aezk {
    @SerializedName("body")
    public aeso a;
    @SerializedName("chat_message_id")
    public String b;
    @SerializedName("saved_state")
    public Map<String, aewk> c;
    @SerializedName("preservations")
    public Map<String, Boolean> d;
    @SerializedName("last_released_seq_num")
    public Map<String, Long> e;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aegj)) {
            aegj aegj = (aegj) obj;
            return super.equals(aegj) && Objects.equal(this.a, aegj.a) && Objects.equal(this.b, aegj.b) && Objects.equal(this.c, aegj.c) && Objects.equal(this.d, aegj.d) && Objects.equal(this.e, aegj.e);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        aeso aeso = this.a;
        int i = 0;
        hashCode = (hashCode + (aeso == null ? 0 : aeso.hashCode())) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.c;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.d;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.e;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
