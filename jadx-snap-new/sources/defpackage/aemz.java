package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aena.class)
/* renamed from: aemz */
public class aemz extends aezl implements aezk {
    @SerializedName("friends")
    public List<aelf> a;
    @SerializedName("friends_sync_token")
    public String b;
    @SerializedName("friends_sync_type")
    public String c;
    @SerializedName("added_friends")
    public List<aelf> d;
    @SerializedName("bests")
    public List<String> e;
    @SerializedName("extra_friendmoji_mutable_dict")
    public Map<String, aejy> f;
    @SerializedName("extra_friendmoji_read_only_dict")
    public Map<String, aejy> g;
    @SerializedName("added_friends_sync_token")
    public String h;
    @SerializedName("added_friends_sync_type")
    public String i;

    /* renamed from: aemz$a */
    public enum a {
        AFULL("aFull"),
        APARTIAL("aPartial"),
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

    /* renamed from: aemz$b */
    public enum b {
        FULL("full"),
        PARTIAL("partial"),
        TOKEN_ONLY("token_only"),
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

    public final b a() {
        return b.a(this.c);
    }

    public final a b() {
        return a.a(this.i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aemz)) {
            aemz aemz = (aemz) obj;
            return Objects.equal(this.a, aemz.a) && Objects.equal(this.b, aemz.b) && Objects.equal(this.c, aemz.c) && Objects.equal(this.d, aemz.d) && Objects.equal(this.e, aemz.e) && Objects.equal(this.f, aemz.f) && Objects.equal(this.g, aemz.g) && Objects.equal(this.h, aemz.h) && Objects.equal(this.i, aemz.i);
        }
    }

    public int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) + 527) * 31;
        String str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list2 = this.d;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        list2 = this.e;
        hashCode = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.f;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        map = this.g;
        hashCode = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
