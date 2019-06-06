package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahbf.class)
/* renamed from: ahbe */
public class ahbe extends aezl implements aezk {
    @SerializedName("user_id")
    public String a;
    @SerializedName("username")
    public String b;
    @SerializedName("display")
    public String c;
    @SerializedName("mischief_version")
    public Long d = Long.valueOf(0);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahbe)) {
            ahbe ahbe = (ahbe) obj;
            return Objects.equal(this.a, ahbe.a) && Objects.equal(this.b, ahbe.b) && Objects.equal(this.c, ahbe.c) && Objects.equal(this.d, ahbe.d);
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
        Long l = this.d;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
