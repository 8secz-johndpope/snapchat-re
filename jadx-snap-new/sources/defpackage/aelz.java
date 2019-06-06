package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aema.class)
/* renamed from: aelz */
public class aelz extends aezl implements aezk {
    @SerializedName("chat_feed_response")
    public aegb a;
    @SerializedName("story_feed_response")
    public afbe b;
    @SerializedName("feed_items")
    public List<aelp> c;
    @SerializedName("ranking_metadata")
    public aelr d;
    @SerializedName("creation_timestamp")
    public Long e;
    @SerializedName("session_id")
    public String f;
    @SerializedName("request_id")
    public String g;
    @SerializedName("debug_info")
    public aemb h;
    @SerializedName("force_full_sync_feed_items")
    public Boolean i;
    @SerializedName("user_signals")
    public aemd j;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aelz)) {
            aelz aelz = (aelz) obj;
            return Objects.equal(this.a, aelz.a) && Objects.equal(this.b, aelz.b) && Objects.equal(this.c, aelz.c) && Objects.equal(this.d, aelz.d) && Objects.equal(this.e, aelz.e) && Objects.equal(this.f, aelz.f) && Objects.equal(this.g, aelz.g) && Objects.equal(this.h, aelz.h) && Objects.equal(this.i, aelz.i) && Objects.equal(this.j, aelz.j);
        }
    }

    public int hashCode() {
        aegb aegb = this.a;
        int i = 0;
        int hashCode = ((aegb == null ? 0 : aegb.hashCode()) + 527) * 31;
        afbe afbe = this.b;
        hashCode = (hashCode + (afbe == null ? 0 : afbe.hashCode())) * 31;
        List list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aelr aelr = this.d;
        hashCode = (hashCode + (aelr == null ? 0 : aelr.hashCode())) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        aemb aemb = this.h;
        hashCode = (hashCode + (aemb == null ? 0 : aemb.hashCode())) * 31;
        Boolean bool = this.i;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aemd aemd = this.j;
        if (aemd != null) {
            i = aemd.hashCode();
        }
        return hashCode + i;
    }
}
