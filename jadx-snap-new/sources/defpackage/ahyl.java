package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahym.class)
/* renamed from: ahyl */
public class ahyl extends aezl implements aezk {
    @SerializedName("style_id")
    public String a;
    @SerializedName("display_name")
    public String b;
    @SerializedName("font_style")
    public ahzi c;
    @SerializedName("background_style")
    public ahyi d;
    @SerializedName("color_changeable")
    public Boolean e;
    @SerializedName("base_color")
    public String f;
    @SerializedName("is_wifi_only")
    public Boolean g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahyl)) {
            ahyl ahyl = (ahyl) obj;
            return Objects.equal(this.a, ahyl.a) && Objects.equal(this.b, ahyl.b) && Objects.equal(this.c, ahyl.c) && Objects.equal(this.d, ahyl.d) && Objects.equal(this.e, ahyl.e) && Objects.equal(this.f, ahyl.f) && Objects.equal(this.g, ahyl.g);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ahzi ahzi = this.c;
        hashCode = (hashCode + (ahzi == null ? 0 : ahzi.hashCode())) * 31;
        ahyi ahyi = this.d;
        hashCode = (hashCode + (ahyi == null ? 0 : ahyi.hashCode())) * 31;
        Boolean bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.g;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
