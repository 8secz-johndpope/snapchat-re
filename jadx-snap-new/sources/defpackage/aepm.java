package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aepn.class)
/* renamed from: aepm */
public class aepm extends aezl implements aezk {
    @SerializedName("sender_username")
    public String a;
    @SerializedName("sent_timestamp")
    public Long b;
    @SerializedName("sender_message_seq_num")
    public Long c;
    @SerializedName("message_body_type")
    public String d;
    @SerializedName("viewed_timestamp")
    public Long e;
    @SerializedName("first_media_type")
    public String f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aepm)) {
            aepm aepm = (aepm) obj;
            return Objects.equal(this.a, aepm.a) && Objects.equal(this.b, aepm.b) && Objects.equal(this.c, aepm.c) && Objects.equal(this.d, aepm.d) && Objects.equal(this.e, aepm.e) && Objects.equal(this.f, aepm.f);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.c;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
