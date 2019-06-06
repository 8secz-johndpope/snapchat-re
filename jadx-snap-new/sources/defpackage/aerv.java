package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aerw.class)
/* renamed from: aerv */
public class aerv extends aezl implements aezk {
    @SerializedName("media_id")
    public String a;
    @SerializedName("media_type")
    public String b;
    @SerializedName("media_url")
    public String c;
    @SerializedName("media_attributes")
    public Map<String, Object> d;
    @SerializedName("key")
    public String e;
    @SerializedName("iv")
    public String f;
    @SerializedName("width")
    public Integer g;
    @SerializedName("height")
    public Integer h;
    @SerializedName("owner")
    public String i;
    @SerializedName("timer_sec")
    public Float j;
    @SerializedName("is_zipped")
    public Boolean k;
    @SerializedName("venue_id")
    public String l;
    @SerializedName("snap_attachments")
    public List<aeye> m;
    @SerializedName("is_infinite_duration")
    public Boolean n;
    @SerializedName("source_id")
    public String o;
    @SerializedName("animated_snap_type")
    public String p;
    @SerializedName("creator_attribution")
    public String q;
    @SerializedName("direct_download_url")
    public aesg r;
    @SerializedName("mini_thumbnail_data")
    public String s;
    @SerializedName("lens_metadata")
    public String t;

    public final aeda a() {
        return aeda.a(this.p);
    }

    public void b() {
        if (this.a == null) {
            throw new IllegalStateException("media_id is required to be initialized.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aerv)) {
            aerv aerv = (aerv) obj;
            return Objects.equal(this.a, aerv.a) && Objects.equal(this.b, aerv.b) && Objects.equal(this.c, aerv.c) && Objects.equal(this.d, aerv.d) && Objects.equal(this.e, aerv.e) && Objects.equal(this.f, aerv.f) && Objects.equal(this.g, aerv.g) && Objects.equal(this.h, aerv.h) && Objects.equal(this.i, aerv.i) && Objects.equal(this.j, aerv.j) && Objects.equal(this.k, aerv.k) && Objects.equal(this.l, aerv.l) && Objects.equal(this.m, aerv.m) && Objects.equal(this.n, aerv.n) && Objects.equal(this.o, aerv.o) && Objects.equal(this.p, aerv.p) && Objects.equal(this.q, aerv.q) && Objects.equal(this.r, aerv.r) && Objects.equal(this.s, aerv.s) && Objects.equal(this.t, aerv.t);
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
        Integer num = this.g;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.h;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str2 = this.i;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.j;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.m;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.n;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.o;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.p;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.q;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aesg aesg = this.r;
        hashCode = (hashCode + (aesg == null ? 0 : aesg.hashCode())) * 31;
        str2 = this.s;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.t;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
