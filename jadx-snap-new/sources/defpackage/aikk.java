package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aikl.class)
/* renamed from: aikk */
public class aikk extends aezl implements aezk {
    @SerializedName("username")
    public String a;
    @SerializedName("user_id")
    public String b;
    @SerializedName("verified_user_info_id")
    public String c;
    @SerializedName("display_name")
    public String d;
    @SerializedName("bitmoji_avatar_id")
    public String e;
    @SerializedName("bitmoji_selfie_id")
    public String f;
    @SerializedName("bitmoji_snapcode_selfie_id")
    public String g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aikk)) {
            aikk aikk = (aikk) obj;
            return Objects.equal(this.a, aikk.a) && Objects.equal(this.b, aikk.b) && Objects.equal(this.c, aikk.c) && Objects.equal(this.d, aikk.d) && Objects.equal(this.e, aikk.e) && Objects.equal(this.f, aikk.f) && Objects.equal(this.g, aikk.g);
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
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
