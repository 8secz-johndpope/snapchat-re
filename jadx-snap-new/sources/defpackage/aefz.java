package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aega.class)
/* renamed from: aefz */
public class aefz extends aezl implements aezk {
    @SerializedName("checksums_dict")
    public String a;
    @SerializedName("features_map")
    public String b;
    @SerializedName("pull_to_refresh")
    public Boolean c;
    @SerializedName("friends_request")
    public aemx d;
    @SerializedName("group_delta_requests")
    public List<ahak> e;
    @SerializedName("exclude_friends")
    public Boolean f;
    @SerializedName("messages_tier")
    public String g;
    @SerializedName("conversation_delta_query_map")
    public Map<String, aefn> h;
    @SerializedName("conversation_snap_delta_query_map")
    public Map<String, aefv> i;
    @SerializedName("feed_iter_token")
    public String j;
    @SerializedName("message_iter_token")
    public String k;
    @SerializedName("group_pagination_type")
    public String l;
    @SerializedName("fetch_reason")
    public String m;
    @SerializedName("feed_delta_sync_token")
    public aekq n;

    /* renamed from: aefz$a */
    public enum a {
        ALL(r2),
        SENT_TODAY(r3),
        NOT_RELEASED(r4),
        UNRECOGNIZED_VALUE(r5);
        
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
        return a.a(this.g);
    }

    public final ahbk b() {
        return ahbk.a(this.l);
    }

    public final aeib c() {
        return aeib.a(this.m);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aefz)) {
            aefz aefz = (aefz) obj;
            return Objects.equal(this.a, aefz.a) && Objects.equal(this.b, aefz.b) && Objects.equal(this.c, aefz.c) && Objects.equal(this.d, aefz.d) && Objects.equal(this.e, aefz.e) && Objects.equal(this.f, aefz.f) && Objects.equal(this.g, aefz.g) && Objects.equal(this.h, aefz.h) && Objects.equal(this.i, aefz.i) && Objects.equal(this.j, aefz.j) && Objects.equal(this.k, aefz.k) && Objects.equal(this.l, aefz.l) && Objects.equal(this.m, aefz.m) && Objects.equal(this.n, aefz.n);
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        aemx aemx = this.d;
        hashCode = (hashCode + (aemx == null ? 0 : aemx.hashCode())) * 31;
        List list = this.e;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.h;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.i;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str2 = this.j;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.k;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.l;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.m;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        aekq aekq = this.n;
        if (aekq != null) {
            i = aekq.hashCode();
        }
        return hashCode + i;
    }
}
