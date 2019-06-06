package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agdd.class)
/* renamed from: agdc */
public class agdc extends aezl implements aezk {
    @SerializedName("id")
    public String a;
    @SerializedName("type_val")
    public String b;
    @SerializedName("display_name")
    public String c;
    @SerializedName("contributors")
    public List<String> d;
    @SerializedName("geo_fence_center")
    public agdp e;
    @SerializedName("geo_subtext")
    public String f;
    @SerializedName("privacy_type")
    public String g;
    @SerializedName("viewers")
    public List<String> h;
    @SerializedName("enable_autosave")
    public Boolean i;
    @SerializedName("mischief_id")
    public String j;

    public final ageb a() {
        return ageb.a(this.b);
    }

    public final agdz b() {
        return agdz.a(this.g);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agdc)) {
            agdc agdc = (agdc) obj;
            return Objects.equal(this.a, agdc.a) && Objects.equal(this.b, agdc.b) && Objects.equal(this.c, agdc.c) && Objects.equal(this.d, agdc.d) && Objects.equal(this.e, agdc.e) && Objects.equal(this.f, agdc.f) && Objects.equal(this.g, agdc.g) && Objects.equal(this.h, agdc.h) && Objects.equal(this.i, agdc.i) && Objects.equal(this.j, agdc.j);
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
        List list = this.d;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        agdp agdp = this.e;
        hashCode = (hashCode + (agdp == null ? 0 : agdp.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.i;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
