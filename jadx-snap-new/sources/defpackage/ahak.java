package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahal.class)
/* renamed from: ahak */
public class ahak extends aezl implements aezk {
    @SerializedName("mischief_id")
    public String a;
    @SerializedName("latest_sequence_numbers")
    public Map<String, Long> b;
    @SerializedName("earliest_sequence_numbers")
    public Map<String, Long> c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahak)) {
            ahak ahak = (ahak) obj;
            return Objects.equal(this.a, ahak.a) && Objects.equal(this.b, ahak.b) && Objects.equal(this.c, ahak.c);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }
}
