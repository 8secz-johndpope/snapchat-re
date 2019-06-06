package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahek.class)
/* renamed from: ahej */
public class ahej extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("name")
    public String b;
    @SerializedName("suggest_reason")
    public String c;
    @SerializedName("score")
    public Map<ahet, Double> d;
    @SerializedName("suggest_reason_display")
    public String e;
    @SerializedName("display")
    public String f;
    @SerializedName("is_hidden")
    public Boolean g;
    @SerializedName("story_privacy")
    public String h;
    @SerializedName("is_new_snapchatter")
    public Boolean i;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahej)) {
            ahej ahej = (ahej) obj;
            return Objects.equal(this.a, ahej.a) && Objects.equal(this.b, ahej.b) && Objects.equal(this.c, ahej.c) && Objects.equal(this.d, ahej.d) && Objects.equal(this.e, ahej.e) && Objects.equal(this.f, ahej.f) && Objects.equal(this.g, ahej.g) && Objects.equal(this.h, ahej.h) && Objects.equal(this.i, ahej.i);
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
        Map map = this.d;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.i;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
