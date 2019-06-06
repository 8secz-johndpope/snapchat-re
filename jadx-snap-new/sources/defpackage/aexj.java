package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aexk.class)
/* renamed from: aexj */
public class aexj extends aezl implements aezk {
    @SerializedName("server_latency")
    public String a;
    @SerializedName("response_checksum")
    public String b;
    @SerializedName("response_compare_result")
    public String c;
    @SerializedName("response_compare_results_dict")
    public String d;

    /* renamed from: aexj$a */
    public enum a {
        EQUAL(r2),
        DELTA(r3),
        NOT_EQUAL(r4),
        NOT_SUPPORT(r5),
        UNRECOGNIZED_VALUE(r6);
        
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aexj)) {
            aexj aexj = (aexj) obj;
            return Objects.equal(this.a, aexj.a) && Objects.equal(this.b, aexj.b) && Objects.equal(this.c, aexj.c) && Objects.equal(this.d, aexj.d);
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
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
