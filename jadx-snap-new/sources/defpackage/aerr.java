package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.List;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aers.class)
/* renamed from: aerr */
public class aerr extends aeji implements aezk {
    @SerializedName("pre_auth_token")
    public String c;
    @SerializedName("password")
    public String d;
    @SerializedName("ptoken")
    public String e;
    @SerializedName("remember_device")
    public Boolean f;
    @SerializedName("from_deeplink")
    public Boolean g;
    @SerializedName("nt")
    public String h;
    @SerializedName("height")
    public Integer i;
    @SerializedName("width")
    public Integer j;
    @SerializedName("max_video_height")
    public Integer k;
    @SerializedName("max_video_width")
    public Integer l;
    @SerializedName("application_id")
    public String m;
    @SerializedName("attestation")
    public String n;
    @SerializedName("sflag")
    public String o;
    @SerializedName("screen_width_in")
    public Float p;
    @SerializedName("screen_height_in")
    public Float q;
    @SerializedName("screen_width_px")
    public Integer r;
    @SerializedName("screen_height_px")
    public Integer s;
    @SerializedName("two_fa_mechanism_used")
    public String t;
    @SerializedName("reactivation_confirmed")
    public Boolean u;
    @SerializedName("hashed_out_alphas")
    public List<String> v;
    @SerializedName("fidelius_client_init")
    public ahpx w;
    @SerializedName("odlv_pre_auth_token")
    public String x;
    @SerializedName("otp_type")
    public String y;
    @SerializedName("device_id")
    public String z;

    /* renamed from: aerr$a */
    public enum a {
        EMAIL_TOTP(r2),
        PHONE_TOTP(r3),
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
        return a.a(this.y);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aerr)) {
            aerr aerr = (aerr) obj;
            return super.equals(aerr) && Objects.equal(this.c, aerr.c) && Objects.equal(this.d, aerr.d) && Objects.equal(this.e, aerr.e) && Objects.equal(this.f, aerr.f) && Objects.equal(this.g, aerr.g) && Objects.equal(this.h, aerr.h) && Objects.equal(this.i, aerr.i) && Objects.equal(this.j, aerr.j) && Objects.equal(this.k, aerr.k) && Objects.equal(this.l, aerr.l) && Objects.equal(this.m, aerr.m) && Objects.equal(this.n, aerr.n) && Objects.equal(this.o, aerr.o) && Objects.equal(this.p, aerr.p) && Objects.equal(this.q, aerr.q) && Objects.equal(this.r, aerr.r) && Objects.equal(this.s, aerr.s) && Objects.equal(this.t, aerr.t) && Objects.equal(this.u, aerr.u) && Objects.equal(this.v, aerr.v) && Objects.equal(this.w, aerr.w) && Objects.equal(this.x, aerr.x) && Objects.equal(this.y, aerr.y) && Objects.equal(this.z, aerr.z);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.c;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.d;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.g;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.h;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.i;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.j;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.k;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.l;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.m;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.n;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.o;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.p;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        f = this.q;
        hashCode = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        num = this.r;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        num = this.s;
        hashCode = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        str = this.t;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.u;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.v;
        hashCode = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ahpx ahpx = this.w;
        hashCode = (hashCode + (ahpx == null ? 0 : ahpx.hashCode())) * 31;
        str = this.x;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.y;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.z;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return maskSensitiveValue(maskSensitiveValue(super.toString(), String.valueOf(this.d), 0), String.valueOf(this.x), 0);
    }
}
