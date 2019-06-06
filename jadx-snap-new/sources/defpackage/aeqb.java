package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeqc.class)
/* renamed from: aeqb */
public class aeqb extends aezl implements aezk {
    @SerializedName("resource_type")
    public String a;
    @SerializedName("quality")
    public String b;
    @SerializedName("archive_link")
    public String c;
    @SerializedName("checksum")
    public String d;
    @SerializedName("signature")
    public String e;
    @SerializedName("last_updated")
    public Long f;
    @SerializedName("algorithm_version")
    public Integer g;

    /* renamed from: aeqb$a */
    public enum a {
        LOW(r2),
        HIGH(r3),
        NORMAL(r4),
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

    /* renamed from: aeqb$b */
    public enum b {
        PLAIN(r2),
        ZIP(r3),
        LNS(r4),
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
        return b.a(this.a);
    }

    public final a b() {
        return a.a(this.b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeqb)) {
            aeqb aeqb = (aeqb) obj;
            return Objects.equal(this.a, aeqb.a) && Objects.equal(this.b, aeqb.b) && Objects.equal(this.c, aeqb.c) && Objects.equal(this.d, aeqb.d) && Objects.equal(this.e, aeqb.e) && Objects.equal(this.f, aeqb.f) && Objects.equal(this.g, aeqb.g);
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
        str2 = this.d;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.g;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }
}
