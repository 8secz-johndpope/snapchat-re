package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aemm.class)
/* renamed from: aeml */
public class aeml extends aezl implements aezk {
    @SerializedName("username")
    public String a;
    @SerializedName("stories")
    public List<aemn> b;
    @SerializedName("display_name")
    public String c;
    @SerializedName("is_local")
    public Boolean d;
    @SerializedName("profile_description")
    public String e;
    @SerializedName("deep_link_url")
    public String f;
    @SerializedName("shared_id")
    public String g;
    @SerializedName("mature_content")
    public Boolean h;
    @SerializedName("ad_placement_metadata")
    public afml i;
    @SerializedName("thumbnails")
    public afcj j;
    @SerializedName("allow_story_explorer")
    public Boolean k;
    @SerializedName("has_custom_description")
    public Boolean l;
    @SerializedName("show_viewing_jit")
    public Boolean m;
    @SerializedName("featured_story")
    public agbw n;
    @SerializedName("is_manifest_story")
    public Boolean o;
    @SerializedName("type")
    public String p;
    @SerializedName("publisher_id")
    public String q;
    @SerializedName("official_stories_metadata")
    public agay r;
    @SerializedName("new_story_count")
    public Integer s;
    @SerializedName("user_id")
    public String t;

    public final agdk a() {
        return agdk.a(this.p);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeml)) {
            aeml aeml = (aeml) obj;
            return Objects.equal(this.a, aeml.a) && Objects.equal(this.b, aeml.b) && Objects.equal(this.c, aeml.c) && Objects.equal(this.d, aeml.d) && Objects.equal(this.e, aeml.e) && Objects.equal(this.f, aeml.f) && Objects.equal(this.g, aeml.g) && Objects.equal(this.h, aeml.h) && Objects.equal(this.i, aeml.i) && Objects.equal(this.j, aeml.j) && Objects.equal(this.k, aeml.k) && Objects.equal(this.l, aeml.l) && Objects.equal(this.m, aeml.m) && Objects.equal(this.n, aeml.n) && Objects.equal(this.o, aeml.o) && Objects.equal(this.p, aeml.p) && Objects.equal(this.q, aeml.q) && Objects.equal(this.r, aeml.r) && Objects.equal(this.s, aeml.s) && Objects.equal(this.t, aeml.t);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        List list = this.b;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        bool = this.h;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        afml afml = this.i;
        hashCode = (hashCode + (afml == null ? 0 : afml.hashCode())) * 31;
        afcj afcj = this.j;
        hashCode = (hashCode + (afcj == null ? 0 : afcj.hashCode())) * 31;
        bool = this.k;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        agbw agbw = this.n;
        hashCode = (hashCode + (agbw == null ? 0 : agbw.hashCode())) * 31;
        bool = this.o;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.p;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.q;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        agay agay = this.r;
        hashCode = (hashCode + (agay == null ? 0 : agay.hashCode())) * 31;
        Integer num = this.s;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.t;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
