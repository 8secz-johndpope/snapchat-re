package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aemy.class)
/* renamed from: aemx */
public class aemx extends aezl implements aezk {
    @SerializedName("friends_sync_token")
    public String a;
    @SerializedName("request_token_only")
    public Boolean b;
    @SerializedName("added_friends_sync_token")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemx)) {
            aemx aemx = (aemx) obj;
            return Objects.equal(this.a, aemx.a) && Objects.equal(this.b, aemx.b) && Objects.equal(this.c, aemx.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
