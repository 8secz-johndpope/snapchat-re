package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aess.class)
/* renamed from: aesr */
public class aesr extends aeie implements aezk {
    @SerializedName("chat_message_id")
    public String a;
    @SerializedName("chat_message_seq_num")
    public Long b;
    @SerializedName("chat_message_sender_id")
    public String c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesr)) {
            aesr aesr = (aesr) obj;
            return super.equals(aesr) && Objects.equal(this.a, aesr.a) && Objects.equal(this.b, aesr.b) && Objects.equal(this.c, aesr.c);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
