package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeve.class)
/* renamed from: aevd */
public class aevd extends aezl implements aezk {
    @SerializedName("uuid")
    public String a;
    @SerializedName("name")
    public String b;

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("uuid is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("name is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aevd)) {
            aevd aevd = (aevd) obj;
            return Objects.equal(this.a, aevd.a) && Objects.equal(this.b, aevd.b);
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
