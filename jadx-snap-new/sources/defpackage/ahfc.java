package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahfd.class)
/* renamed from: ahfc */
public class ahfc extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("name")
    public String b;
    @SerializedName("last_login")
    public Long c = Long.valueOf(0);

    public void a() {
        if (this.a == null) {
            throw new IllegalStateException("id is required to be initialized.");
        } else if (this.b == null) {
            throw new IllegalStateException("name is required to be initialized.");
        } else if (this.c == null) {
            throw new IllegalStateException("last_login is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahfc)) {
            ahfc ahfc = (ahfc) obj;
            return Objects.equal(this.a, ahfc.a) && Objects.equal(this.b, ahfc.b) && Objects.equal(this.c, ahfc.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
