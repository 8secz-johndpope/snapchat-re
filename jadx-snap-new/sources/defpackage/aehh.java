package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aehi.class)
/* renamed from: aehh */
public class aehh extends aezl implements aezk {
    @SerializedName("name")
    public String a;
    @SerializedName("value")
    public String b;
    @SerializedName("last_updated_timestamp")
    public Long c;
    @SerializedName("last_updated_app_version")
    public String d;
    @SerializedName("last_updated_platform")
    public String e;

    public final aeus a() {
        return aeus.a(this.e);
    }

    public void b() {
        if (this.a == null) {
            throw new IllegalStateException("name is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("value is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("last_updated_timestamp is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aehh)) {
            aehh aehh = (aehh) obj;
            return Objects.equal(this.a, aehh.a) && Objects.equal(this.b, aehh.b) && Objects.equal(this.c, aehh.c) && Objects.equal(this.d, aehh.d) && Objects.equal(this.e, aehh.e);
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
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
