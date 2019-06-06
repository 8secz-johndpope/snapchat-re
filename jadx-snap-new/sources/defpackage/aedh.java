package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aedi.class)
/* renamed from: aedh */
public class aedh extends aezl implements aezk {
    @SerializedName("timestamp")
    public String C;
    @SerializedName("req_token")
    public String D;
    @SerializedName("username")
    public String E;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aedh)) {
            aedh aedh = (aedh) obj;
            return Objects.equal(this.C, aedh.C) && Objects.equal(this.D, aedh.D) && Objects.equal(this.E, aedh.E);
        }
    }

    public int hashCode() {
        String str = this.C;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.D;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.E;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
