package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeid.class)
/* renamed from: aeic */
public class aeic extends aezl implements aezk {
    @SerializedName("event_name")
    public String a;
    @SerializedName("timestamp")
    public Long b;
    @SerializedName("originating_recipient_id")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeic)) {
            aeic aeic = (aeic) obj;
            return Objects.equal(this.a, aeic.a) && Objects.equal(this.b, aeic.b) && Objects.equal(this.c, aeic.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
