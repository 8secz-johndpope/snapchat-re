package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afco.class)
/* renamed from: afcn */
public class afcn extends aezl implements aezk {
    @SerializedName("x")
    public String a;
    @SerializedName("y")
    public String b;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("x is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("y is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afcn)) {
            afcn afcn = (afcn) obj;
            return Objects.equal(this.a, afcn.a) && Objects.equal(this.b, afcn.b);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
