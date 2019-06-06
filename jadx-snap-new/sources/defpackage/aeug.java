package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeuh.class)
/* renamed from: aeug */
public class aeug extends aezl implements aezk {
    @SerializedName("story")
    public afbi b;
    @SerializedName("story_extras")
    public afbo c;
    @SerializedName("friend_story_extras")
    public afbo d;
    @SerializedName("other_story_extras")
    public afbo e;
    @SerializedName("engagement_percentage")
    public Integer f;
    @SerializedName("intended_post_time")
    public Long g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeug)) {
            aeug aeug = (aeug) obj;
            return Objects.equal(this.b, aeug.b) && Objects.equal(this.c, aeug.c) && Objects.equal(this.d, aeug.d) && Objects.equal(this.e, aeug.e) && Objects.equal(this.f, aeug.f) && Objects.equal(this.g, aeug.g);
        }
    }

    public int hashCode() {
        afbi afbi = this.b;
        int i = 0;
        int hashCode = ((afbi == null ? 0 : afbi.hashCode()) + 527) * 31;
        afbo afbo = this.c;
        hashCode = (hashCode + (afbo == null ? 0 : afbo.hashCode())) * 31;
        afbo = this.d;
        hashCode = (hashCode + (afbo == null ? 0 : afbo.hashCode())) * 31;
        afbo = this.e;
        hashCode = (hashCode + (afbo == null ? 0 : afbo.hashCode())) * 31;
        Integer num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
