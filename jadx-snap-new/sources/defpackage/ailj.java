package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.shared.android.SojuJsonAdapter;

@SojuJsonAdapter(a = ailk.class)
@JsonAdapter(aila.class)
/* renamed from: ailj */
public class ailj extends aikz implements aiky {
    @SerializedName("time_stamp")
    public Long a;
    @SerializedName("content")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ailj)) {
            ailj ailj = (ailj) obj;
            return Objects.equal(this.a, ailj.a) && Objects.equal(this.b, ailj.b);
        }
    }

    public int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) + 527) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
