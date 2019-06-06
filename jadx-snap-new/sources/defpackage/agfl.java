package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agfm.class)
/* renamed from: agfl */
public class agfl extends aezl implements aezk {
    @SerializedName("precache_counts_per_story")
    public List<agfj> a;
    @SerializedName("default_precache_count")
    public agff b;
    @SerializedName("lookahead_precache")
    public agfa c;
    @SerializedName("lookahead_precache_per_section")
    public List<agfc> d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agfl)) {
            agfl agfl = (agfl) obj;
            return Objects.equal(this.a, agfl.a) && Objects.equal(this.b, agfl.b) && Objects.equal(this.c, agfl.c) && Objects.equal(this.d, agfl.d);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        agff agff = this.b;
        hashCode = (hashCode + (agff == null ? 0 : agff.hashCode())) * 31;
        agfa agfa = this.c;
        hashCode = (hashCode + (agfa == null ? 0 : agfa.hashCode())) * 31;
        List list2 = this.d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }
}
