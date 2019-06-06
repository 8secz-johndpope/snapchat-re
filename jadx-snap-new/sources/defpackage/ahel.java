package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahem.class)
/* renamed from: ahel */
public class ahel extends aezl implements aezk {
    @SerializedName("userId")
    public String a;
    @SerializedName("suggestion_subtext")
    public String b;
    @SerializedName("suggestion_token")
    public String c;
    @SerializedName("suggestion_subtext_lowercase")
    public String d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahel)) {
            ahel ahel = (ahel) obj;
            return Objects.equal(this.a, ahel.a) && Objects.equal(this.b, ahel.b) && Objects.equal(this.c, ahel.c) && Objects.equal(this.d, ahel.d);
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
