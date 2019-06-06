package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aelw.class)
/* renamed from: aelv */
public class aelv extends aezl implements aezk {
    @SerializedName("is_debug_request")
    public Boolean a;
    @SerializedName("disable_friends_signal_memcache")
    public Boolean b;
    @SerializedName("disable_stories_adapter")
    public Boolean c;
    @SerializedName("disable_friends_signal_adapter")
    public Boolean d;
    @SerializedName("disable_conversations_adapter")
    public Boolean e;
    @SerializedName("disable_conversations_multi_get_adapter")
    public Boolean f;
    @SerializedName("track_items")
    public List<aell> g;
    @SerializedName("is_replay_request")
    public Boolean h;
    @SerializedName("num_recent_conversations_to_fetch")
    public Integer i;
    @SerializedName("num_stories_to_select_from_ranking")
    public Integer j;
    @SerializedName("num_friends_to_select_from_ranking")
    public Integer k;
    @SerializedName("conversations_scoring_model_to_use")
    public String l;
    @SerializedName("stories_scoring_model_to_use")
    public String m;
    @SerializedName("friends_scoring_model_to_use")
    public String n;
    @SerializedName("should_return_all_signals")
    public Boolean o;
    @SerializedName("disable_conversations_pre_fetch_adapter")
    public Boolean p;
    @SerializedName("study_id_to_use")
    public String q;
    @SerializedName("should_return_debug_info_html")
    public Boolean r;
    @SerializedName("should_return_story_scores")
    public Boolean s;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aelv)) {
            aelv aelv = (aelv) obj;
            return Objects.equal(this.a, aelv.a) && Objects.equal(this.b, aelv.b) && Objects.equal(this.c, aelv.c) && Objects.equal(this.d, aelv.d) && Objects.equal(this.e, aelv.e) && Objects.equal(this.f, aelv.f) && Objects.equal(this.g, aelv.g) && Objects.equal(this.h, aelv.h) && Objects.equal(this.i, aelv.i) && Objects.equal(this.j, aelv.j) && Objects.equal(this.k, aelv.k) && Objects.equal(this.l, aelv.l) && Objects.equal(this.m, aelv.m) && Objects.equal(this.n, aelv.n) && Objects.equal(this.o, aelv.o) && Objects.equal(this.p, aelv.p) && Objects.equal(this.q, aelv.q) && Objects.equal(this.r, aelv.r) && Objects.equal(this.s, aelv.s);
        }
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) + 527) * 31;
        Boolean bool2 = this.b;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.c;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.d;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.e;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.f;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.g;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool2 = this.h;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.i;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.j;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.k;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.l;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.m;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.n;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool2 = this.o;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.p;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        str = this.q;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool2 = this.r;
        hashCode = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        bool2 = this.s;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }
}
