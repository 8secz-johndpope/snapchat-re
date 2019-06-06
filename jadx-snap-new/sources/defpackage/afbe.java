package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afbf.class)
/* renamed from: afbe */
public class afbe extends aezl implements aezk {
    @SerializedName("my_stories")
    public List<afbs> a;
    @SerializedName("my_stories_with_collabs")
    public List<aehl> b;
    @SerializedName("friend_stories")
    public List<aeml> c;
    @SerializedName("my_group_stories")
    public List<aeti> d;
    @SerializedName("my_verified_stories")
    public List<aetm> e;
    @SerializedName("mature_content_text")
    public Map<String, String> f;
    @SerializedName("friend_stories_delta")
    public Boolean g;
    @SerializedName("ordering_response")
    public ageu h;
    @SerializedName("server_info")
    public aexj i;
    @SerializedName("user_stories_precache_config")
    public agfl j;
    @SerializedName("my_mob_stories")
    public List<agda> k;
    @SerializedName("sync_metadata")
    public String l;
    @SerializedName("unsigned_receipt")
    public Boolean m = Boolean.FALSE;
    @SerializedName("response_type")
    public String n;
    @SerializedName("deleted_friend_stories")
    public Map<String, List<String>> o;
    @SerializedName("paginate")
    public Boolean p;

    /* renamed from: afbe$a */
    public enum a {
        PARTIAL(r2),
        FULL(r3),
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
        return a.a(this.n);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afbe)) {
            afbe afbe = (afbe) obj;
            return Objects.equal(this.a, afbe.a) && Objects.equal(this.b, afbe.b) && Objects.equal(this.c, afbe.c) && Objects.equal(this.d, afbe.d) && Objects.equal(this.e, afbe.e) && Objects.equal(this.f, afbe.f) && Objects.equal(this.g, afbe.g) && Objects.equal(this.h, afbe.h) && Objects.equal(this.i, afbe.i) && Objects.equal(this.j, afbe.j) && Objects.equal(this.k, afbe.k) && Objects.equal(this.l, afbe.l) && Objects.equal(this.m, afbe.m) && Objects.equal(this.n, afbe.n) && Objects.equal(this.o, afbe.o) && Objects.equal(this.p, afbe.p);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        List list2 = this.b;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.c;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.d;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.e;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.f;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ageu ageu = this.h;
        hashCode = (hashCode + (ageu == null ? 0 : ageu.hashCode())) * 31;
        aexj aexj = this.i;
        hashCode = (hashCode + (aexj == null ? 0 : aexj.hashCode())) * 31;
        agfl agfl = this.j;
        hashCode = (hashCode + (agfl == null ? 0 : agfl.hashCode())) * 31;
        list2 = this.k;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.l;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.m;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.n;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        map = this.o;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        bool = this.p;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
