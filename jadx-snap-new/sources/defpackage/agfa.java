package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agfb.class)
/* renamed from: agfa */
public class agfa extends aezl implements aezk {
    @SerializedName("tap_to_load_counts")
    public agff a;
    @SerializedName("inline_forward_precache_counts")
    public agff b;
    @SerializedName("num_stories_always_precached")
    public agff c;
    @SerializedName("num_snaps_per_story_always_precached")
    public agff d;
    @SerializedName("order")
    public String e;
    @SerializedName("num_snaps_to_load_before_allow_viewing")
    public agff f;

    public final agfe a() {
        return agfe.a(this.e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agfa)) {
            agfa agfa = (agfa) obj;
            return Objects.equal(this.a, agfa.a) && Objects.equal(this.b, agfa.b) && Objects.equal(this.c, agfa.c) && Objects.equal(this.d, agfa.d) && Objects.equal(this.e, agfa.e) && Objects.equal(this.f, agfa.f);
        }
    }

    public int hashCode() {
        agff agff = this.a;
        int i = 0;
        int hashCode = ((agff == null ? 0 : agff.hashCode()) + 527) * 31;
        agff agff2 = this.b;
        hashCode = (hashCode + (agff2 == null ? 0 : agff2.hashCode())) * 31;
        agff2 = this.c;
        hashCode = (hashCode + (agff2 == null ? 0 : agff2.hashCode())) * 31;
        agff2 = this.d;
        hashCode = (hashCode + (agff2 == null ? 0 : agff2.hashCode())) * 31;
        String str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        agff2 = this.f;
        if (agff2 != null) {
            i = agff2.hashCode();
        }
        return hashCode + i;
    }
}
