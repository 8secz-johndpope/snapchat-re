package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afcq.class)
/* renamed from: afcp */
public class afcp extends aezl implements aezk {
    @SerializedName("x")
    public String a;
    @SerializedName("y")
    public String b;
    @SerializedName("width")
    public String c;
    @SerializedName("height")
    public String d;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("x is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("y is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("width is required to be initialized.");
        } else if (this.d == null) {
            throw new IllegalStateException("height is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afcp)) {
            afcp afcp = (afcp) obj;
            return Objects.equal(this.a, afcp.a) && Objects.equal(this.b, afcp.b) && Objects.equal(this.c, afcp.c) && Objects.equal(this.d, afcp.d);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
