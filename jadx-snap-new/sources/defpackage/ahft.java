package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahfu.class)
/* renamed from: ahft */
public class ahft extends aeji implements aezk {
    @SerializedName("action")
    public String c;
    @SerializedName("code")
    public String d;
    @SerializedName("type")
    public String e;
    @SerializedName("password")
    public String f;
    @SerializedName("deep_link_request")
    public agyi g;
    @SerializedName("is_from_registration")
    public Boolean h;
    @SerializedName("reset_password_in_app")
    public Boolean i = Boolean.FALSE;

    /* renamed from: ahft$a */
    public enum a {
        DEFAULT_TYPE(r2),
        TWO_FA_TYPE(r3),
        REGISTRATION_TYPE(r4),
        SETTINGS_PHONE_TYPE(r5),
        IN_APP_CONTACT_TYPE(r6),
        IN_APP_FORGOT_PASSWORD_TYPE(r7),
        UNRECOGNIZED_VALUE(r8);
        
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahft)) {
            ahft ahft = (ahft) obj;
            return super.equals(ahft) && Objects.equal(this.c, ahft.c) && Objects.equal(this.d, ahft.d) && Objects.equal(this.e, ahft.e) && Objects.equal(this.f, ahft.f) && Objects.equal(this.g, ahft.g) && Objects.equal(this.h, ahft.h) && Objects.equal(this.i, ahft.i);
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
        str = this.f;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        agyi agyi = this.g;
        hashCode = (hashCode + (agyi == null ? 0 : agyi.hashCode())) * 31;
        Boolean bool = this.h;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        bool = this.i;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return maskSensitiveValue(super.toString(), String.valueOf(this.f), 0);
    }
}
