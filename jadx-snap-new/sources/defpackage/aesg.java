package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesh.class)
/* renamed from: aesg */
public class aesg extends aezl implements aezk {
    @SerializedName("url")
    public String a;
    @SerializedName("expirySecs")
    public Long b;
    @SerializedName("type")
    public String c;
    @SerializedName("region")
    public String d;

    public final affr a() {
        return affr.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesg)) {
            aesg aesg = (aesg) obj;
            return Objects.equal(this.a, aesg.a) && Objects.equal(this.b, aesg.b) && Objects.equal(this.c, aesg.c) && Objects.equal(this.d, aesg.d);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
