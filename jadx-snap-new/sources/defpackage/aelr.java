package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aels.class)
/* renamed from: aelr */
public class aelr extends aezl implements aezk {
    @SerializedName("ast_group_to_use")
    public aelh a;
    @SerializedName("debug_ranking_metadata")
    public aelj b;
    @SerializedName("background_time_threshold_in_seconds")
    public Integer c;
    @SerializedName("reranker_story_demotion_factor")
    public Integer d;
    @SerializedName("reranker_chat_demotion_factor")
    public Integer e;
    @SerializedName("reranker_enabled")
    public Boolean f;
    @SerializedName("last_full_ranking_time_threshold_in_secs")
    public Integer g;
    @SerializedName("warm_start_last_full_ranking_time_threshold_in_secs")
    public Integer h;
    @SerializedName("warm_start_friend_feed_time_away_threshold_in_secs")
    @Deprecated
    public Integer i;
    @SerializedName("friend_feed_time_away_threshold_in_secs")
    public Integer j;
    @SerializedName("warm_start_background_time_threshold_in_seconds")
    public Integer k;
    @SerializedName("reranker_v2_metadata")
    public aelx l;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aelr)) {
            aelr aelr = (aelr) obj;
            return Objects.equal(this.a, aelr.a) && Objects.equal(this.b, aelr.b) && Objects.equal(this.c, aelr.c) && Objects.equal(this.d, aelr.d) && Objects.equal(this.e, aelr.e) && Objects.equal(this.f, aelr.f) && Objects.equal(this.g, aelr.g) && Objects.equal(this.h, aelr.h) && Objects.equal(this.i, aelr.i) && Objects.equal(this.j, aelr.j) && Objects.equal(this.k, aelr.k) && Objects.equal(this.l, aelr.l);
        }
    }

    public int hashCode() {
        aelh aelh = this.a;
        int i = 0;
        int hashCode = ((aelh == null ? 0 : aelh.hashCode()) + 527) * 31;
        aelj aelj = this.b;
        hashCode = (hashCode + (aelj == null ? 0 : aelj.hashCode())) * 31;
        Integer num = this.c;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.d;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.e;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        num = this.g;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.h;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.i;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.j;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.k;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        aelx aelx = this.l;
        if (aelx != null) {
            i = aelx.hashCode();
        }
        return hashCode + i;
    }
}
