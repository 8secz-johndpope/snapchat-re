package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aeru.class)
/* renamed from: aert */
public class aert extends aecy implements aezk {
    @SerializedName("recovery_code_used")
    public Boolean A;
    @SerializedName("is_sms_two_fa_enabled")
    public Boolean B;
    @SerializedName("is_otp_two_fa_enabled")
    public Boolean C;
    @SerializedName("verification_needed")
    public ahfr D;
    @SerializedName("latest_out_alpha")
    public String E;
    @SerializedName("latest_backup_out_beta")
    public String F;
    @SerializedName("reactivation_status")
    public String G;
    @SerializedName("pow_numofzeros")
    public Integer H;
    @SerializedName("quick_login_response")
    public Boolean I;
    @SerializedName("iwek")
    public String J;
    @SerializedName("force_phone_verify")
    public Boolean K;
    @SerializedName("preferred_verification_method")
    public String L;
    @SerializedName("hashed_out_beta")
    public String M;
    @SerializedName("snap_session_refresh_token")
    public String N;
    @SerializedName("snap_access_tokens")
    public List<afwr> O;
    @SerializedName("odlv_required")
    public Boolean P;
    @SerializedName("odlv_pre_auth_token")
    public String Q;
    @SerializedName("obfuscated_phone")
    public String R;
    @SerializedName("obfuscated_email")
    public String S;
    @SerializedName("error_field")
    public String q;
    @SerializedName("message")
    public String r;
    @SerializedName("status")
    public Integer s;
    @SerializedName("dtoken1i")
    public String t;
    @SerializedName("dtoken1v")
    public String u;
    @SerializedName("two_fa_needed")
    public Boolean v;
    @SerializedName("username")
    public String w;
    @SerializedName("message_format")
    public String x;
    @SerializedName("phone_number")
    public String y;
    @SerializedName("pre_auth_token")
    public String z;

    /* renamed from: aert$a */
    public enum a {
        DISPLAY_NAME(r2),
        USERNAME(r3),
        BIRTHDAY(r4),
        PASSWORD(r5),
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

    /* renamed from: aert$b */
    public enum b {
        EMAIL_FIRST_PHONE_SKIPPABLE(r2),
        PHONE_FIRST_EMAIL_BYPASSED(r3),
        PHONE_FIRST_EMAIL_SKIPPABLE(r4),
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

    /* renamed from: aert$c */
    public enum c {
        NEEDS_TO_CONFIRM(r2),
        JUST_STARTED(r3),
        IN_PROGRESS(r4),
        ERROR(r5),
        UNRECOGNIZED_VALUE(r6);
        
        private final String value;

        private c(String str) {
            this.value = str;
        }

        public static c a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return c.valueOf(str.toUpperCase(Locale.US));
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
        return a.a(this.q);
    }

    public final c b() {
        return c.a(this.G);
    }

    public final b c() {
        return b.a(this.L);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aert)) {
            aert aert = (aert) obj;
            return super.equals(aert) && Objects.equal(this.q, aert.q) && Objects.equal(this.r, aert.r) && Objects.equal(this.s, aert.s) && Objects.equal(this.t, aert.t) && Objects.equal(this.u, aert.u) && Objects.equal(this.v, aert.v) && Objects.equal(this.w, aert.w) && Objects.equal(this.x, aert.x) && Objects.equal(this.y, aert.y) && Objects.equal(this.z, aert.z) && Objects.equal(this.A, aert.A) && Objects.equal(this.B, aert.B) && Objects.equal(this.C, aert.C) && Objects.equal(this.D, aert.D) && Objects.equal(this.E, aert.E) && Objects.equal(this.F, aert.F) && Objects.equal(this.G, aert.G) && Objects.equal(this.H, aert.H) && Objects.equal(this.I, aert.I) && Objects.equal(this.J, aert.J) && Objects.equal(this.K, aert.K) && Objects.equal(this.L, aert.L) && Objects.equal(this.M, aert.M) && Objects.equal(this.N, aert.N) && Objects.equal(this.O, aert.O) && Objects.equal(this.P, aert.P) && Objects.equal(this.Q, aert.Q) && Objects.equal(this.R, aert.R) && Objects.equal(this.S, aert.S);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.q;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.r;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.s;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.u;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.v;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.w;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.x;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.y;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.z;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.A;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.B;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.C;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ahfr ahfr = this.D;
        hashCode = (hashCode + (ahfr == null ? 0 : ahfr.hashCode())) * 31;
        str = this.E;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.F;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.G;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        num = this.H;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bool = this.I;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.J;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.K;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.L;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.M;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.N;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.O;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        bool = this.P;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.Q;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.R;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.S;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return maskSensitiveValue(maskSensitiveValue(super.toString(), String.valueOf(this.N), 0), String.valueOf(this.Q), 0);
    }
}
