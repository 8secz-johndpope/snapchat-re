package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahbm.class)
/* renamed from: ahbl */
public class ahbl extends aezl implements aezk {
    @SerializedName("user_id")
    public String a;
    @SerializedName("username")
    public String b;
    @SerializedName("display")
    public String c;
    @SerializedName("color")
    public String d;
    @SerializedName("join_timestamp")
    public Long e;
    @SerializedName("video_chat_user_id")
    public Long f;
    @SerializedName("mischief_version")
    public Long g;
    @SerializedName("bitmoji_avatar_id")
    public String h;
    @SerializedName("bitmoji_selfie_id")
    public String i;
    @SerializedName("bitmoji_snapcode_selfie_id")
    public String j;
    @SerializedName("color_hex")
    public String k;

    public ahbl() {
        Long valueOf = Long.valueOf(0);
        this.e = valueOf;
        this.g = valueOf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahbl)) {
            ahbl ahbl = (ahbl) obj;
            return Objects.equal(this.a, ahbl.a) && Objects.equal(this.b, ahbl.b) && Objects.equal(this.c, ahbl.c) && Objects.equal(this.d, ahbl.d) && Objects.equal(this.e, ahbl.e) && Objects.equal(this.f, ahbl.f) && Objects.equal(this.g, ahbl.g) && Objects.equal(this.h, ahbl.h) && Objects.equal(this.i, ahbl.i) && Objects.equal(this.j, ahbl.j) && Objects.equal(this.k, ahbl.k);
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
        Long l = this.e;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        l = this.g;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.k;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
