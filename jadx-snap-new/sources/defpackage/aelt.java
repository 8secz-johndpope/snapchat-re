package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aelu.class)
/* renamed from: aelt */
public class aelt extends aedh implements aezk {
    @SerializedName("chat_feed_request")
    public aefz a;
    @SerializedName("story_friend_feed_request")
    public agbh b;
    @SerializedName("session_id")
    public String c;
    @SerializedName("request_id")
    public String d;
    @SerializedName("call_origination_type")
    public String e;
    @SerializedName("creation_timestamp")
    public Long f;
    @SerializedName("layout_type")
    public String g;
    @SerializedName("conversation_ids_to_fetch")
    public List<String> h;
    @SerializedName("previous_pages_item_ids")
    public List<aell> i;
    @SerializedName("debug_param")
    public aelv j;
    @SerializedName("last_full_sync_timestamp")
    public Long k;
    @SerializedName("return_ranked_stories_only")
    public Boolean l;
    @SerializedName("notification_id")
    public String m;
    @SerializedName("since_timestamp")
    public Long n;
    @SerializedName("limit")
    public Integer o;
    @SerializedName("return_friend_stories_only")
    public Boolean p;
    @SerializedName("return_feed_item_with_signals")
    public Boolean q;
    @SerializedName("user_story_interaction_history")
    public List<aemp> r;

    /* renamed from: aelt$b */
    public enum b {
        TYPE_A(r2),
        TYPE_B(r3),
        TYPE_Q(r4),
        UNRECOGNIZED_VALUE(r5);
        
        private final String value;

        private b(String str) {
            this.value = str;
        }

        public static b a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return b.valueOf(str.toUpperCase(Locale.US));
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

    /* renamed from: aelt$a */
    public enum a {
        APP_OPEN(r2),
        PULL_TO_REFRESH(r3),
        PAGINATION(r4),
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
        return a.a(this.e);
    }

    public final b b() {
        return b.a(this.g);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aelt)) {
            aelt aelt = (aelt) obj;
            return super.equals(aelt) && Objects.equal(this.a, aelt.a) && Objects.equal(this.b, aelt.b) && Objects.equal(this.c, aelt.c) && Objects.equal(this.d, aelt.d) && Objects.equal(this.e, aelt.e) && Objects.equal(this.f, aelt.f) && Objects.equal(this.g, aelt.g) && Objects.equal(this.h, aelt.h) && Objects.equal(this.i, aelt.i) && Objects.equal(this.j, aelt.j) && Objects.equal(this.k, aelt.k) && Objects.equal(this.l, aelt.l) && Objects.equal(this.m, aelt.m) && Objects.equal(this.n, aelt.n) && Objects.equal(this.o, aelt.o) && Objects.equal(this.p, aelt.p) && Objects.equal(this.q, aelt.q) && Objects.equal(this.r, aelt.r);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        aefz aefz = this.a;
        int i = 0;
        hashCode = (hashCode + (aefz == null ? 0 : aefz.hashCode())) * 31;
        agbh agbh = this.b;
        hashCode = (hashCode + (agbh == null ? 0 : agbh.hashCode())) * 31;
        String str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.g;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.h;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        list = this.i;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        aelv aelv = this.j;
        hashCode = (hashCode + (aelv == null ? 0 : aelv.hashCode())) * 31;
        l = this.k;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.m;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.n;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.o;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.p;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.q;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        list = this.r;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
