package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahss.class)
/* renamed from: ahsr */
public class ahsr extends aedh implements aezk {
    @SerializedName("attestation")
    public String a;
    @SerializedName("from_endpoint")
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahsr)) {
            ahsr ahsr = (ahsr) obj;
            return super.equals(ahsr) && Objects.equal(this.a, ahsr.a) && Objects.equal(this.b, ahsr.b);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
