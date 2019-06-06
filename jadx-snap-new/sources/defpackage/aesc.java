package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesd.class)
/* renamed from: aesc */
public class aesc extends aezl implements aezk {
    @SerializedName("saved_message_sender_id")
    public String a;
    @SerializedName("saved_message_id")
    public String b;
    @SerializedName("media_type_saved_count")
    public Map<String, Integer> c;
    @SerializedName("destination")
    public String d;

    public final aese a() {
        return aese.a(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesc)) {
            aesc aesc = (aesc) obj;
            return Objects.equal(this.a, aesc.a) && Objects.equal(this.b, aesc.b) && Objects.equal(this.c, aesc.c) && Objects.equal(this.d, aesc.d);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.c;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
