package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = agbi.class)
/* renamed from: agbh */
public class agbh extends aezl implements aezk {
    @SerializedName("checksum")
    public String a;
    @SerializedName("sync_metadata")
    public String b;
    @SerializedName("request_type")
    public String c;
    @SerializedName("mob_story_types_to_rank")
    public List<agbj> d;
    @SerializedName("should_return_story_scores")
    public Boolean e;
    @SerializedName("mischief_id_in_order_resp")
    public Boolean f;
    @SerializedName("checksum_missing_reason")
    public String g;
    @SerializedName("request_source")
    public String h;

    /* renamed from: agbh$a */
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
        return a.a(this.c);
    }

    public final agax b() {
        return agax.a(this.g);
    }

    public final agbg c() {
        return agbg.a(this.h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof agbh)) {
            agbh agbh = (agbh) obj;
            return Objects.equal(this.a, agbh.a) && Objects.equal(this.b, agbh.b) && Objects.equal(this.c, agbh.c) && Objects.equal(this.d, agbh.d) && Objects.equal(this.e, agbh.e) && Objects.equal(this.f, agbh.f) && Objects.equal(this.g, agbh.g) && Objects.equal(this.h, agbh.h);
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
        Boolean bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
