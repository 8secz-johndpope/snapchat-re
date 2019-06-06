package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agzr.class)
/* renamed from: agzq */
public class agzq extends aedh implements aezk {
    @SerializedName("action")
    public String a;
    @SerializedName("friend")
    public String b;
    @SerializedName("friends")
    public List<aelf> c;
    @SerializedName("friend_id")
    public String d;
    @SerializedName("added_by")
    public String e;
    @SerializedName("identity_profile_page")
    public String f;
    @SerializedName("identity_cell_index")
    public Integer g;
    @SerializedName("display")
    public String h;
    @SerializedName("block_reason_id")
    public Integer i;
    @SerializedName("suggestion_token")
    public String j;
    @SerializedName("group_story_id")
    public String k;
    @SerializedName("suggestion_token_map")
    public Map<String, String> l;
    @SerializedName("story_section")
    public String m;
    @SerializedName("is_official")
    public Boolean n;
    @SerializedName("deleted_by")
    public String o;
    @SerializedName("suggested_publishers")
    public List<ahep> p;

    public final aecr a() {
        return aecr.a(this.e);
    }

    public final aejd b() {
        return aejd.a(this.o);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agzq)) {
            agzq agzq = (agzq) obj;
            return super.equals(agzq) && Objects.equal(this.a, agzq.a) && Objects.equal(this.b, agzq.b) && Objects.equal(this.c, agzq.c) && Objects.equal(this.d, agzq.d) && Objects.equal(this.e, agzq.e) && Objects.equal(this.f, agzq.f) && Objects.equal(this.g, agzq.g) && Objects.equal(this.h, agzq.h) && Objects.equal(this.i, agzq.i) && Objects.equal(this.j, agzq.j) && Objects.equal(this.k, agzq.k) && Objects.equal(this.l, agzq.l) && Objects.equal(this.m, agzq.m) && Objects.equal(this.n, agzq.n) && Objects.equal(this.o, agzq.o) && Objects.equal(this.p, agzq.p);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.g;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.i;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.k;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.l;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str = this.m;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.n;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list = this.p;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
