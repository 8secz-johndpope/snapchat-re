package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aerb.class)
/* renamed from: aera */
public class aera extends aedh implements aezk {
    @SerializedName("lat")
    public Double a;
    @SerializedName("long")
    public Double b;
    @SerializedName("loc_accuracy_in_meters")
    public Double c;
    @SerializedName("checksums_dict")
    public String d;
    @SerializedName("checksum_missing_reason")
    public String e;
    @SerializedName("screen_width_in")
    public Float f;
    @SerializedName("screen_height_in")
    public Float g;
    @SerializedName("screen_width_px")
    public Integer h;
    @SerializedName("screen_height_px")
    public Integer i;
    @SerializedName("time_zone")
    public String j;
    @SerializedName("support_filter_invalidation")
    public Boolean k = Boolean.FALSE;
    @SerializedName("limit_ad_tracking")
    public Boolean l = Boolean.FALSE;
    @SerializedName("previous_request_time")
    public Long m;
    @SerializedName("previous_request_accuracy")
    public Float n;
    @SerializedName("context")
    public String o;
    @SerializedName("trigger")
    public String p;
    @SerializedName("device_id")
    public String q;
    @SerializedName("is_audience_match_opt_out")
    public Boolean r;
    @SerializedName("force_gtq")
    public Boolean s;
    @SerializedName("device_model")
    public String t;
    @SerializedName("retry_count")
    public Integer u;
    @SerializedName("purposes")
    public String v;
    @SerializedName("last_low_sensitivity_response_time")
    public Long w;
    @SerializedName("skip_use_cases")
    public String x;

    /* renamed from: aera$a */
    public enum a {
        DEFAULT(r2),
        CAMERA(r3),
        PREVIEW(r4),
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

    /* renamed from: aera$b */
    public enum b {
        ENTER(r2),
        IP_FALLBACK(r3),
        BETTER_ACCURACY(r4),
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

    public final agax a() {
        return agax.a(this.e);
    }

    public final a b() {
        return a.a(this.o);
    }

    public final b c() {
        return b.a(this.p);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aera)) {
            aera aera = (aera) obj;
            return super.equals(aera) && Objects.equal(this.a, aera.a) && Objects.equal(this.b, aera.b) && Objects.equal(this.c, aera.c) && Objects.equal(this.d, aera.d) && Objects.equal(this.e, aera.e) && Objects.equal(this.f, aera.f) && Objects.equal(this.g, aera.g) && Objects.equal(this.h, aera.h) && Objects.equal(this.i, aera.i) && Objects.equal(this.j, aera.j) && Objects.equal(this.k, aera.k) && Objects.equal(this.l, aera.l) && Objects.equal(this.m, aera.m) && Objects.equal(this.n, aera.n) && Objects.equal(this.o, aera.o) && Objects.equal(this.p, aera.p) && Objects.equal(this.q, aera.q) && Objects.equal(this.r, aera.r) && Objects.equal(this.s, aera.s) && Objects.equal(this.t, aera.t) && Objects.equal(this.u, aera.u) && Objects.equal(this.v, aera.v) && Objects.equal(this.w, aera.w) && Objects.equal(this.x, aera.x);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        Double d = this.a;
        int i = 0;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        d = this.b;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        d = this.c;
        hashCode = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.f;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.g;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.h;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.i;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.j;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.k;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.l;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.m;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        f = this.n;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.p;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.q;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.r;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.s;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.u;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.v;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        l = this.w;
        hashCode = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        str = this.x;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
