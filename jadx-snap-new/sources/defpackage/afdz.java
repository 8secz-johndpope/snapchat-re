package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afea.class)
/* renamed from: afdz */
public class afdz extends aezl implements aezk {
    @SerializedName("start_date_time")
    public String a;
    @SerializedName("end_date_time")
    public String b;
    @SerializedName("start_millis_since_epoch")
    public Long c;
    @SerializedName("end_millis_since_epoch")
    public Long d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afdz)) {
            afdz afdz = (afdz) obj;
            return Objects.equal(this.a, afdz.a) && Objects.equal(this.b, afdz.b) && Objects.equal(this.c, afdz.c) && Objects.equal(this.d, afdz.d);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
