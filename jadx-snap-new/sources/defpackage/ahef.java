package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aheg.class)
/* renamed from: ahef */
public class ahef extends aezl implements aezk {
    @SerializedName("suggested_friend_results")
    public List<ahej> a;
    @SerializedName("message")
    public String b;
    @SerializedName("logged")
    public Boolean c;
    @SerializedName("suggestion_placement_to_reason_mapping")
    public List<aher> d;
    @SerializedName("suggested_friend_results_v2")
    public List<ahen> e;
    @SerializedName("add_friends_footer_ordering")
    public List<ahel> f;
    @SerializedName("stories_page_ordering")
    public List<ahel> g;
    @SerializedName("send_to_page_ordering")
    public List<ahel> h;
    @SerializedName("feed_page_ordering")
    public List<ahel> i;
    @SerializedName("search_page_ordering")
    public List<ahel> j;
    @SerializedName("search_result_page_ordering")
    public List<ahel> k;
    @SerializedName("full_page_ordering")
    public List<ahel> l;
    @SerializedName("stories_view_all_page_ordering")
    public List<ahel> m;
    @SerializedName("friends_horizontal_page_ordering")
    public List<ahel> n;
    @SerializedName("friends_view_all_page_ordering")
    public List<ahel> o;
    @SerializedName("discover_carousel_style")
    public String p;

    /* renamed from: ahef$a */
    public enum a {
        SINGLE(r2),
        DOUBLE(r3),
        UNRECOGNIZED_VALUE(r4);
        
        private final String value;

        private a(String str) {
            this.value = str;
        }

        public static a a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return a.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    public final a a() {
        return a.a(this.p);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahef)) {
            ahef ahef = (ahef) obj;
            return Objects.equal(this.a, ahef.a) && Objects.equal(this.b, ahef.b) && Objects.equal(this.c, ahef.c) && Objects.equal(this.d, ahef.d) && Objects.equal(this.e, ahef.e) && Objects.equal(this.f, ahef.f) && Objects.equal(this.g, ahef.g) && Objects.equal(this.h, ahef.h) && Objects.equal(this.i, ahef.i) && Objects.equal(this.j, ahef.j) && Objects.equal(this.k, ahef.k) && Objects.equal(this.l, ahef.l) && Objects.equal(this.m, ahef.m) && Objects.equal(this.n, ahef.n) && Objects.equal(this.o, ahef.o) && Objects.equal(this.p, ahef.p);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list2 = this.d;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.e;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.f;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.g;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.h;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.i;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.j;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.k;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.l;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.m;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.n;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.o;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        str = this.p;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
