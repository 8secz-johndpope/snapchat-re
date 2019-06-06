package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aici.class)
/* renamed from: aich */
public class aich extends aezl implements aezk {
    @SerializedName("encrypted_unlockables_direct_payload")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aich)) {
            return false;
        }
        return Objects.equal(this.a, ((aich) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }
}
