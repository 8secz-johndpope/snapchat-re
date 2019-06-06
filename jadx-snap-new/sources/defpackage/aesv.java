package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesw.class)
/* renamed from: aesv */
public class aesv extends aeie implements aezk {
    @SerializedName("chat_message_id")
    public String a;
    @SerializedName("preserved")
    public Boolean b;
    @SerializedName("chat_message_seq_num")
    public Long c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesv)) {
            aesv aesv = (aesv) obj;
            return super.equals(aesv) && Objects.equal(this.a, aesv.a) && Objects.equal(this.b, aesv.b) && Objects.equal(this.c, aesv.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
