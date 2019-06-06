package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = afdy.class)
/* renamed from: afdx */
public class afdx extends aezl implements aezk {
    @SerializedName("scheduling_type")
    public String a;
    @SerializedName("start_date_time")
    public String b;
    @SerializedName("end_date_time")
    public String c;
    @SerializedName("timezone")
    public String d;
    @SerializedName("use_local_timezone")
    public Boolean e;
    @SerializedName("repetition_frequency")
    public String f;
    @SerializedName("repetition_end_date_time")
    public String g;
    @SerializedName("weekly_frequency")
    public String h;
    @SerializedName("repeat_intervals")
    public List<afdz> i;

    /* renamed from: afdx$a */
    public enum a {
        DAILY(r2),
        WEEKLY(r3),
        MONTHLY(r4),
        YEARLY(r5),
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

    /* renamed from: afdx$b */
    public enum b {
        ALWAYS(r2),
        ONCE(r3),
        REPEAT(r4),
        REPEAT_MULTIPLE_INTERVALS(r5),
        UNRECOGNIZED_VALUE(r6);
        
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
        return a.a(this.f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof afdx)) {
            afdx afdx = (afdx) obj;
            return Objects.equal(this.a, afdx.a) && Objects.equal(this.b, afdx.b) && Objects.equal(this.c, afdx.c) && Objects.equal(this.d, afdx.d) && Objects.equal(this.e, afdx.e) && Objects.equal(this.f, afdx.f) && Objects.equal(this.g, afdx.g) && Objects.equal(this.h, afdx.h) && Objects.equal(this.i, afdx.i);
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
        Boolean bool = this.e;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.g;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.h;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.i;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }
}
