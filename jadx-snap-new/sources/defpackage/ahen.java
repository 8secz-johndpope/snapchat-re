package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aheo.class)
/* renamed from: ahen */
public class ahen extends aezl implements aezk {
    @SerializedName("userId")
    public String a;
    @SerializedName("username")
    public String b;
    @SerializedName("display_name")
    public String c;
    @SerializedName("story_privacy")
    public String d;
    @SerializedName("bitmoji_avatar_id")
    public String e;
    @SerializedName("metadata")
    public String f;
    @SerializedName("bitmoji_selfie_id")
    public String g;
    @SerializedName("bitmoji_snapcode_selfie_id")
    public String h;
    @SerializedName("emoji_symbol")
    public String i;
    @SerializedName("is_popular_accout")
    public Boolean j;
    @SerializedName("display_username")
    public String k;

    public final afby a() {
        return afby.a(this.d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahen)) {
            ahen ahen = (ahen) obj;
            return Objects.equal(this.a, ahen.a) && Objects.equal(this.b, ahen.b) && Objects.equal(this.c, ahen.c) && Objects.equal(this.d, ahen.d) && Objects.equal(this.e, ahen.e) && Objects.equal(this.f, ahen.f) && Objects.equal(this.g, ahen.g) && Objects.equal(this.h, ahen.h) && Objects.equal(this.i, ahen.i) && Objects.equal(this.j, ahen.j) && Objects.equal(this.k, ahen.k);
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
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.j;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.k;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
