package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahee.class)
/* renamed from: ahed */
public class ahed extends aedh implements aezk {
    @SerializedName("action")
    public String a;
    @SerializedName("seen")
    public Boolean b;
    @SerializedName("hide")
    public Boolean c;
    @SerializedName("friend")
    public String d;
    @SerializedName("friend_id")
    public String e;
    @SerializedName("identity_cell_index")
    public Integer f;
    @SerializedName("seen_suggested_friend_list")
    public List<String> g;
    @SerializedName("placement")
    public String h;
    @SerializedName("suggested_friend_cell_info_list")
    public List<aheh> i;
    @SerializedName("suggested_friend_ranking_tweak")
    public Integer j = Integer.valueOf(0);
    @SerializedName("impression_id")
    public Long k;
    @SerializedName("added_suggested_friend_cell_info_list")
    public List<aheh> l;
    @SerializedName("notification_prefetch")
    public Boolean m;
    @SerializedName("seen_friend_request_cell_info_list")
    public List<aheh> n;
    @SerializedName("impression_time_ms")
    public Long o;

    public ahed() {
        Long valueOf = Long.valueOf(0);
        this.k = valueOf;
        this.o = valueOf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahed)) {
            ahed ahed = (ahed) obj;
            return super.equals(ahed) && Objects.equal(this.a, ahed.a) && Objects.equal(this.b, ahed.b) && Objects.equal(this.c, ahed.c) && Objects.equal(this.d, ahed.d) && Objects.equal(this.e, ahed.e) && Objects.equal(this.f, ahed.f) && Objects.equal(this.g, ahed.g) && Objects.equal(this.h, ahed.h) && Objects.equal(this.i, ahed.i) && Objects.equal(this.j, ahed.j) && Objects.equal(this.k, ahed.k) && Objects.equal(this.l, ahed.l) && Objects.equal(this.m, ahed.m) && Objects.equal(this.n, ahed.n) && Objects.equal(this.o, ahed.o);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.b;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.g;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        num = this.j;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.k;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        list = this.l;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.n;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        l = this.o;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }
}
