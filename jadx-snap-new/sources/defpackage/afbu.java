package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afbv.class)
/* renamed from: afbu */
public class afbu extends aezl implements aezk {
    @SerializedName("viewer")
    public String a;
    @SerializedName("screenshotted")
    public Boolean b;
    @SerializedName("timestamp")
    public Long c;
    @SerializedName("storypointer")
    public afbw d;
    @SerializedName("is_friend_view_of_public_story")
    public Boolean e = Boolean.FALSE;
    @SerializedName("screen_recorded")
    public Boolean f;
    @SerializedName("saved")
    public Boolean g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbu)) {
            afbu afbu = (afbu) obj;
            return Objects.equal(this.a, afbu.a) && Objects.equal(this.b, afbu.b) && Objects.equal(this.c, afbu.c) && Objects.equal(this.d, afbu.d) && Objects.equal(this.e, afbu.e) && Objects.equal(this.f, afbu.f) && Objects.equal(this.g, afbu.g);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.c;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        afbw afbw = this.d;
        hashCode = (hashCode + (afbw == null ? 0 : afbw.hashCode())) * 31;
        bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
