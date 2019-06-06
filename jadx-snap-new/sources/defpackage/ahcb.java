package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = ahcc.class)
/* renamed from: ahcb */
public class ahcb extends aedh implements aezk {
    @SerializedName("action")
    public String a;
    @SerializedName("phoneNumber")
    public String b;
    @SerializedName("countryCode")
    public String c;
    @SerializedName("skipConfirmation")
    public Boolean d;
    @SerializedName("method")
    public String e;
    @SerializedName("reset_password_in_app")
    public Boolean f = Boolean.FALSE;
    @SerializedName("type")
    public String g;

    /* renamed from: ahcb$a */
    public enum a {
        UPDATEPHONENUMBER("updatePhoneNumber"),
        UPDATEPHONENUMBERWITHCALL("updatePhoneNumberWithCall"),
        REQUESTPHONEVERIFICATION("requestPhoneVerification"),
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

    /* renamed from: ahcb$b */
    public enum b {
        TEXT("text"),
        CALL("call"),
        UNRECOGNIZED_VALUE(r4);
        
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

    /* renamed from: ahcb$c */
    public enum c {
        DEFAULT_TYPE(r2),
        TWO_FA_TYPE(r3),
        REGISTRATION_TYPE(r4),
        SETTINGS_PHONE_TYPE(r5),
        IN_APP_CONTACT_TYPE(r6),
        IN_APP_FORGOT_PASSWORD_TYPE(r7),
        UNRECOGNIZED_VALUE(r8);
        
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
        return a.a(this.a);
    }

    public final b b() {
        return b.a(this.e);
    }

    public final c c() {
        return c.a(this.g);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ahcb)) {
            ahcb ahcb = (ahcb) obj;
            return super.equals(ahcb) && Objects.equal(this.a, ahcb.a) && Objects.equal(this.b, ahcb.b) && Objects.equal(this.c, ahcb.c) && Objects.equal(this.d, ahcb.d) && Objects.equal(this.e, ahcb.e) && Objects.equal(this.f, ahcb.f) && Objects.equal(this.g, ahcb.g);
        }
    }

    public int hashCode() {
        int hashCode = (super.hashCode() + 17) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.b;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        str = this.c;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.e;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        bool = this.f;
        hashCode = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
