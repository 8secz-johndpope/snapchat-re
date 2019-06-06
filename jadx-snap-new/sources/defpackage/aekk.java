package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aekl.class)
/* renamed from: aekk */
public class aekk extends aezl implements aezk {
    @SerializedName("pack_id")
    public String a;
    @SerializedName("sticker_id")
    public String b;
    @SerializedName("sticker_type")
    public String c;
    @SerializedName("capabilities")
    public List<String> d;
    @SerializedName("num_times_used")
    public Integer e;
    @SerializedName("last_used")
    public Integer f;

    public final afax a() {
        return afax.a(this.c);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aekk)) {
            aekk aekk = (aekk) obj;
            return Objects.equal(this.a, aekk.a) && Objects.equal(this.b, aekk.b) && Objects.equal(this.c, aekk.c) && Objects.equal(this.d, aekk.d) && Objects.equal(this.e, aekk.e) && Objects.equal(this.f, aekk.f);
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
        List list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.e;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.f;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
