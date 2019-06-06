package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agaz.class)
/* renamed from: agay */
public class agay extends aezl implements aezk {
    @SerializedName("safe_display_name")
    public String a;
    @SerializedName("emoji_symbol")
    public String b;
    @SerializedName("tracking_id")
    public String c;
    @SerializedName("user_id")
    public String d;
    @SerializedName("bitmoji_avatar_id")
    public String e;
    @SerializedName("bitmoji_avatar_selfie_id")
    public String f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agay)) {
            agay agay = (agay) obj;
            return Objects.equal(this.a, agay.a) && Objects.equal(this.b, agay.b) && Objects.equal(this.c, agay.c) && Objects.equal(this.d, agay.d) && Objects.equal(this.e, agay.e) && Objects.equal(this.f, agay.f);
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
